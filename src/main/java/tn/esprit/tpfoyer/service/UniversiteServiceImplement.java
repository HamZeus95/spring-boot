package tn.esprit.tpfoyer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Universite;
import tn.esprit.tpfoyer.repository.UniversiteRepository;

import java.util.List;

@Service
public class UniversiteServiceImplement implements IUniversiteService {

    @Autowired
    private UniversiteRepository universiteRepository;

    @Override
    public Universite addUniversite(Universite Universite) {
        return universiteRepository.save(Universite);
    }

    @Override
    public Universite updateUniversite(Universite Universite) {
        return universiteRepository.save(Universite);
    }

    @Override
    public void deleteUniversite(long idUniversite) {
        universiteRepository.deleteById(idUniversite);
    }

    @Override
    public List<Universite> getAll() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite getUniversite(long idUniversite) {
        return universiteRepository.findById(idUniversite).get();
    }
}
