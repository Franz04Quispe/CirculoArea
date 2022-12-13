import java.util.Scanner;

/*Escriba un programa que utilice un método llamado CírculoArea, que pida al usuario el radio de un círculo
e imprima el área de ese círculo. Declare al menos un constructor con parámetros. (Ingrese el enlace a su repositorio)*/
public class Area {
    protected double radio;

    public Area() {
    }

    public Area(double radio) {
        this.radio = radio;
    }

    private void circuloArea(){
        double area,num,radiocuadrado;
        System.out.println("utilizando la formula: A = Pi*r² ; donde r es el radio ");
        Scanner XD = new Scanner( System.in );
        System.out.print("-Ingrese el radio del circulo: ");
        num=XD.nextDouble(); // num guardará el número que se ingrese
        radiocuadrado=num*num;
        area = (float) (3.14*radiocuadrado);//formula para el area de un circulo
        System.out.println(" siendo el área al cuadrado es: "+num+ " es igual a = "+ radiocuadrado);
        System.out.println(" siendo el área del circulo es: "+ area);
    }

    public static void main(String[] args) {
        Area ar=new Area();
        System.out.println("PROGRAMACION III-EXAMEN FINAL");
        ar.circuloArea();
    }
}
