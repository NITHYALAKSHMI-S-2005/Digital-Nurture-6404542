import React from 'react';

function IndianPlayers() {
  const indianPlayers = ['Sachin1', 'Dhoni2', 'Virat3', 'Rohit4', 'Yuvaraj5', 'Raina6'];

  const [first, second, third, fourth, fifth, sixth] = indianPlayers;

  const T20players = [
    'Mr. First Player',
    'Mr. Second Player',
    'Mr. Third Player',
  ];
  const RanjiPlayers = [
    'Mr. Fourth Player',
    'Mr. Fifth Player',
    'Mr. Sixth Player',
  ];

  const allPlayers = [...T20players, ...RanjiPlayers];

  return (
    <div>
      <h2>Odd Players</h2>
      <ul>
        <li>First : {first}</li>
        <li>Third : {third}</li>
        <li>Fifth : {fifth}</li>
      </ul>
      <hr />
      <h2>Even Players</h2>
      <ul>
        <li>Second : {second}</li>
        <li>Fourth : {fourth}</li>
        <li>Sixth : {sixth}</li>
      </ul>
      <hr />
      <h2>List of Indian Players Merged:</h2>
      <ul>
        {allPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
}

export default IndianPlayers;
