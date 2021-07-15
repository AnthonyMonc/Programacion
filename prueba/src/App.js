import logo from './logo.svg';
import './App.css';
import informacion from './Informacion/datos.json';
import Alumnos from './componentes/Alumnos';
import React from 'react';

class App extends React.Component {
  
    state ={
      informacion:informacion
    }

    añadiralumno = (nombreI, apellidoI,edadI)=>{
      const nuevoAlum = {
        id:this.state.informacion.slice(-1)[0].id+1,
        nombre:nombreI,
        apellido:apellidoI,
        edad:edadI
      }
      this.setState({
        informacion: [...this.state.informacion, nuevoAlum]
      })
    }
    render(){
      return <div className="App">
        <Form añadiralumno={this.añadiralumno}/>
      </div>
    }        
}

export default App;
