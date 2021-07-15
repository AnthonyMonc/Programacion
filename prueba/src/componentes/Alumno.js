import React from 'react';

class Alumno extends React.Component{
    render(){
        const {elem}= this.props;
        console.log(this.props);
        return <div> 
        <h2>
            {elem.nombre}
        </h2>
        <h2>
            {elem.edad}
        </h2>
        </div>
    }
}
export default Alumno;