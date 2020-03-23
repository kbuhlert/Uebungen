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

        for(int i=0; i<3;i++){
            for(int j=0; j<3;j++){
                System.out.print(symbol[j][i]);
            }
            System.out.println();
        }

        //TODO: Implementieren der Ausgabe in einen StringBuilder

        sb.append("Weiter mit der nächsten Zahl");



        return sb.toString();
    }
}
