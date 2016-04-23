/**
 * Created by ronan on 22/04/2016.
 */
public class Queen extends Piece {
    public Queen(int x, int y, String couleur) {
        super(x, y, "Q", couleur);
    }

    public Queen(String name) {
        super(name);
    }

    @Override
    public boolean canMove(int ligneD, int colonneD, int ligneA, int colonneA) {
        if (ligneD == ligneA || colonneA == colonneD)
            return true;
        else return Math.abs(ligneA - ligneD) == Math.abs(colonneA - colonneD);
    }

    @Override
    public boolean freeWay(int ligneD, int colonneD, int ligneA, int colonneA, Plate plate) {
        if (ligneD==ligneA||colonneA==colonneD ) {
            return plate.Tower().freeWay(ligneD, colonneD, ligneA, colonneA, plate);

        } else {
            return plate.Bishop().freeWay(ligneD, colonneD, ligneA, colonneA, plate);
        }
    }
}

