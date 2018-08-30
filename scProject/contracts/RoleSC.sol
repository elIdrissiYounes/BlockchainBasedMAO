pragma solidity ^0.4.18;//please import oraclizeAPI_pre0.4.sol when solidity < 0.4.0

import "./oraclizeAPI_0.5.sol";
contract GroupBoardSC is usingOraclize {

  string public result;
  bytes32 public oraclizeID;
  string public GroupArtID;
  mapping (String => String) public agentRoles;
function GroupBoardSC() public {
oraclize_setProof(proofType_TLSNotary | proofStorage_IPFS);
}
  function adoptRole  (string role,string agent) {
    // we can use the mapping to store agents with their
    //corresponding roles
  string memory str=strConcat("&","idd=");
    oraclizeID = oraclize_query("URL",
    strConcat("https://popular-lion-30.localtunnel.me/api/v1/adopt?role=",role,str,GroupArtID));
  }
function createGroup (string id,string t,string artid) {
    string  memory str1=strConcat("&","type=",t);
    string memory str2=strConcat("&","idd=",artid);
    GroupArtID=artid;
    oraclizeID = oraclize_query("URL",
    strConcat("https://popular-lion-30.localtunnel.me/api/v1/create?id=",id,str1,str2));
  }

  function __callback(bytes32 _oraclizeID, string _result) {
    if(msg.sender != oraclize_cbAddress()) throw;
    result = _result;
  }

}
