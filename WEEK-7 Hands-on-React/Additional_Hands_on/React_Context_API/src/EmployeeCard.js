import React, { useContext } from 'react';
import ThemeContext from './ThemeContext';

const EmployeeCard = ({ name }) => {
  const theme = useContext(ThemeContext);

  return (
    <div>
      <p>{name}</p>
      <button className={theme === 'light' ? 'btn-light' : 'btn-dark'}>
        View Profile
      </button>
    </div>
  );
};

export default EmployeeCard;