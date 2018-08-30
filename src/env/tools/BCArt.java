// CArtAgO artifact code for project house-building

package tools;

import java.io.File;

import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.Contract;
import org.web3j.tx.ManagedTransaction;


import cartago.*;


//goal ==> double impl bare one and oraclize one 
//first attempt with oraclize

public class BCArt extends Artifact {
	// public static Credentials credentials;
	public static Web3j web3j;
	ObsProperty address  = getObsProperty("address");
	public static Credentials credentials;
	public static String contractAddress;
	void init() throws Exception {
		//web3j instanciated by using infura
		web3j = Web3j.build(new HttpService("https://rinkeby.infura.io/"
				+ "SpqDcPUIxkJRS4ZPXKFS")); // 
			
		//loading credentials
	credentials = WalletUtils.loadCredentials("Kuzu6024",
				"/home/lab-info/.ethereum/testnet/keystore/"
				+ "UTC--2018-04-04T13-47-42.940000000Z--"
				+ "b6c595bc339e998b333766056791b2e6f283e3ef.json");
	//deploying smart contract
	
		 GroupBoardSC contract = GroupBoardSC.deploy(web3j, credentials,
		 ManagedTransaction.GAS_PRICE, Contract.GAS_LIMIT).send();
		 contractAddress = contract.getContractAddress();
		 System.out.println(contractAddress);
	

	}

	@OPERATION
	void adoptRolee(String role) throws Exception {
		//loading the smart contract
		GroupBoardSC contract = GroupBoardSC.load(contractAddress, web3j, credentials,
				ManagedTransaction.GAS_PRICE, Contract.GAS_LIMIT);
		
		String str = getCurrentOpAgentBody().toString();
		
		
		TransactionReceipt transactionReceipt = contract.adoptRole(role, str).send();

	}

	@OPERATION
	// creation
	public void createGroupe(String id, String type, OpFeedbackParam<ArtifactId> idd) {
		/*ArtifactId id1;
		try {
			id1 = makeArtifact("myorg", "ora4mas.nopl.OrgBoard", new ArtifactConfig("src/org/house-os.xml"));
			execLinkedOp(id1, "createGroup", id, type, idd);

		} catch (OperationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/


		GroupBoardSC contract = GroupBoardSC.load(contractAddress, web3j, credentials,
				ManagedTransaction.GAS_PRICE, Contract.GAS_LIMIT);
		String str = idd.toString();
		// here should go the code of the client.js
		try {
			TransactionReceipt transactionReceipt = contract.createGroup(id, type, str).send();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
