package co.com.bancolombia.api;
import co.com.bancolombia.model.account.Account;
import co.com.bancolombia.usecase.account.AccountUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {
    private final AccountUseCase accountUseCase;

    @GetMapping(path = "/health")
    public String health(){
        return "up";
    }

    @GetMapping(path = "/accounts")
    public List<Account> getAccounts() {
        return accountUseCase.getAccounts();
    }

    @GetMapping(path = "/account/:id")
    public Account getAccounts(int accountNumber) {
        return accountUseCase.getAccountById(accountNumber);
    }
}
