
//creando el modulo express
const express = require('express');
const cors = require('cors');
const app = express();
module.exports = app;
//Configuracion
const port = process.env.PORT?process.env.PORT:5000;
console.log(port);
app.set('port',port);

//MIDDLEWARES
app.use(cors());
app.use(express.json());

//RUTAS

app.get('/api/ingreso',(req,res)=>res.send('Ingreso  a la raiz'))



