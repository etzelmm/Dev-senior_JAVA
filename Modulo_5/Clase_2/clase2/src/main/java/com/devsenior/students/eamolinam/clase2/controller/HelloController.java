package com.devsenior.students.eamolinam.clase2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/api/hello")
public class HelloController {

    @GetMapping
    public String sayHelloWorld(){
        return "Hello world!!";
    }

    @GetMapping("/name")
    public String sayHelloToMe(
            @RequestParam("nombre") String name, 
            @RequestParam(value = "apellido", required = false, defaultValue = "Smith") String lastName){
        return String.format("Hello %s %s", name, lastName);
    }

    @GetMapping("/name2/{name}")
    public Map<String, Object> sayHelloToMe2(@PathVariable("name") String name){
        var value =String.format("Hello %s again ", name);
        return Map.of("mesagge: ", value, "edad", 24, "activo", true);
    }

    @PostMapping
    public String postMethodName(@RequestBody String entity) {
        return  "Creando la entidad: " + entity;
    }

    @PutMapping
    public String putMethodName(@RequestBody String entity) {
        return "Actualizando la entidad: " + entity;
    }

    @DeleteMapping("/{id}")
    public String deleteMethodName(@PathVariable("id") String id){
        return "Eliminando el id: " + id;
    }
    

}
