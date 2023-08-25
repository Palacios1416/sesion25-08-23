import java.util.Scanner;
public class App {
    //static final double tasaInss = 0.07;
    //static final double tasaIR = 0.07;
    //static final double tasaInss = 0.07;
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double ingresoBruto, ingresoNeto, salarioNeto;
        double ingresototales, deduccionesTotales, ingresoAntiguedad;
        double deduccionInss, deduccionIR, montoSindicato, inssPatronal;
        
        System.out.print("Ingrese su salario bruto: ");
        ingresoBruto = scanner.nextDouble();
        
        ingresoAntiguedad = (0.15) * ingresoBruto;
        ingresototales = ingresoBruto + ingresoAntiguedad;

        
        montoSindicato = (0.01) * ingresoBruto;
        deduccionInss = (0.07) * ingresototales;
        deduccionIR = (0.156) * ingresototales;

        deduccionesTotales = deduccionInss + deduccionIR + montoSindicato;

        ingresoNeto = ingresototales - deduccionesTotales;
        
        inssPatronal = (0.225) * ingresototales;

        System.out.println("Hello, World!");
    }
}
