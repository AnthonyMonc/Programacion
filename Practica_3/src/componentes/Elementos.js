import React from 'react';
import Elemento from './Elemento';
class Elementos extends React.Component{
    render(){
        return this.props.practica1.map((s)=><Elemento elem = {s} key={s.id} />)
    }
}
export default Elementos;