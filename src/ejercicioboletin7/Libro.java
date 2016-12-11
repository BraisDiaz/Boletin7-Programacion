
package ejercicioboletin7;

import javax.swing.JOptionPane;

/**
 *
 * @author Brais
 */
public class Libro {
    
    private String titulo, autor;
    private int nºexemplares, nºprestados;

    public Libro() {
    }

    public Libro(String titulo, String autor, int nºexemplares, int nºprestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.nºexemplares = nºexemplares;
        this.nºprestados = nºprestados;
    }

    public void setTitulo() {
        titulo = JOptionPane.showInputDialog("Introducir título del libro");
    }

    public void setAutor() {
        autor = JOptionPane.showInputDialog("Introducir nombre del autor");
    }

    public void setNºexemplares(int nºexemplares) {
        this.nºexemplares = nºexemplares;
    }

    public void setNºprestados(int nºprestados) {
        this.nºprestados = nºprestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
        
    public void prestamo (int prestamo){
        if (nºexemplares>nºprestados){
            nºprestados = nºprestados + prestamo;
             }
            else 
            
            JOptionPane.showMessageDialog(null, "No hay ejemplares de ese libro disponibles para prestar, lo sentimos");
        }
    public void devolucion (int devolucion){
        if (nºprestados>0){
            nºexemplares = nºexemplares + devolucion;
    }
        else {
        
        JOptionPane.showMessageDialog(null, "No se puede devolver un ejemplar que no ha sido prestado");
        }
    }
    public void getNºexemplares() {
        JOptionPane.showMessageDialog(null, "El nº de ejemplares disponibles es de " + (nºexemplares - nºprestados));
    }
    public void getNºprestados() {
        
        JOptionPane.showMessageDialog(null, "El nº de ejemplares prestados es de " + (nºprestados));
    }

 
    }

   
    
    
    

    
    

    
    
    
    

