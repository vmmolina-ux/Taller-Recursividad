package Recursividad;

import java.util.Scanner;

public class EjerciciosRecursivos 
    
    {

    public static void main(String[] args) 
    
        {
        
        Scanner scanner = new Scanner(System.in);
        int opcion; 
        do 
        
        {

            System.out.println("\n - - - TALLER DE RECURSIVIDAD - - -");
            System.out.println("1. Factorial");
            System.out.println("2. Sumatoria hasta n");
            System.out.println("3. Sumatoria armónica");
            System.out.println("4. Invertir número");
            System.out.println("5. Sumar dígitos de un número");
            System.out.println("6. Potencia (base^exponente)");
            System.out.println("7. MCD (Algoritmo de Euclides)");
            System.out.println("8. División por restas sucesivas");
            System.out.println("9. Multiplicación por sumas sucesivas");
            System.out.println("10. Sumar elementos de un arreglo");
            System.out.println("11. Sumar elementos de una matriz");
            System.out.println("12. Serie de Fibonacci hasta límite");
            System.out.println("13. Función de Ackermann");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();

            switch (opcion) 
            
            {

                case 1:
                    
                    System.out.print("Ingrese n: ");
                    int n1 = scanner.nextInt();

                    System.out.println("Resultado: " + factorial(n1));
                   
                    break;
                
                case 2:
            
                    System.out.print("Ingrese n: ");
                    int n2 = scanner.nextInt();

                    System.out.println("Resultado: " + sumatoria(n2));
                
                    break;
                
                case 3:
                
                    System.out.print("Ingrese n: ");
                    int n3 = scanner.nextInt();

                    System.out.println("Resultado: " + sumatoriaArmonica(n3));
            
                    break;
            
                case 4:
        
                    System.out.print("Ingrese número: ");
                    int n4 = scanner.nextInt();

                    System.out.println("Resultado: " + invertirNumero(n4, 0));
            
                    break;
            
                case 5:
        
                    System.out.print("Ingrese número: ");
                    int n5 = scanner.nextInt();

                    System.out.println("Resultado: " + sumarDigitos(n5));
            
                    break;
            
                case 6:
                    
                    System.out.print("Ingrese base: ");
                    int base = scanner.nextInt();

                    System.out.print("Ingrese exponente: ");
                    int exp = scanner.nextInt();

                    System.out.println("Resultado: " + potencia(base, exp));
                    
                    break;
                
                case 7:
                
                    System.out.print("Ingrese M: ");
                    int m7 = scanner.nextInt();

                    System.out.print("Ingrese N: ");
                    int n7 = scanner.nextInt();

                    System.out.println("Resultado: " + mcd(m7, n7));
                
                    break;
                
                case 8:
                
                    System.out.print("Ingrese dividendo: ");
                    int div1 = scanner.nextInt();

                    System.out.print("Ingrese divisor: ");
                    int div2 = scanner.nextInt();

                    System.out.println("Resultado: " + divisionRestas(div1, div2));
            
                    break;
            
                case 9:
            
                    System.out.print("Ingrese número 1: ");
                    int a9 = scanner.nextInt();
                    
                    System.out.print("Ingrese número 2: ");
                    int b9 = scanner.nextInt();

                    System.out.println("Resultado: " + multiplicacionSumas(a9, b9));
        
                    break;
        
                case 10:
        
                    System.out.print("Ingrese tamaño del arreglo: ");
                    int tam = scanner.nextInt();

                    int[] arr = new int[tam];
                    for (int i = 0; i < tam; i++) 
                        
                    {
                        
                            System.out.print("Arreglo[" + i + "]: ");    
                            arr[i] = scanner.nextInt();
                    
                    }
                    
                    System.out.println("Resultado: " + sumarArreglo(arr, tam - 1));
    
                    break;
    
                case 11:
    
                    System.out.print("Ingrese filas m: ");
                    int m11 = scanner.nextInt();

                    System.out.print("Ingrese columnas n: ");
                    int n11 = scanner.nextInt();

                    int[][] mat = new int[m11][n11];
                    for (int i = 0; i < m11; i++) 
                        
                        {

                        for (int j = 0; j < n11; j++) 
                            
                            {
                            
                            System.out.print("Matriz[" + i + "][" + j + "]: ");

                            mat[i][j] = scanner.nextInt();

                        }

                    }

                    System.out.println("Resultado: " + sumarMatriz(mat, m11 - 1, n11 - 1, n11));

                    break;

                case 12:
 
                    System.out.print("Ingrese límite de Fibonacci: ");
                    int lim = scanner.nextInt();

                    System.out.print("Serie: ");
                    imprimirFibonacci(lim, 0);

                    System.out.println();
                   
                    break;
                
                case 13:
                
                    System.out.print("Ingrese m: ");
                    int m13 = scanner.nextInt();

                    System.out.print("Ingrese n: ");
                    int n13 = scanner.nextInt();

                    System.out.println("Resultado: " + ackermann(m13, n13));
                 
                    break;
                
                case 0:
                
                    System.out.println("Saliendo...");
                    break;
                
                default:
            
                    System.out.println("Opción no válida.");
            
            }
        } 
        
            while (opcion != 0);
    }

    //Factorial
    
    public static int factorial(int n) 
    {
      
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    
    }

    //Sumatoria hasta n

    public static int sumatoria(int n) 
    {
   
        if (n <= 0) return 0;
        return n + sumatoria(n - 1);
   
    }

    //Sumatoria armónica 

    public static double sumatoriaArmonica(int n) 
    {
       
        if (n <= 1) return 1.0;
        return (1.0 / n) + sumatoriaArmonica(n - 1);
    
    }

    //Invertir número

    public static int invertirNumero(int n, int acum) 
    
    {
       
        if (n == 0) return acum;
        return invertirNumero(n / 10, acum * 10 + (n % 10));
    
    }

    //Sumar dígitos de un número

    public static int sumarDigitos(int n) 
    
    {
     
        if (n == 0) return 0;
        return (n % 10) + sumarDigitos(n / 10);
    
    }

    //Potencia 

    public static int potencia(int base, int exp) 
    {
    
        if (exp == 0) return 1;
        return base * potencia(base, exp - 1);

    }

    //Algoritmo de Euclides

    public static int mcd(int m, int n) 
    {
        
        if (n == 0) return m;
        return mcd(n, m % n);
    
    }

    //División por restas sucesivas

    public static int divisionRestas(int dividendo, int divisor) 
    {
        
        if (dividendo < divisor) return 0;
        return 1 + divisionRestas(dividendo - divisor, divisor);

    }

    //Multiplicación por sumas sucesivas

    public static int multiplicacionSumas(int a, int b) 
    {
        
        if (b == 0) return 0;
        return a + multiplicacionSumas(a, b - 1);

    }

    //Sumar elementos de un arreglo

    public static int sumarArreglo(int[] arr, int pos) 
    {
        
        if (pos < 0) return 0;
        return arr[pos] + sumarArreglo(arr, pos - 1);
        
    }

    //Suma elementos de una matriz

    public static int sumarMatriz(int[][] mat, int i, int j, int cols) 
    
    {

        if (i < 0) return 0;
        if (j < 0) return sumarMatriz(mat, i - 1, cols - 1, cols);
        return mat[i][j] + sumarMatriz(mat, i, j - 1, cols);
    
    }

    //Fibonacci

    public static int fibonacci(int n) 
    
    {
    
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    
    }

    public static void imprimirFibonacci(int limite, int pos) 
    
    {
    
        if (pos > limite) return;
        System.out.print(fibonacci(pos) + " ");
        imprimirFibonacci(limite, pos + 1);
    
    }

    //Ackermann

    public static int ackermann(int m, int n) 
    
    {
    
        if (m == 0) return n + 1;
        if (m > 0 && n == 0) return ackermann(m - 1, 1);
        return ackermann(m - 1, ackermann(m, n - 1));
    
    }
}