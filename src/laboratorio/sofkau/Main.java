package laboratorio.sofkau;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Game game = new Game();
        game.startGame();
        Historial historial = new Historial();
        historial.guardarPlayer(game.player, game.getPremio());
        historial.leerHistorial();

}}
