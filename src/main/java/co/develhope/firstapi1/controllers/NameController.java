package co.develhope.firstapi1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

    @GetMapping
    public String WelcomeMsg() {
        return  "Welcome to the local 8080 port!";
    }

    @GetMapping("/name/{name}")
    public String getName(@PathVariable String name){
        return "Welcome " + name + "!";
    }

    @PostMapping("/name/{name}")
    public String reversedName(@PathVariable String name){

        String revName = "";
        char ch;

        for (int i=0; i<name.length(); i++)
        {
            ch= name.charAt(i); //extracts each character
            revName= ch+revName; //adds each character in front of the existing string
        }
        return "Your reversed name is " + revName + "!!";
     }

}
