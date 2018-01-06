package pl.pkowalczyk.carparts.demo.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.pkowalczyk.carparts.demo.model.Part;
import pl.pkowalczyk.carparts.demo.service.PartService;

import java.util.List;

@RestController
public class PartControler {

    @Autowired
    private PartService partService;

    @GetMapping("/findPartByName/{name}")
    public List<Part> getPartsByNameControler(@PathVariable(value = "name") String name) {


        return partService.getPartsByName(name);
    }

    @GetMapping("/findPartByCode/{code}")
    public Part getPartByCodeContoler(@PathVariable(value = "code") Long code) {


        return partService.getPartByCode(code);
    }

    @GetMapping("/findPartById/{id}")
    public Part getPartByIdContoler(@PathVariable(value = "id") Long id) {


        return partService.getPartById(id);
    }


}
