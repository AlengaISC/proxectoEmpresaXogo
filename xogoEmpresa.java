import java.util.*;
import java.lang.Math;

public class xogoEmpresa {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        calcularEntrada();
    }
    
    public static void calcularEntrada() {
        int age;
        double prezo;
        
        System.out.println("Indica a idade do cliente: ");
        age = input.nextInt();
        while (age < 0) {
            System.out.println("Introduce unha idade válida");
            age = input.nextInt();
        }
        if (age >= 18) {
            prezo = 10;
        } else {
            if (age < 4 && age >= 0) {
                prezo = 0;
            } else {
                prezo = 5;
            }
        }
        System.out.println("O cliente terá que pagar: " + prezo + "€");
	System.out.println("Non sei que hai que poñerlle aquí")
    }
}
