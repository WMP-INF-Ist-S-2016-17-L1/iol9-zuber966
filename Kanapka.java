/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dekorator;

import java.util.ArrayList;

/**
 *
 * @author student
 */
abstract class Kanapka {
    
    ArrayList<String> listaSkladnikow = new ArrayList<>();
    public double cena = 5;
    
    public Kanapka(){
        listaSkladnikow.add("Bułka");
        listaSkladnikow.add("Masło");
        listaSkladnikow.add("Ser");
    }
    
    public boolean dodajSkladnik(Skladnik s){
        listaSkladnikow.add(s.getName());
        cena += s.getCena();
        return true;
    }
    
    public void wyswietlListeSkladnikow(){
        for(String s : listaSkladnikow){
            System.out.print(s+",");
        }
    }
    
    public void podajCene(){
        System.out.println("Cena: "+cena);
    }
    
}
