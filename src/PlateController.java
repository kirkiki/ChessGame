import java.util.ArrayList;
import java.util.List;

/**
 * Created by ronan on 22/04/2016.
 */
public class PlateController {

    PlateView _pv;
    Plate plate;

    ArrayList<Pawn> pawns = new ArrayList();

    public PlateController() {
        plate = new Plate();
        _pv = new PlateView(this);
    }

    public void setup() {
        placePawn();
        place(plate.Tower(), 1, 7, plate.Tower().Name());
        place(plate.Bishop(), 2, 5, plate.Bishop().Name());
        place(plate.Knight(), 3, 3, plate.Knight().Name());
        place(plate.King(), 4, 5, plate.King().Name());
        place(plate.Queen(), 5, 4, plate.Queen().Name());
    }

    public void place(Piece _piece, int debut, int fin, String name) {
        String currentColor = "B";

        if (_piece == plate.Queen() || _piece == plate.King()) {
                Queen queenB=new Queen(5,1,"B");
                Queen queenW=new Queen(4,8,"W");
                King kingB=new King(4,1,"B");
                King kingW=new King(5,8,"W");
                plate.Board()[queenB.Position().Y()][queenB.Position().X()] = queenB.Name() + queenB.Couleur() + " ";
                plate.Board()[queenW.Position().Y()][queenW.Position().X()] = queenW.Name() + queenW.Couleur() + " ";
                plate.Board()[kingB.Position().Y()][kingB.Position().X()] = kingB.Name() + kingB.Couleur() + " ";
                plate.Board()[kingW.Position().Y()][kingW.Position().X()] = kingW.Name() + kingW.Couleur() + " ";
        }
        else {
            for (int var = 1; var < 9; var = var + 7) {
                for (int i = debut; i < 9; i = i + fin) {
                    Piece piece = new Piece(i, var, name, currentColor);
                    plate.Board()[piece.Position().Y()][piece.Position().X()] = piece.Name() + piece.Couleur() + " ";
                }
                currentColor = "W";
            }
        }
    }

    public void placePawn() {
        int i = 1;
        String currentColor = "B";
        for (int j = 2; j < 8; j = j + 5) {
            while (i < plate.Board().length) {
                Pawn varPawn = new Pawn(i, j, currentColor);
                plate.Board()[varPawn.Position().Y()][varPawn.Position().X()] = varPawn.Name() + varPawn.Couleur() + " ";
                i++;
            }
            currentColor = "W";
            i = 1;
        }
    }

    public void affi() {
        _pv.Display();
    }
}
