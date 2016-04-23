/**
 * Created by ronan on 22/04/2016.
 */
public abstract class Piece {//a mettre en abstract

    private Position _position;
    private String _name;
    private String _couleur;

    public Piece(int X, int Y, String name, String couleur ){
        _position=new Position(X,Y);
        _name=name;
        _couleur=couleur;
    }

    public Piece(String name){_name=name;}

    public abstract boolean canMove(int ligneD, int colonneD, int ligneA, int colonneA);


    public String Name() {
        return _name;
    }
    public  void Couleur(String couleur){_couleur=couleur;}

    public Position Position() {
        return _position;
    }

   // public boolean canMove(int ligneD, int colonneD, int ligneA,int ){};

    public void setPosition(Position _position) {
        this._position = _position;
    }

    public String getCouleur() {
        return _couleur;
    }

    public void setCouleur(String _couleur) {
        this._couleur = _couleur;
    }
}
