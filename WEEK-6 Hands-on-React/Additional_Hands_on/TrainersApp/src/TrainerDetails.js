import React from 'react';
import { useParams } from 'react-router-dom';
import trainers from './TrainersMock';

function TrainerDetails() {
  const { id } = useParams();
  const trainer = trainers.find(t => t.trainerId === parseInt(id));

  if (!trainer) return <p>Trainer not found</p>;

  return (
    <div>
      <h3>Trainers Details</h3>
      <strong>{trainer.name} ({trainer.technology})</strong>
      <p>{trainer.email}</p>
      <p>{trainer.phone}</p>
      <ul>
        {trainer.skills.map((skill, index) => (
          <li key={index}>{skill}</li>
        ))}
      </ul>
    </div>
  );
}

export default TrainerDetails;