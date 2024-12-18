package Ejercicio_15;

public class Peso {
    private double pesoA;
    private double pesoB;
    private double pesoC;
    private double pesoD;

    public Peso(double pesoA, double pesoB, double pesoC, double pesoD) {
        this.pesoA = pesoA;
        this.pesoB = pesoB;
        this.pesoC = pesoC;
        this.pesoD = pesoD;
    }

    public String determinarEsferaDiferente() {
        if (pesoA == pesoB && pesoA == pesoC) {
            return pesoD > pesoA 
                ? "La esfera D es la diferente y es de mayor peso." 
                : "La esfera D es la diferente y es de menor peso.";
        } else if (pesoA == pesoB && pesoA == pesoD) {
            return pesoC > pesoA 
                ? "La esfera C es la diferente y es de mayor peso." 
                : "La esfera C es la diferente y es de menor peso.";
        } else if (pesoA == pesoC && pesoA == pesoD) {
            return pesoB > pesoA 
                ? "La esfera B es la diferente y es de mayor peso." 
                : "La esfera B es la diferente y es de menor peso.";
        } else {
            return pesoA > pesoB 
                ? "La esfera A es la diferente y es de mayor peso." 
                : "La esfera A es la diferente y es de menor peso.";
        }
    }
}
