require('dotenv').config();
require('./database');
//utilizo el modulo que acabo de crear
const app = require('./app');
//const port = process.env.PORT?process.env.PORT:5000;
app.listen(app.get('port'),()=> console.log('Servidor funcionando en el puerto 5000'));
console.log("Hello word");


