//import logo from './logo.svg';
import React from 'react';
import './App.css';
import datos from './Informacion/datos.json';
import Alumnos from './componentes/Alumnos';
import Form from './componentes/Form';

class App extends React.Component {
  
    state ={
      datos:datos
    }

    añadiralumno = (nombreI, apellidoI,edadI)=>{
      const nuevoAlum = {
        id:this.state.datos.slice(-1)[0].id+1,
        nombre:nombreI,
        apellido:apellidoI,
        edad:edadI
      }
      this.setState({
        datos: [...this.state.datos, nuevoAlum]
      })
    }
    render(){
      return <div className="App">
        <h1>Prueba</h1>
        <Form añadiralumno={this.añadiralumno}/>
        <Alumnos datos={this.state.datos}/>
        
      </div>
    }        
}

export default App;
