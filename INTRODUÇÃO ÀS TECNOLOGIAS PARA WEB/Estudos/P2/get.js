import express from "express";
const app = express();


//GET
app.use(express.json());
app.get("/recursos/id:", (req, res) =>{
    const id = Number(req.params.id);

    // 1) valida: inteiro e positivo -> senão 400
    if(!Number.isInteger(id) || id <= 0){

        return res.status(400).json({mensagem: "ID invalido."});
    }

    // 2) busca (agora number === number)
    const inscricao = inscricao.find(i => i.id === id);

    // 3) não achou -> 404
    if(!inscricao){

        return res.status(400).json({mensagem: "Inscricao inexistente."});
    }


    // 4) sucesso: objeto (find devolve o objeto, não array)
    return res.status(200).json(inscricao);
})


app.listen(3000);