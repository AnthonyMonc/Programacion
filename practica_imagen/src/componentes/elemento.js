import React from 'react';

class Elemento extends React.Component{
    

    render(){
        const {elem}= this.props;
        return <div> 
        <button style= {elem.color} >
            {elem.nombre}
        </button>
        </div>
    }
}

export default Elemento;