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
        
        
        
        
        Team<BaseballPlayer> redsocks = new Team<>(" Red Socks ");
        
        BaseballPlayer jorge1 = new BaseballPlayer("jorge1");
        BaseballPlayer jorge2 = new BaseballPlayer("jorge2");
        BaseballPlayer jorge3 = new BaseballPlayer("jorge3");
        
        
        Team<BaseballPlayer> sanfra = new Team<>(" San Francisco ");
        
        BaseballPlayer eduardo1 = new BaseballPlayer("eduardo1");
        BaseballPlayer eduardo2 = new BaseballPlayer("eduardo2");
        BaseballPlayer eduardo3 = new BaseballPlayer("eduardo3");
        
        
        Team<VolleyballPlayer> linces = new Team<>(" Linces ");
        
        VolleyballPlayer osvaldo1 = new VolleyballPlayer("osvaldo1");
        VolleyballPlayer osvaldo2 = new VolleyballPlayer("osvaldo2");
        VolleyballPlayer osvaldo3 = new VolleyballPlayer("osvaldo3");
        
        
        
        Team<VolleyballPlayer> borregos = new Team<>(" Borregos ");
        
        VolleyballPlayer rodrigo1 = new VolleyballPlayer("rodrigo1");
        VolleyballPlayer rodrigo2 = new VolleyballPlayer("rodrigo2");
        VolleyballPlayer rodrigo3 = new VolleyballPlayer("rodrigo3");
        
        
      
        redsocks.addPlayer(jorge1);
        redsocks.addPlayer(jorge2);
        redsocks.addPlayer(jorge3);
        
        sanfra.addPlayer(eduardo1);
        sanfra.addPlayer(eduardo2);
        sanfra.addPlayer(eduardo3);
        
        linces.addPlayer(osvaldo1);
        linces.addPlayer(osvaldo2);
        linces.addPlayer(osvaldo3);
        
        borregos.addPlayer(rodrigo1);
        borregos.addPlayer(rodrigo2);
        borregos.addPlayer(rodrigo3);
        
        League<Team<BaseballPlayer>> mlb = new League("MLB");
        
        mlb.add(sanfra);
        mlb.add(redsocks);
        
        League<Team<VolleyballPlayer>> vwc = new League("VOLLEY LEAGUE");
        
        vwc.add(linces);
        vwc.add(borregos);
        //vwc.add(redsocks);
        
        redsocks.matchResult(sanfra, 3, 2);
        
        
        linces.matchResult(borregos, 1, 2);
        
        mlb.showLeagueTable();
        
        vwc.showLeagueTable();
        
        
        
        
    }
    
}
