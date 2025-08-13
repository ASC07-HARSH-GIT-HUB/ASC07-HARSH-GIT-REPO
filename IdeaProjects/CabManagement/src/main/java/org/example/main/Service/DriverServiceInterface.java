package org.example.Service;
import org.example.Entity.Driver;

import java.util.List;

public interface DriverServiceInterface {

    public Driver saveDriver(Driver driver);

    public List<Driver> getAllDriver();

    public void deleteDriver(Long id);

    public void deleteAllDriver();
}
