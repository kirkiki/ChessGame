/**
 * Created by ronan on 22/04/2016.
 */
public class Plate {
    private String vide="    ";
    private String board[][] = {
            {"  ", "A  ", "B  ", "C  ", "D  ", "E  ", "F  ", "G  ", "H  "},
            {"1 ", vide, vide, vide, vide, vide, vide, vide, vide},
            {"2 ", vide, vide, vide, vide, vide, vide, vide, vide},
            {"3 ", vide, vide, vide, vide, vide, vide, vide, vide},
            {"4 ", vide, vide, vide, vide, vide, vide, vide, vide},
            {"5 ", vide, vide, vide, vide, vide, vide, vide, vide},
            {"6 ", vide, vide, vide, vide, vide, vide, vide, vide},
            {"7 ", vide, vide, vide, vide, vide, vide, vide, vide},
            {"8 ", vide, vide, vide, vide, vide, vide, vide, vide},

    };

    private Bishop bishop = new Bishop("B");
    private Knight knight = new Knight("k");
    private Tower tower = new Tower("T");
    private King king = new King("K");
    private Queen queen=new Queen("Q");

    public String[][] Board() {
        return board;
    }

    public Bishop Bishop() {
        return bishop;
    }

    public Knight Knight() {
        return knight;
    }

    public Tower Tower() {
        return tower;
    }

    public King King() {return king;}

    public Queen Queen() {return queen;}

}
