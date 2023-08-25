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

        System.out.println("Sus ingresos brutos son: C$"+ ingresoBruto);
        System.out.println("Sus ingresos totales son: C$" + ingresototales);
        System.out.println("::::::::::::::::::::::::::::::::::::");
        System.out.println("Sus deducciones totales fueron: C$" + deduccionesTotales +
                            "\n" + "\tMonto por afiliacion del sindicato: C$"+ montoSindicato+
                            "\n" + "\tDeduccion Inss: C$"+ deduccionInss +
                            "\n" + "\tDeduccion IR: C$"+ deduccionIR);
        System.out.println("::::::::::::::::::::::::::::::::::::");
        System.out.println("La deduccion de la empresa son: C$" + inssPatronal);
        System.out.println("::::::::::::::::::::::::::::::::::::");
        System.out.println("Sus ingresos netos son: C$" + ingresoNeto);
        System.out.println("Sus ingresos por antiguedad son: C$" + ingresoAntiguedad);
    }
}
