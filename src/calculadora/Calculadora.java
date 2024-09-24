
package calculadora;

public class Calculadora {

    public static void main(String[] args) {

  ventana inicio = new ventana();
        inicio.setTitle("Calculadora basica");
        inicio.setBounds(420, 185, 360, 520); //posicion y dimensiones
        inicio.setResizable(false); //desactivar redimensión
        inicio.insertarPanel();
        inicio.insertarEtiquetas();
        inicio.insertarTexto();
        inicio.insertarBotones();

    }
    
}
