package vn.hoidanit.laptopshop.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import vn.hoidanit.laptopshop.domain.User;
import vn.hoidanit.laptopshop.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class UserController {

    private UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String getHomePage(Model model){
        model.addAttribute("dat", "Hello form model");
        return "hello";
    }
    @RequestMapping("/admin/user/create")
    public String getAdminPage(Model model){
        model.addAttribute("newUser", new User());
        return "admin/user/create";
    }

    @RequestMapping("/admin/user")
    public String getTableUser(Model model){
        List<User> arrUser = this.userService.getAllUsers();
        model.addAttribute("users", arrUser);
        return "admin/user/table-user";
    }

    @RequestMapping("/admin/user/{id}")
    public String getDetailUser(Model model, @PathVariable Long id){
        System.out.println("user id = " + id);
        User user = this.userService.getUserById(id);
        model.addAttribute("id", id);
        model.addAttribute("email", user.getEmail());
        model.addAttribute("fullName", user.getFullName());
        model.addAttribute("address", user.getAddress());

        return "admin/user/show";
    }

    @RequestMapping(value = "/admin/user/create", method = RequestMethod.POST)
    public String createUserPage(Model model, @ModelAttribute("newUser") User hoidanNTD){
        System.out.println("run here..." + hoidanNTD);
        this.userService.handleSaveUser(hoidanNTD);
        return "redirect:/admin/user";
    }
    
    @RequestMapping("/admin/user/update/{id}")
    public String getUpdateUserPage(Model model, @PathVariable Long id){
        User currentUser = this.userService.getUserById(id);
        model.addAttribute("userUpdate", currentUser);
        return "admin/user/update";
    }

    @PostMapping("/admin/user/update")
    public String updateUser(Model model, @ModelAttribute("userUpdate") User userU){
       User currentUser = this.userService.getUserById(userU.getId());
       if (currentUser != null) {
            currentUser.setFullName(userU.getFullName());
            currentUser.setAddress(userU.getAddress());
            currentUser.setPhone(userU.getPhone());
            this.userService.handleSaveUser(currentUser);
       }
      
        return "redirect:/admin/user";
    }

    @GetMapping("/admin/user/delete/{id}")
    public String getDeleteUserPage(Model model, @PathVariable Long id) {
        model.addAttribute("id", id);
        // User user = new User();
        // user.setId(id);
        model.addAttribute("newUser", new User());
        return "admin/user/delete";
    }

    @PostMapping("/admin/user/delete")
    public String postDeleteUser(Model model, @ModelAttribute("newUser") User ntd) {
        this.userService.deleteAUser(ntd.getId());
        return "redirect:/admin/user";
    }
    
}