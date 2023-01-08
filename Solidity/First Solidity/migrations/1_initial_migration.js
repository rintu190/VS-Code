const Migrations = artifacts.require("Migrations");
const HelloWorld = artifacts.require("HelloWorld");
const Trust = artifacts.require("Trust");

module.exports = function (deployer) {
  deployer.deploy(Migrations);
  deployer.deploy(Trust);
  deployer.deploy(HelloWorld);
};
