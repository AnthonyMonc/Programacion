//importamos React
import React from 'react';

class Form extends React.Component{
    state={
        nombre:'',
        apellido:'',
        edad:''
    }
    
    onSubmit=(evn)=>{
        evn.preventDefault();        
    }
    //para capturar los datos que ingresamos
    cambiando=(env)=>{
        this.setState(
            {
                [env.target.name]:env.target.value
            }
        )
    }
    render(){
        return(
            <form onSubmit={this.onSubmit} >
                <input name="nombre"
                    type="text" 
                    placeholder="Ingrese el Nombre" 
                    onChange={this.cambiando} 
                    value={this.state.nombre} />
                <br />
                <br />
                <input name="apellido"
                    type="text" 
                    placeholder="Ingrese el Apellido" 
                    onChange={this.cambiando} 
                    value={this.state.apellido}/>
                <br /><br />
                <input name="edad"
                    type="text" 
                    placeholder="Ingrese el Color" 
                    onChange={this.cambiando} 
                    value={this.state.edad} />
                <br />
                <input type="submit" />
            </form>
        )
    
}
}
export default Form;