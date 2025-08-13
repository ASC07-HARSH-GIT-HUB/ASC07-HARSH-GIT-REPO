package org.example.Service;
import org.example.Entity.Cab;

import java.util.List;

public interface CabServiceInterface {

    public Cab saveCab(Cab cab);

    public List<Cab> getAllCab();

    public void deleteCab(Long id);

    public void deleteAllCab();
}