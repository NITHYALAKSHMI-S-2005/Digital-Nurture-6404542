import React from 'react';
import CohortDetails from './components/CohortDetails';

function App() {
  const cohorts = [
    {
      id: 'INTADMDF10',
      name: '.NET FSD',
      startedOn: '22-Feb-2022',
      status: 'Scheduled',
      coach: 'Aathma',
      trainer: 'Jojo Jose'
    },
    {
      id: 'ADM21JF014',
      name: 'Java FSD',
      startedOn: '10-Sep-2021',
      status: 'Ongoing',
      coach: 'Apoorv',
      trainer: 'Elisa Smith'
    },
    {
      id: 'CDBJF21025',
      name: 'Java FSD',
      startedOn: '24-Dec-2021',
      status: 'Ongoing',
      coach: 'Aathma',
      trainer: 'John Doe'
    }
  ];

  return (
    <div style={{ padding: '20px' }}>
      <h1>Cohorts Details</h1>
      {cohorts.map((cohort, index) => (
        <CohortDetails key={index} cohort={cohort} />
      ))}
    </div>
  );
}

export default App;
