package net.javaguides.bankingApplication.repository;

import net.javaguides.bankingApplication.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long>{

}
