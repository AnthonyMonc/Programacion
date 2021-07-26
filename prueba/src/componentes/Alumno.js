import React from 'react';

class Alumno extends React.Component{
    render(){
        const {elem}= this.props;
        console.log(this.props);
        return <div> 
        <p>
            {elem.nombre}       
            {elem.apellido}       
            {elem.edad}
        </p>
           
        
        </div>
    }
}
export default Alumno;