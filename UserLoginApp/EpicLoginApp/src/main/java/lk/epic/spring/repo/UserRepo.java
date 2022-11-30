package lk.epic.spring.repo;

import lk.epic.spring.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Amayuru indeewara
 * @created 30/11/2022 - 16:02
 * @project EpicLoginApp
 */
public interface UserRepo extends JpaRepository<User, String> {
}
