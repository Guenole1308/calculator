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
}