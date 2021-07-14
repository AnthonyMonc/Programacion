import React from 'react';
class formIngreso extends React.Component {
    mipropioSubmit = ()=>{
        console.log("Llamada al metodo submit",this.props.imprimirNombre)
        console.log(this.props.edad);
    }
    render() {
        return <div>
            <h1>Hola mundo</h1>
            <input type="submit" onClick={this.mipropioSubmit}></input>
        </div>
    }
}
export default formIngreso;