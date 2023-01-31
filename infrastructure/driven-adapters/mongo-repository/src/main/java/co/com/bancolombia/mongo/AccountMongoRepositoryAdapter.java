package co.com.bancolombia.mongo;

import co.com.bancolombia.model.account.Account;
import co.com.bancolombia.model.account.gateways.AccountRepository;
import co.com.bancolombia.mongo.helper.AdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AccountMongoRepositoryAdapter extends AdapterOperations<Account, AccountDTO, String, AccountMongoDBRepository>
implements AccountRepository
{
    public AccountMongoRepositoryAdapter(AccountMongoDBRepository repository, ObjectMapper mapper) {
        /**
         *  Could be use mapper.mapBuilder if your domain model implement builder pattern
         *  super(repository, mapper, d -> mapper.mapBuilder(d,ObjectModel.ObjectModelBuilder.class).build());
         *  Or using mapper.map with the class of the object model
         */
        super(repository, mapper, d -> mapper.mapBuilder(d, Account.AccountBuilder.class).build());
    }

    @Override
    public List<Account> getAccounts() {
        return super.findAll();
    }

    @Override
    public Account getAccountById(int accountNumber) {
        return super.findById(Integer.toString(accountNumber));
    }
}
