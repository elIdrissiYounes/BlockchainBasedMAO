package tools;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Bytes32;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 3.2.0.
 */
public class GroupBoardSC extends Contract {
    private static final String BINARY = "0x606060405234156200001057600080fd5b6200007760017f01000000000000000000000000000000000000000000000000000000000000000260107f010000000000000000000000000000000000000000000000000000000000000002176200007d6401000000000262001b66176401000000009004565b62000a90565b60008060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1614806200010357506000620001016000809054906101000a900473ffffffffffffffffffffffffffffffffffffffff1662000404640100000000026200119c176401000000009004565b145b156200012b576200012960006200040f64010000000002620011a7176401000000009004565b505b6000809054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166338cc48316000604051602001526040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401602060405180830381600087803b1515620001b957600080fd5b6102c65a03f11515620001cb57600080fd5b5050506040518051905073ffffffffffffffffffffffffffffffffffffffff16600160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1614151562000317576000809054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166338cc48316000604051602001526040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401602060405180830381600087803b1515620002ba57600080fd5b6102c65a03f11515620002cc57600080fd5b50505060405180519050600160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055505b600160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1663688dcfd7826040518263ffffffff167c010000000000000000000000000000000000000000000000000000000002815260040180827effffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff19167effffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff19168152602001915050600060405180830381600087803b1515620003ec57600080fd5b6102c65a03f11515620003fe57600080fd5b50505050565b6000813b9050919050565b60006200042f6200043664010000000002620015f0176401000000009004565b9050919050565b6000806200046c731d3b2638a7cc9f2cb3d298a3da7a90b67e5506ed62000404640100000000026200119c176401000000009004565b11156200052557731d3b2638a7cc9f2cb3d298a3da7a90b67e5506ed6000806101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055506200051b6040805190810160405280600b81526020017f6574685f6d61696e6e6574000000000000000000000000000000000000000000815250620009c56401000000000262001a7f176401000000009004565b60019050620009c2565b60006200055a73c03a2615d5efaf5f49f60b7bb6583eaec212fdf162000404640100000000026200119c176401000000009004565b1115620006135773c03a2615d5efaf5f49f60b7bb6583eaec212fdf16000806101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff160217905550620006096040805190810160405280600c81526020017f6574685f726f707374656e330000000000000000000000000000000000000000815250620009c56401000000000262001a7f176401000000009004565b60019050620009c2565b60006200064873b7a07bcf2ba2f2703b24c0691b5278999c59ac7e62000404640100000000026200119c176401000000009004565b1115620007015773b7a07bcf2ba2f2703b24c0691b5278999c59ac7e6000806101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff160217905550620006f76040805190810160405280600981526020017f6574685f6b6f76616e0000000000000000000000000000000000000000000000815250620009c56401000000000262001a7f176401000000009004565b60019050620009c2565b60006200073673146500cfd35b22e4a392fe0adc06de1a1368ed4862000404640100000000026200119c176401000000009004565b1115620007ef5773146500cfd35b22e4a392fe0adc06de1a1368ed486000806101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff160217905550620007e56040805190810160405280600b81526020017f6574685f72696e6b656279000000000000000000000000000000000000000000815250620009c56401000000000262001a7f176401000000009004565b60019050620009c2565b600062000824736f485c8bf6fc43ea212e93bbf8ce046c7f1cb47562000404640100000000026200119c176401000000009004565b11156200088957736f485c8bf6fc43ea212e93bbf8ce046c7f1cb4756000806101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555060019050620009c2565b6000620008be7320e12a1f859b3feae5fb2a0a32c18f5a65555bbf62000404640100000000026200119c176401000000009004565b111562000923577320e12a1f859b3feae5fb2a0a32c18f5a65555bbf6000806101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555060019050620009c2565b6000620009587351efaf4c8b3c9afbd5ab9f4bbc82784ab6ef8faa62000404640100000000026200119c176401000000009004565b1115620009bd577351efaf4c8b3c9afbd5ab9f4bbc82784ab6ef8faa6000806101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555060019050620009c2565b600090505b90565b8060029080519060200190620009dd929190620009e1565b5050565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f1062000a2457805160ff191683800117855562000a55565b8280016001018555821562000a55579182015b8281111562000a5457825182559160200191906001019062000a37565b5b50905062000a64919062000a68565b5090565b62000a8d91905b8082111562000a8957600081600090555060010162000a6f565b5090565b90565b611ee48062000aa06000396000f300606060405260043610610083576000357c0100000000000000000000000000000000000000000000000000000000900463ffffffff16806327dc297e146100885780633073efdd146100f257806338bbfa50146101d55780636537214714610282578063d13abacd14610310578063d98645c5146103b0578063f8a8fd6d146103e1575b600080fd5b341561009357600080fd5b6100f060048080356000191690602001909190803590602001908201803590602001908080601f016020809104026020016040519081016040528093929190818152602001838380828437820191505050505050919050506103f6565b005b34156100fd57600080fd5b6101d3600480803590602001908201803590602001908080601f0160208091040260200160405190810160405280939291908181526020018383808284378201915050505050509190803590602001908201803590602001908080601f0160208091040260200160405190810160405280939291908181526020018383808284378201915050505050509190803590602001908201803590602001908080601f01602080910402602001604051908101604052809392919081815260200183838082843782019150505050505091905050610452565b005b34156101e057600080fd5b61028060048080356000191690602001909190803590602001908201803590602001908080601f0160208091040260200160405190810160405280939291908181526020018383808284378201915050505050509190803590602001908201803590602001908080601f01602080910402602001604051908101604052809392919081815260200183838082843782019150505050505091905050610607565b005b341561028d57600080fd5b61029561060c565b6040518080602001828103825283818151815260200191508051906020019080838360005b838110156102d55780820151818401526020810190506102ba565b50505050905090810190601f1680156103025780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b341561031b57600080fd5b6103ae600480803590602001908201803590602001908080601f0160208091040260200160405190810160405280939291908181526020018383808284378201915050505050509190803590602001908201803590602001908080601f016020809104026020016040519081016040528093929190818152602001838380828437820191505050505050919050506106aa565b005b34156103bb57600080fd5b6103c36107dd565b60405180826000191660001916815260200191505060405180910390f35b34156103ec57600080fd5b6103f46107e3565b005b6103fe61088a565b73ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff1614151561043757600080fd5b806005908051906020019061044d929190611a99565b505050565b61045a611b19565b610462611b19565b6104d76040805190810160405280600181526020017f26000000000000000000000000000000000000000000000000000000000000008152506040805190810160405280600581526020017f747970653d00000000000000000000000000000000000000000000000000000081525086610ba0565b915061054e6040805190810160405280600181526020017f26000000000000000000000000000000000000000000000000000000000000008152506040805190810160405280600481526020017f6964643d0000000000000000000000000000000000000000000000000000000081525085610ba0565b90506105f66040805190810160405280600381526020017f55524c00000000000000000000000000000000000000000000000000000000008152506105f1606060405190810160405280603881526020017f68747470733a2f2f706f70756c61722d6c696f6e2d33302e6c6f63616c74756e81526020017f6e656c2e6d652f6170692f76312f6372656174653f69643d0000000000000000815250888686610bde565b610c0d565b600681600019169055505050505050565b505050565b60058054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156106a25780601f10610677576101008083540402835291602001916106a2565b820191906000526020600020905b81548152906001019060200180831161068557829003601f168201915b505050505081565b6106b2611b19565b6107266040805190810160405280600181526020017f26000000000000000000000000000000000000000000000000000000000000008152506040805190810160405280600481526020017f6964643d0000000000000000000000000000000000000000000000000000000081525061114f565b90506107ce6040805190810160405280600381526020017f55524c00000000000000000000000000000000000000000000000000000000008152506107c9606060405190810160405280603981526020017f68747470733a2f2f706f70756c61722d6c696f6e2d33302e6c6f63616c74756e81526020017f6e656c2e6d652f6170692f76312f61646f70743f726f6c653d00000000000000815250868587610bde565b610c0d565b60068160001916905550505050565b60065481565b61087e6040805190810160405280600381526020017f55524c0000000000000000000000000000000000000000000000000000000000815250606060405190810160405280603281526020017f68747470733a2f2f706f70756c61722d6c696f6e2d33302e6c6f63616c74756e81526020017f6e656c2e6d652f6170692f76312f746573740000000000000000000000000000815250610c0d565b60068160001916905550565b6000806000809054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1614806108fa575060006108f86000809054906101000a900473ffffffffffffffffffffffffffffffffffffffff1661119c565b145b1561090b5761090960006111a7565b505b6000809054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166338cc48316000604051602001526040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401602060405180830381600087803b151561099857600080fd5b6102c65a03f115156109a957600080fd5b5050506040518051905073ffffffffffffffffffffffffffffffffffffffff16600160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16141515610af2576000809054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166338cc48316000604051602001526040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401602060405180830381600087803b1515610a9657600080fd5b6102c65a03f11515610aa757600080fd5b50505060405180519050600160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055505b600160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1663c281d19e6000604051602001526040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401602060405180830381600087803b1515610b8057600080fd5b6102c65a03f11515610b9157600080fd5b50505060405180519050905090565b610ba8611b19565b610bd5848484602060405190810160405280600081525060206040519081016040528060008152506111b8565b90509392505050565b610be6611b19565b610c038585858560206040519081016040528060008152506111b8565b9050949350505050565b60008060008060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff161480610c7f57506000610c7d6000809054906101000a900473ffffffffffffffffffffffffffffffffffffffff1661119c565b145b15610c9057610c8e60006111a7565b505b6000809054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166338cc48316000604051602001526040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401602060405180830381600087803b1515610d1d57600080fd5b6102c65a03f11515610d2e57600080fd5b5050506040518051905073ffffffffffffffffffffffffffffffffffffffff16600160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16141515610e77576000809054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166338cc48316000604051602001526040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401602060405180830381600087803b1515610e1b57600080fd5b6102c65a03f11515610e2c57600080fd5b50505060405180519050600160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055505b600160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1663524f3889856000604051602001526040518263ffffffff167c01000000000000000000000000000000000000000000000000000000000281526004018080602001828103825283818151815260200191508051906020019080838360005b83811015610f2a578082015181840152602081019050610f0f565b50505050905090810190601f168015610f575780820380516001836020036101000a031916815260200191505b5092505050602060405180830381600087803b1515610f7557600080fd5b6102c65a03f11515610f8657600080fd5b50505060405180519050905062030d403a02670de0b6b3a764000001811115610fb55760006001029150611148565b600160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1663adf59f9982600087876000604051602001526040518563ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401808481526020018060200180602001838103835285818151815260200191508051906020019080838360005b8381101561107657808201518184015260208101905061105b565b50505050905090810190601f1680156110a35780820380516001836020036101000a031916815260200191505b50838103825284818151815260200191508051906020019080838360005b838110156110dc5780820151818401526020810190506110c1565b50505050905090810190601f1680156111095780820380516001836020036101000a031916815260200191505b50955050505050506020604051808303818588803b151561112957600080fd5b6125ee5a03f1151561113a57600080fd5b505050506040518051905091505b5092915050565b611157611b19565b61119483836020604051908101604052806000815250602060405190810160405280600081525060206040519081016040528060008152506111b8565b905092915050565b6000813b9050919050565b60006111b16115f0565b9050919050565b6111c0611b19565b6111c8611b2d565b6111d0611b2d565b6111d8611b2d565b6111e0611b2d565b6111e8611b2d565b6111f0611b19565b6111f8611b2d565b6000808e98508d97508c96508b95508a94508451865188518a518c51010101016040518059106112255750595b9080825280601f01601f1916602001820160405250935083925060009150600090505b88518110156112fb57888181518110151561125f57fe5b9060200101517f010000000000000000000000000000000000000000000000000000000000000090047f01000000000000000000000000000000000000000000000000000000000000000283838060010194508151811015156112be57fe5b9060200101907effffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff1916908160001a9053508080600101915050611248565b600090505b87518110156113b357878181518110151561131757fe5b9060200101517f010000000000000000000000000000000000000000000000000000000000000090047f010000000000000000000000000000000000000000000000000000000000000002838380600101945081518110151561137657fe5b9060200101907effffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff1916908160001a9053508080600101915050611300565b600090505b865181101561146b5786818151811015156113cf57fe5b9060200101517f010000000000000000000000000000000000000000000000000000000000000090047f010000000000000000000000000000000000000000000000000000000000000002838380600101945081518110151561142e57fe5b9060200101907effffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff1916908160001a90535080806001019150506113b8565b600090505b855181101561152357858181518110151561148757fe5b9060200101517f010000000000000000000000000000000000000000000000000000000000000090047f01000000000000000000000000000000000000000000000000000000000000000283838060010194508151811015156114e657fe5b9060200101907effffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff1916908160001a9053508080600101915050611470565b600090505b84518110156115db57848181518110151561153f57fe5b9060200101517f010000000000000000000000000000000000000000000000000000000000000090047f010000000000000000000000000000000000000000000000000000000000000002838380600101945081518110151561159e57fe5b9060200101907effffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff1916908160001a9053508080600101915050611528565b82995050505050505050505095945050505050565b600080611610731d3b2638a7cc9f2cb3d298a3da7a90b67e5506ed61119c565b11156116b157731d3b2638a7cc9f2cb3d298a3da7a90b67e5506ed6000806101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055506116a86040805190810160405280600b81526020017f6574685f6d61696e6e6574000000000000000000000000000000000000000000815250611a7f565b60019050611a7c565b60006116d073c03a2615d5efaf5f49f60b7bb6583eaec212fdf161119c565b11156117715773c03a2615d5efaf5f49f60b7bb6583eaec212fdf16000806101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055506117686040805190810160405280600c81526020017f6574685f726f707374656e330000000000000000000000000000000000000000815250611a7f565b60019050611a7c565b600061179073b7a07bcf2ba2f2703b24c0691b5278999c59ac7e61119c565b11156118315773b7a07bcf2ba2f2703b24c0691b5278999c59ac7e6000806101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055506118286040805190810160405280600981526020017f6574685f6b6f76616e0000000000000000000000000000000000000000000000815250611a7f565b60019050611a7c565b600061185073146500cfd35b22e4a392fe0adc06de1a1368ed4861119c565b11156118f15773146500cfd35b22e4a392fe0adc06de1a1368ed486000806101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055506118e86040805190810160405280600b81526020017f6574685f72696e6b656279000000000000000000000000000000000000000000815250611a7f565b60019050611a7c565b6000611910736f485c8bf6fc43ea212e93bbf8ce046c7f1cb47561119c565b111561197357736f485c8bf6fc43ea212e93bbf8ce046c7f1cb4756000806101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555060019050611a7c565b60006119927320e12a1f859b3feae5fb2a0a32c18f5a65555bbf61119c565b11156119f5577320e12a1f859b3feae5fb2a0a32c18f5a65555bbf6000806101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555060019050611a7c565b6000611a147351efaf4c8b3c9afbd5ab9f4bbc82784ab6ef8faa61119c565b1115611a77577351efaf4c8b3c9afbd5ab9f4bbc82784ab6ef8faa6000806101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555060019050611a7c565b600090505b90565b8060029080519060200190611a95929190611a99565b5050565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f10611ada57805160ff1916838001178555611b08565b82800160010185558215611b08579182015b82811115611b07578251825591602001919060010190611aec565b5b509050611b159190611b41565b5090565b602060405190810160405280600081525090565b602060405190810160405280600081525090565b611b6391905b80821115611b5f576000816000905550600101611b47565b5090565b90565b60008060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff161480611bd557506000611bd36000809054906101000a900473ffffffffffffffffffffffffffffffffffffffff1661119c565b145b15611be657611be460006111a7565b505b6000809054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166338cc48316000604051602001526040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401602060405180830381600087803b1515611c7357600080fd5b6102c65a03f11515611c8457600080fd5b5050506040518051905073ffffffffffffffffffffffffffffffffffffffff16600160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16141515611dcd576000809054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff166338cc48316000604051602001526040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401602060405180830381600087803b1515611d7157600080fd5b6102c65a03f11515611d8257600080fd5b50505060405180519050600160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055505b600160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1663688dcfd7826040518263ffffffff167c010000000000000000000000000000000000000000000000000000000002815260040180827effffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff19167effffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff19168152602001915050600060405180830381600087803b1515611ea157600080fd5b6102c65a03f11515611eb257600080fd5b505050505600a165627a7a72305820ac6f6dfa613139045b23a55d44f6acf3d166d250cfce0da44ea0ce50961eef830029";

