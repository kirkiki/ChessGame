/**
 * Created by ronan on 22/04/2016.
 */
public class Tower extends Piece {
    public Tower(int x, int y, String couleur) {
        super(x, y, "T", couleur);
    }

    public Tower(String name) {
        super(name);
    }

    @Override
    public boolean canMove(int ligneD, int colonneD, int ligneA, int colonneA) {
        return !(colonneD != colonneA && ligneD != ligneA);
    }

    @Override
    public boolean freeWay(int ligneD, int colonneD, int ligneA, int colonneA, Plate plate) {
        if (colonneA == colonneD) {
            if (ligneA > ligneD) {
                for (int i = 0; i <= ligneA - ligneD; i++) {
                    return plate.Board()[ligneD + i][colonneD].Name().equals("..") || !plate.Board()[ligneA][colonneA].getCouleur().equals(this.getCouleur());
                }
            } else if (ligneA < ligneD) {
                for (int i = ligneD - ligneA; i >= 0; i--) {
                    return plate.Board()[ligneD - i][colonneD].Name().equals("..") || !plate.Board()[ligneA][colonneA].getCouleur().equals(this.getCouleur());
                }
            }
        } else if (ligneA == ligneD) {

            if (colonneA > colonneD) {

                for (int i = 0; i <= colonneA - colonneD; i++) {
                    return plate.Board()[ligneD][colonneD + i].Name().equals("..") || !plate.Board()[ligneA][colonneA].getCouleur().equals(this.getCouleur());
                }
            } else if (colonneA < colonneD) {
                for (int i = 0; i <= colonneD-colonneA; i++) {
                    return plate.Board()[ligneD][colonneD - i].Name().equals("..") || !plate.Board()[ligneA][colonneA].getCouleur().equals(this.getCouleur());
                }
            }
        }
        return false;
    }
}
