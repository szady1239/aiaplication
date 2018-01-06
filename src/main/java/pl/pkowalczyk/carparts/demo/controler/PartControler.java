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

    @GetMapping("/partList/{name}")
    public List<Part> getPartsByNameControler(@PathVariable(value = "name") String name) {


        return partService.getPartsByName(name);
    }


}
