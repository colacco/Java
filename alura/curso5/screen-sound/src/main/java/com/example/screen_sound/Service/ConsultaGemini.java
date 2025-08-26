package com.example.screen_sound.Service;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;

public class ConsultaGemini {
    public static String obterTraducao(String texto) {
        Client client = Client.builder().apiKey(System.getenv("GEMINI_KEY")).build();
        GenerateContentResponse response = client.models.generateContent("gemini-2.5-flash", "Retorna um breve resumo do cantor(a): " + texto, null);
        return response.text();
    }
}
