package at.campus02.nowa;

import at.campus02.nowa.figures.*;

import java.io.PrintStream;
import java.util.Scanner;

public class App {              //Ich verstehe die Logik hinter der App-Klasse noch nicht
    private final Scanner input;        //Wie funktioniert der Scanner?
    private final PrintStream output;   // Was ist die Klasse PrintStream?
    private boolean exit = false;
    private int figure;                 // Figure ist die Zahl mit der später in der UpdateCase-Methode die Figure ausgewählt wird (Switch)
    private int faktor;                 //Könnte man figure nicht direkt bei den Objekten angeben? Warum Auswahl im Switch
    private Figure figureToPrint;

    public App(Scanner input, PrintStream output){      //Konstruktor für App, der Attribute input (ein Scanner) und output (ein PrintStream) übergeben bekommt
        this.input = input;
        this.output = output;
    }

    public void Run() {         // diese Methode wird in Main aufgerufen, ich verstehe aber die Logik, der Befehle in der Methode nicht.
        initialize();               //was macht initialize? Leere Methode?
        printState();               //braucht die figureToPrint, die aber erst mit updateState() initialisiert wird, warum wird das jetzt aufgerufen

        while(!exit) {          //exit ist boolean und false, !exit = true
            readUserInput();        //Methode die wiederum den scanner aufruft und figure mit einer Zahl initialisiert
            updateState();          //figure gibt die Zahl aus dem scanner in den switch und initialisiert die figureToPrint
            printState();           //figuretoprint wird vom output aufgerufen oder in den output gegeben?

            exit = !askContinue();      //warum ist exit die Verneinung von askContinue()?
        }                              //die toString Methode der figures, die für die Ausgabe der Figures wichtig ist wird nirgend aufgerufen? Wie können figures ausgegeben werden?
    }

    private void initialize() {         //Was mach initialize? Es ist eine leere Methode. Warum wird die von der Run-Methode aufgerufen?

    }

    private void readUserInput() {  //warum ist die Methode zwischengeschaltet, inputFigure() könnte doch auch direkt von der run-Methode aufgerufen werden
        inputFigure();
        inputFaktor();
    }

    private void inputFigure() {        // wird von readuserInput aufgerufen und regelt scanner eingabe (Zahl von 1 bis6)
        //TODO: Hier die auszugebende Figur einlesen/
        output.println("Bitte geben Sie Zahl von 1-6 ein");
        figure = input.nextInt();//Figure ist Casezahl
        if(figure<1 || figure>6){
            output.println("Zahl muss zwischen 1-6 liegen");
        }
    }

    private void inputFaktor() {
        //TODO: Hier den Faktor einlesen
    }

    private void updateState() {
        switch (figure){
            case 1:
                figureToPrint = new FigureH(faktor);            //figure to print wird entsprechend der Eingabe den Objekten zugeordnet
                break;                                          //je nach Eingabe (figure) ist figureToPrint ein anderes Figure-Objekt
            case 2:
                figureToPrint = new FigureL(faktor);
                break;
            case 3:
                figureToPrint = new FigureO(faktor);
                break;
            case 4:
                figureToPrint = new FigureO2(faktor);
                break;
            case 5:
                figureToPrint = new FigureI(faktor);
                break;
            case 6:
                figureToPrint = new FigureMinus(faktor);
                break;
            //TODO: hier entsprechend erweitern
            default: break;
        }
    }

    private void printState() {
        if (figureToPrint != null){              //heißt != null, wenn eine figureToPrint erstellt wurde, dann soll diese ausgegeben werden?
            output.println(figureToPrint);      //die figureToPrint wurde im switch (updateState-Methode) erstellt
        }                                      //output ist eine Variable vom Typ PrintStream, keine Ahnung was das ist
    }

    private boolean askContinue(){
        return true;
    } //askContinue ist oben (Zeile30)mit exit verbunden, keine Ahnung warum?
}
