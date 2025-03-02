package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entity.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation addReservation(Reservation Reservation);
    Reservation updateReservation(Reservation Reservation);
    void deleteReservation(String idReservation);
    List<Reservation> getAll();
    Reservation getReservation(String idReservation);
}
