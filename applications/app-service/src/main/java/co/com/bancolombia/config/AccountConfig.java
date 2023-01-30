package co.com.bancolombia.config;

import co.com.bancolombia.model.account.gateways.AccountRepository;
import co.com.bancolombia.usecase.account.AccountUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AccountConfig {
    @Bean
    public AccountUseCase AccountUseCase(AccountRepository accountRepository){
        return new AccountUseCase(accountRepository);
    }
}
