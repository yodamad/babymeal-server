package fr.jahland.baby.model;

import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

/**
 * Created by mvincent on 27/10/2015.
 */
public class Meal {

    @Id
    public String id;
    public LocalDate date;
    public LocalTime time;
    public Bibber bibber;
    public Food food;
    public List<Masterdata> drugs;
}
