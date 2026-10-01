package com.guenole.personnage;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonnageTest {

    @Test
    void tourner_0_retourne_nord() {
        Personnage personnage = new Personnage();

        assertThat(personnage.tourner(0))
                .isEqualTo("NORD");
    }

    @Test
    void tourner_1_retourne_est() {
        Personnage personnage = new Personnage();

        assertThat(personnage.tourner(1))
                .isEqualTo("EST");
    }

    @Test
    void tourner_2_retourne_sud() {
        Personnage personnage = new Personnage();

        assertThat(personnage.tourner(2))
                .isEqualTo("SUD");
    }

    @Test
    void tourner_3_retourne_ouest() {
        Personnage personnage = new Personnage();

        assertThat(personnage.tourner(3))
                .isEqualTo("OUEST");
    }

    @Test
    void tourner_4_retourne_nord() {
        Personnage personnage = new Personnage();

        assertThat(personnage.tourner(4))
                .isEqualTo("NORD");
    }
}