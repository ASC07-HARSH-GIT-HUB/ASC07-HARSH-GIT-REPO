package org.example.Service;
import org.example.Entity.Cab;
import org.example.Repository.CabRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.util.List;

@Service
public class CabServiceImplementation implements CabServiceInterface{

    @Autowired
    private CabRepository cabRepository;


    @Override
    public Cab saveCab(Cab cab) {
        return cabRepository.save(cab);
    }

    @Override
    public List<Cab> getAllCab() {
        return cabRepository.findAll();
    }

    @Override
    public void deleteCab(Long id) {
        cabRepository.deleteById(id);
    }

    @Override
    public void deleteAllCab() {
        cabRepository.deleteAll();
    }
}
