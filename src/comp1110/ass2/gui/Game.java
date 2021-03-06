package comp1110.ass2.gui;

import comp1110.ass2.Constants;
import comp1110.ass2.backend.MultiAzul;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Game extends Application implements Constants {

    Group controls = new Group();
    Group matrixBoard = new Group();

    /* board layout */
    private static final int BOARD_WIDTH = 1200;
    private static final int BOARD_HEIGHT = 700;

    public static int PLAYER_NUMBER;
    public static int FACTORY_MAX_NUMBER;

    public static String[] currentState;

    public static ArrayList<Integer> playerOrders = new ArrayList<Integer>();
    public static ArrayList<String> playerNames = new ArrayList<String>();
    public static ArrayList<Character> playerTypes = new ArrayList<Character>();
    public static ArrayList<PlayersInformation.PlayerInfo> playerInfos = new ArrayList<PlayersInformation.PlayerInfo>();
    public static HashMap<Character, PlayersInformation.PlayerInfo> playerMap = new HashMap<Character, PlayersInformation.PlayerInfo>();

    public static StorageCoordinates STORAGE_COORDINATES;
    public static FloorCoordinates FLOOR_COORDINATES;
    public static MosaicCoordinates MOSAIC_COORDINATES;
    public static BagCoordinates BAG_COORDINATES;
    public static DiscardCoordinates DISCARD_COORDINATES;
    public static CenterCoordinates CENTER_COORDINATES;
    public static FactoriesCoordinates FACTORIES_COORDINATES;

    public static void main(String[] args) {
        launch(args);
    }

    // animateBoard() contains two parts:
    // showCenterBoard() and showPlayerBoard() of each players
    public static void animateBoard(){
        // Show setup of center of board
        showCenterBoard();
        // Show setup of player of board
        showPlayerBoard();
    };

    // showCenterBoard() contains four parts:
    // showFactory(), showCenter(), showBag() and showDiscard()
    // This is graphic of board states shared with all players
    public static void showCenterBoard(){
        showFactory();
        showCenter();
        showBag();
        showDiscard();
    };
    // showFactory() shows graphics of factories and their tiles
    public static void showFactory(){

    };
    // showCenter() shows graphics of center and their tiles
    public static void showCenter(){

    };
    // showBag() shows graphics of bag and their tiles
    public static void showBag(){

    };
    // showDiscard() shows graphics of discard and their tiles
    public static void showDiscard(){

    };

    // showPlayerBoard() contains three parts:
    // showStorage(), showMosaic(), showFloor().
    // This is graphic of board state of each players
    public static void showPlayerBoard(){
        showStorage();
        showMosaic();
        showFloor();
    };
    // showStorage() shows graphics of player's storage and their tiles
    public static void showStorage(){

    };
    // showMosaic() shows graphics of player's mosaic and their tiles
    public static void showMosaic(){

    };
    // showFloor() shows graphics of player's floor and their tiles
    public static void showFloor(){

    };

    @Override
    public void start(Stage stage) throws Exception {
        //  FIXME Task 12: Implement a basic playable Azul game in JavaFX that only allows tiles to be placed in valid places
        //  FIXME Task 14: Implement a computer opponent so that a human can play your game against the computer.
        stage.setTitle("Azul");
        Group root = new Group();
        Scene scene = new Scene(root, BOARD_WIDTH, BOARD_HEIGHT);

        decidePlayers();
        initializeStates();
        makeCoordinates();

        //start_page();
        //PlayerSetting playerSetting = new PlayerSetting();
        //playerSetting.main();

        //stage.setScene(scene);
        //stage.show();

        Viewer viewer = new Viewer();
        viewer.start(stage);

        //Create draggable tiles

    }

    private void decidePlayers(){
        //PLAYER_NUMBER = DEFAULT_MAX_PLAYER;
        PLAYER_NUMBER = 4;
        FACTORY_MAX_NUMBER = FACTORY_MAX_NUMBERS[PLAYER_NUMBER - DEFAULT_MAX_PLAYER];
        String[] temporary_names = new String[] {"player1name", "player2name", "player3name", "player4name"};
        char[] temporary_types = new char[] {HUMAN_PLAYER, COMPUTER_PLAYER, COMPUTER_PLAYER, COMPUTER_PLAYER};
        for(int i=0; i < PLAYER_NUMBER; i++){
            playerNames.add(temporary_names[i]);
            playerTypes.add(temporary_types[i]);
        }
        randomizeOrders();
        /*
        for(int i=0; i < PLAYER_NUMBER; i++){
            System.out.println(playerOrders.get(i));
        }

         */

        PlayersInformation playersinformation = new PlayersInformation(playerOrders, playerNames, playerTypes);
        playerInfos = playersinformation.getPlayerInfos();
        playerMap = playersinformation.getPlayerMap();
        //System.out.println(playersinformation);

        /*
        for( char player_turn : ALL_PLAYERS ){
            System.out.print(" Turn : " + player_turn + playerMap.get(player_turn));
        }

         */
    }

    private void randomizeOrders(){
        Random r = new Random();
        int bound = PLAYER_NUMBER;
        for(int i=0; i < bound; i++){
            int rand_num = r.nextInt(bound);
            if(i == 0){
                playerOrders.add(rand_num);
            }
            else{
                boolean repeated = false;
                for(int j=0; j < playerOrders.size(); j++){
                    if(playerOrders.get(j) == rand_num){
                        repeated = true;
                    }
                }
                if(repeated){
                    i--;
                }
                else{
                    playerOrders.add(rand_num);
                }
            }
        }
    }

    private void initializeStates() {
        MultiAzul multiazul = new MultiAzul(PLAYER_NUMBER);
        currentState = multiazul.setInitalStates(PLAYER_NUMBER);
        currentState = multiazul.setStartingState(currentState);
    }

    private void makeCoordinates(){
        // Coordinates
        STORAGE_COORDINATES = new StorageCoordinates();
        FLOOR_COORDINATES = new FloorCoordinates();
        MOSAIC_COORDINATES = new MosaicCoordinates();
        BAG_COORDINATES = new BagCoordinates();
        DISCARD_COORDINATES = new DiscardCoordinates();
        CENTER_COORDINATES = new CenterCoordinates(PLAYER_NUMBER);
        FACTORIES_COORDINATES = new FactoriesCoordinates(FACTORY_MAX_NUMBER);

        //System.out.println(STORAGE_COORDINATES);
        //System.out.println(FLOOR_COORDINATES);
        //System.out.println(MOSAIC_COORDINATES);
        //System.out.println(BAG_COORDINATES);
        //System.out.println(DISCARD_COORDINATES);
        //System.out.println(CENTER_COORDINATES);
        //System.out.println(FACTORIES_COORDINATES);

    }

    private void start_page() {
        matrixBoard.getChildren().clear();
        controls.getChildren().clear();

        Rectangle r1 = new Rectangle(50, 548, 1200, 30);
        r1.setFill(Color.WHITE);
        controls.getChildren().add(r1);

        Button WelcomeStartButton = new Button("Start");
        Button WelcomeExitButton = new Button("Exit ");

        ImageView boardA = new ImageView(new Image(WELCOME_PAGE_IMAGE));
        boardA.setFitWidth(1200);
        boardA.setFitHeight(600);
        boardA.setLayoutX(0);
        boardA.setLayoutY(15);
        boardA.setOpacity(1.0);
        matrixBoard.getChildren().add(boardA);

        WelcomeStartButton.setLayoutX(430);
        WelcomeStartButton.setLayoutY(360);
        WelcomeStartButton.setPrefSize(120,50);
        matrixBoard.getChildren().add(WelcomeStartButton);

        WelcomeExitButton.setLayoutX(630);
        WelcomeExitButton.setLayoutY(360);
        WelcomeExitButton.setPrefSize(120,50);
        matrixBoard.getChildren().add(WelcomeExitButton);

        WelcomeStartButton.setOnAction(ae -> {

            //boardA.setOpacity(0);
            matrixBoard.getChildren().clear();
            controls.getChildren().clear();
            //setupViewer();

            //ChoosePlayers();
            //setupViewer();

            Button GameExitButton = new Button("Exit ");
            //Button GameNextRoundButton = new Button("Next round");

            GameExitButton.setOnAction(ae1 -> {
                System.exit(0);
            });
            //GameNextRoundButton.setOnAction(ae1 -> {

                //if(current_stage == NEXT_ROUND_STAGE){
                //    currentState = multiazul.nextRound(currentState);
                //}
                //setupViewer();
            //});

            HBox hb1 = new HBox(GameExitButton);
            hb1.setSpacing(10);
            hb1.setLayoutX(1000);
            hb1.setLayoutY(550);
            controls.getChildren().add(hb1);
        });

        WelcomeExitButton.setOnAction(ae -> {
            System.exit(0);
        });

    }

}