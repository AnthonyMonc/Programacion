const mongoose = require('mongoose');

const URL = process.env.MONGOOSE_URL?process.env.MONGOOSE_URL:'mongodb://localhost/proyectodb';
console.log(URL);
mongoose.connect(URL, {
  useNewUrlParser: true,
  useUnifiedTopology: true,
  useFindAndModify: false,
  useCreateIndex: true
})


//const connection = mongoose.connect;
mongoose.connection.once('open', ()=>{
    console.log('La base de datos esta conectada')
})