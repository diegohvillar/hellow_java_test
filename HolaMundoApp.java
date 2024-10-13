import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class HolaMundoApp {
    public static void main(String[] args) {
        // Crear el marco (ventana)
        JFrame frame = new JFrame("Hola Mundo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        
        // Crear una etiqueta con el texto "Hola Mundo"
        JLabel label = new JLabel("¡Hola Mundo!", JLabel.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 24));
        
        // Agregar la etiqueta al marco
        frame.add(label);
        
        // Hacer la ventana visible
        frame.setVisible(true);
    }
}
