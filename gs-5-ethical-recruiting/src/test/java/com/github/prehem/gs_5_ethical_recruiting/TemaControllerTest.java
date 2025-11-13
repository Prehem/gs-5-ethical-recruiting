package com.github.prehem.gs_5_ethical_recruiting;

import com.github.prehem.gs_5_ethical_recruiting.controller.TemaController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class TemaControllerTest {

    @Autowired
    private TemaController controller;

    @Test
    void contextLoads() {
        assertThat(controller).isNotNull();
    }

    @Test
    void getInfoShouldReturnCorrectTema() {
        var response = controller.getInfo();
        assertThat(response.get("tema")).isEqualTo("Sistemas de recrutamento ético e inclusivo com base em dados");
        assertThat(response.get("membro1")).isEqualTo("Pedro Sodré");
    }
}