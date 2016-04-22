/**
 * Created by ronan on 22/04/2016.
 */
public class PlayerController {
    private PlayerView _plv;
    private boolean playing=true;

    public PlayerController(){
        _plv=new PlayerView(this);
    }

    public void affi(){
        System.out.print("Player 1 on");
    }

    public boolean isPlaying() {
        return playing;
    }
}
