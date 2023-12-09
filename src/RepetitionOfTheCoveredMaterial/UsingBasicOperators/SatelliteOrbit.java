package RepetitionOfTheCoveredMaterial.UsingBasicOperators;

import static java.lang.Math.*;

public class SatelliteOrbit {
    public static void main(String[] args) {

        final double G = 6.672E-11; // гравитационная постоянная
        final double M = 5.96e24;   // масса земли (кг)
        final double R = 6.37E6;    // радиус земли
        double T = 1.5;             // период обращения спутника
        double H;                   // высота над поверхностью
        T *= 3600;                  // перевод в сек.
        H = pow(G * M * T * T / 4 / PI / PI , (double) 1 / 3) - R;  // высота в метрах
        H = (double) round(H) / 1000;  // высота в км с точностью до тысячных

        System.out.println("Высота обриты спутника: " + H + " км");
    }
}
