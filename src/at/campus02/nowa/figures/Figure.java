package at.campus02.nowa.figures;

public abstract class Figure {
    protected int faktor;
    protected char[][] symbol = new char[3][3];

    protected Figure(int faktor){
        this.faktor = faktor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        //TODO: Implementieren der Ausgabe in einen StringBuilder

        sb.append("Hallo, bitte eine Zahl von 1-6 eingeben");

        return sb.toString();
    }
}
