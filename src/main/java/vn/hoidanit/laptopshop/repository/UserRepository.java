package vn.hoidanit.laptopshop.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import vn.hoidanit.laptopshop.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{
    User save(User hoidanit);
    List<User> findByEmail(String email);
    Optional<User> findById(long id);
    User getById(Long Id);
    void deleteById(long id);
}
