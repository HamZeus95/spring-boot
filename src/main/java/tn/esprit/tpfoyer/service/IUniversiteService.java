package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entity.Universite;

import java.util.List;

public interface IUniversiteService {
    Universite addUniversite(Universite Universite);
    Universite updateUniversite(Universite Universite);
    void deleteUniversite(long idUniversite);
    List<Universite> getAll();
    Universite getUniversite(long idUniversite);
}
