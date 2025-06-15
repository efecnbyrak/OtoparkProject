package com.example.phyberk.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "otopark_online_kullanıcılar")
public class UserLogIn {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //user_id'nin otomatik artıcağını söyleyen kod
    @Column(name = "user_id")
    //Column komutu benim sql tablomdaki değişken adını söylüyor.
    private Long userid;
	
	@Column(name = "user_email")
    private String useremail;
    
    @Column(name = "user_pass")
    private String userpass;

	public Long getUserid() {
		return userid;
	}

	public String getUseremail() {
		return useremail;
	}

	public String getUserpass() {
		return userpass;
	}
    
    
	
}
