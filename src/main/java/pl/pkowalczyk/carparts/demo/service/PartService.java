package pl.pkowalczyk.carparts.demo.service;

import pl.pkowalczyk.carparts.demo.model.Part;

import java.util.List;

public interface PartService {
    List<Part> getPartsByName(String name);
    Part getPartById(Long id);
    Part getPartByCode(Long code);

}
