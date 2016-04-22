/**
 * Created by ronan on 22/04/2016.
 */
public class Main {
    public static void main(String [] args){
        PlateController plate = new PlateController();
        PlayerController player1 = new PlayerController();

        //plate.affi();
        plate.setup();
        plate.affi();

       // while (player1.isPlaying()){
            plate.play();
       // }

    }
}
