import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();

        int opcion=0;
        while (opcion != 8) {
            System.out.println("*************************\n"+
            "Bienvenidos a el conversor de monedas Jeff\n\n"+
            "Ingrese la conversión que desea realizar hoy \n\n"+
            "1. Dolar a peso Argentino\n"+
            "2. Peso Argentino a Dolar\n"+
            "3. Dolar a Real Brasileño\n"+
            "4. Real Brasileño a Dolar\n"+
            "5. Dolar a Peso Colombiano\n"+
            "6. Peso Colombiano a Dolar\n"+
            "7. Convertir otra moneda\n"+
            "8. Salir");
            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion){
                case 1:
                    ConvertirMoneda.convertir("USD","ARS",consulta,lectura);
                    break;
                case 2:
                    ConvertirMoneda.convertir("ARS","USD",consulta,lectura);
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD","BRL",consulta,lectura);
                    break;
                case 4:
                    ConvertirMoneda.convertir("BRL","USD",consulta,lectura);
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD","COP",consulta,lectura);
                    break;
                case 6:
                    ConvertirMoneda.convertir("COP","USD", consulta, lectura);
                    break;
                case 7:
                    ConvertirMoneda.convertirOtraMoneda(consulta,lectura);
                    break;
                case 8:
                    System.out.println("Adiós");
                    break;

                default:
                    System.out.println("Opción no valida");
                    break;
            }
        }
    }
}
