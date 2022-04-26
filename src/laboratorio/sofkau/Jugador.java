package laboratorio.sofkau;

import java.util.Scanner;

public class Jugador{
    protected int a = 0;
    private int premio = 0;
    public String player;
    protected final String SEPARADOR = "-----------------------------------";
    protected int ronda = 0;
    int salidor;
    int salida;
    protected static int k;


    Scanner sc = new Scanner(System.in);
//utilizamos getters and setters para dejar en evidencia el encapsulamiento
    public int getPremio() {
        return premio;
    }

    public void setPremio(int premio) {
        this.premio = premio;
    }

    public void createPlayer() {
        System.out.println("Bienvenido a ^Preguntario^ indique su nombre a continuacion");
        player = sc.nextLine();
        System.out.println("Bienvenido " + player + " empecemos a jugar!");

    }


}
