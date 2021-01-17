package com.sparta.ben;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.URI;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConnectionManager {
    private static final String BASEURL = "https://swapi.dev/api/";
    private static final String URL = "https://swapi.dev/api/people/1/";
    private static String endPoint;
    //private String URL;

    public static String getRandomConnection(){
        return BASEURL + "people/" + randomCharacter();
    }

    private static int randomCharacter(){
        int random = (int) (Math.random()*82)+1;
        return random;
    }


    public static int getStatusCode(){
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(BASEURL + endPoint)).build();
        int statusCode = 0;
        try{
            HttpResponse<String> httpResponse = httpClient.send(httpRequest,HttpResponse.BodyHandlers.ofString());
        }catch(IOException|InterruptedException e){
            e.printStackTrace();
        }
        return statusCode;
    }

    public static HttpResponse getHttpResponse(String url){

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(url)).build();

        ObjectMapper objectMapper = new ObjectMapper();

        try{
            HttpResponse<String> httpResponse = httpClient.send(httpRequest,HttpResponse.BodyHandlers.ofString());
            return httpResponse;
        }catch(IOException |InterruptedException e){
            e.printStackTrace();
        }
        return null;
    }
    public static int getStatus(String url){
        return getHttpResponse(url).statusCode();
    }

    public static HttpHeaders getHeaders(String url){

        return getHttpResponse(url).headers();
    }
    public static String getBody(String url){
        return (String) getHttpResponse(url).body();
    }

}
