package co.com.bancolombia.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface AccountMongoDBRepository extends MongoRepository<AccountDTO, String> , QueryByExampleExecutor<AccountDTO> {
}
