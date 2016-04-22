/**
 * Created by ronan on 22/04/2016.
 */
public class Plate {
    private Tile dark=new Tile("  ");
    private Tile vide=new Tile("..");
    private Tile un=new Tile("1");
    private Tile deux=new Tile("2");
    private Tile trois=new Tile("3");
    private Tile quatre=new Tile("4");
    private Tile cinq=new Tile("5");
    private Tile six=new Tile("6");
    private Tile sept=new Tile("7");
    private Tile huit=new Tile("8");
    private Tile a=new Tile("A ");
    private Tile b=new Tile("B ");
    private Tile c=new Tile("C ");
    private Tile d=new Tile("D ");
    private Tile e=new Tile("E ");
    private Tile f=new Tile("F ");
    private Tile g=new Tile("G ");
    private Tile h=new Tile("H ");
    private Piece board[][] = {
            {dark  , a   , b   , c   , d   , e   , f   , g    ,h   },
            {un    , vide, vide, vide, vide, vide, vide, vide, vide},
            {deux  , vide, vide, vide, vide, vide, vide, vide, vide},
            {trois , vide, vide, vide, vide, vide, vide, vide, vide},
            {quatre, vide, vide, vide, vide, vide, vide, vide, vide},
            {cinq  , vide, vide, vide, vide, vide, vide, vide, vide},
            {six   , vide, vide, vide, vide, vide, vide, vide, vide},
            {sept  , vide, vide, vide, vide, vide, vide, vide, vide},
            {huit  , vide, vide, vide, vide, vide, vide, vide, vide},

    };

    private Bishop bishop = new Bishop("B");
    private Knight knight = new Knight("k");
    private Tower tower = new Tower("T");
    private King king = new King("K");
    private Queen queen=new Queen("Q");

    public Piece[][] Board() {
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
