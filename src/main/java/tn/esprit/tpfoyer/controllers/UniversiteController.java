package tn.esprit.tpfoyer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entity.Universite;
import tn.esprit.tpfoyer.service.IUniversiteService;

import java.util.List;

@RestController
@RequestMapping("/universite")
public class UniversiteController {
   @Autowired
    IUniversiteService universiteService;

    @PostMapping("/addUniversite")
    Universite addUniversite(@RequestBody Universite reservation){

        return universiteService.addUniversite(reservation);
    }
    @PutMapping("/updateUniversite")
    Universite updateUniversite(@RequestBody Universite reservation){

        return universiteService.updateUniversite(reservation);
    }
    @DeleteMapping("/deleteUniversite/{idUniversite}")
    void deleteUniversite(@PathVariable long idUniversite){

        universiteService.deleteUniversite(idUniversite);
    }
    @GetMapping("/getUniversites")
    List<Universite> getAll(){
        return universiteService.getAll();
    }
    @GetMapping("/getUniversite/{idUniversite}")
    Universite getUniversite(@PathVariable long idUniversite) {
        return universiteService.getUniversite(idUniversite);
    }
    
    
}
