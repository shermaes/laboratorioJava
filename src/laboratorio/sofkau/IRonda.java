package laboratorio.sofkau;

import java.util.Random;
import java.util.Scanner;

public interface IRonda {

    Random rand = new Random();
    Scanner read = new Scanner(System.in);

    //is being overidden in Ronda1, Ronda2 ...
    default Integer questions() {
        return null;
    }
}

