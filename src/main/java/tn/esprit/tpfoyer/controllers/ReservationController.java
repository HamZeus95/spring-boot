package tn.esprit.tpfoyer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entity.Reservation;
import tn.esprit.tpfoyer.service.IReservationService;

import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ReservationController {
    @Autowired
    IReservationService reservationService;

    @PostMapping("/addReservation")
    Reservation addReservation(@RequestBody Reservation reservation){

        return reservationService.addReservation(reservation);
    }
    @PutMapping("/updateReservation")
    Reservation updateReservation(@RequestBody Reservation reservation){

        return reservationService.updateReservation(reservation);
    }
   @DeleteMapping("/deleteReservation/{idReservation}")
    void deleteReservation(@PathVariable String idReservation){

        reservationService.deleteReservation(idReservation);
    }
    @GetMapping("/getReservations")
    List<Reservation> getAll(){
        return reservationService.getAll();
    }
   @GetMapping("/getReservation/{idReservation}")
    Reservation getReservation(@PathVariable String idReservation) {
        return reservationService.getReservation(idReservation);
    }
}
