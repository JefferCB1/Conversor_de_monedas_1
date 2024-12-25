public class Principal {
    public static void main(String[] args) {
        ConsultaMoneda consulta = new ConsultaMoneda();
        Moneda moneda= consulta.buscarMonedas("COP", "USD");
        System.out.println(moneda);
    }
}
