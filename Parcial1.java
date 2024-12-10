
package MenuComidas;
import java.util.*;


public class Parcial1 {

    
    public static void main(String[] args) {
        
        Menus Pizza = new Menus("Pizza", 30, 7.000, 1);      //Se crean los distintos productos del menu
        Menus HotDog = new Menus("Hot Dog", 15, 3.000, 2);
        Menus Malteada = new Menus("Malteada", 7, 6.000, 3);

        System.out.println("Escribe 1 o 2 dependiendo la accion que deseas realizar, 1 para ver el menu, 2 para hacer un pedido: ");
        Scanner s = new Scanner(System.in);               //Se le da la opcion al usuario de ver el menu o hacer un pedido
        int z = s.nextInt();
        if(z == 1){
            Pizza.consultar();
            HotDog.consultar();
            Malteada.consultar();
        }else{
            System.out.println("Escribe el numero del producto del menu que desees comprar: ");
            Scanner ss = new Scanner(System.in);
            System.out.println("Escribe la cantidad de ese producto que deseas comprar: ");
            Scanner sss = new Scanner(System.in);
            int w = ss.nextInt();
            int y = sss.nextInt();
            switch (w) {
                case 1:
                    Pizza.realizarPedido(y);
                    System.out.println("Has pedido " + y +" porciones de pizza exitosamente.");
                    break;
                case 2:
                    HotDog.realizarPedido(y);
                    System.out.println("Has pedido " + y + " Hot Dogs exitosamente.");
                    break;
                case 3:
                    Malteada.realizarPedido(y);
                    System.out.println("Has pedido " + y + "Malteadas exitosamente");
                default:
                    break;
            }
            
        }
        //Para observar que se realizo el pedido podemos ver la cantidad actual del producto
        
       
    }
    
}
