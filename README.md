# Ejercicio.Introduccion_Programacion
1) Función: Suma de 3 parámetros. 

public class FuncionSuma
{
    public static void main(final String[] args) {
        final int resultado = sumaNumeros(3, 5, 7);
        System.out.println(resultado);
    }
    
    public static int sumaNumeros(final int num1, final int num2, final int num3) {
        return num1 + num2 + num3;
    }
}

................................................

2) Clase Coche: Incrementa el número de puertas.

public class Coche
{
    int puertas;
}
..................

public class Main
{
    public static void main(final String[] args) {
        final Coche miCoche = new Coche();
        miCoche.puertas = incremento(1);
        System.out.println(miCoche.puertas);
    }
    
    public static int incremento(int doors) {
        return ++doors;
    }
}
