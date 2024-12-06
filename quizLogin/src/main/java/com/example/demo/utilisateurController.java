package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/utilisateurs")
public class utilisateurController {

   
    private utilisateurService utilisateurService;

    public utilisateurController(utilisateurService utilisateurService) {
        this.utilisateurService = utilisateurService;
    }
   

    @PostMapping("/register")
    public ResponseEntity<String> create(@RequestBody utilisateur utilisateur) {
        return utilisateurService.register(utilisateur);
    }


    @GetMapping("/{id}")
    public utilisateur getUtilisateurById(@PathVariable Long id) {
        return utilisateurService.getUtilisateurById(id);
    }

    @PutMapping("/{id}")
    public utilisateur updateUtilisateur(@PathVariable Long id, @RequestBody utilisateur utilisateur) {



            utilisateur.setId(id);
            utilisateur updatedUtilisateur = utilisateurService.updateUtilisateur(utilisateur);
   
            return updatedUtilisateur;

    }

    
    @DeleteMapping("/{id}")
    public void deleteUtilisateur(@PathVariable Long id) {
    	utilisateurService.deleteUtilisateur(id);
    }

 
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody login loginRequest) {
       
        utilisateur user = utilisateurService.findByEmailAndPassword(loginRequest.getEmail(), loginRequest.getPassword());

        if (user == null) {
            // Si l'utilisateur n'existe pas
            return new ResponseEntity<>("Utilisateur non trouvé", HttpStatus.NOT_FOUND);
        }

      
        return new ResponseEntity<>(user, HttpStatus.OK);
    }





   

}


