package by.jrr.fp.nbrbclient.repository;


import by.jrr.fp.nbrbclient.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findAllByFirstName(String firstName);
    List<User> findAllByLastName(String lastName);

}