    protected static final HashMap<String, String> _addresses;

    static {
        _addresses = new HashMap<>();
    }

    protected GroupBoardSC(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected GroupBoardSC(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public RemoteCall<TransactionReceipt> __callback(byte[] _oraclizeID, String _result) {
        Function function = new Function(
                "__callback", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(_oraclizeID), 
                new org.web3j.abi.datatypes.Utf8String(_result)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> createGroup(String id, String t, String artid) {
        Function function = new Function(
                "createGroup", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(id), 
                new org.web3j.abi.datatypes.Utf8String(t), 
                new org.web3j.abi.datatypes.Utf8String(artid)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> __callback(byte[] myid, String result, byte[] proof) {
        Function function = new Function(
                "__callback", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(myid), 
                new org.web3j.abi.datatypes.Utf8String(result), 
                new org.web3j.abi.datatypes.DynamicBytes(proof)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> result() {
        Function function = new Function("result", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> adoptRole(String role, String GrArtId) {
        Function function = new Function(
                "adoptRole", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(role), 
                new org.web3j.abi.datatypes.Utf8String(GrArtId)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<byte[]> oraclizeID() {
        Function function = new Function("oraclizeID", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<TransactionReceipt> test() {
        Function function = new Function(
                "test", 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<GroupBoardSC> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(GroupBoardSC.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<GroupBoardSC> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(GroupBoardSC.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    public static GroupBoardSC load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new GroupBoardSC(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static GroupBoardSC load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new GroupBoardSC(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected String getStaticDeployedAddress(String networkId) {
        return _addresses.get(networkId);
    }

    public static String getPreviouslyDeployedAddress(String networkId) {
        return _addresses.get(networkId);
    }
}
