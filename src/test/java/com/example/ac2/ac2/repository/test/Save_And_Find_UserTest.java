package com.example.ac2.ac2.repository.test;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import com.example.ac2.ac2.entity.User;
import com.example.ac2.ac2.repository.User_Repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ActiveProfiles("test")
@DataJpaTest
public class Save_And_Find_UserTest {
	  @Autowired
	    private User_Repository userRepository;

	    @Test
	    public void testSaveAndFindUser() {
	        // Cria um novo usuário
	        User user = new User();
	        user.setUsername("testUser1");

	        // Salva no banco de dados
	        User savedUser = userRepository.save(user);
	        assertNotNull(savedUser.getId());
	        // Busca o usuário pelo ID
	        Optional<User> retrievedUser = userRepository.findById(savedUser.getId());
	        assertThat(retrievedUser).isPresent();
	        assertThat(retrievedUser.get().getUsername()).isEqualTo("testUser1");
	    }
	

}
