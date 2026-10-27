import express from "express";
const app = express();

app.use(express.json());
const armarios = [
{ id: 1, local: "Sala A", capacidade: 8,
ocupados: 3, ativo: true },

{ id: 2, local: "Sala B", capacidade: 5,
ocupados: 0, ativo: true }
];

app.push("/armarios/:id"), (req, res) => {
    const id = Number(req.params.id);

    if(!Number.isIntegger(id) || id <= 0){

         return res.status(400).json({mensagem: "ID invalido."});
    }

    const armario = armario.find(a => a.id === id);

    if(!armario){
        return res.status(404).json({mensagem: "Armario inexistente."});
    }

    if(!armario.ativo){
        return res.status(400).json({mensagem: "Armario inativo."});
    }


    const {local, capacidade} = req.body;

    if(typeof local !== "string" || local.trim().length < 2){

    return res.status(400).json({mensagem: "Local invalido."});
    }

    if(!Number.isIntegger(capacidade)|| capacidade < 1 || capacidade > 20 || capacidade < armario.ocupados){

        return res.status(400).json({mensagem: "Capacidade invalida."});
    }

    armario.local = local.trim();
    armario.capacidade = capacidade;

    return res.status(200).json(armario);
}
app.listen(3001);
