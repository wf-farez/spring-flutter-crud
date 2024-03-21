
package springfluttercrud.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import springfluttercrud.entity.User;

public interface UsersRepository extends JpaRepository<User, Integer> {
    User findByName(String name);
}


