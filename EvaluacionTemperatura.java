import java.util.Scanner;

public class EvaluacionTemperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

             int[][] valoresPredeterminados = {
            {20, 30, 40}, 
            {25, 35, 45},  
            {15, 25, 35},   
        };

        
        System.out.print("Ingrese el momento del día (mañana, tarde, noche): ");
        
        String momentoDia = scanner.nextLine().toLowerCase();

        System.out.print("Ingrese la temperatura actual del tanque de combustible: ");
        int temperatura = scanner.nextInt();

        String resultadoEvaluacion = evaluarTemperatura(momentoDia, temperatura, valoresPredeterminados);

        System.out.println("La temperatura del tanque de combustible es: " + resultadoEvaluacion);
    }

    public static String evaluarTemperatura(String momentoDia, int temperatura, int[][] valoresPredeterminados) {
        int indiceMomentoDia = -1;

        switch (momentoDia) {
            case "mañana":
                indiceMomentoDia = 0;
                break;
            case "tarde":
                indiceMomentoDia = 1;
                break;
            case "noche":
                indiceMomentoDia = 2;
                break;
            default:
                return "Error: Momento del día no válido.";
        }

        if (temperatura < valoresPredeterminados[indiceMomentoDia][0]) {
            return "Muy Buena";
        } else if (temperatura < valoresPredeterminados[indiceMomentoDia][1]) {
            return "Normal";
        } else if (temperatura < valoresPredeterminados[indiceMomentoDia][2]) {
            return "Peligrosa";
        } else {
            return "Muy Peligrosa";
        }
    }
}
