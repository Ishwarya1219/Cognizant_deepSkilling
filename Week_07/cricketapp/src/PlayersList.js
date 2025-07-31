import React from "react";
const PlayersList = () => {
  const players = [
    { name: "Dhoni ", score: 95 },
    { name: "Sachin Tendulkhar ", score: 90 },
    { name: "Virat kohli ", score: 85 },
    { name: "Jadeja ", score: 80 },
    { name: "Rahul ", score: 75 },
    { name: "Ashwin ", score: 70 },
    { name: "Gill ", score: 65 },
    { name: "Surya ", score: 60 },
    { name: "Pant ", score: 55 },
    { name: "Rohit ", score: 55 },
    { name: "Suresh ", score: 50 },
  ];
  const below70 = players.filter((p) => p.score < 70);
  const odd = players.filter((_, i) => i % 2 !== 0);
  const even = players.filter((_, i) => i % 2 === 0);

  const t20players = ["Hardik", "Rohit", "Surya"];
  const ranjiplayers = ["Rahane", "pujara", "Karun Nair"];
  const allplayers = [...t20players, ...ranjiplayers];

  var flag=false;
  if(flag===true){

  
  return (
    <div>
      <h2>List of players</h2>
      <ul>
        {players.map((item, index) => (
          <li key={index}>
            Mr.{item.name}- <span>{item.score}</span>
          </li>
        ))}
      </ul><hr></hr>

      <h2>List of Players having Scores Less than 70</h2>
      <ul>
        {below70.map((p, index) => (
          <li key={index}>
            {p.name}-{p.score}
          </li>
        ))}
      </ul>
      <hr></hr>

     
    </div>
  );
  }
  else{
    return(
        <div>
 <h2>Odd Players</h2>
      <ol>
        {odd.map((p, index) => (
          <li key={index}>{p.name}</li>
        ))}
      </ol>
      <hr></hr>

      <h2>Even Players</h2>
      <ol>
        {even.map((p, index) => (
          <li key={index}>
            {index}-{p.name}
          </li>
        ))}
      </ol>
<hr></hr>
      <h2>List of Indian Players Merged</h2>
      <ul>
        {allplayers.map((name, index) => (
          <li key={index}>{name}</li>
        ))}
      </ul>
      <hr></hr>
      </div>
    )
  }
};

export default PlayersList;
