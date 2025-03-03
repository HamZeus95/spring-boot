package tn.esprit.tpfoyer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Reservation;
import tn.esprit.tpfoyer.repository.ReservationRepository;

import java.util.List;

@Service
public class ReservationServiceImplement implements IReservationService {
    @Autowired
    private ReservationRepository reservationRepository;


    @Override
    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void deleteReservation(String idReservation) {
            reservationRepository.deleteById(idReservation);
    }

    @Override
    public List<Reservation> getAll() {

        return reservationRepository.findAll();
    }

    @Override
    public Reservation getReservation(String idReservation) {
        return reservationRepository.findById(idReservation).get();
    }
}
