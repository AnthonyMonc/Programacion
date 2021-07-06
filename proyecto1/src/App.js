import imagen_1 from './/Images/messi.jpg';
import imagen_2 from './/Images/fcb.jpg';
import imagen_3 from './/Images/Goku.jpg';
import imagen_4 from './/Images/Kakaroto.jpg';
import imagen_5 from './/Images/wtf.png';
import imagen_6 from './/Images/java.jpg';
import './App.css';
import React from 'react';
/*
function Nombre(props) {
    console.log(props);
    return <div id = "divNombre" >{props.nombre} </div>
}
function Materia(props) {
    console.log(props);
    return <div id = "divCurso" > {props.materia} </div>
}
function Edad(props) {
    console.log(props);
    return <div id = "divEdad" > {props.edad} </div>
}*/
/*function Datos(props) {
    console.log(props);
    return( <div><h3>{props.datos}</h3> </div>);
}
*/
/*const ingresarDatos=(props)=>{
    return( <div><h3>{props.datos}</h3> </div>);
}*/
//clase
class Imagen1 extends React.Component{
 state={
     bandera:true
 }
  cambiarestado=()=>{
    this.setState({bandera:!this.state.bandera});
 }
    render(){
        if(this.state.bandera){
            return( <div id="imagen"><h3>{this.props.datos}</h3>            
            <img id="img" src =  { imagen_1 }className = "App-logo"  alt = "logo"/>      
            <button onClick={this.cambiarestado}> cambiar Estado</button>
            </div>);
        } else{
            return(<div><h3>Cambio de Imagen </h3><img  id="img" src = { imagen_2 }className = "App-logo"  alt = "logo"/> <button onClick={this.cambiarestado}> cambiar Estado</button></div>  );
        }
    }
}
class Imagen2 extends React.Component{
    state={
        bandera:true
    }
     cambiarestado=()=>{
       this.setState({bandera:!this.state.bandera});
    }
       render(){
           if(this.state.bandera){
               return( <div id="imagen"><h3>{this.props.datos}</h3>            
               <img  id="img" src =  { imagen_3 }className = "App-logo"  alt = "logo"/>      
               <button onClick={this.cambiarestado}> cambiar Imagen</button>
               </div>);
           } else{
               return(<div><h3>Cambio de Imagen </h3><img  id="img" src = { imagen_4 }className = "App-logo"  alt = "logo"/> <button onClick={this.cambiarestado}> cambiar Estado</button></div>  );
           }
       }
   }
   class Imagen3 extends React.Component{
    state={
        bandera:true
    }
     cambiarestado=()=>{
       this.setState({bandera:!this.state.bandera});
    }
       render(){
           if(this.state.bandera){
               return( <div id="imagen"><h3>{this.props.datos}</h3>            
               <img id="img" src = { imagen_5 } className = "App-logo"  alt = "logo"/>      
               <button onClick={this.cambiarestado}> cambiar Estado</button>
               </div>);
           } else{
               return(<div><h3>Cambio de Imagen </h3><img  id="img" src = { imagen_6 }className = "App-logo"  alt = "logo"/> <button onClick={this.cambiarestado}> cambiar Estado</button></div>  );
           }
       }
   }

function App() {
    return ( 
        <div className = "App">            
        <header className = "App-header">          
        <div id="container">
        <Imagen1 datos="Imagen 1"></Imagen1>
        <Imagen2 datos="Imagen 2"></Imagen2>
        <Imagen3 datos="Imagen 3"></Imagen3>  
        </div>      
         
       
       </header >       
       </div>
    );
}

export default App;