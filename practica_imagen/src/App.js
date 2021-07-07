import React from 'react';
import './App.css';
import practia1 from './datos/practica1.json';
import Elementos from './componentes/elementos';

class App extends React.Component{

  state ={
    practica1:practia1
  }

  render(){
    return<div>
        <Elementos practica1={this.state.practica1}  />
    </div>
  }
}


export default App;
