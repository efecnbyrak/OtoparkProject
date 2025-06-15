package com.example.phyberk.model;

import jakarta.persistence.*;

@Entity
@Table(name = "otopark_online_kullanıcılar")//SQL Tablomun ismi
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //user_id'nin otomatik artıcağını söyleyen kod
    @Column(name = "user_id")
    //Column komutu benim sql tablomdaki değişken adını söylüyor.
    private Long userid;
    
    @Column(name = "user_name")
    private String username;

    @Column(name = "user_email")
    private String useremail;
    
    @Column(name = "user_pass")
    private String userpass;

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpass() {
		return userpass;
	}

	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}
    
    // Getters and Setters - Klasik Getter Setter'lar
    
}	
