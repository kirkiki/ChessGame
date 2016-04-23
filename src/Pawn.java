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
        return colonneD == colonneA && Math.abs(ligneA - ligneD) == 1;
    }
}

