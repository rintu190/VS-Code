// SPDX-License-Identifier: MIT
pragma solidity >=0.4.22 <0.9.0;

contract helloWorld {
  string message;
  constructor() {
    message ="hello solidity";
  }
  function sayHello() public view returns (string memory) {
    return message;
  }
}
