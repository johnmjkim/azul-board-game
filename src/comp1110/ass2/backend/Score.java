package comp1110.ass2.backend;

public class Score implements State{

    // Size, Numbers of all components
    public final String EMPTY_STATE = "";
    int score;

    // Player fields strings
    String scoreState = EMPTY_STATE;

    /**
     * Constructor method for Score class
     * @param scoreState
     */
    public Score ( String scoreState ){
        this.scoreState = scoreState;
        this.score = Integer.parseInt(scoreState);
    }

    public String getScoreState(){
        updateState();
        return this.scoreState;
    }

    public int getScore(){
        return this.score;
    }

    /**
     * Add score to the particular player
     * @param score_added
     */
    public void addScore( int score_added ){
        int current_score = this.score;
        int adjusted_score = current_score + score_added;
        if(adjusted_score < 0){
            this.score = 0;
        }
        else{
            this.score = adjusted_score;
        }
        updateState();
    }

    /**
     * Calculate score when clearing floor
     * @param floor_length
     * @return
     */
    public int scoreLose_clearFloor( int floor_length ) {
        if( floor_length < MAX_FLOOR_STRING_SIZE){
            return CLEARING_FLOOR_POINTS[floor_length];
        }
        else{
            return -14;
        }
    }

    /**
     * Calculate and reflect score after clearing floor
     * @param floor_length
     */
    public void clearFloorScore( int floor_length ){
        int score_lost = scoreLose_clearFloor(floor_length);
        addScore(score_lost);
        updateState();
    }

    @Override
    public boolean isStateEmpty() {
        return this.scoreState.isEmpty();
    }

    @Override
    public String getStateString() {
        return this.scoreState;
    }

    @Override
    public void updateState() {
        StringBuilder SB = new StringBuilder();
        SB.append(this.score);
        this.scoreState = String.valueOf(SB);
    }
}
