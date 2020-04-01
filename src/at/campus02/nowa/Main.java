package at.campus02.nowa;

import java.util.Scanner;

public class Main {
    public static  void main (String[] args){
        Scanner input = new Scanner(System.in);     //ein neuer Scanner wird erstellt

        App app = new App(input, System.out);          //ein neues Objekt der Klasse App wird erstellt
        app.Run();                              // das Objekt app ruft die Methode run() auf, die Methode ruft den scanner auf, initialisiert mit dem eingegebenen Wert das int-Attribut figure,
                                // figure wird in updateState übergeben und wählt mit dem switch das entsprechende Figure-Objekt aus (=figureToPrint),
                            // das kommt dann in output, danach ist einiges unklar, z.B. wie und wann wird StringBuilder aufgerufen/ausgegeben
        input.close();      //der scanner "input" aus der Klasse App (vom Konstruktor als Parameter übergeben) ruft eine Methode close() auf. Wo finde ich die Methode?
                            // Was muss ich eingeben, damit Programm beendet wird? False, Null oder 0 haben nicht funktioniert.
        System.out.println("Das Programm wird beendet ...");
    }
}
