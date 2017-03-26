package roulette;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Raffle {
    
    protected int num;
    protected int bet;
    // colours are lists, for now
    protected ArrayList<Integer> reds = 
            new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36));
    
    protected ArrayList<Integer> blacks = 
            new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35));
    //in roulette 0 is usually green, and 00 is 37 because java doesn't think 00 is a thing
    protected int green = 0;
    protected int ohoh = 37;
    
    private int rouletteWheel(){
        int rng = ThreadLocalRandom.current().nextInt(0, 37);
        return rng;
    }
    
    public void gamble(int num, int bet){
        int slot = rouletteWheel();
        this.num = num;
        this.bet = bet;
        
        System.out.println(slot);
        
        if (num == slot){
            System.out.println("WIN");
        }
        else {
            System.out.println("LOSE");
        }
        
        
    }
}
