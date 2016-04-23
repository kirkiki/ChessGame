/**
 * Created by ronan on 22/04/2016.
 */
public class Bishop extends Piece {
    public Bishop(int x, int y, String couleur) {
        super(x, y, "B", couleur);
    }

    public Bishop(String name) {
        super(name);
    }

    @Override
    public boolean canMove(int ligneD, int colonneD, int ligneA, int colonneA) {
        return Math.abs(ligneA - ligneD) == Math.abs(colonneA - colonneD);
    }

    @Override
    public boolean freeWay(int ligneD, int colonneD, int ligneA, int colonneA, Plate plate) {
        if (plate.Board()[ligneA][colonneA].getCouleur().equals("") || !plate.Board()[ligneA][colonneA].getCouleur().equals(this.getCouleur())) {
            if (ligneA < ligneD) {
                if (colonneA < colonneD) {
                    for (int i = ligneD - ligneA; i > 0; i--) {
                        return plate.Board()[ligneD - i][colonneD - i].Name().equals("..") || !plate.Board()[ligneA][colonneA].getCouleur().equals(this.getCouleur());
                    }
                } else if (colonneA > colonneD) {
                    for (int i = ligneD - ligneA; i > 0; i--) {
                        return plate.Board()[ligneD - i][colonneD + i].Name().equals("..");
                    }
                } else
                    return false;
                return true;
            } else if (ligneA > ligneD) {
                if (colonneA < colonneD) {
                    for (int i = ligneA - ligneD; i > 0; i--) {
                        return plate.Board()[ligneD - i][colonneD - i].Name().equals("..");
                    }
                } else return colonneA > colonneD;
                return true;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}