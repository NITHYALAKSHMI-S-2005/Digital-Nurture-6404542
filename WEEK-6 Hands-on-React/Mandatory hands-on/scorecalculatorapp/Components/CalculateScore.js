import React from 'react';
import '../Stylesheets/mystyle.css';

function CalculateScore() {
  const name = "Steeve";
  const school = "DNV Public School";
  const total = 284;
  const score = ((total / 300) * 100).toFixed(2);

  return (
    <div>
      <h1 className="heading">Student Details:</h1>
      <p><span className="label">Name:</span> <span className="name">{name}</span></p>
      <p><span className="label">School:</span> <span className="school">{school}</span></p>
      <p><span className="label">Total:</span> <span className="total">{total}Marks</span></p>
      <p><span className="label">Score:</span> <span className="score">{score}%</span></p>
    </div>
  );
}

export default CalculateScore;
