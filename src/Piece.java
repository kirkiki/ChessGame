/**
 * Created by ronan on 22/04/2016.
 */
public  class Piece {

    private Position _position;
    private String _name;
    private String _couleur;

    public Piece(int X, int Y, String name, String couleur ){
        _position=new Position(X,Y);
        _name=name;
        _couleur=couleur;
    }

    public Piece(String name){_name=name;}

    public String Name() {
        return _name;
    }

    public String Couleur() {
        return _couleur;
    }
    public  void setCouleur(String couleur){_couleur=couleur;}

    public Position Position() {
        return _position;
    }
}
