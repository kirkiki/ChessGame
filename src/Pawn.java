/**
 * Created by ronan on 22/04/2016.
 */
public class Pawn extends Piece {

    public Pawn(int x, int y, String couleur) {
        super(x, y, "P", couleur);
    }

    @Override
    public boolean canMove(int ligneD, int colonneD, int ligneA, int colonneA) {
        //ajouter la condition mangerPion
        if (this.getCouleur().equals("W"))
            return colonneD == colonneA && ligneD - ligneA == 1;
        else
            return colonneD == colonneA && ligneA - ligneD == 1;
    }

    @Override
    public boolean freeWay(int ligneD, int colonneD, int ligneA, int colonneA, Plate plate) {
        return true;
    }
}

