/**
 * Created by ronan on 22/04/2016.
 */
public class Queen  extends Piece{
    public Queen(int x, int y, String couleur){super(x,y,"Q",couleur);}
    public Queen(String name){super(name);}

    @Override
    public boolean canMove(int ligneD, int colonneD, int ligneA, int colonneA) {
        return true;
    }
}
