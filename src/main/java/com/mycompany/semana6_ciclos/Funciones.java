/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana6_ciclos;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author pclab0.pc24
 */
public class Funciones {
    
    private static Scanner leer;
    
    public Funciones() {
        leer = new Scanner(System.in);
    }

    public static Scanner getLeer() {
        return leer;
    }

    public static void setLeer(Scanner leer) {
        Funciones.leer = leer;
    }
    
    public void Centimetros()
    {
        boolean continuar = true;
        while (continuar) {
            System.out.println("Ingrese la cantidad de centimetros que quiere convertir: ");
            int centimetros = ValidarEntero();
            int centimetrosOriginales = centimetros;

            int kilometros = centimetros / 100000;
            centimetros %= 100000;
            
            int metros = centimetros / 100;
            centimetros %= 100;

            System.out.println("========== RESULTADO FUNCION =========");
            System.out.println(centimetrosOriginales + " centimetros son " + kilometros + " kilometros, " + metros + " metros y " + centimetros + " centimetros.");
            continuar = Continuar();
        }
    }
    
    public void Numeros10()
    {
        System.out.println("========== RESULTADO FUNCION =========");
        int i = 1;
        while (i <= 10)
        {
            System.out.println(i + " ");
            i++;
        }
    }
    
    public void Suma10()
    {
        System.out.println("========== RESULTADO FUNCION =========");
        int i = 1;
        int suma = 0;
        while (i <= 10)
        {
            suma += i;
            i++;
        }
        System.out.println(suma);
    }
    
    public void Par()
    {
        boolean continuar = true;
        while (continuar) {
            int numero = ValidarEntero();
            System.out.println("========== RESULTADO FUNCION =========");
            if (numero % 2 == 0)
            {
                System.out.println("El numero ingresado es par");
            }
            else
            {
                System.out.println("El numero ingresado es impar");
            }
            continuar = Continuar();
        }
    }
    
    public void Promedio30()
    {
        double suma = 0;
        for (int i = 0; i < 30; i++)
        {
            int num = ValidarEntero();
            suma += num;
        }
        System.out.println("========== RESULTADO FUNCION =========");
        System.out.println("El promedio de sus numero es: " + suma/30);
    }
    
    public void Pares20()
    {
        System.out.println("========== RESULTADO FUNCION =========");
        int i = 1;
        while (i <= 20)
        {
            if (i % 2 == 0)
            {
                System.out.println(i);
            }
            i++;
        }
    }
    
    public void SumaImpares400()
    {
        int suma = 0;
        int i = 1;
        while (i <= 400)
        {
            if (i % 2 != 0)
            {
                suma += i;
            }
            i++;
        }
        System.out.println("========== RESULTADO FUNCION =========");
        System.out.println("La suma de los numeros impares de 1 al 400 es " + suma);
    }
    
    public void AreaCirculo()
    {
        boolean continuar = true;
        while (continuar) {
            System.out.println("Ingrese el radio del circulo ");
            double radio = ValidarNumeroPositivo();
            double area = radio * radio * Math.PI;
            System.out.println("========== RESULTADO FUNCION =========");
            System.out.println("El area del circulo de radio " + radio + " es " + area);
            continuar = Continuar();
        }
    }
    
    public void PerimetroCirculo()
    {
        boolean continuar = true;
        while (continuar) {
            System.out.println("Ingrese el radio del circulo ");
            double radio = ValidarNumeroPositivo();
            double perimetro = 2 * Math.PI * radio;
            System.out.println("========== RESULTADO FUNCION =========");
            System.out.println("El perimetro del circulo de radio " + radio + " es " + perimetro);
            continuar = Continuar();
        }
    }
    
    public void AreaRectangulo()
    {
        boolean continuar = true;
        while (continuar) {
            System.out.println("Ingrese el lado 1 del rectangulo");
            double lado1 = ValidarNumeroPositivo();
            System.out.println("Ingrese el lado 2 del rectangulo");
            double lado2 = ValidarNumeroPositivo();
            double area = lado1 * lado2;
            System.out.println("========== RESULTADO FUNCION =========");
            System.out.println("El area del rectangulo de lados " + lado1 + " y " + lado2 + " es " + area);
            continuar = Continuar();
        }
    }
    
    public void VolumenEsfera()
    {
        boolean continuar = true;
        while (continuar) {
            System.out.println("Ingrese el radio de la esfera ");
            double radio = ValidarNumeroPositivo();
            double volumen = (Math.PI * (radio * radio * radio) * 4) / 3;
            System.out.println("========== RESULTADO FUNCION =========");
            System.out.println("El volumen de la esfera de radio " + radio + " es " + volumen);
            continuar = Continuar();
        }
    }
    
    public void AreaPerimetroCubo()
    {
        boolean continuar = true;
        while (continuar) {
            System.out.println("Ingrese la longitud del cubo");
            double longitud = ValidarNumeroPositivo();
            double perimetro = 12 * longitud;
            double area = longitud * longitud * longitud;
            System.out.println("========== RESULTADO FUNCION =========");
            System.out.println("El area del cubo de longitud " + longitud + " es " + area + " y su perimetro es " + perimetro);
            continuar = Continuar();
        }
    }
    
