import java.util.Scanner;

public class Ex02 {
    
    private double hipotenusa, c1, c2;
    
    public double calcularHipotenusa() {
        return hipotenusa = Math.sqrt(Math.pow(c1,2) + Math.pow(c2,2));
    }
    
    public double calcularArea() {
        return (c1 * c2) / 2;
    }
    
    public double setC1(double c1) {
        return this.c1 = c1;
    }
    
    public double setC2(double c2) {
        return this.c2 = c2;
    }
    
    
    public static void main(String[] args) {
      
      double c1, c2;
      
      Scanner scanner = new Scanner(System.in);
      
      TrianguloRetangulo rt = new TrianguloRetangulo();
      
      System.out.println("Digite o valor do primeiro cateto:");
      c1 = scanner.nextDouble();
      
      rt.setC1(c1);
      
      System.out.println("Digite o valor do segundo cateto:");
      c2 = scanner.nextDouble();
      
      rt.setC2(c2);
      
      System.out.println("Valor da hipotenusa: " + rt.calcularHipotenusa());
      System.out.println("Valor da área: " + rt.calcularArea());
      
      scanner.close();
      
    }
}
