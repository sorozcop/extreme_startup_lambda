package com.serverless;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ResponderModelTest {
    @Test
    public void  cuandoPreguntanPorElNombreRespondeCarlos(){
        ResponderModel responder = new ResponderModel();
        String pregunta = "75aee560: what is your name";
        String respuesta = responder.answer(pregunta);
        assertThat(respuesta).isEqualTo("Elemento");
    }
}
