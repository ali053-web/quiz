package com.example.demo;

public class login {
    private String email;  
    private String password;

   
    public login(String email, String password) {
        super();
        this.email = email;
        this.password = password;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    // Getter et Setter pour password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

	public String getEmail() {
		// TODO Auto-generated method stub
		 return email;
	}
}
