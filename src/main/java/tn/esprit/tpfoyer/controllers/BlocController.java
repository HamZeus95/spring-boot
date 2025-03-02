package tn.esprit.tpfoyer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entity.Bloc;
import tn.esprit.tpfoyer.service.IBlocService;

import java.util.List;

@RestController
@RequestMapping("/bloc")
public class BlocController {
    @Autowired
    IBlocService blocService;
    @PostMapping("/addBloc")
    Bloc addBloc(@RequestBody Bloc Bloc){
        System.out.println(Bloc);
        return blocService.addBloc(Bloc);
    }
    @PutMapping("/updateBloc")
    Bloc updateBloc(@RequestBody Bloc Bloc){
        return blocService.updateBloc(Bloc);
    }
    @DeleteMapping("/deleteBloc/{idBloc}")
    void deleteBloc(@PathVariable long idBloc){
        blocService.deleteBloc(idBloc);
    }
    @GetMapping("/getBlocs")
    List<Bloc> getAll(){
        return blocService.getAll();
    }
    @GetMapping("/getBloc/{idBloc}")
    Bloc getBloc(@PathVariable long idBloc){
        return  blocService.getBloc(idBloc);
    }
}
