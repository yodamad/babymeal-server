package fr.jahland.baby.model;

import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * Created by mvincent on 05/11/2015.
 */
public class Aliment {
    @Id
    public String id;
    public Masterdata type;
    public List<Masterdata> tasts;
    public Float quantity;
}
