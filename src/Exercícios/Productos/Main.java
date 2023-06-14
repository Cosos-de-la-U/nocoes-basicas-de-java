package Exercícios.Productos;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Integer> inventario = new HashMap<>();
        TreeMap<String, Integer> inventarioOrdenado;

        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");

        int opcion = 0;

        System.out.println("Inventario de produectos");
        System.out.println("-----------------------------");

        while (opcion != 8) {
            System.out.println("\nSeleciona una opcion:");
            System.out.println("1. Agregar producto");
            System.out.println("2. Aumentar stock de un producto");
            System.out.println("3. Eliminar stock de un producto");
            System.out.println("4. Listar producto y su stock");
            System.out.println("5. Eliminar producto");
            System.out.println("6. Ordenar producto ascendentemente");
            System.out.println("7. Ordenar productos descendentemente");
            System.out.println("8. Salir");

            String producto;
            int stock, stockActual;

            opcion = teclado.nextInt();

            try {
                switch (opcion) {
                    case 1:
                        System.out.println("\n Digite el nombre del producto");
                        producto = teclado.next();

                        if (inventario.containsKey(producto)) {
                            System.out.println("Ese producto ya esxiste");
                        } else {
                            inventario.put(producto, 0);
                            System.out.println("Se agrego " + producto);
                        }
                        break;
                    case 2:
                        System.out.println("\n Digite el nombre del producto");
                        producto = teclado.next();

                        if (inventario.containsKey(producto)) {
                            System.out.println("\n Ingrese cantidad de stock");
                            stock = teclado.nextInt();

                            if (stock > 0) {
                                stockActual = inventario.get(producto);
                                inventario.put(producto, stock + stockActual);

                                System.out.println("Se ha agregado " + stock + " de stock");
                            }
                        } else {
                            System.out.println("Ese producto no existe");
                        }
                        break;
                    case 3:
                        System.out.println("Ingrese el producto");
                        producto = teclado.next();

                        if (inventario.containsKey(producto)) {

                            System.out.println("Ingrese cantidad a eliminar");
                            stock = teclado.nextInt();
                            if (inventario.get(producto) > 0) {
                                stockActual = inventario.get(producto);
                                inventario.put(producto, stock + stockActual);

                                System.out.println("Se a elminado" + stock + "de stock");
                            } else {
                                System.out.println("No se puede eliminar " + stock + " productos de " + inventario.get(producto));
                            }
                        } else {
                            System.out.println("Ese producto no existe");
                        }
                        break;
                    case 4:
                        System.out.println("\n Lista");
                        for (Map.Entry<String, Integer> item : inventario.entrySet()) {
                            System.out.println("Producto: " + item.getKey() + ", Stock: " + item.getValue());
                        }
                        break;
                    case 5:
                        System.out.println("Ingrese producto a eliminar");
                        producto = teclado.next();

                        if (inventario.containsKey(producto)) {
                            inventario.remove(producto);
                            System.out.println("Se elimino " + producto);
                        } else {
                            System.out.println("Ese producto no existe");
                        }
                        break;
                    case 6:
                        inventarioOrdenado = new TreeMap<>(new ProductoAsc());
                        inventarioOrdenado.putAll(inventario);

                        for (String i : inventarioOrdenado.keySet()) {
                            stock = inventarioOrdenado.get(i);
                            System.out.println();
                            System.out.println("Clave: " + i);
                            System.out.println("Stock: " + stock);
                        }
                        break;
                    case 7:
                        inventarioOrdenado = new TreeMap<>(new ProductoDesc());
                        inventarioOrdenado.putAll(inventario);

                        for (String i : inventarioOrdenado.keySet()) {
                            stock = inventarioOrdenado.get(i);
                            System.out.println();
                            System.out.println("Clave: " + i);
                            System.out.println("Stock: " + stock);
                        }
                        break;
                }

            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Seleciona una opcion correcta");
            }
        }
    }

}
