package pl.pkowalczyk.carparts.demo.service;

import pl.pkowalczyk.carparts.demo.model.Part;

import java.util.List;

public interface PartService {
    List<Part> getPartsByName(String name);
    Part getPartById(Long id);
    List<Part> getPartByCode(Long code);
    List<Part> getPartsByPartGroupId(Long partGroupId);

}
