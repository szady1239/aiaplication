package pl.pkowalczyk.carparts.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.pkowalczyk.carparts.demo.model.Part;
import pl.pkowalczyk.carparts.demo.repository.PartRepository;

import java.util.List;

@Service
public class PartServiceImpl implements PartService {

    @Autowired
    private PartRepository partRepository;

    @Override
    public List<Part> getPartsByName(String name) {

        return partRepository.findByName(name);
    }

    @Override
    public Part getPartById(Long id) {
        return partRepository.findOne(id);
    }

    @Override
    public Part getPartByCode(Long code) {
        return partRepository.findByCode(code);
    }
}
