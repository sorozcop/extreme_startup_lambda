package com.serverless;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ResponderModelTest {
    @Test
    public void  cuandoPreguntanPorElNombreRespondeElemento(){
        ResponderModel responder = new ResponderModel();
        String pregunta = "75aee560: what is your name";
        String respuesta = responder.answer(pregunta);
        assertThat(respuesta).isEqualTo("Elemento");
    }
    @Test
    public void testCuandoLaPeticionEsIncorrectaDebeDevolverNombrePorDefecto (){
        ResponderModel responder = new ResponderModel();
        String pregunta = "hat is your name";
        String respuesta = responder.answer(pregunta);
        assertThat(respuesta).isEqualTo("Elemento");
    }
    @Test
    public void testCuandoPreguntaElNumeroMayorDebeDevolver982 (){
        ResponderModel responder = new ResponderModel();
        String pregunta = "663a5150: which of the following numbers is the largest: 60, 84, 861, 982";
        String respuesta = responder.answer(pregunta);
        assertThat(respuesta).isEqualTo("982");
    }
    @Test
    public void testCuandoPreguntaElNumeroMayorDebeDevolver659 (){
        ResponderModel responder = new ResponderModel();
        String pregunta = "56c32210: which of the following numbers is the largest: 659, 767, 10, 52";
        String respuesta = responder.answer(pregunta);
        assertThat(respuesta).isEqualTo("767");
    }
    @Test
    public void testCuandoPreguntaElNumeroMayorDebeDevolver561 (){
        ResponderModel responder = new ResponderModel();
        String pregunta = "56c32210: which of the following numbers is the largest: 6, 346, 75, 561";
        String respuesta = responder.answer(pregunta);
        assertThat(respuesta).isEqualTo("561");
    }
    @Test
    public void testCuandoPreguntaElNumeroMayorDebeDevolver672 (){
        ResponderModel responder = new ResponderModel();
        String pregunta = "47fef510: which of the following numbers is the largest: 97, 672";
        String respuesta = responder.answer(pregunta);
        assertThat(respuesta).isEqualTo("672");
    }
    @Test
    public void testCuandoSolicitaAdicionDe10Y17DebeDevolver27 (){
        ResponderModel responder = new ResponderModel();
        String pregunta = "2e0d2950: what is 10 plus 17";
        String respuesta = responder.answer(pregunta);
        assertThat(respuesta).isEqualTo("27");
    }
    @Test
    public void testCuandoSolicitaAdicionDe16Y15DebeDevolver31 (){
        ResponderModel responder = new ResponderModel();
        String pregunta = "377740f0: what is 16 plus 15";
        String respuesta = responder.answer(pregunta);
        assertThat(respuesta).isEqualTo("31");
    }
}
