package com.guenole.personnage;

public class Personnage {

    private String orientation = "NORD";

    public String tourner(int fois) {

        String[] orientations = {"NORD", "EST", "SUD", "OUEST"};

        orientation = orientations[fois % 4];

        return orientation;
    }
}