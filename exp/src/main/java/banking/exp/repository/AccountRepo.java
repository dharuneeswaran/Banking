package banking.exp.repository;

import banking.exp.model.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepo extends JpaRepository<BankAccount, Integer> {
}