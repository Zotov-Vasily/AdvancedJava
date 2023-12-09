package RepetitionOfTheCoveredMaterial.UsingBasicOperators;
import static java.lang.Math.*;

public class CalculationOfBodyCoordinates {
    public static void main(String[] args) {
        final double g = 9.8;  // ��������� ���������� �������
        double alpha = 30;     // ���� � ��������� (� ��������)
        double m = 0.1;        // ����� ���� (� ��.)
        double gamma = 0.1;    // ����������� ������������ � ������� (�*�/�)
        double V = 100.0;      // �������� ���� (�/�)
        double t = 1.1;        // ����� (� ���.)
        double x, y;           // ���������� ���� (� ������)
        alpha /= 180 / PI;     // ������� �������� � �������

        x = V * m * cos(alpha) / gamma * (1 - exp(-gamma * t / m));
        y = m * (V * sin(alpha) * gamma + m * g) / gamma / gamma * (1 - exp(-gamma * t / m)) - m * g * t / gamma;

        System.out.println("���������� ���� ��� t = " + t + " ���: \nx = " + x + " � \ny = " + y + " �");
        System.out.println("���������:");
        System.out.println("���� alpha = " + alpha / PI * 180 + " ��������");
        System.out.println("�������� V = " + V + " �/�");
        System.out.println("����������� ������������� gamma = " + gamma + " �*�/�");
        System.out.println("����� ���� m = " + m + " ��");
    }
}
