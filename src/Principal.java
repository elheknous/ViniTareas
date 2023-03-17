import java.util.ArrayList;
import java.util.Scanner;
public class Principal {
    static Scanner sc = new Scanner(System.in);
    static int contador;
    public static void main(String[] args) {
        //hola
        Scanner sc = new Scanner(System.in);
        String[][] vinilos = new String[100][3];
        System.out.println("Espacio maximo disponible: 100 vinilos");
        System.out.println(" ");
        agregarVinilos(vinilos,"Iron maden","Iron maden","1980");
        agregarVinilos(vinilos,"Iron maden","Killers","1981");
        agregarVinilos(vinilos,"Iron maden","The Number Of The Beast","1982");
        agregarVinilos(vinilos,"AC-DC","Back In Black","1980");
        agregarVinilos(vinilos,"Kiss","Destroyer","1976");
        totalVinilos(vinilos);
        buscarArtista(vinilos);
        imprimirMatriz(vinilos,100,3);

    }

    private static void buscarArtista(String[][] vinilos) {
        ArrayList<String> cancionesEncontradas = new ArrayList<>();
        System.out.println("Que artista desea buscar: ");
        String artista = sc.nextLine();
        artista = artista.toUpperCase();
        Boolean existen = false;

        for (int i = 0; i < contador; i++) {
            String aux = vinilos[i][0];
            if(aux.toUpperCase().equals(artista)){
                cancionesEncontradas.add(vinilos[i][1] +" - "+vinilos[i][2]);
                existen = true;
            }
        }

        if (existen){
            System.out.println("El artista existe");
            System.out.println("Las canciones encontradas del artista son: ");
            for (String i : cancionesEncontradas){
                System.out.println(i);
            }
        }else {
            System.out.println("Lo sentimos, no hay canciones de ese artista:(");
        }
        System.out.println(" ");


    }

    private static void totalVinilos(String[][] vinilos) {
        contador = 0;
        for (int i = 0; i < 100; i++) {
            if (vinilos[i][0] != null){
                contador++;
            }

        }
        System.out.println("Hay un total de "+contador+" vinilos");
        System.out.println("Hay "+(100-contador)+" espacios disponibles");
        System.out.println(" ");
    }

    private static void agregarVinilos(String[][] vinilos, String banda, String disco, String cancion) {
        String[] vin = {banda,disco,cancion};
        int posicion = encontrarEspacio(vinilos);
        for (int i = 0; i < 3; i++) {
            vinilos[posicion][i] = vin[i];

        }


    }

    private static int encontrarEspacio(String[][] vinilos) {
        int i = 0;
        int posicion = -1;
        do {
            if (vinilos[i][0] == null){
                posicion = i;
            }
            i++;
        }while (posicion == -1 || i > 99);
        return posicion;
    }

    private static void imprimirMatriz(String[][] matriz, int filas, int columnas) {
        System.out.println("Los vinilos disponibles son: ");
        for (int i = 0; i < filas; i++) {
            if (matriz[i][0] != null) {
                for (int j = 0; j < columnas; j++) {
                    System.out.print("[" + matriz[i][j] + "]");

                }
                System.out.println(" ");
            }
        }
    }
}

