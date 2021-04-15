package comp1110.ass2;

import comp1110.ass2.State;

import java.util.ArrayList;

public class Mosaic implements Tiles {

    String mosaicState = EMPTY_STATE;

    public ArrayList<MosaicRow> mosaic_rows = new ArrayList<MosaicRow>();
    public ArrayList<MosaicCol> mosaic_cols = new ArrayList<MosaicCol>();

    int[] letters = new int[128];

    public Mosaic(String mosaicState){
        this.mosaicState = mosaicState;
        addMosaicRowCol(mosaicState);
        countTilesNumber(mosaicState);
    }

    public void addMosaicRowCol(String mosaicState){
        ArrayList<Character> tile_color = new ArrayList<Character>();
        ArrayList<Integer> mosaic_row_idx = new ArrayList<Integer>();
        ArrayList<Integer> mosaic_col_idx = new ArrayList<Integer>();

        char[] mosaicState_char_array = mosaicState.toCharArray();
        int len = 0;
        int div = 3;
        int i = 0;
        for( char c : mosaicState_char_array ){
            if(i % div == 0){
                tile_color.add(c);
                len++;
            }
            else if(i % div == 1){
                mosaic_row_idx.add(Character.getNumericValue(c));
            }
            else {
                mosaic_col_idx.add(Character.getNumericValue(c));
            }
            i++;
        }

        StringBuilder SB = new StringBuilder();
        SB.append("");
        this.mosaic_rows.clear();
        for(int row=0; row < MAX_MOSAIC_ROW; row++){
            for(int j=0; j < len; j++){
                if(mosaic_row_idx.get(j) == row){
                    SB.append(tile_color.get(j));
                    SB.append(mosaic_row_idx.get(j));
                    SB.append(mosaic_col_idx.get(j));
                }
            }
            if(SB.length() > 0){
                this.mosaic_rows.add(new MosaicRow(String.valueOf(SB), row));
            }
            else {
                SB.append("");
                this.mosaic_rows.add(new MosaicRow(String.valueOf(SB), row));
            }
            SB.delete(0,SB.length());
        }

        SB.append("");
        this.mosaic_cols.clear();
        for(int col=0; col < MAX_MOSAIC_COL; col++){
            for(int j=0; j < len; j++){
                if(mosaic_col_idx.get(j) == col){
                    SB.append(tile_color.get(j));
                    SB.append(mosaic_row_idx.get(j));
                    SB.append(mosaic_col_idx.get(j));
                }
            }
            if(SB.length() > 0){
                this.mosaic_cols.add(new MosaicCol(String.valueOf(SB), col));
            }
            else {
                SB.append("");
                this.mosaic_cols.add(new MosaicCol(String.valueOf(SB), col));
            }
            SB.delete(0,SB.length());
        }

    }

    public MosaicRow getMosaicRow(int row){
        return this.mosaic_rows.get(row);
    }

    public MosaicCol getMosaicCol(int col){
        return this.mosaic_cols.get(col);
    }

    @Override
    public void countTilesNumber(String mosaicState){

        int[] letters_array = new int[128];
        char[] mosaicState_char_array = mosaicState.toCharArray();
        for(char c : mosaicState_char_array){
            letters_array[c]++;
        }
        // 'a'~'f'
        this.letters[BLUE] = letters_array[BLUE];
        this.letters[GREEN] = letters_array[GREEN];
        this.letters[ORANGE] = letters_array[ORANGE];
        this.letters[PURPLE] = letters_array[PURPLE];
        this.letters[RED] = letters_array[RED];
    }

    @Override
    public int getTilesNumber(char color){
        return this.letters[color];
    }

    @Override
    public int getTotalTilesNumber(){
        int tot_tiles = 0;
        char color = BLUE;
        for(int i=0; i <= RED - BLUE; i++){
            tot_tiles += this.letters[color];
            color++;
        }
        return tot_tiles;
    }

    @Override
    public boolean isStateEmpty() {
        return this.mosaicState.isEmpty();
    }

    @Override
    public String getStateString() {
        return this.mosaicState;
    }

    @Override
    public String toString(){
        return getStateString();
    }

    @Override
    public void updateState() {
        StringBuilder SB = new StringBuilder();
        for( MosaicRow mr : this.mosaic_rows ){
            SB.append(mr.getStateString());
        }
        this.mosaicState = String.valueOf(SB);
    }

    /**
     * Inner class eachMosaicRow of Mosaic class
     * Each player has eachMosaicRow state stored here
     */
    public class MosaicRow implements CoordinateTyped, Comparable<MosaicRow>{
        // TODO finish eachMosaicRow and eachMosaicCol
        String mosaic_rowState = EMPTY_STATE;
        char[] MOSAIC_MASK = new char[MAX_MOSAIC_ROW];
        int[] letters = new int[128];
        int MAX_TILES_LIMIT = MAX_MOSAIC_ROW;
        int row;

