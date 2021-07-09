import React from 'react';
import './App.css';
import practica1 from './datos/practica1.json';
import Elementos from './componentes/Elementos';
import MyForm2 from './componentes/MyForm2'
//para dibujar algo usamos render
class App extends React.Component{

  state ={
    practica1:practica1
  }

  añadirElementoPractica1=( colorIn, nombreIn )=>{
    const newElement  = {
      //tomamos el id del arreglo
      id : this.state.practica1.slice(-1)[0].id+1,
      color:{"backgroundColor":colorIn},
      nombre:nombreIn,
      flag:true
    }
    //añadir un nuevo elemento a la practica 1 al vector
    this.setState({
      practica1: [...this.state.practica1, newElement]//this.state.practica1.push(newElement)
    })
  }

  eliminarElementoPractica1=(id)=>{
    const eraseElement  = this.state.practica1.length -1;
    console.log(eraseElement); 
    console.log("Metodo eliminar elemento Practica1")
    this.setState({      
      practica1: this.state.practica1.splice(1,eraseElement)
    })


  }
   
      //en elementos podemos llamar a
    render(){
//MyForm2 es un componente
      return<div>        
           <MyForm2 añadirElementoPractica1={this.añadirElementoPractica1} />
      <Elementos practica1={this.state.practica1} eliminarElementoPractica1={this.eliminarElementoPractica1} />
      </div>
    }
  }
  
export default App;