package pl.pkowalczyk.carparts.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.pkowalczyk.carparts.demo.model.Part;
import pl.pkowalczyk.carparts.demo.model.PartGroup;
import pl.pkowalczyk.carparts.demo.repository.PartGroupRepository;
import pl.pkowalczyk.carparts.demo.repository.PartRepository;

import java.util.LinkedList;
import java.util.List;

@Service
public class PartServiceImpl implements PartService {

    @Autowired
    private PartRepository partRepository;

    @Autowired
    PartGroupRepository partGroupRepository;

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

    @Override
    public List<Part> getPartsByPartGroupId(Long partGroupId) {
        PartGroup partGroup = partGroupRepository.findOne(partGroupId);
        List<Part> partList = partRepository.findAll();
        List<Part> partListOfGroup = new LinkedList<Part>();
        for (Part partObject: partList){
            if(partObject.getPartGroup().getId()==partGroup.getId())
                partListOfGroup.add(partObject);
        }

        return partListOfGroup;
    }
}
