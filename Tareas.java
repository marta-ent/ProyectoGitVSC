import java.util.Scanner;
public class Tareas {
    public static void mostrarElementos(String[] tareas) {
        for (String t : tareas) {
            System.out.println(t);
        }
    }
    public static void llenarTareas(String[] tareas, Scanner teclado) {
        for (int i = 0; i < tareas.length; i++) {
            System.out.println("Dime la " + (i + 1) + " tarea:");
            tareas[i] = teclado.nextLine();
        }
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime la cantidad de tareas:");
        int cantidad = teclado.nextInt();
        teclado.nextLine();
        String[] tareas = new String[cantidad];
        llenarTareas(tareas, teclado);
        System.out.println("Tus tareas son:");
        mostrarElementos(tareas);
        teclado.close();
    }
}

