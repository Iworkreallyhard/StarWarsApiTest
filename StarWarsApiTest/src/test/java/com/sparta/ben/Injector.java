package com.sparta.ben;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.ben.PersonDTO;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.URI;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import java.net.URL;

public class Injector {

    private static final String BASEURL = "https://swapi.dev/api/";
    private static final String url = "https://swapi.dev/api/people/1/";
    private static String endPoint;
    //private String URL;

    public static PersonDTO injectPersonPOJO(String url){

        PersonDTO personDTO = new PersonDTO();
        ObjectMapper objectMapper = new ObjectMapper();

        try{
            personDTO = objectMapper.readValue(ConnectionManager.getBody(url), PersonDTO.class);

        }catch(IOException e){
            e.printStackTrace();
        }
        return personDTO;
    }
}
