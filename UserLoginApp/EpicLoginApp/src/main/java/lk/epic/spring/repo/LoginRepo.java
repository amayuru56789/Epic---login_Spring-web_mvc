package lk.epic.spring.repo;

import lk.epic.spring.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Amayuru indeewara
 * @created 30/11/2022 - 18:42
 * @project EpicLoginApp
 */
public interface LoginRepo extends JpaRepository<User, String> {
}
