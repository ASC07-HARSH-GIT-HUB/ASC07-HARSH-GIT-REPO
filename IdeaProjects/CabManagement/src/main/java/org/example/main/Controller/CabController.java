package org.example.Controller;

import org.example.Entity.Cab;
import org.example.Service.CabServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/cab")
public class CabController {

    @Autowired
    private CabServiceImplementation csi;

    @PostMapping
    public Cab createCab(@RequestBody Cab cab) {
        return csi.saveCab(cab);
    }

    @GetMapping
    public List<Cab> getAllCab() {
        return csi.getAllCab();
    }

    @DeleteMapping("/{id}")
    public String deleteCab(@PathVariable Long id) {
        csi.deleteCab(id);
        return "The cab with id: " + id + " is deleted!";
    }

    @DeleteMapping("/deleteAll")
    public String deleteAllCab() {
        csi.deleteAllCab();
        return "All Cabs deleted!";
    }

    @GetMapping("/getHTML")
    public String getHTMLContent() {
        return "<html><head><title>Welcome</title></head></html>";
    }

}








