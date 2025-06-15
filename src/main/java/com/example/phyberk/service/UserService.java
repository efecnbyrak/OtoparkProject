package com.example.phyberk.service;

import com.example.phyberk.model.User;
import com.example.phyberk.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired //new lememe gerek kalmadan UserRepository Interface'ine bağlanıyor.
    private UserRepository userRepository;
   
    //Sayfaya Girilen username ile password değerini kontrol ediyor boşmu değil mi diye.
    public String saveUser(User user) {
    	if(user.getUseremail() == null || user.getUseremail().isEmpty() || 
    	           user.getUsername() == null || user.getUsername().isEmpty() || 
    	           user.getUserpass() == null || user.getUserpass().isEmpty()) {
    	            // Eğer eksik bilgi varsa, hata mesajı döndür
    	            return "Lütfen tüm alanları doldurun.";
    	        } else {
    	            // Veriler geçerliyse, veritabanına kaydet
    	            userRepository.save(user);
    	            return "Kayıt başarılı!";
    	        } 
    }
}
