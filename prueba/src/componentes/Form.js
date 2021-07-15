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
        this.props.añadiralumno(this.state.nombre, this.state.apellido, this.state.edad);      
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
                <h3>Ingrese el nombre</h3>
                <input name="nombre"
                    type="text" 
                    placeholder="Ingrese el Nombre" 
                    onChange={this.cambiando} 
                    value={this.state.nombre} />                              
                <h3>Ingrese el Apellido</h3>
                <input name="apellido"
                    type="text" 
                    placeholder="Ingrese el Apellido" 
                    onChange={this.cambiando} 
                    value={this.state.apellido}/>
                
                <h3>Ingrese su Edad</h3>
                <input name="edad"
                    type="text" 
                    placeholder="Ingrese la edad" 
                    onChange={this.cambiando} 
                    value={this.state.edad} />
                <br />
                <br></br>
                <input type="submit" />
            </form>
        )
    
}
}
export default Form;