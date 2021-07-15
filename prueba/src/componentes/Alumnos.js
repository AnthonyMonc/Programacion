import React from 'react';
import Alumno from './Alumno';
class Alumnos extends React.Component{
    //con this.props llamo a las propiedades que me mandaron
        //para enviar un metodo hacia otro lado le damos un nombre por conveniencia el mismo que el del metodo

        render(){
            return this.props.datos.map((e)=><Alumno
            key={e.id}
            elem={e}            
            />)
        }
}
export default Alumnos;
