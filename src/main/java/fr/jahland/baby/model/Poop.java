package fr.jahland.baby.model;

import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Created by mvincent on 11/11/2015.
 */
public class Poop {
    @Id
    public String id;
    public LocalDate date;
    public LocalTime time;
    public boolean withSuppository;
}
