package roulette;

import java.util.concurrent.ThreadLocalRandom;

public class Raffle {
    
    public int num;
    public int bet;
    
    private int rouletteWheel(){
        int rng = ThreadLocalRandom.current().nextInt(0, 36);
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
