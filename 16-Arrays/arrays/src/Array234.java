import java.util.Random;

public class Array234 {
    private int[][][] array;

    // Constructor que inicializa el array aleatoriamente
    public Array234() {
        array = new int[2][3][4];
        Random random = new Random();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++) {
                    array[i][j][k] = random.nextInt(100); // Valores aleatorios entre 0 y 99
                }
            }
        }
    }

    // Método para mostrar los valores máximos y mínimos del array y sus índices
    public void max_min() {
        int max = array[0][0][0];
        int min = array[0][0][0];
        int[] maxIndex = {0, 0, 0};
        int[] minIndex = {0, 0, 0};

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++) {
                    if (array[i][j][k] > max) {
                        max = array[i][j][k];
                        maxIndex = new int[]{i, j, k};
                    }
                    if (array[i][j][k] < min) {
                        min = array[i][j][k];
                        minIndex = new int[]{i, j, k};
                    }
                }
            }
        }

        System.out.println("Valor máximo: " + max + " en el índice [" + maxIndex[0] + "][" + maxIndex[1] + "][" + maxIndex[2] + "]");
        System.out.println("Valor mínimo: " + min + " en el índice [" + minIndex[0] + "][" + minIndex[1] + "][" + minIndex[2] + "]");
    }

    // Método para imprimir el array (opcional, para verificar el contenido)
    public void printArray() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

}