    public void SaltarMultiplos3()
    {
        System.out.println("========== RESULTADO FUNCION =========");
        for (int i = 1; i <= 100; i++)
        {
            if (i % 3 != 0)
            {
                System.out.println(i);
            }
        }
    }
    
    public void SaltarMultiplos5()
    {
        System.out.println("========== RESULTADO FUNCION =========");
        for (int i = 1; i <= 100; i++)
        {
            if (i % 5 != 0)
            {
                System.out.println(i);
            }
        }
    }
    
    public void SaltarMultiplos3y5()
    {
        System.out.println("========== RESULTADO FUNCION =========");
        for (int i = 1; i <= 100; i++)
        {
            if (i % 3 != 0 && i % 5 != 0)
            {
                System.out.println(i);
            }
        }
    }
    
    public void CuekMultiplos3()
    {
        System.out.println("========== RESULTADO FUNCION =========");
        for (int i = 1; i <= 100; i++)
        {
            if (i % 3 != 0)
            {
                System.out.println(i);
            }
            else
            {
                System.out.println("Cuek");
            }
        }
    }
    
    public void Factorial()
    {
        boolean continuar = true;
        while (continuar) {
            int fact = 1;
            System.out.println("Ingrese un numero para calcular su factorial: ");
            int num = (int) Math.round(ValidarNumeroPositivo());
            for (int i = 1; i <= num; i++)
            {
                fact *= i;
            }
            System.out.println("========== RESULTADO FUNCION =========");
            System.out.println("El factorial de " + num + " es " + fact);
            continuar = Continuar();
        }
    }
    
    public void ContarDigitos()
    {
        boolean continuar = true;
        while (continuar)
        {
            System.out.println("Ingrese un numero para contar sus digitos");
            int num = ValidarEntero();
            int digitos = 0;
            while (num > 0)
            {
                num /= 10;
                digitos++;
            }
            System.out.println("========== RESULTADO FUNCION =========");
            System.out.println("La cantidad de digitos de su numero es: " + digitos);
            continuar = Continuar();
        }
    }
    
    public void AreaPerimetroCuadrado()
    {
        boolean continuar = true;
        while (continuar) {
            System.out.println("Ingrese la longitud del cuadrado");
            double longitud = ValidarNumeroPositivo();
            double perimetro = 4 * longitud;
            double area = longitud * longitud;
            System.out.println("========== RESULTADO FUNCION =========");
            System.out.println("El area del cuadrado de longitud " + longitud + " es " + area + " y su perimetro es " + perimetro);
            continuar = Continuar();
        }
    }
    
    public void Potencia()
    {
        boolean continuar = true;
        while (continuar)
        {
            System.out.println("Ingrese la base");
            int base = ValidarEnteroPositivo();
            System.out.println("Ingrese el exponente");
            int exponente = ValidarEnteroPositivo();
            int potencia = 1;
            for (int i = 0; i < exponente; i++)
            {
                potencia *= base;
            }
            System.out.println("========== RESULTADO FUNCION =========");
            System.out.println(base + " elevado a " + exponente + " es " + potencia);
            continuar = Continuar();
        }
    }
    
    //Funciones recurrentes para validar numeros y continuar con una funcion.
    private boolean Continuar()
    {
        System.out.println("¿Desea continuar con esta funcion?");
        System.out.println("Si no desea continuar ingrese 'N' o 'No', cualquier otro sera considerado como que SI desea continuar con la funcion");
        String continuar = leer.next();
        return !(continuar.toLowerCase().equals("no") || continuar.toLowerCase().equals("n"));
    }
    
    private int ValidarEntero()
    {
        boolean continuar = true;
        int num = 0;
        while (continuar)
        {
            try {
                System.out.println("Ingrese su numero");
                num = leer.nextInt();
                continuar = false;
            }
            catch (InputMismatchException ex){
                leer.next();
                continuar = true;
                System.out.println("####Error, debe ingresar un numero entero####");
                System.out.println("Vuelva a ingresar el numero");
            }
        }
        return num;
    }
    
    private int ValidarEnteroPositivo()
    {
        boolean continuar = true;
        int num = 0;
        System.out.println("Ingrese su numero, debe ser un entero positivo");
        while (continuar)
        {
            try {
                num = leer.nextInt();
                while (num < 0){
                    System.out.println("####Error, ingrese un numero positivo####");
                    System.out.println("Vuelva a ingresar el numero");
                    num = leer.nextInt();
                }
                continuar = false;
            }
            catch (InputMismatchException ex){
                leer.next();
                continuar = true;
                System.out.println("####Error, debe ingresar un numero entero####");
                System.out.println("Vuelva a ingresar el numero");
            }
        }
        return num;
    }
    
    private double ValidarNumeroPositivo()
    {
        boolean continuar = true;
        double num = 0;
        System.out.println("Ingrese su numero, este debe ser positivo");
        while (continuar)
        {
            try {
                num = leer.nextDouble();
                while (num < 0)
                {
                    System.out.println("####Error, su numero debe ser positivo####");
                    System.out.println("Vuelva a ingresar el numero");
                    num = leer.nextDouble();
                }
                continuar = false;
            }
            catch (InputMismatchException ex){
                leer.next();
                continuar = true;
                System.out.println("####Error, debe ingresar un numero entero o con decimales (Separados por .) ####");
                System.out.println("Vuelva a ingresar el numero");
            }
        }
        return num;
    }
}
