package laboratorio.sofkau;

import java.util.ArrayList;
import java.util.List;

public class Ronda3 extends Banco implements IRonda {

    public Ronda3() {
    }

    public Ronda3(String pregunta, String respuestaC) {
        super();
        this.pregunta = pregunta;
        this.respuestaC = respuestaC;
    }

    @Override
    public Integer questions() {
        List<Ronda3> lista3 = new ArrayList<Ronda3>();
        lista3.add(new Ronda3(
                "Cuanto duro la guerra de los 100 a�os?\na:100\nb:161\nc:110\nd:116",
                "d"));
        lista3.add(new Ronda3(
                "Que carabela no volvio del viaje donde Colon arribo a America la primera vez?\na:La Pinta\nb:La Nina\nc:La Alejandrina\nd:La Santa Maria",
                "d"));
        lista3.add(new Ronda3(
                "Que isla sirvio de prision para Napoleon tras ser derrotado en Waterloo?\na:Santa Elena\nb:Santa Eulalia\nc:Santa Ana\nd:Santa Maria",
                "a"));
        lista3.add(new Ronda3(
                "En que pais se habla mayoritariamente el idioma Tagalog?\na:Filipinas\nb:Corea del sur \nc:Japon\nd:Corea del norte",
                "a"));
        lista3.add(new Ronda3(
                "Cual es la ciudad mas poblada de Africa\na:El cairo\nb:Nairobi\nc:Luanda\nd:Pretoria",
                "a"));
        int index = rand.nextInt(lista3.size());
        System.out.println("Su pregunta a responder es...\n" + lista3.get(index).pregunta);
        System.out.println(" ");
        System.out.println("Indique su respuesta a continuacion:");
        respuestaC = (lista3.get(index).respuestaC);
        respuesta = read.nextLine();
        if (respuesta.equals(respuestaC)) {
            System.out.println("Su respuesta es correcta");
            resultado = 1;
        } else {
            System.out.println("Oops esa no era la respuesta");
            loser();
            resultado = 0;
        }
        premio=premio+100;
        return resultado;
    }

    @Override
    public void loser() {
        System.out.println("Usted ha perdido durante la tercera ronda :c");
    }
}
