const RoleSC = artifacts.require('./RoleSC.sol')

module.exports = function(deployer) {
  deployer.deploy(RoleSC)
}
