package com.iamriven;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import org.json.JSONObject;

public class RequestPrice {

    public static float recuperarPrecio(int id, int nivel) {
        float precio = 0;

        HttpResponse<String> respuesta;
        try {
            respuesta = Unirest
                    .get("https://api.arsha.io/v1/na/price?id=" + id + "&sid=" + nivel + "&lang=en")
                    .asString();
            String respuesta_cuerpo = respuesta.getBody();
            JSONObject jsonResponse = new JSONObject(respuesta_cuerpo);
            precio = jsonResponse.getFloat("basePrice");
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        return precio;
    }
}
