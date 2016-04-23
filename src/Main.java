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
        plate.getInput("a",2,"a",3);
        plate.play();

       // while (player1.isPlaying()){
        plate.getInput("a",3,"a",4);
        plate.play();
        plate.getInput("a",1,"a",3);
        plate.play();
        plate.getInput("a",1,"a",3);
        plate.play();

        plate.getInput("a",3,"f",3);
        plate.play();
        plate.getInput("b",1,"a",2);
        plate.play();
        plate.getInput("a",2,"d",5);
        plate.play();
        plate.getInput("c",1,"b",3);
        plate.play();
        plate.getInput("a",7,"a",6);
        plate.play();




       // }

    }
}
