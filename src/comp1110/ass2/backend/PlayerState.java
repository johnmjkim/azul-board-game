package comp1110.ass2.backend;

import java.util.ArrayList;

public class PlayerState extends States {

    // Player fields strings
    String[] playerNameState;
    String[] playerStates;

    public ArrayList<nPlayer> nplayers = new ArrayList<nPlayer>();

    /**
     * @author Min Jae, Kim
     * Constructor method for PlayerState class without parameter
     */
    public PlayerState(){
        super(EMPTY_STATE, DEFAULT_MAX_PLAYER);
        super.playerState = EMPTY_STATE;
        super.MAX_PLAYER_NUMBER = DEFAULT_MAX_PLAYER;
        setPlayerState( playerState , MAX_PLAYER_NUMBER );
    }

    /**
     * @author Min Jae, Kim
     * Constructor method for SharedState class with parameter
     * @param playerState
     * @param max_player_number
     */
    public PlayerState( String playerState , int max_player_number){
        super(playerState, max_player_number);
        super.playerState = playerState;
        super.MAX_PLAYER_NUMBER = max_player_number;
        setPlayerState( playerState , max_player_number);
    }

    /**
     * @author Min Jae, Kim
     * Set all Turn, Factories, Center, Bag, Discard and updateSharedState
     * @param playerState
     * @param max_player_number
     */
    public void setPlayerState( String playerState , int max_player_number ){
        this.playerNameState = new String[max_player_number];
        this.playerStates = new String[max_player_number];

        String playerState_substring = EMPTY_STATE;

        for(int i=0; i < max_player_number; i++){
            if( i < max_player_number - 1){
                playerState_substring = playerState.substring(playerState.indexOf(ALL_PLAYERS[i]),playerState.indexOf(ALL_PLAYERS[i + 1]));
            }
            else{
                playerState_substring = playerState.substring(playerState.indexOf(ALL_PLAYERS[i]),playerState.length());
            }
            playerNameState[i] = playerState_substring.substring(0, 1);
            playerStates[i] = playerState_substring.substring(1,playerState_substring.length());
        }

        setPlayerStates(playerStates, playerNameState , max_player_number);
    }

    private void setPlayerStates( String[] playerStates, String[] playerNameState , int max_player_number ){
        this.nplayers.clear();
        for(int i=0; i < MAX_PLAYER_NUMBER; i++){
            this.nplayers.add(new nPlayer( playerStates[i] , playerNameState[i].charAt(0), max_player_number));
        }
    }

    public nPlayer getnPlayer( char player ){
        int nplayer_index = 0;
        for( int i=0; i < MAX_PLAYER_NUMBER; i++){
            if(ALL_PLAYERS[i] == player){
                nplayer_index = i;
            }
        }
        return this.nplayers.get(nplayer_index);
    }

    public String getUpdatedPlayerState(){
        updatePlayerState();
        return super.playerState;
    }

    public String getUpdatedPlayerState( char player ){
        updatePlayerState();
        int index = getPlayer_index( player );
        return this.playerStates[index];
    }

    public int getPlayer_index( char player ){
        int player_index = 0;
        int i = 0;
        for( char c : ALL_PLAYERS ){
            if(c == player){
                player_index = i;
            }
            i++;
        }
        return player_index;
    }

    public void updatePlayerState(){
        StringBuilder SB = new StringBuilder();
        for(int i=0; i < MAX_PLAYER_NUMBER; i++){
            this.playerNameState[i] = String.valueOf(this.nplayers.get(i).nplayerNameState);
            this.playerStates[i] = this.nplayers.get(i).nplayerState;

            SB.append(this.nplayers.get(i).nplayerNameState);
            SB.append(this.nplayers.get(i).getStateString());
        }
        super.playerState = String.valueOf(SB);
    }

    /**
     * @author Min Jae, Kim
     * return true if the player finished its mosaic row
     * @return
     */
    public boolean isEndofGame(){
        boolean isGameEnd = false;
        for( nPlayer p : this.nplayers ){
            if(p.isEnder() == true){
                isGameEnd = true;
            }
        }
        return isGameEnd;
    }

    public char getEnder(){
        int ender_idx = 0;
        for( nPlayer p : this.nplayers ){
            if(p.isEnder() == true){
                return ALL_PLAYERS[ender_idx];
            }
            ender_idx++;
        }
        return NO_COLOR;
    }

    /**
     * @author Min Jae, Kim
     * Find out if the player has full storage row
     * @return
     */
    public boolean existsPlayerFullStorageRow(){
        boolean existsRowTilesFull = false;
        for( nPlayer p : this.nplayers ){
            if(p.existsStorageRowTilesFull()){
                existsRowTilesFull = true;
            }
        }
        return existsRowTilesFull;
    }
}
