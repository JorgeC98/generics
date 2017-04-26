/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class Generics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* TODO code application logic here
        //ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add("leon");
        items.add(5f);
        items.add(1.0);*/
        League<Team<BaseballPlayer>> baseballLeague = new League<>("MLB");
                
        Team<BaseballPlayer> jorge1 = new Team<>("jorge1");
        Team<BaseballPlayer> jorge2 = new Team<>("jorge2");
        Team<BaseballPlayer> jorge3 = new Team<>("jorge3");
        Team<BaseballPlayer> eduardo1 = new Team<>("eduardo1");
        Team<BaseballPlayer> eduardo2 = new Team<>("eduardo2");
        Team<BaseballPlayer> eduardo3 = new Team<>("eduardo3");
        
        League<Team<VolleyballPlayer>> bolleyballLeague = new League<>("");
        
        Team<VolleyballPlayer> osvaldo1 = new Team<>("osvaldo1");
        Team<VolleyballPlayer> osvaldo2 = new Team<>("osvaldo2");
        Team<VolleyballPlayer> osvaldo3 = new Team<>("osvaldo3");
        Team<VolleyballPlayer> rodrigo1 = new Team<>("osvaldo1");
        Team<VolleyballPlayer> rodrigo2 = new Team<>("osvaldo2");
        Team<VolleyballPlayer> rodrigo3 = new Team<>("osvaldo3");
        
    }
    
}
