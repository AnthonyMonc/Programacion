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
        this.props.añadirElementoPractica1(this.state.color, this.state.nombre);
    }
    //el evento puede tener cualquier nombre
    //usamos name para poder traer el name del input
    //captura cada que tecleamo
    myOnChange=(env)=>{
        //console.log("myOnChange", env.target.value, " name: ", env.target.name)
              this.setState({
                  [env.target.name]:env.target.value
              })
          }

          render(){
            return(
                <form onSubmit={this.myOnSubmit} >
                    <input name="color"
                        type="text" 
                        placeholder="Ingrese el color" 
                        onChange={this.myOnChange} 
                        value={this.state.color} />
                    <br />
                    <br />
                    <input name="nombre"
                        type="text" 
                        placeholder="Ingrese el nombre de la imagen" 
                        onChange={this.myOnChange} 
                        value={this.state.nombre}/>
                    <br /><br />
                    <input type="submit" />
                </form>
            )
        
    }
}
export default MyForm2;