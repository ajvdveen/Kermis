package Apps.Kermis;

import Model.Kermis.Attractie;

public class AppKermis {
    public static void main(String[] args) {
        String NaamAttr;
        double PrijsAttr;
        double TotaleOmzet = 0;
        // array met attracties
        Attractie[] KermisAttracties = new Attractie[10];
        //loopje voor maken 10 nieuwe attracties
        for (int index = 0; index < 10; index++) {
            NaamAttr = "Attractie " + index;
            PrijsAttr = ((index + 1) * 0.25);
            KermisAttracties[index] = new Attractie(NaamAttr, PrijsAttr, 5);
        }

        //loop om alle kermisattracties 3 keer uit te voeren

        for (int teller = 0; teller < 3; teller++) {
            for (int index = 0; index < 10; index++) {
                TotaleOmzet = TotaleOmzet + KermisAttracties[index].performAttractie();
            }
        }
        System.out.println("Totale Omzet :" + TotaleOmzet);
    }
}
