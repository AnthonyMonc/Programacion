const ingresoCtrl = {};
ingresoCtrl.getIngreso = (req,es)=>{res.send('Datos Ingreso');

}; 
ingresoCtrl.actualizaIngreso = (req,res)=>{res.json({mensaje:'objeto actualizado'});};
module.exports = ingresoCtrl;