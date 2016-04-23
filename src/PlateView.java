import java.util.Scanner;

/**
 * Created by ronan on 22/04/2016.
 */
public class PlateView {

    private PlateController _pc;
    private Plate _pl;

    public PlateView(PlateController plateController) {
        _pc = plateController;
        _pl = _pc.plate;
    }

    public Plate Pl() {
        return _pl;
    }

    public void Display() {
        int longe = 0;
        int larg = 0;

        while (larg < _pl.Board().length) {
            while (longe < _pl.Board().length) {
                System.out.print(_pl.Board()[larg][longe].Name() + _pl.Board()[larg][longe].getCouleur() + " ");
                longe++;
            }
            System.out.println();
            larg++;
            longe = 0;
        }
    }

    public void erreurMvt() {
        System.out.println("erreur de mouvement");
    }

    public void userInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez une colonne de depart");
        String colonneDepart =sc.nextLine();
        System.out.println("Entrez une ligne de depart ");
        int ligneDepart = sc.nextInt();
        String var=sc.nextLine();
        System.out.println("Entrez une colonne d'arrivee");
        String colonneArrivee=sc.nextLine();
        System.out.println("Entrez une ligne d'arrivée ");
        int ligneArrivee = sc.nextInt();
        _pc.getInput(colonneDepart,ligneDepart,colonneArrivee,ligneArrivee);
    }
}
