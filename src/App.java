public class App {
    public static void main(String[] args) throws Exception{
        int numeroIf = -1;
        if (numeroIf > 0) {
            System.out.println("es mayor que 0");
        } else if (numeroIf < 0) {
            System.out.println("es menor que 0");
        } else if (numeroIf == 0) {
            System.out.println("el numero es 0");
        }

        System.out.println("----------------------------------------");

        int numeroWhile = 0;

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        }

        System.out.println("----------------------------------------");

        do {
            numeroWhile = numeroWhile + 1;
            System.out.println(numeroWhile);
        } while (numeroWhile < 3);

        System.out.println("----------------------------------------");

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        System.out.println("----------------------------------------");

        var Estacion = "Verano";

        switch (Estacion) {
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            case "Primavera":
                System.out.println("Es Primavera");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            default:
                System.out.println("Esto no es una estacion >:(");
                break;
        }
    }
}
