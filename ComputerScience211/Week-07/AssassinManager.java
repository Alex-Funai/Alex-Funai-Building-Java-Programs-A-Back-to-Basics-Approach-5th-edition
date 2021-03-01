// CS211 - Assignment 7 - Linked List (Assassin Game)
// Alexander Funai

/*********************************************
 * You need to implement AssassinManager     *
 *********************************************/

import java.util.*;

public class AssassinManager {
    // the head of the kill ring linked list
    private AssassinNode killRingHead = null;

    // the head of the grave yard linked list
    private AssassinNode graveYardHead = null;

    public AssassinManager(List<String> names) {
        if ( names == null || names.size() == 0) {
            throw new IllegalArgumentException();
        }
        for ( int i = names.size() - 1; i >=0; i--) {
            this.killRingHead = new AssassinNode ( names.get(i), this.killRingHead);
        }
    }

    public void printKillRing() {
        AssassinNode current;
        for ( current = this.killRingHead; current.next != null; current = current.next ) {
            System.out.println ( "   " + current.name + " is stalking " + current.next.name );
        }
        System.out.println ( "   " + current.name + " is stalking " + this.killRingHead.name);
    }

    public void printGraveyard() {
        AssassinNode current = this.graveYardHead;
        while ( current != null ) {
            System.out.println ("   " + current.name + " was killed by " + current.killer);
            current = current.next;
        }
    }

    public boolean killRingContains(String name) {
        AssassinNode killer;
        for ( killer = this.killRingHead; killer.next != null; killer = killer.next) {
            if ( killer.name.equalsIgnoreCase(name))
                return true;
        }
        return false;
    }

    public boolean graveyardContains(String name) {
        AssassinNode current;
        for ( current = this.graveYardHead; current.next != null; current = current.next) {
            if ( current.name.equals(name))
                return true;
        }
        return false;
    }

    public boolean gameOver() {
        return this.killRingHead.next == null;
    }


    public String winner() {
        if ( gameOver()) {
            return this.killRingHead.name;
        }
        return null;
    }

    public void kill(String name) {
        AssassinNode current = this.killRingHead;
        if ( gameOver()) {
            throw new IllegalStateException();
        }
        if (!killRingContains(name)) {
            throw new IllegalArgumentException();
        }
        while ( current.next !=null && current.next.name.equalsIgnoreCase(name)) {
            current = current.next;
        }
        AssassinNode temporary = this.graveYardHead;

        if ( this.killRingHead.name.equalsIgnoreCase(name) ) {
            this.graveYardHead = this.killRingHead;
            this.killRingHead = this.killRingHead.next;
        } else {
            this.graveYardHead.next = temporary;
            this.graveYardHead.killer = current.name;
        }
    }
}
