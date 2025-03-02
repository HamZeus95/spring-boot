package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entity.Foyer;

import java.util.List;

public interface IFoyerService {

    Foyer addFoyer(Foyer Foyer);
    Foyer updateFoyer(Foyer Foyer);
    void deleteFoyer(long idFoyer);
    List<Foyer> getAll();
    Foyer getFoyer(long idFoyer);
}
