package at.campus02.nowa;

import java.util.Scanner;

public class Main {
    public static  void main (String[] args){
        Scanner input = new Scanner(System.in);     //ein neuer Scanner wird erstellt

        App app = new App(input, System.out);          //ein neues Objekt der Klasse App wird ersteööt
        app.Run();                              // das Objekt app ruft die Methode run() auf, die Methode ruft den scanner auf, initialisiert mit dem eingegebenen Wert die figure, wählt dann mit dem
                            //switch das entsprechende Figure-Objekt aus, das kommt dann in output, danch ist es unklar
        input.close();      //der scanner "input" aus der Klasse App (als Parameter übergeben) ruft eine Methode close() auf. Wo finde ich die Methode? Was muss ich eingeben, damit Programm beendet wird?3
        System.out.println("Das Programm wird beendet ...");
    }
}
