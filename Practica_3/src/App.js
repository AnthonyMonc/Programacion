import React from 'react';
import './App.css';
import practia1 from './datos/practica1.json';
import Elementos from './componentes/Elementos';
import MyForm2 from './componentes/MyForm2'

class App extends React.Component{

    state ={
        practica1:practia1
      }
    render(){
      return<div>
          <MyForm2/>
          <Elementos practica1={this.state.practica1}  />
      </div>
    }
  }
  
export default App;