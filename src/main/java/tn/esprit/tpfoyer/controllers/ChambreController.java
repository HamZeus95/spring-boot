package tn.esprit.tpfoyer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entity.Chambre;
import tn.esprit.tpfoyer.service.IChambreService;

import java.util.List;

@RestController
@RequestMapping("/chambre")
public class ChambreController {
    @Autowired
    IChambreService chambreService;

    @PostMapping("/addChambre")
    Chambre addChambre(@RequestBody Chambre chambre){
        System.out.println(chambre);
        return chambreService.addChambre(chambre);
    }
    @PutMapping("/updateChambre")
    Chambre updateChambre(@RequestBody Chambre chambre){
        return chambreService.updateChambre(chambre);
    }
    @DeleteMapping("/deleteChambre/{idChambre}")
    void deleteChambre(@PathVariable long idChambre){
        chambreService.deleteChambre(idChambre);
    }
    @GetMapping("/getChambres")
    List<Chambre> getAll(){
        return chambreService.getAll();
    }
    @GetMapping("/getChambre/{idChambre}")
    Chambre getChambre(@PathVariable long idChambre){
        return  chambreService.getChambre(idChambre);
    }
}
