package com.sparta.ben;

import static org.junit.Assert.assertTrue;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URL;


public class AppTest 
{
    PersonDTO personDTO;
    ObjectMapper objectMapper = new ObjectMapper();

    @BeforeEach
    void setup(){
        personDTO = Injector.injectPersonPOJO("https://swapi.dev/api/people/1/");
    }

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testConnection(){
        System.out.println(personDTO.getBirthYear());
        Assertions.assertEquals("19BBY",personDTO.getBirthYear());
    }
}


