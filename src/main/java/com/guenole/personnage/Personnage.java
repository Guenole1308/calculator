package com.guenole.personnage;

public class Personnage {

    public String tourner(int fois) {
        if (fois == 1) {
            return "EST";
        }

        if (fois == 2) {
            return "SUD";
        }

        if (fois == 3) {
            return "OUEST";
        }

        return "NORD";
    }
}