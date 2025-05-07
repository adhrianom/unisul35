
package model;
import javax.swing.JOptionPane;
public class Cachorro implements Animal {
    private String name;
    private String raca;

    public Cachorro() {
    }

    public Cachorro(String name, String raca) {
        this.name = name;
        this.raca = raca;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    public void leitura(){
        setName(JOptionPane.showInputDialog("Qual o nome do cachorro?"));
        setRaca(JOptionPane.showInputDialog("Qual a raça dele?"));
    }
    
    public void imprimir(){
        JOptionPane.showMessageDialog(null, "NOME: " + getName() + "\n" + "RAÇA: " + getRaca() + "\n");
    }
    
    @Override
    public String produzirSom(String produzirSom){
        return "Latir";
    }
    
    @Override
    public String mover(String mover){
        return "Andar";
    }
}
