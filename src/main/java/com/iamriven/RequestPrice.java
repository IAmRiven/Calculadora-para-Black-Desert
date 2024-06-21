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
    // public static float recuperarPrecio(int id, int nivel) {
    // float precio = 0;
    // try {
    // // Hacer conexión
    // URL url = new URL("https://api.arsha.io/v1/na/price?id=" + id + "&sid=" +
    // nivel + "&lang=en");
    // HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    // conn.setRequestMethod("GET");
    // conn.connect();

    // StringBuilder formar_precio = new StringBuilder();
    // Scanner sc = new Scanner(url.openStream());
    // while (sc.hasNext()) {
    // formar_precio.append(sc.nextLine());
    // }
    // sc.close();
    // JSONObject item = new JSONObject(formar_precio.toString());
    // precio = item.getFloat("basePrice");

    // } catch (Exception e) {
    // e.printStackTrace();
    // }
    // return precio;

    // }
}
