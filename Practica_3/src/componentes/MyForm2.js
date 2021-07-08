//my form2 tambien es un componente por eso importamos react
import React from 'react';

//mi elemento que voy a utilizar
//todo elemento debe tener un render con un return
class MyForm2  extends React.Component{
    //debe ser  el mismo nombre que el de los input 
    state={
        color:'',
        nombre:''
    }
    //en este evento estoy tomando el evento y lo imprimo 
    //puedo ponerle cualquier nombre en ese caso myOnSubmit
    myOnSubmit=(evn)=>{                
        evn.preventDefault();
        console.log(this.state)
    }
    //el evento puede tener cualquier nombre
    //usamos name para poder traer el name del input
    //captura cada que tecleamo
    myOnchange=(env)=>{
        console.log("myOnchange",env.target.value, "name:",env.name);
        this.setState({
            [env.target.name]:env.target.value
        })
    }

    render(){
        return(
            <form onSubmit={this.myOnSubmit}>
                
                <input name="color" type="text" placeholder="Ingrese el Color" onChange={this.myOnchange} value={this.state.color}></input>
                <br/>
                <br/>
                <input name="nombre" type="text" placeholder="Ingrese el nombre de la imagen" onChange={this.myOnchange}  value={this.state.nombre}></input>
                <br/>
                <br/>
                <input type="submit"></input>
            </form>
        )
    }
}
export default MyForm2;