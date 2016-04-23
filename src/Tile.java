import java.util.PrimitiveIterator;

/**
 * Created by ronan on 22/04/2016.
 */
public class Tile extends Piece {
    public Tile(String name) {
        super(name);
        setCouleur("");
    }


    @Override
    public boolean canMove(int ligneD, int colonneD, int ligneA, int colonneA) {
        return false;
    }

    @Override
    public boolean freeWay(int ligneD, int colonneD, int ligneA, int colonneA, Plate plate) {
        return false;
    }

}
