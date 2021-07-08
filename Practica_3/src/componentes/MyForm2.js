import React from 'react';

//mi elemento que voy a utilizar
//todo elemento debe tener un render con un return
class MyForm2  extends React.Component{
    state={
        color:'',
        nombre:''
    }
    //en este evento estoy tomando el evento y lo imprimo 
    //puedo ponerle cualquier nombre en ese caso myOnSubmit
    myOnSubmit=(evn)=>{
        console.log(evn)
        evn.preventDefault();
    }

    myOnchange=(env)=>{
        console.log("myOnchange",env.target.value);
        this.setState({
            color:env.target.value
        })
    }
    render(){
        return(
            <form onSubmit={this.myOnSubmit}>
                <input type="text" placeholder="Ingrese el Color" onChange={this.myOnchange} value={this.state.color}></input>
                <br/>
                <br/>
                <input type="text" placeholder="Ingrese el nombre de la imagen" onChange={this.myOnchange}  value={this.state.color}></input>
                <br/>
                <br/>
                <input type="submit"></input>
            </form>
        )
    }
}
export default MyForm2;