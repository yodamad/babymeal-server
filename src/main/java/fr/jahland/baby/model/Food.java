package fr.jahland.baby.model;

import fr.jahland.baby.enums.Aliment;
import fr.jahland.baby.enums.MealType;

import java.util.List;
import java.util.Map;

/**
 * Created by mvincent on 27/10/2015.
 */
public class Food {
    public Map<MealType, List<Aliment>> elements;
}
