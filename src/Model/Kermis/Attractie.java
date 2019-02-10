package Model.Kermis;

public class Attractie {
    private String Name;
    private double Price;
    private double Omzet = 0;
    private int rounds =0;
    private int roundsBeforeInspection;

    // Constructor waarbij naam, prijs en max aantal rondjes tot inspectie
    // gevuld worden
    public Attractie (String Naam, double Prijs, int MaxRondes) {
        this.Name = Naam;
        this.Price = Prijs;
        this.roundsBeforeInspection = MaxRondes;
    }

    public String getName() {
        return Name;
    }

    public double getPrice() {
        return Price;
    }

    public double getOmzet() {
        return Omzet;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public int getRoundsBeforeInspection() {
        return roundsBeforeInspection;
    }

    public double performAttractie(){
        //hier moet iets gedaan wordt wat de omzet verhoogd
        // Controle of het aantal rondes tot inspectie bereikt is
        if (rounds == roundsBeforeInspection) {
            return 0;
        }
        // Tel de prijs bij de omzet op
        Omzet = Omzet + Price;
        return Omzet;
    }
}
