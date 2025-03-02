package tn.esprit.tpfoyer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entity.Foyer;
import tn.esprit.tpfoyer.service.IFoyerService;

import java.util.List;

@RestController
@RequestMapping("/foyer")
public class FoyerController {
    
    @Autowired
    IFoyerService foyerService;

    @PostMapping("/addFoyer")
    Foyer addFoyer(@RequestBody Foyer Foyer){

        return foyerService.addFoyer(Foyer);
    }
    @PutMapping("/updateFoyer")
    Foyer updateFoyer(@RequestBody Foyer Foyer){
        
        return foyerService.updateFoyer(Foyer);
    }
    @DeleteMapping("/deleteFoyer/{idFoyer}")
    void deleteFoyer(@PathVariable long idFoyer){

        foyerService.deleteFoyer(idFoyer);
    }
    @GetMapping("/getFoyers")
    List<Foyer> getAll(){
        return foyerService.getAll();
    }
    @GetMapping("/getFoyer/{idFoyer}")
    Foyer getFoyer(@PathVariable long idFoyer) {
        return foyerService.getFoyer(idFoyer);
    }
}
