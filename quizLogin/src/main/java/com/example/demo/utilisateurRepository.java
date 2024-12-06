package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface utilisateurRepository extends JpaRepository<utilisateur, Long> {

	
	

	
	utilisateur findByEmailAndPassword(String email, String password);
	

}
