/**
 * Created by ronan on 22/04/2016.
 */
public class King extends Piece {
    public King(int x, int y, String couleur) {
        super(x, y, "K", couleur);
    }


    public King(String name) {
        super(name);
    }

    @Override
    public boolean canMove(int ligneD, int colonneD, int ligneA, int colonneA) {
        return !(Math.abs(ligneD - ligneA) != 1 || Math.abs(colonneA - colonneD) != 1);
    }

    @Override
    public boolean freeWay(int ligneD, int colonneD, int ligneA, int colonneA, Plate plate) {
        return !plate.Board()[ligneA][colonneA].getCouleur().equals(this.getCouleur());
    }
}
