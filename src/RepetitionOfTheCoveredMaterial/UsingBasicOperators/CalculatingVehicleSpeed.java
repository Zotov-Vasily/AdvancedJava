package RepetitionOfTheCoveredMaterial.UsingBasicOperators;

public class CalculatingVehicleSpeed {
    public static void main(String[] args) {
        // расстояние между обьектами км.
        double S1 = 100;
        double S2 = 200;

        // скорость на первом участке (км/ч)
        double V1 = 80;

        // средняя скорость (км/ч)
        double V = 48;

        // скорость на втором участке. общее время движения. время движения на первом участке
        double V2, T, t;

        // общее время движения (ч)
        T = (S1 + S2) / V;

        // время движения на первом участке
        t = S1 / V1;

        // скорость на втором участке
        V2 = T > t ? (S1 + S2) / (T - t) :- 1;
        System.out.println("Скорость на втором участке:");
        System.out.println(V2 < 0 ? "Это невозможно!" : V2 + " км/ч");
    }
}
