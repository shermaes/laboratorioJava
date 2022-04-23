package laboratorio.sofkau;

import java.util.ArrayList;
import java.util.List;


public class Ronda2 extends Banco implements IRonda {

    public Ronda2() {
    }

    public Ronda2(String pregunta, String respuestaC) {
        super();
        this.pregunta = pregunta;
        this.respuestaC = respuestaC;
    }


    @Override
    public Integer questions() {
        List<Ronda2> lista2 = new ArrayList<Ronda2>();
        lista2.add(new Ronda2(
                "Como se llamaba el caballo de Don Quijote de la mancha?\na:Rucio Moro\nb:Rocinante\nc:Copo de nieve\nd:Nevado",
                "b"));
        lista2.add(new Ronda2(
                "Cuantos elementos tiene la tabla periodica\na:118\nb:117\nc:120\nd:122",
                "a"));
        lista2.add(new Ronda2(
                "Que ciencia estudia la sangre?\na:Ciencia Hematologica\nb:Hematologia\nc:Hematolociencia\nd:Ciencia de la sangre y el plasma",
                "b"));
        lista2.add(new Ronda2(
                "Como se llama el protagonista de la serie CSI:MIAMI?\na:Argent\nb:Alan\nc:Horacio\nd:Philip",
                "c"));
        lista2.add(new Ronda2(
                "En Venezuela se dice que es una reina pepiada: \na:Una mujer muy hermosa\nb:Una arepa\nc:Una gran cantidad de dinero\nd:Una coincidencia",
                "b"));
        int index = rand.nextInt(lista2.size());
        System.out.println("Su pregunta a responder es...\n" + lista2.get(index).pregunta);
        System.out.println(" ");
        System.out.println("Indique su respuesta a continuacion:");
        respuestaC = (lista2.get(index).respuestaC);
        respuesta = read.nextLine();
        if (respuesta.equals(respuestaC)) {
            System.out.println("Su respuesta es correcta");
            resultado = 1;
        } else {
            System.out.println("Oops esa no era la respuesta, usted ha perdido el juego");
            loser();
            resultado = 0;

        }
        return resultado;
    }

    @Override
    public void loser() {
        System.out.println("Usted ha perdido durante la segunda ronda");
    }
}
