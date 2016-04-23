/**
 * Created by ronan on 22/04/2016.
 */
public class Bishop extends Piece {
    public Bishop(int x, int y, String couleur) {
        super(x, y, "B", couleur);
    }
    public Bishop(String name){super(name);}

    @Override
    public boolean canMove(int ligneD, int colonneD, int ligneA, int colonneA) {
        return Math.abs(ligneA - ligneD) == Math.abs(colonneA - colonneD);
    }

}
