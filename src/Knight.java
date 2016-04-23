/**
 * Created by ronan on 22/04/2016.
 */
public class Knight extends Piece {
    public Knight(int x, int y, String couleur) {
    super(x, y, "k", couleur);
}
    public Knight(String name){super(name);}

    @Override
    public boolean canMove(int ligneD, int colonneD, int ligneA, int colonneA) {
        return Math.abs(ligneA - ligneD) == 1 && (Math.abs(colonneA - colonneD) == 2 || Math.abs(colonneA - colonneD) == 1) || Math.abs(ligneA - ligneD) == 2 && (Math.abs(colonneA - colonneD) == 2 || Math.abs(colonneA - colonneD) == 1);

    }

}
