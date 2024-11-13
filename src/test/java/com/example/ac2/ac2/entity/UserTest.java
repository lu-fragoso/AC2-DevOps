package com.example.ac2.ac2.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.example.ac2.ac2.entity.User;
import com.example.ac2.ac2.entity.User_Email;

public class UserTest {
	
	 @Test
	    void testSetAndGetValidEmail() {
	        User user = new User();
	        User_Email email = new User_Email("test@example.com");
	        user.setEmail(email);
	        
	        assertEquals(email, user.getEmail());
	    }

	    @Test
	    void testInvalidEmailThrowsException() {
	        assertThrows(IllegalArgumentException.class, () -> {
	            new User_Email("invalid-email");
	        });
	    }}
