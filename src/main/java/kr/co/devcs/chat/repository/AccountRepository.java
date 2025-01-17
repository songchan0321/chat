package kr.co.devcs.chat.repository;

import kr.co.devcs.chat.entity.Account;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {
    @Override
    Optional<Account> findById(Long accountNo);

    Optional<Account> findByPassword(String accountForm);

    @Override
    Account save(Account account);

    @Override
    void delete(Account entity);

    Page<Account> findAllByNicknameLike(Pageable pageable, String nickname);

    List<Account> findByNameAndBirthDate(String name, LocalDate birthDate);
}
