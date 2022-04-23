package laboratorio.sofkau;

import java.util.Scanner;

public class Jugador{
    int premio;
    public String player;
    protected final String SEPARADOR = "-----------------------------------";
    static int ronda = 0;
    int salidor;
    int salida;
    protected static int k;
    static final int VALIDA = 1;

    Scanner sc = new Scanner(System.in);

    public void createPlayer() {
        System.out.println("Bienvenido a ^Preguntario^ indique su nombre a continuacion");
        player = sc.nextLine();
        System.out.println("Bienvenido " + player + " empecemos a jugar!");

    }

    public void winner() {
        System.out.println("________$$$$\r\n" + "_______$$__$\r\n" + "_______$___$$\r\n" + "_______$___$$\r\n"
                + "_______$$___$$\r\n" + "________$____$$\r\n" + "________$$____$$$\r\n" + "_________$$_____$$\r\n"
                + "_________$$______$$\r\n" + "__________$_______$$\r\n" + "____$$$$$$$________$$\r\n"
                + "__$$$_______________$$$$$$\r\n" + "_$$____$$$$____________$$$\r\n"
                + "_$___$$$__$$$____________$$\r\n" + "_$$________$$$____________$\r\n"
                + "__$$____$$$$$$____________$\r\n" + "__$$$$$$$____$$___________$\r\n"
                + "__$$_______$$$$___________$\r\n" + "___$$$$$$$$$__$$_________$$\r\n"
                + "____$________$$$$_____$$$$\r\n" + "____$$____$$$$$$____$$$$$$\r\n" + "_____$$$$$$____$$__$$\r\n"
                + "_______$_____$$$_$$$\r\n" + "________$$$$$$$$$$\r\n" + "");
    }


}
