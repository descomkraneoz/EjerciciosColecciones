import java.util.TreeSet;

public class ConjuntosOrdenados {
    public static void main(String[] args) {
        TreeSet<String>colores=new TreeSet<String>();
        colores.add("rojo");
        colores.add("verde");
        colores.add("amarillo");
        colores.add("azul");
        colores.add("marron");
        colores.add("negro");

        for (String s: colores) {
            System.out.println(s);
        }


    }

}
