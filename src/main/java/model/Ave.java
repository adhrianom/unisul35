
package model;

import javax.swing.JOptionPane;

public class Ave implements Animal {
    private String name;
    private String color;

    public Ave() {
    }

    public Ave(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void leitura(){
        setName(JOptionPane.showInputDialog("Qual o nome da ave?"));
        setColor(JOptionPane.showInputDialog("Qual a cor dele?"));
    }
    
    public void imprimir(){
        JOptionPane.showMessageDialog(null, "NOME: " + getName() + "\n" + "COR: " + getColor() + "\n");
    }
    
    @Override
    public String produzirSom(String produzirSom){
        return "Cantar";
    }
    
    @Override
    public String mover(String mover){
        return "Voar";
    }
  
}
