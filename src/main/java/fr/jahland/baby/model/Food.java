package fr.jahland.baby.model;

import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * Created by mvincent on 27/10/2015.
 */
public class Food {
    @Id
    public String id;
    public List<Masterdata> elements;
}
