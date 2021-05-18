package comp1110.ass2.Custom_tests;

import comp1110.ass2.TestFourPlayerStateCases;
import comp1110.ass2.backend.PlayerState;
import comp1110.ass2.TestStateCases;
import org.junit.jupiter.api.Test;

import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static org.junit.jupiter.api.Assertions.assertEquals;

@org.junit.jupiter.api.Timeout(value = 1000, unit = MILLISECONDS)

public class GetFourPlayerStateStringTest implements TestFourPlayerStateCases {

    // TODO 1 : Change all below code to test 4 Players version of game
    // TODO 2 : Use PLAYER_NUMBER (= 4), FULL_FOUR_PLAYER_GAME_WITH_MOVES to finish test
    // TODO 3 : Add valid states in interface TestFourPlayerStateCases
    // TODO 4 : Finish Turntest, PlayerStatetest, Mosaictest, MosaicRowtest, MosaicColtest, Storagetest, StorageRowtest, Floortest
    // TODO 5 : Finish testTurnState, testPlayerState, testMosaicState, testMosaicRowState, testMosaicColState, testStorageState, testStorageRowState, testFloorState
    // TODO 6 : Once done, get checked by Min Jae (John) Kim

    private void Turntest(String in, String expected, int player) {
        PlayerState ps = new PlayerState(in, DEFAULT_MAX_PLAYER);
        char out = ps.getnPlayer(ALL_PLAYERS[player]).getnPlayerChar();
        assertEquals(expected, String.valueOf(out), "Input state in TurnTest " + ALL_PLAYERS[player] + " : \"" + in + "\"");
    }

    private void PlayerStatetest(String in, String expected, int player) {
        PlayerState ps = new PlayerState(in, DEFAULT_MAX_PLAYER);
        String out = ps.getnPlayer(ALL_PLAYERS[player]).getStateString();
        assertEquals(expected, out, "Input state in PlayerStateTest " + ALL_PLAYERS[player] + " : \"" + in + "\"");
    }

    private void Mosaictest(String in, String expected, int player) {
        PlayerState ps = new PlayerState(in, DEFAULT_MAX_PLAYER);
        String out = ps.getnPlayer(ALL_PLAYERS[player]).mosaic.getStateString();
        assertEquals(expected, out, "Input state in Mosaictest " + ALL_PLAYERS[player] + " : \"" + in + "\"");
    }

    private void MosaicRowtest(String in, String expected, int player, int row) {
        PlayerState ps = new PlayerState(in, DEFAULT_MAX_PLAYER);
        String out = ps.getnPlayer(ALL_PLAYERS[player]).mosaic.getMosaicRow(row).getStateString();
        assertEquals(expected, out, "Input state in MosaicRowtest " + ALL_PLAYERS[player] + " : \"" + in + "\"");
    }

    private void MosaicColtest(String in, String expected, int player, int col) {
        PlayerState ps = new PlayerState(in, DEFAULT_MAX_PLAYER);
        String out = ps.getnPlayer(ALL_PLAYERS[player]).mosaic.getMosaicCol(col).getStateString();
        assertEquals(expected, out, "Input state in MosaicColtest " + ALL_PLAYERS[player] + " : \"" + in + "\"");
    }

    private void Storagetest(String in, String expected, int player) {
        PlayerState ps = new PlayerState(in, DEFAULT_MAX_PLAYER);
        String out = ps.getnPlayer(ALL_PLAYERS[player]).storage.getStateString();
        assertEquals(expected, out, "Input state in Storagetest " + ALL_PLAYERS[player] + " : \"" + in + "\"");
    }

    private void StorageRowtest(String in, String expected, int player, int row) {
        PlayerState ps = new PlayerState(in, DEFAULT_MAX_PLAYER);
        String out = ps.getnPlayer(ALL_PLAYERS[player]).storage.getStorageRow(row).getStateString();
        assertEquals(expected, out, "Input state in StorageRowtest " + ALL_PLAYERS[player] + " : \"" + in + "\"");
    }

    private void Floortest(String in, String expected, int player) {
        PlayerState ps = new PlayerState(in, DEFAULT_MAX_PLAYER);
        String out = ps.getnPlayer(ALL_PLAYERS[player]).floor.getStateString();
        assertEquals(expected, out, "Input state in Floortest " + ALL_PLAYERS[player] + " : \"" + in + "\"");
    }

    /*
    @Test
    public void testTurnState(){
        for (int i = 0; i < VALID_STATES.length; i++) {
            for(int j = 0; j < DEFAULT_MAX_PLAYER; j++){
                Turntest(VALID_STATES[i][1], VALID_STATES_TURNS[i][j+1], j);
            }
        }
    }

    @Test
    public void testPlayerState(){
        for (int i = 0; i < VALID_STATES.length; i++) {
            for(int j = 0; j < DEFAULT_MAX_PLAYER; j++){
                PlayerStatetest(VALID_STATES[i][1], VALID_PLAYER_STATES[i][j], j);
            }
        }
    }

    @Test
    public void testMosaicState(){
        for (int i = 0; i < VALID_STATES.length; i++) {
            for(int j = 0; j < DEFAULT_MAX_PLAYER; j++){
                Mosaictest(VALID_STATES[i][1], VALID_STATES_MOSAIC[i][j], j);
            }
        }
    }

    @Test
    public void testMosaicRowState(){
        for (int i = 0; i < VALID_STATES.length; i++) {
            for(int j = 0; j < DEFAULT_MAX_PLAYER; j++){
                for(int row = 0; row < MAX_MOSAIC_ROW; row++){
                    MosaicRowtest(VALID_STATES[i][1], VALID_STATES_MOSAIC_ROW[i][j*5+row], j, row);
                }

            }
        }
    }

    @Test
    public void testMosaicColState(){
        for (int i = 0; i < VALID_STATES.length; i++) {
            for(int j = 0; j < DEFAULT_MAX_PLAYER; j++){
                for(int col = 0; col < MAX_MOSAIC_COL; col++){
                    MosaicColtest(VALID_STATES[i][1], VALID_STATES_MOSAIC_COL[i][j*5+col], j, col);;
                }
            }
        }
    }

    @Test
    public void testStorageState(){
        for (int i = 0; i < VALID_STATES.length; i++) {
            for(int j = 0; j < DEFAULT_MAX_PLAYER; j++){
                Storagetest(VALID_STATES[i][1], VALID_STATES_STORAGE[i][j], j);
            }
        }
    }

    @Test
    public void testStorageRowState(){
        for (int i = 0; i < VALID_STATES.length; i++) {
            for(int j = 0; j < DEFAULT_MAX_PLAYER; j++){
                for(int row = 0; row < MAX_STORAGE_ROW; row++){
                    StorageRowtest(VALID_STATES[i][1], VALID_STATES_STORAGE_ROW[i][j*5+row], j, row);
                }
            }
        }
    }

    @Test
    public void testFloorState(){
        for (int i = 0; i < VALID_STATES.length; i++) {
            for(int j = 0; j < DEFAULT_MAX_PLAYER; j++){
                Floortest(VALID_STATES[i][1], VALID_STATES_FLOOR[i][j], j);
            }
        }
    }

     */
}