package co.com.bancolombia.mongo;

import co.com.bancolombia.model.account.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface AccountMongoDBRepository extends MongoRepository<AccountDTO, String> , QueryByExampleExecutor<AccountDTO> {

    //public Account findById(int id);
}
