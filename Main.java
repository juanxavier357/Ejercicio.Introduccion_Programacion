// 
// Decompiled by Procyon v0.5.36
// 

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
