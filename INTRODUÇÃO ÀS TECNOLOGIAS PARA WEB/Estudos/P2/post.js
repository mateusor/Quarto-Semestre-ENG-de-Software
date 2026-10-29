import express from "express";
const app = express();
//POST

app.use(express.json())/
app.post("/inscricoes", (req, res) => {
    // 1) pega só os campos que importam (extras e id do cliente são ignorados)
    const { nome, oficina, vagas } = req.body;

    // 2) valida nome: string e >= 3 caracteres sem espaços das pontas -> senão 400
    if(typeof nome !== "string" || nome.trim().length < 3){

        return res.status(400).json({mensagem: "Nome invalido."});
    }

    // 3) valida oficina: exatamente uma das duas -> senão 400
    if(oficina !== "escrita" && oficina !== "fotografia"){

        return res.status(400).json({mensagem: "Oficina invalida."});
    }

    // 4) valida vagas: inteiro de 1 a 3 (rejeita "2", 1.5, undefined) -> senão 400
    if(!Number.isInteger(vagas) || vagas < 1 || vagas > 3){

        return res.status(400).json({mensagem: "Vagas invalidas."});
    }

    // 5) soma das vagas já reservadas nessa oficina
    let reservadas = 0;
    for(const i of inscricoes){
        if(i.oficina === oficina) reservadas += i.vagas;
    }

    // 6) regra de negócio: não pode passar do limite -> senão 400
    if(reservadas + vagas > limites[oficina]){

        return res.status(400).json({mensagem: "Limite de vagas excedido."});
    }

    // 7) só agora, com tudo validado, cria e consome o id
    const nova = { id: proximoId, nome: nome.trim(), oficina, vagas };
    inscricoes.push(nova);
    proximoId++;

    // 8) sucesso: 201 (criado) com o objeto criado
    return res.status(201).json(nova);
});

app.listen(3000);