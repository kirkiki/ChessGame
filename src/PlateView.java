/**
 * Created by ronan on 22/04/2016.
 */
public class PlateView {

    private PlateController _pc;
    private Plate _pl;
    public PlateView(PlateController plateController){
        _pc=plateController;
        _pl=_pc.plate;
    }

    public Plate Pl() {
        return _pl;
    }

    public void Display(){
        int longe=0;
        int larg=0;

        while (larg<_pl.Board().length){
            while (longe<_pl.Board().length){
                System.out.print(_pl.Board()[larg][longe].Name()+_pl.Board()[larg][longe].Couleur()+" ");
                longe++;
            }
            System.out.println();
            larg++;
            longe=0;
        }
    }
}
