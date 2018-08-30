package tools;

import java.io.File;

import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.Contract;
import org.web3j.tx.ManagedTransaction;


public class Test {

	public static void main(String[] args) throws Exception {
		  Web3j web3j;
		String contractAddress;
		 Credentials credentials;
		web3j = Web3j.build(new HttpService("https://rinkeby.infura.io/SpqDcPUIxkJRS4ZPXKFS"));	
		//WalletUtils.generateNewWalletFile("Kuzu6024",new File("/home/lab-info/Bureau/wallet"), true);
		credentials = WalletUtils.loadCredentials("Kuzu6024","/home/lab-info/.ethereum/testnet/keystore/UTC--2018-04-04T13-47-42.940000000Z--b6c595bc339e998b333766056791b2e6f283e3ef.json");
		 GroupBoardSC contract = GroupBoardSC.deploy(web3j, credentials,
				 ManagedTransaction.GAS_PRICE, Contract.GAS_LIMIT).send();
				 contractAddress = contract.getContractAddress();
				 
				 
		 contract = GroupBoardSC.load(contractAddress, web3j, credentials,
							ManagedTransaction.GAS_PRICE, Contract.GAS_LIMIT);

					System.out.println(contractAddress);
	TransactionReceipt transactionReceipt = contract.test().send();
	contract.test().send();

	}

}
