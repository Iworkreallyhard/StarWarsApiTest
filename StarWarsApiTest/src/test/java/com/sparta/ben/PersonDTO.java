 package com.sparta.ben;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.ObjectMapper;

 @JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonPropertyOrder({
//        "name",
//        "height",
//        "mass",
//        "hair_color",
//        "skin_color",
//        "eye_color",
//        "birth_year",
//        "gender",
//        "homeworld",
//        "films",
//        "species",
//        "vehicles",
//        "starships",
//        "created",
//        "edited",
//        "url"
//})
public class PersonDTO {

    @JsonProperty("name")
    private String name;
    @JsonProperty("height")
    private Integer height;
    @JsonProperty("mass")
    private Integer mass;
    @JsonProperty("hair_color")
    private String hairColor;
    @JsonProperty("skin_color")
    private String skinColor;
    @JsonProperty("eye_color")
    private String eyeColor;
    @JsonProperty("birth_year")
    private String birthYear;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("homeworld")
    private String homeworld;
    @JsonProperty("films")
    private List<String> films = null;
    @JsonProperty("species")
    private List<String> species = null;
    @JsonProperty("vehicles")
    private List<String> vehicles = null;
    @JsonProperty("starships")
    private List<String> starships = null;
    @JsonProperty("created")
    private String created;
    @JsonProperty("edited")
    private String edited;
    @JsonProperty("url")
    private String url;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();



    @JsonProperty("name")
    public String getName() {
        return name;
    }
    @JsonProperty("height")
    public int getHeight() {
        return height;
    }
    @JsonProperty("mass")
    public int getMass() {
        return mass;
    }
    @JsonProperty("hair_color")
    public String getHairColor() {
        return hairColor;
    }
    @JsonProperty("skin_color")
    public String getSkinColor() {
        return skinColor;
    }
    @JsonProperty("eye_color")
    public String getEyeColor() {
        return eyeColor;
    }
    @JsonProperty("birth_year")
    public String getBirthYear() {
        return birthYear;
    }
    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }
    @JsonProperty("homeworld")
    public String getHomeworld() {
        return homeworld;
    }
    @JsonProperty("films")
    public List<String> getFilms() {
        return films;
    }
    @JsonProperty("species")
    public List<String> getSpecies() {
        return species;
    }
    @JsonProperty("vehicles")
    public List<String> getVehicles() {
        return vehicles;
    }
    @JsonProperty("starships")
    public List<String> getStarships() {
        return starships;
    }
    @JsonProperty("created")
    public String getCreated() {
        return created;
    }
    @JsonProperty("edited")
    public String getEdited() {
        return edited;
    }
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }


    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }
    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public PersonDTO(){}

    //public class NameProperties{
        //has name
        public Boolean hasName(){
            return name.getClass()==String.class;
        }
        //name not null
        public Boolean isNameNotNull(){
            return name != null;
        }
        //name longer than x
        public Boolean isTheNameLongerThanZero(){
            return name.length()>0;
        }
        //name shorter than y

        //name capitalised


    //}
    //public class HeightProperties{
        //has height
        public Boolean hasHeight(){
            return height.getClass()==Integer.class;
        }
        //height not null
        public Boolean isHeightNotNull(){
            return height != null;
        }
        //height greater than 0
        public Boolean isHeightGreaterThanZero(){
            return height>0;
        }
        //height less than y
    //}
    //public class MassProperties{
        //has mass
        public Boolean hasMass(){
            return mass.getClass()==Integer.class;
        }
        //name not null
        public Boolean isMassNotNull(){
            return mass != null;
        }
        //mass greater than 0
        public Boolean isMassGreaterThanZero(){
            return mass>0;
        }
        //mass less than y
    //}
    //public class HairColourProperties{
        //has hair colour
        public Boolean hasHairColour(){
            return hairColor.getClass()==String.class;
        }

        //chosen from array of hair colours
        public Boolean hairColourInList(){
            for(String colour: LISTS.HairColours){
                if(hairColor.equals(colour)){
                    return true;
                }
            }
            return false;
        }
    //}
    //public class SkinColourProperties{
        //has skin colour
        public Boolean hasSkinColour(){
            return skinColor.getClass()==String.class;
        }
        //skin colour not null
        public Boolean isSkinColourNotNull(){
            return skinColor != null;
        }
        //chosen from selection of skin colours
    //}
    //public class EyeColourProperties{
        //has eye colour
        public Boolean hasEyeColour(){
            return eyeColor.getClass()==String.class;
        }
        //eye colour not null
        public Boolean isEyecolourNotNull(){
            return eyeColor != null;
        }
        //chosen from selection of eye colours
        //todo
    //}
    //public class BirthYearProperties{
        //has birth year
        public Boolean hasBirthYear(){
            return birthYear.getClass()==String.class;
        }
        //birth year more than x

        //less than present day

        //birth year has specific setup
        public Boolean birthYearSetupCorrect(){
            if(birthYear.endsWith("BBY")||birthYear.equalsIgnoreCase("unknown")){
                return true;
            }else{
                return false;
            }
        }

        //checks if digits before BBY is a number
        public Boolean birthYearNumbersBeforeBBY(){
            if(birthYear.substring(0,birthYear.indexOf("B")).matches("[0-9]+")||birthYear.contains(".")||birthYear.equalsIgnoreCase("unknown")){
                return true;
            }
            return false;
        }
    //}
    //public class HomeWorldProperties{
        //has
        public Boolean hasHomeWorld(){
            return homeworld.getClass()==String.class;
        }
        //homeworld not null
        public Boolean homeWorldNotNull(){
            return homeworld != null;
        }
        //selected from enum
        //todo
    //}
    //public class Films{
        //has
        public Boolean hasFilms(){
            return films.getClass()==List.class;
        }
        //number of films greater than 0
        public Boolean isInFilms(){
            return films.size()>0;
        }
        //number of films less than 8
        public Boolean isInLessThanEight(){
            return films.size()<8;
        }
        //check the setup of the film urls
        public Boolean isFilmUrlSetUpCorrect(){
            for(String film: films){
                if(urlHasCorrectFormat(film,"films")==false){
                    return false;
                }
            }
            return true;
        }
    //}
    //public class SpeciesProperties{
        //has
        public Boolean hasSpecies(){
            return species.getClass()==List.class && species.size()<2;
        }
        //
     public Boolean isSpeciesSetUpCorrectly(){
         for(String specie: species){
             if(urlHasCorrectFormat(specie,"species")==false){
                 return false;
             }
         }
         return true;
     }
    //}
    public class VehicleProperties{
        //has
        public Boolean hasVehicle(){
            return vehicles.getClass()==List.class;
        }
        //vehicles set out correctly
        public Boolean vehicleUrlsSetOutCorrectly(){
            Boolean status = false;
            for(String vehicle:vehicles) {
                if(urlHasStatus200(vehicle)&&urlHasCorrectFormat(vehicle,"vehicles")){
                    status=true;
                }else{
                    return false;
                }
            }
            return status;
        }
    }
    public class StarShips{

    }
    public class edited{

    }
    public class created{

    }
    public class URL{

    }

    private Boolean urlHasStatus200(String url){
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(url)).build();
        ObjectMapper objectMapper = new ObjectMapper();
        int statusCode = 0;
        try{
            HttpResponse<String> httpResponse = httpClient.send(httpRequest,HttpResponse.BodyHandlers.ofString());
            statusCode = httpResponse.statusCode();
        }catch(IOException |InterruptedException e){
            e.printStackTrace();
        }

        return statusCode==200;
    }

    public Boolean urlHasCorrectFormat(String url,String category){
        String[] urlSplit = url.split("/");

        if(urlSplit[2].equalsIgnoreCase("swapi.dev")&&urlSplit[3].equalsIgnoreCase("api")&&urlSplit[4].equalsIgnoreCase(category)&&urlSplit[5].matches("[0-9]+")){
            return true;
        }else {
            return false;
        }
    }

}
