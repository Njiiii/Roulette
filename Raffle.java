package roulette;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Raffle {
    
    protected int num;
    protected int bet;
    
    protected ArrayList<Integer> reds = 
            new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36));
    
    protected ArrayList<Integer> blacks = 
            new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35));
    
    //in roulette 0 is usually green, and 00 is 37 because java doesn't think 00 is a thing
    protected int green = 0;
    protected int doublegreen = 37;
    
    private int rouletteWheel(){
        int rng = ThreadLocalRandom.current().nextInt(0, 37);
        //int rng = 10;
        //System.out.println(rng);
       
        return rng;
    }
    
    //Spin is used to check if rouletteWheel() works
    public void spin(){
        int a = rouletteWheel();
        System.out.println(a);
        
    }
    
    public void gamble(int num, int bet){
        int slot = rouletteWheel();
        this.num = num;
        this.bet = bet;
        
        if (reds.contains(slot)){
            System.out.println("Red, " + slot);
        }
        else if (blacks.contains(slot)){
            System.out.println("Black, " + slot);
        }
        else if (slot == green){
            System.out.println("Zero");
        }
        else if (slot == doublegreen){
            System.out.println("Double zero");
        }
        
        if (num == slot){
            bet = bet * 37;
            System.out.println("Ammount won: " + bet + "$");
            System.out.println("WIN");
        }
        else {
            System.out.println("LOSE");
        }
        
        
    }
}
