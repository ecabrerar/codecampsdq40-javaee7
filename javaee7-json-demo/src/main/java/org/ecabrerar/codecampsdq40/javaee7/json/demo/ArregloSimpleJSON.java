/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ecabrerar.codecampsdq40.javaee7.json.demo;

import javax.json.Json;
import javax.json.JsonArray;

/**
 *
 * @author ecabrerar
 */
public class ArregloSimpleJSON {
    public static void main(String[] args) {
        JsonArray jsonArray = Json.createArrayBuilder()
                .add(Json.createObjectBuilder().add("apple", "red"))
                .add(Json.createObjectBuilder().add("banana", "yellow"))
                .build();
        
        System.out.println(""+jsonArray);
    }
}
