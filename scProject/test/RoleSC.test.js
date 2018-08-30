const assert = require('chai').assert // use Chai Assertion Library
const ganache = require('ganache-cli') // use ganache-cli with ethereum-bridge for Oraclize

// Configure web3 1.0.0 instead of the default version with Truffle
const Web3 = require('web3')
const provider = ganache.provider()
const web3 = new Web3(provider)

// Define the contract we'll be testing
const RoleSC = artifacts.require('RoleSC')

// Define tests
contract('RoleSC', accounts => {
  // define variable to hold the instance of our Template.sol contract
  let template

  // use fresh contract for each test
  beforeEach('Setup contract for each test', async function() {
    template = await RoleSC.new()
  })

  // check that it sends a query and receives a response
  it('sends a query and receives a response', async function() {

    // call the getRandomNumber function
    // make sure to send enough Ether and to set gas limit sufficiently high
    const result = await template.test({
      from: accounts[0],

      gas: '3000000',
    })

  }) // end 'it' block
}) // end 'contract' block
