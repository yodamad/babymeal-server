package fr.jahland.baby.model;

import org.springframework.data.annotation.Id;

/**
 * Created by mvincent on 02/11/2015.
 */
public class Masterdata {
    @Id
    public String id;
    public String label;
    public String type;
    public String additionalData;
}
