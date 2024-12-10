
package MenuComidas;

public class Menus{     //Clase Menus para crear objetos, en este caso cada producto del menu
    String nombre;
    int cantidad;
    double precio;
    int numero;
    
    public Menus(String nombre, int cantidad, double precio, int numero){ //Constructor
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;  
        this.numero = numero;
    }
    
    void agregarCantidad(int x){     //Metodo por si se requiere agregar cantidad de producto a stock
        if(x > 0){
        cantidad = cantidad + x;
        }else{
            System.out.println("Agrega una cantidad mayor a 0");
        }
    }
    
    void consultar(){          //Metodo para ver la info del producto
        System.out.println(numero + ". Nombre del producto: " + nombre);
        System.out.println("Cantidad disponible: " + cantidad);
        System.out.println("Precio del producto: " + precio);
    }
    
    boolean realizarPedido(int x){        //Metodo para hacer el pedido
        if(x <= cantidad){
            cantidad = cantidad - x;
            return true;
        }else{
            if(x <= 0){
                System.out.println("Se debe pedir una cantidad mayor a 0");
            }else{
                System.out.println("Por el momento no hay");
            }
            return false;
        }
    }
    
}
