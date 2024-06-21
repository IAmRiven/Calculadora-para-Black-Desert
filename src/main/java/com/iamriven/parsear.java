package com.iamriven;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Set;

public class parsear {

    public static void main(String[] args) throws IOException, ParseException {

        JSONParser jsonparser = new JSONParser();
        FileReader archivo = new FileReader("src\\main\\resources\\item_data.json");

        Object jsonContent = jsonparser.parse(archivo);
        JSONObject accessories = (JSONObject) jsonContent;
        JSONObject rings = (JSONObject) accessories.get("rings");

        // Iteramos sobre el tipo de accesorio
        Set<String> accessoriesKeys = accessories.keySet();
        for (String type : accessoriesKeys) {
            JSONObject tipo_de_accesorio = (JSONObject) accessories.get(type);

            // Iterar sobre los IDs de las joyas dentro de cada tipo de accesorio
            Set<String> objetosIds = tipo_de_accesorio.keySet();
            for (String objetoId : objetosIds) {
                JSONObject itemData = (JSONObject) tipo_de_accesorio.get(objetoId);

                // Iterar sobre los niveles de mejora para cada artículo
                Set<String> niveles_de_encantamiento = itemData.keySet();
                for (String nivel_encantado : niveles_de_encantamiento) {
                    JSONObject encantamiento_datos = (JSONObject) itemData.get(nivel_encantado);

                    String name = (String) encantamiento_datos.get("Nombre");
                    System.out.println(name);
                }
            }
        }

    }
}
