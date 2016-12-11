
package ejercicioboletin7;

/**
 *
 * @author Brais
 */
public class EjercicioBoletin7 {

    public static void main(String[] args) {
       
        Libro libro1 = new Libro();
        
        libro1.setAutor();
        libro1.setTitulo();
        libro1.setNºexemplares(10);
        libro1.setNºprestados(2);
        libro1.prestamo(2);
        libro1.devolucion(1);
        libro1.getNºexemplares();
        libro1.getNºprestados();
        
    }
    
}
