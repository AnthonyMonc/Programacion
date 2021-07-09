import React from 'react';
import Elemento from './Elemento';
class Elementos extends React.Component{    
        //con this.props llamo a las propiedades que me mandaron
        //para enviar un metodo hacia otro lado le damos un nombre por conveniencia el mismo que el del metodo 
     
    render(){
        //console.log(this.props)
        return this.props.practica1.map((s)=><Elemento 
        key={s.id} 
        elem = {s} 
        eliminarElementoPractica1 = {this.props.eliminarElementoPractica1} />)
    }
}
export default Elementos;