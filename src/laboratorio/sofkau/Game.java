package laboratorio.sofkau;

//Ejemplo de herencia
public class Game extends Jugador {

    // constructor
    public Game() {
    }

    //objetos necesarios
    Ronda1 ronda1 = new Ronda1();
    Ronda2 ronda2 = new Ronda2();
    Ronda3 ronda3 = new Ronda3();
    Ronda4 ronda4 = new Ronda4();
    Ronda5 ronda5 = new Ronda5();

    // Esqueleto del juego - Este ejecuta y llama las preguntas de la clase Banco
    public void startGame() {
        createPlayer();
        System.out.println("Los puntos a conseguir por cada ronda son: 100");
        System.out.println(SEPARADOR);
        ronda1.questions();
        salidor=ronda1.resultado;
        aumentarPuntaje(salidor);
        preguntarSalida();
        if (salidor == 1) {
            System.out.println(SEPARADOR);
            ronda2.questions();
            System.out.println(SEPARADOR);
            salidor = ronda2.resultado;
            aumentarPuntaje(salidor);
            preguntarSalida();
        }
        if (salidor == 1) {
            System.out.println(SEPARADOR);
            ronda3.questions();
            System.out.println(SEPARADOR);
            salidor = ronda3.resultado;
            aumentarPuntaje(salidor);
            preguntarSalida();
        }
        if (salidor == 1) {
            System.out.println(SEPARADOR);
            ronda4.questions();
            System.out.println(SEPARADOR);
            salidor = ronda4.resultado;
            aumentarPuntaje(salidor);
            preguntarSalida();
        }
        if (salidor == 1) {
            System.out.println(SEPARADOR);
            ronda5.questions();
            System.out.println(SEPARADOR);
            salidor = ronda5.resultado;
            aumentarPuntaje(salidor);
            if (salidor == 1) {
                System.out.println(SEPARADOR);
                imprimirAcumulado();
            }
        }
    }


    public int confirmExit() {
        System.out.println(getPremio());
        System.out.println("Desea retirarse con lo que lleva acumulado?\n Indique 1 para si o 0 para no");
        salida = sc.nextInt();
        if (salida == 1) {
            System.out.println("Usted ha salido del juego con una puntuacion de: " + getPremio());
            salidor=0;
            continuar();
        } else {
            System.out.println("Usted ha pasado a la " + ronda + " ronda con " + getPremio() + " puntos");
        }
        return salidor;
    }

    private void preguntarSalida() {
        if (salidor == 1) {
            imprimirAcumulado();
            confirmExit();
        }
    }

    protected void imprimirAcumulado() {
        ronda = ronda + 1;
        System.out.println("Sigamos a la siguiente ronda " + player + " tienes " + getPremio() + " puntos acumulados");
        System.out.println(SEPARADOR);
    }

    // metodo que ofrece una nueva partida

    public void continuar() {
        System.out.println("Confirme que dejara de jugar presionando cualquier numero menos 1");
        k = sc.nextInt();
        if (k == 1) {
            startGame();
        } else {
            salidor = 3;
            System.out.println("Gracias por jugar a ^Preguntario^");
        }

    }

public void aumentarPuntaje(int salidor){

        if (salidor ==0){
            setPremio(0);
        }else{
            a=a+100;
            setPremio(a);
        }
}

}


