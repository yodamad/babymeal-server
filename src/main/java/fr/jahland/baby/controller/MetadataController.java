package fr.jahland.baby.controller;

import fr.jahland.baby.enums.*;
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

    @RequestMapping("/aliments/vegetables")
    public List<Vegetable> getVegetables() {
        return Arrays.asList(Vegetable.values());
    }

    @RequestMapping("/aliments/fruits")
    public List<Fruit> getFruits() {
        return Arrays.asList(Fruit.values());
    }

    @RequestMapping("/drugs")
    public List<Drug> getDrugs() {
        return Arrays.asList(Drug.values());
    }

    @RequestMapping("/milk/types")
    public List<MilkType> getMilkTypes() {
        return Arrays.asList(MilkType.values());
    }

    @RequestMapping("/milk/garnishes")
    public List<Garnish> getGarnishes() {
        return Arrays.asList(Garnish.values());
    }

    @RequestMapping("/mealtypes")
    public List<MealType> getMealTypes() {
        return Arrays.asList(MealType.values());
    }

}
