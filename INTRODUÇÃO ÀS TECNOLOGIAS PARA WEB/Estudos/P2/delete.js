import express from "express";
const app = express();

app.use(express.json());
const armarios = [
{ id: 1, local: "Sala A", capacidade: 8,
ocupados: 3, ativo: true },

{ id: 2, local: "Sala B", capacidade: 5,
ocupados: 0, ativo: true }
];

app.delete("/aramrios/:id"), (req, res) => {
    
    const id = Number(req.params.id);

    if(!Number.isIntegger(id) || id <= 0){

        return res.status(400).json({mensagem: "ID invalido."});
    }

    const armario = armario.find(a => a.id === id);
    
    if(!armario){

        return res.status(404).json({mensagem: "Armario inexistente."});
    }

     if(armario.ocupados > 0){

        return res.status(400).json({mensagem: "Armario com kits guardados."});
    }

    armario.ativo = false;

    // 6) sucesso: 200 com { mensagem, armario }
    return res.status(200).json({mensagem: "Armario desativado.", armario});
};
app.listen(3001);

