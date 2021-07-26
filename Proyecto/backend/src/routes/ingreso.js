const {Router} = require('express');
const ingresoCtrl = require('../controler/ingreso.control');
const router = Router();
router.route('/')
.get(ingresoCtrl.getIngreso)
.post()
.put()
.delete();
router.route('/:id')
.put(ingresoCtrl.actualizaIngreso)
.delete();