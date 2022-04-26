package laboratorio.sofkau;

import laboratorio.sofkau.IRonda;

import java.util.ArrayList;
import java.util.List;

public class Ronda1 extends Banco implements IRonda {

    public Ronda1() {
    }

    public Ronda1(String pregunta, String respuestaC) {
        super();
        this.pregunta = pregunta;
        this.respuestaC = respuestaC;
    }

    @Override
    public Integer questions() {
        List<Ronda1> lista1 = new ArrayList<Ronda1>();
        lista1.add(new Ronda1(
                "Quien fue el fundador de chocolates Wonka?\na:Willy Martinez\nb:Mikel Jackson\nc:Willy Wonka\nd:Jose Maestre",
                "c"));
        lista1.add(new Ronda1(
                "Cuantos dias le toma a la tierra dar una vuelta al sol?\na:31 \nb:250\nc:360\nd:365",
                "d"));
        lista1.add(new Ronda1(
                "Cual es el rio mas caudaloso del mundo?\na:Nilo\nb:Amazonas\nc:Mission Mississippi\nd:Yang Tse Kiang",
                "b"));
        lista1.add(new Ronda1(
                "Donde se encuentra la casa rosada?\na:Argentina\nb:Colombia\nc:Venezuela\nd:Filipinas",
                "a"));
        lista1.add(new Ronda1(
                "Una arepa catira en Venezuela lleva: \na:Mozzarella\nb:Queso amarillo\nc:Frijoles negros\nd:Huevo",
                "b"));
        int index = rand.nextInt(lista1.size());
        System.out.println("Su pregunta a responder es...\n" + lista1.get(index).pregunta);
        System.out.println(" ");
        System.out.println("Indique su respuesta a continuacion:");
        respuestaC = (lista1.get(index).respuestaC);
        respuesta = read.nextLine();
        if (respuesta.equals(respuestaC)) {
            System.out.println("Su respuesta es correcta");
            resultado = 1;
        } else {
            System.out.println("Oops esa no era la respuesta");
            resultado = 0;
            loser();
        }

        return resultado;

    }

    @Override
    public void loser() {
        System.out.println("Usted ha perdido esta ronda y sus premios");
    }
}

