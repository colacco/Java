package ex2;

public class CalculadoraSalaRetangular implements CalculoGeometrico{
    public double calcularArea(double altura, double largura) {
        return altura * largura * 6;
    }

    public double calcularPerimetro(double altura, double largura) {
        return (altura + largura) * 12;
    }
}
// (altura * 2 + largura * 2) * 6 <=> 2(altura + largura) * 6 <=> 12(altura + largura)