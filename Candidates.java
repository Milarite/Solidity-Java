package Voting_App_Java-Solidity;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Uint256;
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
 * <p>Generated with web3j version 3.5.0.
 */
public class Candidates extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506111f9806100206000396000f3006080604052600436106100f05763ffffffff7c01000000000000000000000000000000000000000000000000000000006000350416630d3c05b181146100f55780631e0efcf31461018b5780633e2b1ae7146101ac5780634bd231db146101df57806361fe3163146102005780636efdce6d146102755780638cd32d5a1461029657806394e4bf6c146102ae5780639a55605e146102cf5780639e611f11146104305780639ff00ac114610454578063b41435a314610469578063b567c63c1461048a578063ba13af67146105ab578063c27eb745146101ac578063e24c09eb146105cc578063f4b29ed914610647575b600080fd5b34801561010157600080fd5b50610116600160a060020a03600435166106ae565b6040805160208082528351818301528351919283929083019185019080838360005b83811015610150578181015183820152602001610138565b50505050905090810190601f16801561017d5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b34801561019757600080fd5b50610116600160a060020a036004351661075c565b3480156101b857600080fd5b506101cd600160a060020a03600435166107d0565b60408051918252519081900360200190f35b3480156101eb57600080fd5b50610116600160a060020a03600435166107ee565b34801561020c57600080fd5b506040805160206004803580820135601f81018490048402850184019095528484526102599436949293602493928401919081908401838280828437509497506108659650505050505050565b60408051600160a060020a039092168252519081900360200190f35b34801561028157600080fd5b50610116600160a060020a03600435166108d6565b3480156102a257600080fd5b5061025960043561094d565b3480156102ba57600080fd5b50610116600160a060020a0360043516610979565b3480156102db57600080fd5b5060408051602060046024803582810135601f810185900485028601850190965285855261042e958335600160a060020a031695369560449491939091019190819084018382808284375050604080516020601f89358b018035918201839004830284018301909452808352979a99988101979196509182019450925082915084018382808284375050604080516020601f89358b018035918201839004830284018301909452808352979a99988101979196509182019450925082915084018382808284375050604080516020601f89358b018035918201839004830284018301909452808352979a99988101979196509182019450925082915084018382808284375050604080516020601f89358b018035918201839004830284018301909452808352979a9998810197919650918201945092508291508401838280828437509497506109ee9650505050505050565b005b34801561043c57600080fd5b5061042e600160a060020a0360043516602435610adf565b34801561046057600080fd5b506101cd610b2a565b34801561047557600080fd5b50610116600160a060020a0360043516610b31565b34801561049657600080fd5b5060408051602060046024803582810135601f810185900485028601850190965285855261042e958335600160a060020a031695369560449491939091019190819084018382808284375050604080516020601f89358b018035918201839004830284018301909452808352979a99988101979196509182019450925082915084018382808284375050604080516020601f89358b018035918201839004830284018301909452808352979a99988101979196509182019450925082915084018382808284375050604080516020601f89358b018035918201839004830284018301909452808352979a999881019791965091820194509250829150840183828082843750949750610bab9650505050505050565b3480156105b757600080fd5b50610116600160a060020a0360043516610d31565b3480156105d857600080fd5b5060408051602060046024803582810135601f8101859004850286018501909652858552610633958335600160a060020a0316953695604494919390910191908190840183828082843750949750610da69650505050505050565b604080519115158252519081900360200190f35b34801561065357600080fd5b5060408051602060046024803582810135601f810185900485028601850190965285855261042e958335600160a060020a0316953695604494919390910191908190840183828082843750949750610f819650505050505050565b600160a060020a03811660009081526003602090815260409182902060040180548351601f60026000196101006001861615020190931692909204918201849004840281018401909452808452606093928301828280156107505780601f1061072557610100808354040283529160200191610750565b820191906000526020600020905b81548152906001019060200180831161073357829003601f168201915b50505050509050919050565b600160a060020a0381166000908152600260208181526040928390208201805484516001821615610100026000190190911693909304601f810183900483028401830190945283835260609390918301828280156107505780601f1061072557610100808354040283529160200191610750565b600160a060020a031660009081526004602052604090206001015490565b600160a060020a03811660009081526003602090815260409182902060050180548351601f60026000196101006001861615020190931692909204918201849004840281018401909452808452606093928301828280156107505780601f1061072557610100808354040283529160200191610750565b60006001826040518082805190602001908083835b602083106108995780518252601f19909201916020918201910161087a565b51815160209384036101000a6000190180199092169116179052920194855250604051938490030190922054600160a060020a0316949350505050565b600160a060020a03811660009081526003602081815260409283902090910180548351601f60026000196101006001861615020190931692909204918201849004840281018401909452808452606093928301828280156107505780601f1061072557610100808354040283529160200191610750565b600060058281548110151561095e57fe5b600091825260209091200154600160a060020a031692915050565b600160a060020a038116600090815260026020818152604092839020600301805484516001821615610100026000190190911693909304601f810183900483028401830190945283835260609390918301828280156107505780601f1061072557610100808354040283529160200191610750565b6040805160c081018252600160a060020a0388811680835260208084018a81528486018a9052606085018990526080850188905260a085018790526000928352600382529490912083518154600160a060020a03191693169290921782559251805192939192610a6492600185019201906110ee565b5060408201518051610a809160028401916020909101906110ee565b5060608201518051610a9c9160038401916020909101906110ee565b5060808201518051610ab89160048401916020909101906110ee565b5060a08201518051610ad49160058401916020909101906110ee565b505050505050505050565b604080518082018252600160a060020a0393841680825260208083019485526000918252600490529190912090518154600160a060020a031916931692909217825551600190910155565b6005545b90565b600160a060020a0381166000908152600360209081526040918290206002908101805484516001821615610100026000190190911692909204601f810184900484028301840190945283825260609391929091908301828280156107505780601f1061072557610100808354040283529160200191610750565b6005805460018181019092557f036b6384b5eca791c62761152d0c79bb0604c104a5fb6f4eb0703f3154bb3db0018054600160a060020a03808916600160a060020a031992831681179093556040805160a08101825284815260208181018b81528284018b9052606083018a905260808301899052600096875260028252929095208151815494169390941692909217835551805191949293610c53938501929101906110ee565b5060408201518051610c6f9160028401916020909101906110ee565b5060608201518051610c8b9160038401916020909101906110ee565b5060808201518051610ca79160048401916020909101906110ee565b50905050846001856040518082805190602001908083835b60208310610cde5780518252601f199092019160209182019101610cbf565b51815160209384036101000a600019018019909216911617905292019485525060405193849003019092208054600160a060020a031916600160a060020a03949094169390931790925550505050505050565b600160a060020a038116600090815260026020818152604092839020600401805484516001821615610100026000190190911693909304601f810183900483028401830190945283835260609390918301828280156107505780601f1061072557610100808354040283529160200191610750565b6000816040516020018082805190602001908083835b60208310610ddb5780518252601f199092019160209182019101610dbc565b6001836020036101000a0380198251168184511680821785525050505050509050019150506040516020818303038152906040526040518082805190602001908083835b60208310610e3e5780518252601f199092019160209182019101610e1f565b6001836020036101000a0380198251168184511680821785525050505050509050019150506040518091039020600019166002600085600160a060020a0316600160a060020a031681526020019081526020016000206004016040516020018082805460018160011615610100020316600290048015610ef55780601f10610ed3576101008083540402835291820191610ef5565b820191906000526020600020905b815481529060010190602001808311610ee1575b50509150506040516020818303038152906040526040518082805190602001908083835b60208310610f385780518252601f199092019160209182019101610f19565b6001836020036101000a0380198251168184511680821785525050505050509050019150506040518091039020600019161415610f7757506001610f7b565b5060005b92915050565b600160a060020a03821660009081526002602052604081208054600160a060020a031916815590610fb5600183018261116c565b610fc360028301600061116c565b610fd160038301600061116c565b610fdf60048301600061116c565b5050600160a060020a03821660009081526003602052604081208054600160a060020a031916815590611015600183018261116c565b61102360028301600061116c565b61103160038301600061116c565b61103f60048301600061116c565b61104d60058301600061116c565b5050600160a060020a03821660009081526004602090815260408083208054600160a060020a031916815560019081019390935551835184928291908401908083835b602083106110af5780518252601f199092019160209182019101611090565b51815160209384036101000a600019018019909216911617905292019485525060405193849003019092208054600160a060020a031916905550505050565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f1061112f57805160ff191683800117855561115c565b8280016001018555821561115c579182015b8281111561115c578251825591602001919060010190611141565b506111689291506111b3565b5090565b50805460018160011615610100020316600290046000825580601f1061119257506111b0565b601f0160209004906000526020600020908101906111b091906111b3565b50565b610b2e91905b8082111561116857600081556001016111b95600a165627a7a723058201a78a2258c161089aa6fb17abad4d2c19e32ed63c70be8b38d8fd4e5a6e653400029";

    public static final String FUNC_GETCANDIDATEPHONENUMBER = "getCandidatePhonenumber";

    public static final String FUNC_GETCANDIDATENAME = "getCandidateName";

    public static final String FUNC_GETCANDIDATENUMBEROFVOTES = "getCandidateNumberOfVotes";

    public static final String FUNC_GETCANDIDATECAMPAIGN = "getCandidateCampaign";

    public static final String FUNC_GETCANDIDATEADDRESSBYNATIONALID = "getCandidateAddressByNationalId";

    public static final String FUNC_GETCANDIDATEYEAR = "getCandidateYear";

    public static final String FUNC_GETNATIONALID = "getNationalID";

    public static final String FUNC_GETCANDIDATEBIRTHOFDATE = "getCandidatebirthOfDate";

    public static final String FUNC_ADDCANDIDATEDETAILS = "addCandidateDetails";

    public static final String FUNC_ADDCANDIDATETRACKING = "addCandidateTracking";

    public static final String FUNC_GETNATIONALIDARRAYLENGTH = "getNationalIDArrayLength";

    public static final String FUNC_GETCANDIDATECITY = "getCandidateCity";

    public static final String FUNC_ADDCANDIDATE = "addCandidate";

    public static final String FUNC_GETCANDIDATEPASSWORD = "getCandidatePassword";

    public static final String FUNC_GETCANDIDATEVOTESNUMBER = "getCandidateVotesNumber";

    public static final String FUNC_CHECKIDANDPASSWORD = "checkIdAndPassword";

    public static final String FUNC_DELETECANDIDATE = "deleteCandidate";

    protected Candidates(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Candidates(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public RemoteCall<String> getCandidatePhonenumber(String _address) {
        final Function function = new Function(FUNC_GETCANDIDATEPHONENUMBER, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_address)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> getCandidateName(String _address) {
        final Function function = new Function(FUNC_GETCANDIDATENAME, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_address)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<BigInteger> getCandidateNumberOfVotes(String _address) {
        final Function function = new Function(FUNC_GETCANDIDATENUMBEROFVOTES, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_address)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<String> getCandidateCampaign(String _address) {
        final Function function = new Function(FUNC_GETCANDIDATECAMPAIGN, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_address)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> getCandidateAddressByNationalId(String nationalId) {
        final Function function = new Function(FUNC_GETCANDIDATEADDRESSBYNATIONALID, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(nationalId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> getCandidateYear(String _address) {
        final Function function = new Function(FUNC_GETCANDIDATEYEAR, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_address)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> getNationalID(BigInteger index) {
        final Function function = new Function(FUNC_GETNATIONALID, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(index)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> getCandidatebirthOfDate(String _address) {
        final Function function = new Function(FUNC_GETCANDIDATEBIRTHOFDATE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_address)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> addCandidateDetails(String _address, String candidateIdNumber, String city, String year, String phoneNumber, String campaign) {
        final Function function = new Function(
                FUNC_ADDCANDIDATEDETAILS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_address), 
                new org.web3j.abi.datatypes.Utf8String(candidateIdNumber), 
                new org.web3j.abi.datatypes.Utf8String(city), 
                new org.web3j.abi.datatypes.Utf8String(year), 
                new org.web3j.abi.datatypes.Utf8String(phoneNumber), 
                new org.web3j.abi.datatypes.Utf8String(campaign)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> addCandidateTracking(String _address, BigInteger numberOfVotes) {
        final Function function = new Function(
                FUNC_ADDCANDIDATETRACKING, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_address), 
                new org.web3j.abi.datatypes.generated.Uint256(numberOfVotes)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> getNationalIDArrayLength() {
        final Function function = new Function(FUNC_GETNATIONALIDARRAYLENGTH, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<String> getCandidateCity(String _address) {
        final Function function = new Function(FUNC_GETCANDIDATECITY, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_address)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> addCandidate(String _address, String candidateIdNumber, String name, String birthOfDate, String password) {
        final Function function = new Function(
                FUNC_ADDCANDIDATE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_address), 
                new org.web3j.abi.datatypes.Utf8String(candidateIdNumber), 
                new org.web3j.abi.datatypes.Utf8String(name), 
                new org.web3j.abi.datatypes.Utf8String(birthOfDate), 
                new org.web3j.abi.datatypes.Utf8String(password)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> getCandidatePassword(String _address) {
        final Function function = new Function(FUNC_GETCANDIDATEPASSWORD, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_address)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<BigInteger> getCandidateVotesNumber(String _address) {
        final Function function = new Function(FUNC_GETCANDIDATEVOTESNUMBER, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_address)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<Boolean> checkIdAndPassword(String _address, String password) {
        final Function function = new Function(FUNC_CHECKIDANDPASSWORD, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_address), 
                new org.web3j.abi.datatypes.Utf8String(password)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteCall<TransactionReceipt> deleteCandidate(String _address, String nationalID) {
        final Function function = new Function(
                FUNC_DELETECANDIDATE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_address), 
                new org.web3j.abi.datatypes.Utf8String(nationalID)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<Candidates> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Candidates.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<Candidates> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Candidates.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    public static Candidates load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Candidates(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static Candidates load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Candidates(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }
}
