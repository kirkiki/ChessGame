/**
 * Created by ronan on 22/04/2016.
 */
public class PlayerController {
    PlayerView _plv;

    public PlayerController(){
        _plv=new PlayerView(this);
    }

    public void affi(){
        System.out.print("Player 1 on");
    }
}
