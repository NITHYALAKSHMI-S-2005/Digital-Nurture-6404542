import React from 'react';
import Cart from './Cart';

class OnlineShopping extends React.Component {
  constructor(props) {
    super(props);
    this.items = [
      { itemname: 'Laptop', price: 80000 },
      { itemname: 'TV', price: 120000 },
      { itemname: 'Washing Machine', price: 50000 },
      { itemname: 'Mobile', price: 30000 },
      { itemname: 'Fridge', price: 70000 }
    ];
  }

  render() {
    return (
      <div style={{ textAlign: 'center', marginTop: '50px' }}>
        <h1 style={{ color: 'green' }}>Items Ordered :</h1>
        <table align="center" border="1" cellPadding="10" style={{ borderCollapse: 'collapse', color: 'teal' }}>
          <thead>
            <tr>
              <th>Name</th>
              <th>Price</th>
            </tr>
          </thead>
          <tbody>
            {this.items.map((item, index) => (
              <Cart key={index} itemname={item.itemname} price={item.price} />
            ))}
          </tbody>
        </table>
      </div>
    );
  }
}

export default OnlineShopping;