package comp1110.ass2;

import comp1110.ass2.State;

import java.util.ArrayList;

public class Discard extends BagTypedObject{
    public Discard(String bagTypedObjectState) {
        super(bagTypedObjectState);
    }
}
/*
public class Discard implements BagTyped {

    String discardState = EMPTY_STATE;
    int[] letters = new int[128];

    public Discard(String discardState){
        this.discardState = discardState;
        //countDiscardTilesNumber(discardState);
        countTilesNumber(discardState);
    }

    @Override
    public boolean isStateEmpty() {
        updateState();
        return this.discardState.isEmpty();
    }

    @Override
    public String getStateString() {
        updateState();
        return this.discardState;
    }

    @Override
    public String toString(){
        return getStateString();
    }

    @Override
    public void updateState() {
        StringBuilder SB = new StringBuilder();
        SB.append(EMPTY_STATE);
        int[] discard_letters = this.letters;
        char color = BLUE;
        for(int i=0; i <= RED - BLUE; i++){
            if(discard_letters[color] < 10){
                SB.append("0");
            }
            SB.append(String.valueOf(discard_letters[color]));
            color++;
        }
        this.discardState = String.valueOf(SB);
    }

    @Override
    public void countTilesNumber(String State) {
        ArrayList<Integer> discards_counts = new ArrayList<Integer>();
        char[] discardState_char_array = discardState.toCharArray();
        StringBuilder SB = new StringBuilder();
        int len = 0;
        for(char c : discardState_char_array){
            if( len % 2 == 0 && len != 0){
                discards_counts.add(Integer.valueOf(String.valueOf(SB)));
                SB.delete(0,SB.length());
            }
            SB.append(c);
            len++;
        }
        discards_counts.add(Integer.valueOf(String.valueOf(SB)));
        SB.delete(0,SB.length());
        // 'a'~'f'
        this.letters[BLUE] = discards_counts.get(0);
        this.letters[GREEN] = discards_counts.get(1);
        this.letters[ORANGE] = discards_counts.get(2);
        this.letters[PURPLE] = discards_counts.get(3);
        this.letters[RED] = discards_counts.get(4);
    }

    @Override
    public int getTilesNumber(char color) {
        return this.letters[color];
    }

    @Override
    public int getTotalTilesNumber() {
        int tot_tiles = 0;
        char color = BLUE;
        for(int i=0; i <= RED - BLUE; i++){
            tot_tiles += this.letters[color];
            color++;
        }
        return tot_tiles;
    }

    @Override
    public void removeTile(char color) {
        this.letters[color]--;
        updateState();
    }

    @Override
    public void removeAllTiles() {
        char color = BLUE;
        for(int i=0; i <= RED - BLUE; i++){
            while(this.letters[color] > 0){
                this.letters[color]--;
            }
            color++;
        }
        updateState();
    }

    @Override
    public void addTile(char color) {
        this.letters[color]++;
        updateState();
    }

    @Override
    public void addTiles(char color, int n) {
        for(int i=0; i < n; i++){
            this.letters[color]++;
        }
        updateState();
    }

    @Override
    public void refillTiles(String refill) {
        ArrayList<Integer> discards_counts = new ArrayList<Integer>();
        char[] refill_char_array = refill.toCharArray();
        StringBuilder SB = new StringBuilder();
        int len = 0;
        for(char c : refill_char_array){
            if( len % 2 == 0 && len != 0){
                discards_counts.add(Integer.valueOf(String.valueOf(SB)));
                SB.delete(0,SB.length());
            }
            SB.append(c);
            len++;
        }
        discards_counts.add(Integer.valueOf(String.valueOf(SB)));
        SB.delete(0,SB.length());
        // 'a'~'f'
        this.letters[BLUE] += discards_counts.get(0);
        this.letters[GREEN] += discards_counts.get(1);
        this.letters[ORANGE] += discards_counts.get(2);
        this.letters[PURPLE] += discards_counts.get(3);
        this.letters[RED] += discards_counts.get(4);
        updateState();
    }
}

 */
