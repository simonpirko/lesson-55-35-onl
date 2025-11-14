package by.tms.lesson5535onl.repository;

import by.tms.lesson5535onl.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
