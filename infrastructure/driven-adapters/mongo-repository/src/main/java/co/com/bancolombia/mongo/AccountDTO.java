package co.com.bancolombia.mongo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "accounts")
@Getter
@Setter
@Builder(toBuilder = true)
public class AccountDTO {
    @Field("_id")
    private int id;
    @Field("accountNumber")
    private int accountNumber;
    @Field("accountType")
    private int accountType;
}
