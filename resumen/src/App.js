import logo from './logo.svg';
import './App.css';
import FormResumen from './componentes/formIngreso';
import React from 'react';


//declaramos como una clase
class App extends React.Component{
  //coloco estados
  //delcaro un json que tiene un nombre y un valor
  state={
    edad:38
  }
  //es una funcion
  imprimirNombre= ()=>{
    console.log("Anthony Moncayo");
  }
//envio datos a traves de las propiedades y parametros
  render(){
    this.imprimirNombre();
    return (
      <div className="App">

        <header className="App-header">
          <FormResumen imprimirNombre={this.imprimirNombre} edad={this.state.edad}/>
          <img src={logo} className="App-logo" alt="logo" />
          <p>
            Edit <code>src/App.js</code> and save to reload.
          </p>
          <a
            className="App-link"
            href="https://reactjs.org"
            target="_blank"
            rel="noopener noreferrer"
          >
            Learn React
          </a>
        </header>
      </div>);
  }
}



export default App;
