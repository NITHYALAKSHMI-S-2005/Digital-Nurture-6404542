import React, { Component } from 'react';

class Counter extends Component {
  constructor(props) {
    super(props);
    this.state = {
      count: 1
    };
  }

  increment = () => {
    this.setState(prevState => ({ count: prevState.count + 1 }));
    this.sayHello();
  }

  decrement = () => {
    this.setState(prevState => ({ count: prevState.count - 1 }));
  }

  sayHello = () => {
    console.log("Hello from Increment Button!");
  }

  sayWelcome = (msg) => {
    alert(msg);
  }

  handleClick = (event) => {
    alert("I was clicked");
  }

  render() {
    return (
      <div>
        <p>{this.state.count}</p>
        <button onClick={this.increment}>Increment</button>
        <button onClick={this.decrement}>Decrement</button>
        <button onClick={() => this.sayWelcome("Welcome!")}>Say welcome</button>
        <button onClick={this.handleClick}>Click on me</button>
      </div>
    );
  }
}

export default Counter;
