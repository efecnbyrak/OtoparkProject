package com.example.phyberk.controller;

import com.example.phyberk.model.User;
import com.example.phyberk.repository.UserRepository;
import com.example.phyberk.service.UserService;

import ch.qos.logback.core.model.Model;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

	@Autowired
	private UserRepository userRepository;
    @Autowired
    private UserService userService;

    @GetMapping("/lms")
    public String showLms() {
    	return "lms";
    }
    
    @GetMapping("/index")
    public String showIndex() {
    	return "index";
    }
    
    @GetMapping("/lmslog")
    public String showLogInPage() {
    	return "lmslog";
    }
    
    @GetMapping("/lmsprices")
    public String sohwLmsPrices() {
    	return "lmsprices";
    }
    
    @PostMapping("/saveUser")
    public String saveUser(User user) {
    	if(user.getUseremail() == null || user.getUseremail().isEmpty() || 
    	           user.getUsername() == null || user.getUsername().isEmpty() || 
    	           user.getUserpass() == null || user.getUserpass().isEmpty()) {
    	            // Eğer boş ise, işlemi iptal et ve hata mesajı ver
    	            System.out.println("Lütfen tüm alanları doldurun.");
    	            return "lms"; // Kayıt sayfasına geri dön
    	        } else {
    	            // Veriler doğruysa, kullanıcıyı kaydet
    	            userService.saveUser(user);
    	            return "redirect:/"; // Başarılı işlemin ardından anasayfaya yönlendir
    	  }
    }
}
