//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public Main () {
    }

    public static void main(String[] args) {
Flores Rosa = new Flores();
Rosa.color = "Rojo";
Rosa.tamaño = 40;
Rosa.tipo = "Blush";
Rosa.olor = "dulce";
System.out.println("Rosa.color = " + Rosa.color);
System.out.println("Rosa.tamaño = " + Rosa.tamaño);
System.out.println("Rosa.tipo = " + Rosa.tipo);
System.out.println("Rosa.olor = " + Rosa.olor);
Flores Tulipan = new Flores();
Tulipan.color = "Blanco";
Tulipan.tamaño = 35 ;
Tulipan.tipo = "Angelica";
Tulipan.olor = "dulce";
Tulipan.detalleflor();
    }
}