        public MosaicRow (String mosaic_rowState, int row){
            //System.out.println(" row " + row + " : " + mosaic_rowState);
            this.mosaic_rowState = mosaic_rowState;
            this.row = row;
            generateMosaicMask(row);
            countTilesNumber(mosaic_rowState);
        }

        private void generateMosaicMask(int row){
            for(int i=0; i < MAX_MOSAIC_ROW; i++) {
                MOSAIC_MASK[i] = TILES_MASK[(i + MAX_MOSAIC_ROW - row) % MAX_MOSAIC_ROW];
            }
        }

        @Override
        public void countTilesNumber(String State) {
            int[] letters_array = new int[128];
            char[] mosaic_rowState_char_array = State.toCharArray();
            for(char c : mosaic_rowState_char_array){
                letters_array[c]++;
            }
            // 'a'~'f'
            this.letters[BLUE] = letters_array[BLUE];
            this.letters[GREEN] = letters_array[GREEN];
            this.letters[ORANGE] = letters_array[ORANGE];
            this.letters[PURPLE] = letters_array[PURPLE];
            this.letters[RED] = letters_array[RED];

        }

        @Override
        public int getTilesNumber(char color){
            return this.letters[color];
        }

        @Override
        public int getTotalTilesNumber(){
            int tot_tiles = 0;
            char color = BLUE;
            for(int i=0; i <= RED - BLUE; i++){
                tot_tiles += this.letters[color];
                color++;
            }
            return tot_tiles;
        }

        @Override
        public int compareTo(MosaicRow mosaic_row) {
            if(row == mosaic_row.row){
                return 0;
            }
            else if(row > mosaic_row.row){
                return 1;
            }
            else{
                return -1;
            }
        }

        @Override
        public boolean isRowTilesFull() {
            return (this.MAX_TILES_LIMIT == getTotalTilesNumber());
        }

        @Override
        public boolean isStateEmpty() {
            return this.mosaic_rowState.isEmpty();
        }

        @Override
        public String getStateString() {
            return this.mosaic_rowState;
        }

        @Override
        public String toString(){
            return getStateString();
        }

        @Override
        public void updateState() {

        }
    }


    public class MosaicCol implements CoordinateTyped, Comparable<MosaicCol> {
        // TODO finish eachMosaicRow and eachMosaicCol
        String mosaic_colState = EMPTY_STATE;
        char[] MOSAIC_MASK = new char[MAX_MOSAIC_COL];
        int[] letters = new int[128];
        int MAX_TILES_LIMIT = MAX_MOSAIC_COL;
        int col;

        public MosaicCol(String mosaic_colState, int col) {
            //System.out.println(" col " + col + " : " + mosaic_colState);
            this.mosaic_colState = mosaic_colState;
            this.col = col;
            generateMosaicMask(col);
            countTilesNumber(mosaic_colState);
        }

        private void generateMosaicMask(int col) {
            for (int i = 0; i < MAX_MOSAIC_COL; i++) {
                MOSAIC_MASK[i] = TILES_MASK[(i + MAX_MOSAIC_COL - col) % MAX_MOSAIC_ROW];
            }
        }

        @Override
        public void countTilesNumber(String mosaic_colState){
            int[] letters_array = new int[128];
            char[] mosaic_colState_char_array = mosaic_colState.toCharArray();
            for(char c : mosaic_colState_char_array){
                letters_array[c]++;
            }
            // 'a'~'f'
            this.letters[BLUE] = letters_array[BLUE];
            this.letters[GREEN] = letters_array[GREEN];
            this.letters[ORANGE] = letters_array[ORANGE];
            this.letters[PURPLE] = letters_array[PURPLE];
            this.letters[RED] = letters_array[RED];
        }

        @Override
        public int getTilesNumber(char color){
            return this.letters[color];
        }

        @Override
        public int getTotalTilesNumber() {
            int tot_tiles = 0;
            char color = BLUE;
            for (int i = 0; i <= RED - BLUE; i++) {
                tot_tiles += this.letters[color];
                color++;
            }
            return tot_tiles;
        }

        @Override
        public int compareTo(MosaicCol mosaic_col) {
            if(col == mosaic_col.col){
                return 0;
            }
            else if(col > mosaic_col.col){
                return 1;
            }
            else{
                return -1;
            }
        }

        @Override
        public boolean isRowTilesFull() {
            return (this.MAX_TILES_LIMIT == getTotalTilesNumber());
        }

        @Override
        public boolean isStateEmpty() {
            return this.mosaic_colState.isEmpty();
        }

        @Override
        public String getStateString() {
            return this.mosaic_colState;
        }

        @Override
        public String toString(){
            return getStateString();
        }

        @Override
        public void updateState() {

        }
    }

}
