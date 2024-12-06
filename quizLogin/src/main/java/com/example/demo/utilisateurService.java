package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;


@Service
public class utilisateurService {
	
	@Autowired
	private utilisateurRepository utilisateurRepository;
	
	public utilisateurService(utilisateurRepository utilisateurRepository) {
		this.utilisateurRepository=utilisateurRepository;
	}
	
	

	public ResponseEntity<String> register(@RequestBody utilisateur utilisateur) {
		
	    if (utilisateur.getPassword() == null || utilisateur.getPassword().isEmpty()) {
	        return ResponseEntity.badRequest().body("Le champ 'password' est obligatoire.");
	    }
	    utilisateurRepository.save(utilisateur);
	    return ResponseEntity.ok("Utilisateur enregistré avec succès.");
	}


	
	
	
	public utilisateur getUtilisateurById(Long id){
	Optional<utilisateur>	optionalUtilisateur= utilisateurRepository.findById(id);
	 return optionalUtilisateur.orElse(null);
		
	}
	
	public utilisateur addUtilisateur(utilisateur utilisateur) {
		return utilisateurRepository.save(utilisateur);
	}
	
	  
	
	  public utilisateur updateUtilisateur(utilisateur utilisateur) {
		 

	       
	        return utilisateurRepository.save(utilisateur);
	    }




	

	public void deleteUtilisateur(Long id) {
		utilisateurRepository.deleteById(id);
		
	}
	



	public List<utilisateur> getAllUtilisateurs() {
		
		return utilisateurRepository.findAll();	
	}



    public utilisateur findByEmailAndPassword(String email, String password) {
        return utilisateurRepository.findByEmailAndPassword(email, password);
    }





	}