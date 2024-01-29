package com.loja.rock;

public class cadastro {
	
	    private String username;
	    private String password;
	    private String email;

	    public void Cadastro (String username, String password, 
	    		String email) {
	    		this.username = username;
	    }

	    public void setUsername(String username) {
	        this.username = username;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getUsername() {
	        return username;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public String getEmail() {
	        return email;
	    }
	
	}


