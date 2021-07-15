import React from 'react';

class Alumno extends React.Component{
    render(){
        const {elem}= this.props;
        console.log(this.props);
        return <div> 
        <h2>
            "Nombre:" + {elem.nombre} +" " + "Apellido:"+{elem.apellido}
        </h2>
        <h2>
            "Tiene: " + {elem.edad} + "años"
        </h2>
        </div>
    }
}
export default Alumno;