import java.util.Arrays;

public class EE {

    private int[] ensTab;

    private int cardinal;


    public EE(int max) { //creation de l'ensemble vide car il a un cardinal de 0
        int[] tab = new int[max]; //creation de la taille de max, comme ça on a plein de 0 pour mettre de futur valeurs
        this.cardinal = 0;
    }

    public EE(int max, int[] ensTab) {
        this.ensTab = new int[max];
        this.ensTab=ensTab;
        this.cardinal=ensTab.length;

    }

    public EE(EE ensemble1) {
        cardinal = ensemble1.cardinal;
        ensTab = ensemble1.ensTab;
    }

    public void toStringEE(){
        System.out.println(Arrays.toString(ensTab)+"²");
    }

    public int getCardinal() {
        return cardinal;
    }

}
