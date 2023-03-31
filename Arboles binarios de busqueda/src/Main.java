import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Arbol_Binario_B add= new Arbol_Binario_B();

        add.nuevo_nodo(8);
        add.nuevo_nodo(9);
        add.nuevo_nodo(2);
        add.nuevo_nodo(5);
        add.nuevo_nodo(29);
        add.nuevo_nodo(23);
        add.nuevo_nodo(45);
        add.nuevo_nodo(12);

        add.buscarElemento(5);
/*
        if (add.buscarElemento(5) != null) {
            System.out.println("Elemento encontrado");
            add.getv
        }else {
            System.out.println("Elemento no encontrado");
        }*/

        System.out.println("indices ascentes ");
        //Obtenemos los números ordenados descendentemente
        ArrayList<Integer> numerosOrdenadosDescedentemente = add.obtenerElementosOrdenadosDescendentemente();
        System.out.print("Lista de números ordenados descendentemente: [ ");

        for (Integer numero: numerosOrdenadosDescedentemente) {
            System.out.print(numero + " ");
        }
        System.out.print("]\n");


        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        while (opcion !=5) {
            System.out.println("Arboles de busqueda ");
            System.out.println("1:\tInsertar Nodo");
            System.out.println("2:\tBuscar elemento");
            System.out.println("3:\tEliminar nodo");
            System.out.println("4:\tListar valores del nodo");
            System.out.println("5:\t Salir ");
            opcion = entrada.nextInt();

            int indice=0;
            switch (opcion) {
                case 1:

                    while (indice!=2) {
                        System.out.println("ingrese indice del nodo");
                        indice = entrada.nextInt();
                        add.nuevo_nodo(indice);
                        System.out.println("presione 2 para salir ");
                    }

                    break;
                case 2:
                    System.out.println("Ingrese indice del nodo a buscar");
                    indice = entrada.nextInt();
                    add.buscarElemento(indice);
                    break;
                case 3:
                    System.out.println("Ingrese indice del nodo que desea eliminar\n:");
                    indice = entrada.nextInt();
                    add.eliminarElemento(indice);
                    break;
                case 4:
                    System.out.println("la lista de nodos es:");

                    ArrayList<Integer> numerosOrdenadosDescedentement = add.obtenerElementosOrdenadosDescendentemente();
                    System.out.print("Lista de nodos ordenados descendentemente: [ ");

                    for (Integer numero: numerosOrdenadosDescedentement) {
                        System.out.print(numero + " ");
                    }
                    System.out.print("]\n");

                    break;
                default:
                    System.out.println("Opcion no disponible");
                    break;

            }
            try {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}