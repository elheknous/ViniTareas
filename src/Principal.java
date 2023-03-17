public class Principal {
    public static void main(String[] args) {
        //hola
        String[][] vinilos = new String[100][3];
        agregarVinilos(vinilos,"Iron maden","Iron maden","1980");
        agregarVinilos(vinilos,"Iron maden","Killers","1981");
        agregarVinilos(vinilos,"Iron maden","The Number Of The Beast","1982");

        imprimirMatriz(vinilos,100,3);


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
