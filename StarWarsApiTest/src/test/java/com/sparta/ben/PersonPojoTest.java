package com.sparta.ben;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.junit.jupiter.api.*;

import javax.net.ssl.SSLSession;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Optional;

public class PersonPojoTest {

    ObjectMapper objectMapper = new ObjectMapper();
    PersonDTO personDTO;

    @BeforeEach
    void setup(){
        //System.out.println(ConnectionManager.getConnection());
        personDTO = Injector.injectPersonPOJO("https://swapi.dev/api/people/12/");
        PersonDTOManager.addCharactersToList();
    }

    @Test
    void test1(){
        Assertions.assertEquals("19BBY",personDTO.getBirthYear());
    }

    @Test
    void test2(){
        System.out.println("true");
     Assertions.assertTrue(true);
    }

    @Test
    void test3(){
        Assertions.assertTrue(personDTO.urlHasCorrectFormat("https://swapi.dev/api/people/1/","people"));
    }

    @Test
    void test4(){
        Assertions.assertTrue(personDTO.birthYearSetupCorrect());
        Assertions.assertTrue(personDTO.birthYearNumbersBeforeBBY());
    }


}
