package com.sparta.ben;

import java.util.ArrayList;

public class PersonDTOManager {
    public static ArrayList<PersonDTO> characters = new ArrayList<>();
    public static ArrayList<PersonDTOWithErrors> otherCharacters = new ArrayList<>();
    public static ArrayList<Integer> charactersWithErrors = new ArrayList<Integer>();

    public static void addCharactersToList(){
        int count = 1;
        int nulls = 0;
        while(nulls<5){
            PersonDTO personDTO = Injector.injectPersonPOJO("https://swapi.dev/api/people/"+count+"/");
            if(personDTO.getName()==null){
                charactersWithErrors.add(count);
                nulls++;
            }else{
                characters.add(personDTO);
                nulls=0;
            }
            count++;
        }
        count++;
    }

    public static ArrayList<PersonDTO>
}
