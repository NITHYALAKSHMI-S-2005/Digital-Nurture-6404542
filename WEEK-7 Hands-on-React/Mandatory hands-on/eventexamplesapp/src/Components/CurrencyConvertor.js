import React, { Component } from 'react';

class CurrencyConvertor extends Component {
  constructor(props) {
    super(props);
    this.state = {
      amount: '',
      currency: 'Euro'
    };
  }

  handleAmountChange = (e) => {
    this.setState({ amount: e.target.value });
  }

  handleCurrencyChange = (e) => {
    this.setState({ currency: e.target.value });
  }

  handleSubmit = (e) => {
    e.preventDefault();
    const rupee = parseFloat(this.state.amount);
    let result = 0;

    if (this.state.currency === "Euro") {
      result = rupee * 80;
    }

    alert(`Converting to ${this.state.currency} Amount is ${result}`);
  }

  render() {
    return (
      <div>
        <h2 style={{ color: "green" }}>Currency Convertor!!!</h2>
        <form onSubmit={this.handleSubmit}>
          <label>Amount:</label>
          <input type="text" value={this.state.amount} onChange={this.handleAmountChange} /><br /><br />
          <label>Currency:</label>
          <select value={this.state.currency} onChange={this.handleCurrencyChange}>
            <option value="Euro">Euro</option>
          </select><br /><br />
          <button type="submit">Submit</button>
        </form>
      </div>
    );
  }
}

export default CurrencyConvertor;
