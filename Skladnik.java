/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dekorator;

/**
 *
 * @author student
 */
class Skladnik {
    
    public String nazwa;
    public double cena;
    
    public Skladnik(String nazwa, double cena){
        this.nazwa = nazwa;
        this.cena = cena;
    }
    
    
    public String getName(){
        return nazwa;
    }
    
    public double getCena(){
        return cena;
    }
}
