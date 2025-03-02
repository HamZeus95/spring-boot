package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entity.Etudiant;

import java.util.List;

public interface IEtudiantService {
    Etudiant addEtudiant(Etudiant Etudiant);
    Etudiant updateEtudiant(Etudiant Etudiant);
    void deleteEtudiant(long idEtudiant);
    List<Etudiant> getAll();
    Etudiant getEtudiant(long idEtudiant);
}
