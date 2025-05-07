

package principal;
import javax.swing.JOptionPane;
import model.Cachorro;
import model.Ave;
import model.Animal;
public class Unisul35 {

    public static void main(String[] args) {
        Cachorro cao = new Cachorro();
        Ave ave = new Ave();
        
        String somC = "cao";
        String moverCachorro = "cao";
        
        String somAve = "ave";
        String moverAve = "ave";
        
        JOptionPane.showMessageDialog(null, "CACHORRO" );
        cao.leitura();
        cao.imprimir();
        JOptionPane.showMessageDialog(null, cao.produzirSom(somC));
        JOptionPane.showMessageDialog(null, cao.mover(moverCachorro));
       
    
        JOptionPane.showMessageDialog(null, "AVE");
        ave.leitura();
        ave.imprimir();
        JOptionPane.showMessageDialog(null, ave.produzirSom(somAve));
        JOptionPane.showMessageDialog(null, ave.mover(moverAve));
    }
}
