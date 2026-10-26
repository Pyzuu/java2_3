import java.util.Scanner;
class Main {
  public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
  System.out.print("liczba pierwsza(a):");
    int a =scanner.nextInt();
     System.out.print("liczba druga(b):");
    int b =scanner.nextInt();

    int suma= a+b;

    System.out.print("suma="+suma);
    scanner.close();
  }
  
}
