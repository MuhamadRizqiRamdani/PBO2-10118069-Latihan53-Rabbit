/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbo2.latihan53.rabbit;

/**
 *
 * @author asus
 * NAMA     : Muhamad Rizqi Ramdani
 * KELAS    : IF-2
 * NIM      : 10118069
 * Deskripsi Program : kelinci
 */
public class Animal {
    protected boolean vegetarian;
    protected String eats;
    protected int noOfLegs;
    
    public Animal(boolean vegetarian, String food, int legs){
        this.vegetarian = vegetarian;
        eats = food;
        noOfLegs = legs;
    }
    
    public boolean isVegetarian(){
        return vegetarian;
    }

    public String getEats() {
        return eats;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }
    
    
    
}
