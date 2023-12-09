package RepetitionOfTheCoveredMaterial.UsingBasicOperators;
import static java.lang.Math.*;

public class CalculationOfBodyCoordinates {
    public static void main(String[] args) {
        final double g = 9.8;  // ускорение свободного падения
        double alpha = 30;     // угол к горизонту (в градусах)
        double m = 0.1;        // масса тела (в кг.)
        double gamma = 0.1;    // коэффициент сопротивлени я воздуха (Н*с/м)
        double V = 100.0;      // скорость тела (м/с)
        double t = 1.1;        // время (в сек.)
        double x, y;           // координаты тела (в метрах)
        alpha /= 180 / PI;     // перевод градусов в радианы

        x = V * m * cos(alpha) / gamma * (1 - exp(-gamma * t / m));
        y = m * (V * sin(alpha) * gamma + m * g) / gamma / gamma * (1 - exp(-gamma * t / m)) - m * g * t / gamma;

        System.out.println("Коодринаты тела для t = " + t + " сек: \nx = " + x + " м \ny = " + y + " м");
        System.out.println("Параметры:");
        System.out.println("Угол alpha = " + alpha / PI * 180 + " градусов");
        System.out.println("Скорость V = " + V + " м/с");
        System.out.println("Коэффициент сопротивления gamma = " + gamma + " Н*с/м");
        System.out.println("Масса тела m = " + m + " кг");
    }
}
