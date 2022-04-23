package laboratorio.sofkau;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	Game game = new Game();
    Historial historial = new Historial();
    game.startGame();
    historial.guardarPlayer(game.player,game.premio);
    historial.leerHistorial();
    }
}
