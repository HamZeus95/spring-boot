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
    Universite addUniversite(@RequestBody Universite universite){

        return universiteService.addUniversite(universite);
    }
    @PutMapping("/updateUniversite")
    Universite updateUniversite(@RequestBody Universite universite){

        return universiteService.updateUniversite(universite);
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
