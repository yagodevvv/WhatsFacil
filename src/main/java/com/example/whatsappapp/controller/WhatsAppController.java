package com.example.whatsappapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@RestController
public class WhatsAppController {

    @GetMapping("/gerar-link")
    public String gerarLinkWhatsApp(
            @RequestParam String numero,
            @RequestParam String mensagem) {


        String mensagemCodificada = URLEncoder.encode(mensagem, StandardCharsets.UTF_8);
        String linkWhatsApp = "https://wa.me/" + numero + "?text=" + mensagemCodificada;

        return linkWhatsApp;
    }
}