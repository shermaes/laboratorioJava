package laboratorio.sofkau;

//Ejemplo de herencia
public class Game extends Funcional{

    // constructor
    public Game() {
    }

    // Esqueleto del juego - Este ejecuta y llama las preguntas de la clase Banco
    public void startGame() {
        createPlayer();
        System.out.println("Los puntos a conseguir por cada ronda son: 100");
        System.out.println(SEPARADOR);
        banco.questions1();
        preguntarSalida();
        if (banco.resultado == valida) {
            System.out.println(SEPARADOR);
            banco.questions2();
            preguntarSalida();
        }
        if (banco.resultado == valida) {
            System.out.println(SEPARADOR);
            banco.questions3();
            preguntarSalida();
        }
        if (banco.resultado == valida) {
            System.out.println(SEPARADOR);
            banco.questions4();
            preguntarSalida();
        }
        if (banco.resultado == valida) {
            banco.questions5();
            imprimirAcumulado();
            winner();
        }
    }

    private void preguntarSalida() {
        if (banco.resultado == 1) {
            imprimirAcumulado();
            confirmExit();
        }
    }

    // metodo que da el mensaje de que se perdio el juego
    public void loser() {
        premio = 0;
        System.out.println("Usted ha perdido esta ronda y sus premios");
        banco.resultado = 3;
    }

    // metodo que ofrece una nueva partida

    public void continuar() {
        System.out.println("Confirme que dejara de jugar presionando cualquier numero menos 1");
        k = sc.nextInt();
        if (k == valida) {
            startGame();
        } else {
            banco.resultado = 3;
            System.out.println("Gracias por jugar a ^Preguntario^");
        }

    }
    public void confirmExit() {
        System.out.println("Desea retirarse con lo que lleva acumulado?\n Indique 1 para si o 0 para no");
        salida = sc.nextInt();
        if (salida == valida) {
            System.out.println("Usted ha salido del juego con una puntuacion de: " + premio);
            continuar();
        } else {
            System.out.println("Usted ha pasado a la " + ronda + " ronda con " + premio + " puntos");
        }
    }

}
