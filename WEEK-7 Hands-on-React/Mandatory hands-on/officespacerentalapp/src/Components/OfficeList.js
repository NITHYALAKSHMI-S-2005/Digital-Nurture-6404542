import React from 'react';

function OfficeList() {
  const office = {
    name: "DBS",
    rent: 50000,
    address: "Chennai",
    image: "https://www.officesnapshots.com/wp-content/uploads/2020/12/dbs-bank-office-bengaluru-6.jpg"
  };

  const headingStyle = {
    textAlign: "center",
    fontWeight: "bold",
    marginBottom: "20px"
  };

  const rentStyle = {
    color: office.rent < 60000 ? "red" : "green",
    fontWeight: "bold"
  };

  return (
    <div style={{ padding: "40px" }}>
      <h2 style={headingStyle}>Office Space , at Affordable Range</h2>
      <div style={{ textAlign: "center" }}>
        <img src={office.image} alt="Office" width="300" />
        <p style={{ fontWeight: "bold", fontSize: "22px" }}>Name: {office.name}</p>
        <p style={rentStyle}>Rent: Rs. {office.rent}</p>
        <p><strong>Address:</strong> {office.address}</p>
      </div>
    </div>
  );
}

export default OfficeList;
