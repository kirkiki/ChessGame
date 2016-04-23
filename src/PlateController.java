import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Ronan on 23/04.
 */
public class PlateController {

    PlateView _pv;
    Plate plate;
    int colonneDepart;
    int colonneArrivee;
    int ligneDepart;
    int ligneArrivee;

    public PlateController() {
        plate = new Plate();
        _pv = new PlateView(this);
    }

    public void play() {
        //_pv.userInput();
        if (canMove(plate.Board()[ligneDepart][colonneDepart])) {
            if (plate.Board()[ligneDepart][colonneDepart].freeWay(ligneDepart, colonneDepart, ligneArrivee, colonneArrivee, plate)) {
                move();
            } else {
                _pv.erreurMvt();
            }
        }
        affi();
    }

    private boolean canMove(Piece piece) {
        switch (piece.Name()) {

            case "P":
                if (piece.canMove(ligneDepart, colonneDepart, ligneArrivee, colonneArrivee))
                    return true;
                else {
                    _pv.erreurMvt();
                    return false;
                }

            case "T":
                if (piece.canMove(ligneDepart, colonneDepart, ligneArrivee, colonneArrivee))
                    return true;
                else {
                    _pv.erreurMvt();
                    return false;
                }
            case "B":
                if (piece.canMove(ligneDepart, colonneDepart, ligneArrivee, colonneArrivee))
                    return true;
                else {
                    _pv.erreurMvt();
                    return false;
                }
            case "k":
                if (piece.canMove(ligneDepart, colonneDepart, ligneArrivee, colonneArrivee))
                    return true;
                else {
                    _pv.erreurMvt();
                    return false;
                }
            case "K":
                if (piece.canMove(ligneDepart, colonneDepart, ligneArrivee, colonneArrivee))
                    return true;
                else {
                    _pv.erreurMvt();
                    return false;
                }
            case "Q":
                if (piece.canMove(ligneDepart, colonneDepart, ligneArrivee, colonneArrivee))
                    return true;
                else {
                    _pv.erreurMvt();
                    return false;
                }
            default:
                _pv.erreurMvt();
                return false;
        }
    }

    private boolean roque() {
        return true;
    }


    public void move() {
        plate.Board()[ligneArrivee][colonneArrivee] = plate.Board()[ligneDepart][colonneDepart];
        plate.Board()[ligneDepart][colonneDepart] = new Tile("..");
    }

    public void getInput(String colonneD, int ligneD, String colonneA, int ligneA) {
        ligneDepart = ligneD;
        colonneDepart = toTab(colonneD);
        ligneArrivee = ligneA;
        colonneArrivee = toTab(colonneA);
    }

    public void setup() {
        placePawn();
        placeTower(1, 7);
        placeBishop(2, 5);
        placeKingsAndQueens();
        placeKnight(3, 3);
    }

    public void placeTower(int x, int y) {
        String currentColor = "B";

        for (int var = 1; var < 9; var = var + 7) {
            for (int i = x; i < 9; i = i + y) {
                Tower tower = new Tower(i, var, currentColor);
                plate.Board()[tower.Position().Y()][tower.Position().X()] = tower;
            }
            currentColor = "W";
        }
    }

    public void placeBishop(int debut, int fin) {
        String currentColor = "B";

        for (int var = 1; var < 9; var = var + 7) {
            for (int i = debut; i < 9; i = i + fin) {
                Bishop bishop = new Bishop(i, var, currentColor);
                plate.Board()[bishop.Position().Y()][bishop.Position().X()] = bishop;
            }
            currentColor = "W";
        }
    }

    public void placeKnight(int debut, int fin) {
        String currentColor = "B";

        for (int var = 1; var < 9; var = var + 7) {
            for (int i = debut; i < 9; i = i + fin) {
                Knight knight = new Knight(i, var, currentColor);
                plate.Board()[knight.Position().Y()][knight.Position().X()] = knight;
            }
            currentColor = "W";
        }
    }

    public void placeKingsAndQueens() {
        Queen queenB = new Queen(5, 1, "B");
        Queen queenW = new Queen(4, 8, "W");
        King kingB = new King(4, 1, "B");
        King kingW = new King(5, 8, "W");
        plate.Board()[queenB.Position().Y()][queenB.Position().X()] = queenB;
        plate.Board()[queenW.Position().Y()][queenW.Position().X()] = queenW;
        plate.Board()[kingB.Position().Y()][kingB.Position().X()] = kingB;
        plate.Board()[kingW.Position().Y()][kingW.Position().X()] = kingW;
    }


    public void placePawn() {
        int i = 1;
        String currentColor = "B";
        for (int j = 2; j < 8; j = j + 5) {
            while (i < plate.Board().length) {
                Pawn varPawn = new Pawn(i, j, currentColor);
                plate.Board()[varPawn.Position().Y()][varPawn.Position().X()] = varPawn;
                i++;
            }
            currentColor = "W";
            i = 1;
        }
    }

    public int toTab(String entree) {
        switch (entree) {
            case "a":
                return 1;
            case "b":
                return 2;
            case "c":
                return 3;
            case "d":
                return 4;
            case "e":
                return 5;
            case "f":
                return 6;
            case "g":
                return 7;
            case "h":
                return 8;
            default:
                return -1;
        }
    }

    public void affi() {
        _pv.Display();
    }


}
