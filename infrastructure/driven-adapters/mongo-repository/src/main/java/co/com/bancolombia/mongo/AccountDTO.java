package co.com.bancolombia.mongo;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Builder(toBuilder = true)
@Document(collection = "accounts")
public class AccountDTO {
    @Field("accountNumber")
    private int accountNumber;
    @Field("accountType")
    private int accountType;
}
