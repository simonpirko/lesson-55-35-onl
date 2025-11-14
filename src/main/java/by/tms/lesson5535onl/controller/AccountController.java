package by.tms.lesson5535onl.controller;

import by.tms.lesson5535onl.dto.CreateAccountDto;
import by.tms.lesson5535onl.entity.Account;
import by.tms.lesson5535onl.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author simonpirko
 * @version 1.0
 * @since 14.11.2025
 */

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;

    @GetMapping
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    @PostMapping
    public Account createAccount(@RequestBody CreateAccountDto dto) {

        Account account = new Account();
        account.setUsername(dto.getUsername());
        account.setPassword(dto.getPassword());

        Account save = accountRepository.save(account);
        return save;
    }
}
