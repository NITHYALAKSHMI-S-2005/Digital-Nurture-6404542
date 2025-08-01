import React, { useState } from 'react';

function Register() {
  const [name, setName] = useState('');
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');

  const validateEmail = (email) => {
    return email.includes('@') && email.includes('.');
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    if (name.length < 5) {
      alert('Full Name must be 5 characters long!');
    } else if (!validateEmail(email)) {
      alert('Email is not valid!');
    } else if (password.length < 8) {
      alert('Password must be 8 characters long!');
    } else {
      alert('Registration Successful!');
    }
  };

  return (
    <div>
      <h2>Register Here!!!</h2>
      <form onSubmit={handleSubmit}>
        <label>Name:</label>
        <input 
          type="text" 
          value={name}
          onChange={(e) => setName(e.target.value)}
        />
        <label>Email:</label>
        <input 
          type="text" 
          value={email}
          onChange={(e) => setEmail(e.target.value)}
        />
        <label>Password:</label>
        <input 
          type="password" 
          value={password}
          onChange={(e) => setPassword(e.target.value)}
        />
        <br />
        <button type="submit">Submit</button>
      </form>
    </div>
  );
}

export default Register;