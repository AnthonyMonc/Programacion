import React from 'react';
import Elemento from './elemento';
class Elementos extends React.Component{
    render(){
        return this.props.practica1.map((s)=><h1 key={s.id}>{s.nombre}</h1>)
    }
}
export default Elementos;