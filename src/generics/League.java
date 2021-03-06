/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Alumno
 */
public class League <T extends Team> {
    public String name;
    private ArrayList<T> league = new ArrayList<>();
    
    public League(String name){
        this.name = name;
    }
    
    public boolean add(T team) {
        if(league.contains(team)){
            return false;
        }
        league.add(team);
        return true;
    }
    
    public void showLeagueTable(){
        System.out.println("----------------------"+name+"--------------------------");
        Collections.sort(league);
        for(T t : league) {
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }
}
