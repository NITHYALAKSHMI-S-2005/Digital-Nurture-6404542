import React, { useState } from 'react';

function ComplaintRegister() {
  const [name, setName] = useState('');
  const [complaint, setComplaint] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    const referenceId = Math.floor(Math.random() * 100);
    alert(`Thanks ${name}\nYour Complaint was Submitted.\nTransaction ID is: ${referenceId}`);
  };

  return (
    <div>
      <h2>Register your complaints here!!!</h2>
      <form onSubmit={handleSubmit}>
        <label>Name:</label>
        <input 
          type="text" 
          value={name}
          onChange={(e) => setName(e.target.value)}
          required 
        />
        <label>Complaint:</label>
        <textarea 
          value={complaint}
          onChange={(e) => setComplaint(e.target.value)}
          required 
        />
        <br />
        <button type="submit">Submit</button>
      </form>
    </div>
  );
}

export default ComplaintRegister;