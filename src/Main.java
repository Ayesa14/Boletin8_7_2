public class Main {
    public static void main(String[] args) {
        final int CUADRADO = 1;
        final int TRIANGULO = 2;
        final int CIRCUNFERENCIA = 3;
        Funciones misFunciones = new Funciones();
        misFunciones.mostrarMenu();
        int opcion = misFunciones.introducirOpcion();
        int area, lado, altura, base, radio;
        switch (opcion) {
            case CUADRADO:
            lado = misFunciones.introducirNumero();
            area = misFunciones.calcularAreaCuadrado(lado);
            misFunciones.mostrarArea(area);
            break;
            case TRIANGULO:
            base = misFunciones.introducirNumero();
            altura = misFunciones.introducirNumero();
            area = misFunciones.calcularAreaTriangulo(base, altura);
            misFunciones.mostrarArea(area);
            break;

            case CIRCUNFERENCIA:
            radio = misFunciones.introducirNumero();
            area = (int) misFunciones.calcularAreaCircunferencia(radio);
            misFunciones.mostrarArea(area);
            break;
            default:
                misFunciones.mostrarMensaje();
        }
    }
}