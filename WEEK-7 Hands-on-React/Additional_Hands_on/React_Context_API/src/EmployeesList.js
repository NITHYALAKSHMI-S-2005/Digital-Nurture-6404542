import React from 'react';
import EmployeeCard from './EmployeeCard';

const EmployeesList = () => {
  const employees = [
    { id: 1, name: 'Alice' },
    { id: 2, name: 'Bob' }
  ];

  return (
    <div>
      {employees.map(emp => (
        <EmployeeCard key={emp.id} name={emp.name} />
      ))}
    </div>
  );
};

export default EmployeesList;