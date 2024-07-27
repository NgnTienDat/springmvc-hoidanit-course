package vn.hoidanit.laptopshop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import vn.hoidanit.laptopshop.domain.User;
import vn.hoidanit.laptopshop.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public User handleSaveUser(User user){
        User ntd = this.userRepository.save(user);
        System.out.println(ntd);
        return ntd;
    }
    public List<User> getAllUsers(){
        return this.userRepository.findAll();
    }
    public List<User> getAllUsersByEmail(String email){
        return this.userRepository.findByEmail(email);
    }
   
    public User getUserById(Long IdUser){ 
        return this.userRepository.getById(IdUser);
    }
    public void deleteAUser(long id){
        this.userRepository.deleteById(id);
    }
}

