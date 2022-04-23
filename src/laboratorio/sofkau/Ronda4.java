package laboratorio.sofkau;

import java.util.ArrayList;
import java.util.List;

public class Ronda4 extends Banco implements IRonda {

    public Ronda4() {
    }

    public Ronda4(String pregunta, String respuestaC) {
        super();
        this.pregunta = pregunta;
        this.respuestaC = respuestaC;
    }

    @Override
    public Integer questions() {
        List<Ronda4> lista4 = new ArrayList<Ronda4>();
        lista4.add(new Ronda4(
                "Como se llama el plato de puchero tipico de Hungria hecho a partir de carne, cebolla y pimientos?\na:Strogonoff\nb:Gulash\nc:Palacsinta\nd:Somloi Galuska",
                "b"));
        lista4.add(new Ronda4(
                "Como se llama el manga de Kentaro Miura protagonizado por Guts?\na:Berserk \nb:Jungle Taitei\nc:Sazae-San\nd:Guts-San",
                "a"));
        lista4.add(new Ronda4(
                "De que estilo arquitectonico es la catedral de Notre Dame?\na:Gotico\nb:Eclesiastico\nc:Oscurantista\nd:Contemporaneo",
                "a"));
        lista4.add(new Ronda4(
                "De que pais es originario el tipo de poema breve de diecisiete s�labas, escrito en tres versos de cinco, siete y cinco s�labas respectivamente?\na:Filipinas\nb:Corea del sur \nc:Japon\nd:Corea del norte",
                "c"));
        lista4.add(new Ronda4(
                "Que animal mitologico da nombre a uno de los libros mas conocidos de Thomas Hobbes?\na:El monstruo del lago Ness\nb:Dracula\nc:Leviatan\nd:La Quimera",
                "c"));
        int index = rand.nextInt(lista4.size());
        System.out.println("Su pregunta a responder es...\n" + lista4.get(index).pregunta);
        System.out.println(" ");
        System.out.println("Indique su respuesta a continuacion:");
        respuestaC = (lista4.get(index).respuestaC);
        respuesta = read.nextLine();
        if (respuesta.equals(respuestaC)) {
            System.out.println("Su respuesta es correcta");
            resultado = 1;
        } else {
            System.out.println("Oops esa no era la respuesta");
            loser();
        }
        premio=premio+100;
        return resultado;
    }

    @Override
    public void loser() {
        resultado = 0;
        premio =0;
        System.out.println("Estuviste muy cerca, mejor suerte la proxima");
    }
}
