/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.ArrayList;
import uno_webca.UNOcard;
import uno_webca.UNOdeck;
import uno_webca.UNOgame;
import uno_webca.UNOplayer;

/**
 *
 * @author sobhanbhargavi
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          String id = "A029922";

        ArrayList<UNOplayer> players = new ArrayList<UNOplayer>();
        players.add(new UNOplayer("sads"));
        players.add(new UNOplayer("sads1"));
        players.add(new UNOplayer("sads2"));
        players.add(new UNOplayer("sads3"));
        players.add(new UNOplayer("sads4"));

        String status = "started";

        UNOdeck deck = new UNOdeck();

        for (UNOplayer p : players) {
            for (int i = 0; i < 7; i++) {
                p.getHandcards().add(deck.Drawcard());
            }
        }

        UNOgame game = new UNOgame(id, players, status, deck, deck.Drawcard());

        System.out.println("run: ");
        System.out.println("Id: " + game.getID());
        System.out.println("Discard: card: " + game.getDiscardpile());
        System.out.println("Cards on deck: " + game.getDeck().getNoofCards());
        for (UNOplayer p : game.getPlayers()) {
            System.out.println("        Player:" + p);
            System.out.println("        Cards in hand:");
            for (UNOcard c : p.getHandcards()) {
                System.out.println("                Card: " + c);
            }
            System.out.println();

        }
        // TODO code application logic here
    }
    
}
