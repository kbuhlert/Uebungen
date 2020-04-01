package at.campus02.nowa.figures;

public abstract class Figure {
    protected int faktor;           //Warum gibt es keine Getter wenn die Attribute 'protected' sind?
    protected char[][] symbol = new char[3][3];

    protected Figure(int faktor){      //ist das der Konstruktor für Figure? Wrum enthält der nicht den 2D Array, nur den Faktor und warum ist er protected?
        this.faktor = faktor;
    }

    @Override
    public String toString() {                      //die Methode toString wird nirgends aufgerufen, wie kommt der Stringbuilder in die Klasse App?
        StringBuilder sb = new StringBuilder();//String Builder bitte nochmal erklären

        //hier Fakto einbauen:
        // Faktor1: X
        //Faktor2: XX
        //         XX
        //Faktor3: XXX
        //         XXX
        //         XXX


        for(int i=0; i<3;i++){
            for(int j=0; j<3;j++){
                for (int jFaktor = 0; jFaktor < faktor; jFaktor++){
                sb.append(symbol[j][i]+"\t");  }       //Eigentlich sollten wir kein SOUT verwenden, sondern String Builer, funktioniert aber nicht mit sb.append
            }                                           //Wie würde das mit Stringbuilder aussehen.
            sb.append('\n');
        }

        //TODO: Implementieren der Ausgabe in einen StringBuilder

        sb.append("Weiter mit der nächsten Zahl");      //ist append eine fertige Methode für den Stringbuilder?
        return sb.toString();       //wie kann der Returnwert die eigene Methode aufrufen?
    }
}
