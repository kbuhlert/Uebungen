package at.campus02.nowa;

import at.campus02.nowa.figures.*;

import java.io.PrintStream;
import java.util.Scanner;

public class App {
    private final Scanner input;
    private final PrintStream output;
    private boolean exit = false;
    private int figure;
    private int faktor;
    private Figure figureToPrint;

    public App(Scanner input, PrintStream output){
        this.input = input;
        this.output = output;
    }

    public void Run() {
        initialize();
        printState();

        while(!exit) {
            readUserInput();
            updateState();
            printState();

            exit = !askContinue();
        }
    }

    private void initialize() {

    }

    private void readUserInput() {
        inputFigure();
        inputFaktor();
    }

    private void inputFigure() {
        //TODO: Hier die auszugebende Figur einlesen/
        output.println("Bitte geben Sie Zahl von 1-6 ein");
        figure = input.nextInt();//Figure ist Casezahl
        if(figure<1 || figure>6){
            output.println("Zahl muss zwischen 1-6 liegen");
        }//else{output.println(figureToPrint);}
    }

    private void inputFaktor() {
        //TODO: Hier den Faktor einlesen
    }

    private void updateState() {
        switch (figure){
            case 1:
                figureToPrint = new FigureH(faktor);
                break;
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
        if (figureToPrint != null){
            output.println(figureToPrint);
        }
    }

    private boolean askContinue(){
        return true;
    }
}
