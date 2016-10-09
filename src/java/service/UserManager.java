/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import model.User;

/**
 *
 * @author tonidias
 */
public class UserManager {
    public User getUser(){
        return new User("toto", "tata");
    }
}
