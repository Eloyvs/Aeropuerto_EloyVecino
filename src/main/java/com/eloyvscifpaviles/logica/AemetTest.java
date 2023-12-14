/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eloyvscifpaviles.logica;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONObject;


/**
 *
 * @author eloyv
 */
public class AemetTest {
    public static void main(String[] args){
        try{
            getData(new AemetRequest("eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJZTlI0ODk3MEBlZHVjYXN0dXIuZXMiLCJqdGkiOiJmMzdhODJhNC01MDY4LTQzMjQtYmM3Yy05Y2Y3ZDU2ODkzOWQiLCJpc3MiOiJBRU1FVCIsImlhdCI6MTcwMjQyMzM0NiwidXNlcklkIjoiZjM3YTgyYTQtNTA2OC00MzI0LWJjN2MtOWNmN2Q1Njg5MzlkIiwicm9sZSI6IiJ9.d-lrI0xVGEpKRgWhIaHOj4JscSzXjfKSSuzwRbcY0NY",
            "2"));
        }
        catch(UnirestException ex){
            Logger.getLogger(AemetTest.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
    private static void getData(AemetRequest request) throws UnirestException{
        HttpResponse<JsonNode> response =
              Unirest.get("https://opendata.aemet.es/opendata/api/prediccion/especifica/municipio/diaria/" + request.getCodMunicipio())
                      .header("accept", "application/json")
                      .queryString("api_key", request.getToken())
                      .asJson();
        JSONObject jn = response.getBody().getObject();
        String nuevaUrl = jn.getString("datos");
        System.out.println(nuevaUrl);
        
        HttpResponse<JsonNode> finalResponse =
                Unirest.get(nuevaUrl)
                .header("accept", "application/json")
                .asJson();
        JSONArray prediccion = finalResponse.getBody().getArray();
        JSONObject first = prediccion.getJSONObject(0);
        JSONObject predicciondia = first.getJSONObject("prediccion");
        JSONArray dias = predicciondia.getJSONArray("dia");
        JSONObject temperaturas = dias.getJSONObject(0).getJSONObject("temperatura");
        int tempMinima = temperaturas.getInt("minima");
        int tempMaxima = temperaturas.getInt("maxima");
        System.out.println(tempMinima);
        System.out.println(tempMaxima);
        
        
        
    }
}
