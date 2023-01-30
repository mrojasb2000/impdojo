package co.com.bancolombia.usecase.account;

import co.com.bancolombia.model.account.Account;
import co.com.bancolombia.model.account.gateways.AccountRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class AccountUseCase {
    private AccountRepository accountRepository;

    public List<Account> getAccounts(){
        return accountRepository.getAccounts();
    }

    public Account getAccountById(int accountNumber){
        return accountRepository.getAccountById(accountNumber);
    }
}
