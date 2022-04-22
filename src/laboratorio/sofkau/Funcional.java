package laboratorio.sofkau;

import java.util.Scanner;

public class Funcional {
    static int premio;
    static String player;
    static final String SEPARADOR = "-----------------------------------";
    static int ronda = 1;
    int k;
    int salida;
    static final int valida = 1;

    Banco banco = new Banco();
    Scanner sc = new Scanner(System.in);

    public void createPlayer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a ^Preguntario^ indique su nombre a continuacion");
        player = sc.nextLine();
        System.out.println("Bienvenido " + player + " empecemos a jugar!");

    }
//ejemplo de encapsulacion - este es heredado por Game como private de manera que el lo puede usar
    protected void imprimirAcumulado() {
        ronda = ronda + 1;
        premio = premio + 100;
        System.out.println("Sigamos a la siguiente ronda " + player + " tienes "+premio+" puntos acumulados");
        System.out.println(SEPARADOR);
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
        System.out.println("Usted ha ganado ^Preguntario^ con un total de " + premio + " puntos");
    }


}
