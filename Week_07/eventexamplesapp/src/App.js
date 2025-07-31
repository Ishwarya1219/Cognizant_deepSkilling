import React,{Component} from "react";
class App extends Component{
  constructor(props){
    super(props);
    this.state={
      counter:0,
      message:"",
      inr:"",
      euro:"",
    };
  }
  increment=()=>{
    this.setState((prevState)=>({
      counter:prevState.counter+1,
      message:"Hello! Incremented.",
    }));
  };
  sayHello=()=>{
    console.log("Hello, user! This is a static message.");
  };
  incrementMultiple=()=>{
    this.increment();
    this.sayHello();
  };
  decrement=()=>{
    this.setState((prevState)=>({
      counter:prevState.counter-1,
      
    }));
  };

   sayWelcome = (msg) => {
    alert(msg);
  };
  handleClick=(e)=>{
    e.preventDefault();
    alert("I was Clicked");
  }
  handleInputChange =(e)=>{
    this.setState({inr:e.target.value});
  };
  handleSubmit=(e)=>{
    e.preventDefault();
    const euroRate=0.011;
    this.setState({
      euro:(this.state.inr*euroRate).toFixed(2),
    });
  };
  render(){
return(
    <div style={{padding:"20px"}}>
    <h3>Counter:{this.state.counter}</h3>
    <button onClick={this.incrementMultiple}>Increment</button>
    <br></br>
    <button onClick={this.decrement}>Decrement</button>

    <br></br>
    <p>{this.state.message}</p>

    <br/>
    <button onClick={()=>this.sayWelcome("Welcome!")}>Say Welcome</button>
    <br/><br/>
    <button onClick={this.handleClick}>Synthetic Event(onClick)</button>
   <br/><br/>
    <CurrencyConverter
          inr={this.state.inr}
          euro={this.state.euro}
          handleInputChange={this.handleInputChange}
          handleSubmit={this.handleSubmit}
        />
    </div>
  );
}
  }
  const CurrencyConverter = ({ inr, euro, handleInputChange, handleSubmit }) => (
  <div>
    <h3>Currency Converter (INR to Euro)</h3>
    <form onSubmit={handleSubmit}>
      <input
        type="number"
        placeholder="Enter INR"
        value={inr}
        onChange={handleInputChange}
      />
      <button type="submit">Convert</button>
    </form>
    <p>Euro: {euro}</p>
  </div>
);

export default App;
