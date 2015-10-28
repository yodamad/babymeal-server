package fr.jahland.baby.model;

import fr.jahland.baby.enums.Drug;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

/**
 * Created by mvincent on 27/10/2015.
 */
public class Meal {

    public LocalDate date;
    public LocalTime time;
    public Bibber bibber;
    public Food food;
    public List<Drug> drugs;
}
