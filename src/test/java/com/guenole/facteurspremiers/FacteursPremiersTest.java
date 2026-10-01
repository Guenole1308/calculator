package com.guenole.facteurspremiers;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FacteursPremiersTest {

    @Test
    void generate_1_retourne_liste_vide() {
        assertThat(FacteursPremiers.generate(1))
                .isEqualTo(List.of());
    }

    @Test
    void generate_3_retourne_3() {
        assertThat(FacteursPremiers.generate(3))
                .isEqualTo(List.of(3));
    }

    @Test
    void generate_4_retourne_2_2() {
        assertThat(FacteursPremiers.generate(4))
                .isEqualTo(List.of(2, 2));
    }

    @Test
    void generate_6_retourne_2_3() {
        assertThat(FacteursPremiers.generate(6))
                .isEqualTo(List.of(2, 3));
    }

    @Test
    void generate_8_retourne_2_2_2() {
        assertThat(FacteursPremiers.generate(8))
                .isEqualTo(List.of(2, 2, 2));
    }

    @Test
    void generate_9_retourne_3_3() {
        assertThat(FacteursPremiers.generate(9))
                .isEqualTo(List.of(3, 3));
    }

    @Test
    void generate_12_retourne_2_2_3() {
        assertThat(FacteursPremiers.generate(12))
                .isEqualTo(List.of(2, 2, 3));
    }

}