package net.javaguides.bankingApplication.service.impl;

import net.javaguides.bankingApplication.dto.AccountDto;
import net.javaguides.bankingApplication.entity.Account;
import net.javaguides.bankingApplication.mapper.AccountMapper;
import net.javaguides.bankingApplication.repository.AccountRepository;
import net.javaguides.bankingApplication.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.mapToAccount(accountDto);
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }
}
