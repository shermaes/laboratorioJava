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
        if (ronda1.resultado == VALIDA) {
            premio = 100;
            preguntarSalida();
            System.out.println(SEPARADOR);
            ronda2.questions();
            premio = premio +100;
            System.out.println(SEPARADOR);
            salidor = ronda2.resultado;
            preguntarSalida();
        }
        if (salidor == VALIDA) {
            System.out.println(SEPARADOR);
            ronda3.questions();
            premio = premio +100;
            System.out.println(SEPARADOR);
            salidor = ronda3.resultado;
            preguntarSalida();
        }
        if (salidor == VALIDA) {
            System.out.println(SEPARADOR);
            ronda4.questions();
            premio = premio +100;
            System.out.println(SEPARADOR);
            salidor = ronda4.resultado;
            preguntarSalida();
        }
        if (salidor == VALIDA) {
            System.out.println(SEPARADOR);
            ronda5.questions();
            premio = premio +100;
            System.out.println(SEPARADOR);
            salidor = ronda5.resultado;
            if (salidor == VALIDA) {
                System.out.println(SEPARADOR);
                imprimirAcumulado();
                winner();

            }
        }
    }


    public void confirmExit() {
        System.out.println(premio);
        System.out.println("Desea retirarse con lo que lleva acumulado?\n Indique 1 para si o 0 para no");
        salida = sc.nextInt();
        if (salida == VALIDA) {
            System.out.println("Usted ha salido del juego con una puntuacion de: " + premio);
            continuar();
        } else {
            System.out.println("Usted ha pasado a la " + ronda + " ronda con " + premio + " puntos");
        }
    }

    private void preguntarSalida() {
        if (salidor == 1) {
            imprimirAcumulado();
            confirmExit();
        }
    }

    protected void imprimirAcumulado() {
        ronda = ronda + 1;
        System.out.println("Sigamos a la siguiente ronda " + player + " tienes " + premio + " puntos acumulados");
        System.out.println(SEPARADOR);
    }

    // metodo que ofrece una nueva partida

    public void continuar() {
        System.out.println("Confirme que dejara de jugar presionando cualquier numero menos 1");
        k = sc.nextInt();
        if (k == VALIDA) {
            startGame();
        } else {
            salidor = 3;
            System.out.println("Gracias por jugar a ^Preguntario^");
        }

    }




}


