/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import model.Fruit;

/**
 *
 * @author tonidias
 */
public class FruitManager {
    
    public Fruit getRandomFruit(){
        
        return new Fruit("banana", "yellow");
    }
    
}
