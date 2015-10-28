package fr.jahland.baby.controller;

import fr.jahland.baby.enums.Drug;
import fr.jahland.baby.enums.MilkType;
import fr.jahland.baby.enums.Vegetable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by mvincent on 28/10/2015.
 */
@RestController
@RequestMapping("/metadata")
public class MetadataController {

    @RequestMapping("/vegetables")
    public List<Vegetable> getVegetables() {
        return Arrays.asList(Vegetable.values());
    }

    @RequestMapping("/drugs")
    public List<Drug> getDrugs() {
        return Arrays.asList(Drug.values());
    }

    @RequestMapping("/milktypes")
    public List<MilkType> getMilkTypes() {
        return Arrays.asList(MilkType.values());
    }
}
