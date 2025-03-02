package tn.esprit.tpfoyer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entity.Etudiant;
import tn.esprit.tpfoyer.service.IEtudiantService;

import java.util.List;

@RestController
@RequestMapping("/etudiant")
public class EtudiantController {
    @Autowired
    IEtudiantService etudiantService;
    
    @PostMapping("/addEtudiant")
    Etudiant addEtudiant(@RequestBody Etudiant etudiant){

        return etudiantService.addEtudiant(etudiant);
    }
    @PutMapping("/updateEtudiant")
    Etudiant updateEtudiant(@RequestBody Etudiant etudiant){
        return etudiantService.updateEtudiant(etudiant);
    }
    @DeleteMapping("/deleteEtudiant/{idEtudiant}")
    void deleteEtudiant(@PathVariable long idEtudiant){
        etudiantService.deleteEtudiant(idEtudiant);
    }
    @GetMapping("/getEtudiants")
    List<Etudiant> getAll(){
        return etudiantService.getAll();
    }
    @GetMapping("/getEtudiant/{idEtudiant}")
    Etudiant getEtudiant(@PathVariable long idEtudiant){
        return  etudiantService.getEtudiant(idEtudiant);
    }
}
