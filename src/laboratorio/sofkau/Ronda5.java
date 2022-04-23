package laboratorio.sofkau;

import java.util.ArrayList;
import java.util.List;

public class Ronda5 extends Banco implements IRonda {

    public Ronda5() {
    }

    public Ronda5(String pregunta, String respuestaC) {
        super();
        this.pregunta = pregunta;
        this.respuestaC = respuestaC;
    }

    @Override
    public Integer questions() {
        List<Ronda5> lista5 = new ArrayList<Ronda5>();
        lista5.add(new Ronda5(
                "Como se llama el pintor noruego autor de la obra 'El Grito'?\na:Picasso\nb:Eda Munch\nc:Edvard Munch\nd:Edward Durin",
                "c"));
        lista5.add(new Ronda5(
                "El reino protoctista en la naturaleza se dice que esta constituido por:\na:Protozoos y amebas \nb:Amebas\nc:Bacterias y algas\nd:Protozoos",
                "a"));
        lista5.add(new Ronda5(
                "Alrededor de que planeta orbitan los satelites Ganimedes, Calisto, Io y Europa?\na:Venus\nb:Marte\nc:Jupiter\nd:Urano",
                "c"));
        lista5.add(new Ronda5(
                "Con que denominacion se conoce la linea dibujada por las estrellas Alnitak, Alnilam y Mintaka vistas desde nuetro planeta?\na:Osa mayor\nb:Osa menor\nc:Cancer\nd:Cinturon de Orion",
                "d"));
        lista5.add(new Ronda5(
                "Como se llama el tipo de celula nerviosa mas abundante en el cerebro humano?\na:Neuronas\nb:Celulas gliales\nc:Globulos rojos\nd:Materia gris",
                "b"));
        int index = rand.nextInt(lista5.size());
        System.out.println("Su pregunta a responder es...\n" + lista5.get(index).pregunta);
        System.out.println(" ");
        System.out.println("Indique su respuesta a continuacion:");
        respuestaC = (lista5.get(index).respuestaC);
        respuesta = read.nextLine();
        if (respuesta.equals(respuestaC)) {
            System.out.println("Su respuesta es correcta");
            resultado = 1;
        } else {
            System.out.println("Oops esa no era la respuesta");
            loser();
            resultado = 0;
        }

        return resultado;
    }

    @Override
    public void loser() {
        System.out.println("Tan cerca... pero tan lejos");
    }
}
