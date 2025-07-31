import React,{Component} from "react";
class App extends Component{
  constructor(props){
    super(props);
    this.state={
      isLoggedIn:false,
    };
  }
  handleLogin =()=>{
    this.setState({isLoggedIn:true});
  };
  handleLogout =()=>{
    this.setState({isLoggedIn:false});
  };
  
  render(){
    const {isLoggedIn}=this.state;
    let content;
    if(isLoggedIn){
      content=<UserPage/>;
    }
    else{
      content=<GuestPage/>;
    }
    return(
      <div style={{padding:"20px"}}>
        <h1>Ticket Booking App</h1>
        {
          isLoggedIn?(
            <button onClick={this.handleLogout}>Logout</button>
          ):(
             <button onClick={this.handleLogin}>Login</button>
          )
        }
        <hr/>
        {content}
      </div>
    );
  }

}

const GuestPage=()=>(
  <div>
    <h2>Welcome Guest!</h2>
    <p> You can browse the flights,but you need to log in to book tickets.</p>
    <ul>
      <li>Flight 1 - Delhi to Mumbai</li>
      <li>Flight 2 - Banglore to Chennai</li>
    </ul>
  </div>
);

const UserPage=()=>{

  const handlebooking=()=>{
    alert("Booked Successfully!");
  };

  return(
<div>
    <h2>Welcome User!</h2>
    <p> You are logged in. You can book your tickets.</p>
    <button onClick={handlebooking}>Book Now</button>
  </div>
  );
  
};


export default App;
