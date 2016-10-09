/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import model.Id;

/**
 *
 * @author tonidias
 */
public class IdManager {
    
    public Id getId(){
        return new Id("toto", "tata");
    }
}
