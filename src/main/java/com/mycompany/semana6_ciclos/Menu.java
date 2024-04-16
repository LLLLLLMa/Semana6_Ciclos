/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana6_ciclos;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author lianm
 */
public class Menu {
    private Scanner leer;
    private Funciones funciones;
    
    public Menu()
    {
        leer = new Scanner(System.in);
        funciones = new Funciones();
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public Funciones getFunciones() {
        return funciones;
    }

    public void setFunciones(Funciones funciones) {
        this.funciones = funciones;
    }
    
    public void MostrarOpciones()
    {
        System.out.println("======  MENU  ======");
        System.out.println("0....Salir | 1....Convertir Centimetros | 2....Numeros 1-10");
        System.out.println("3....Suma Numeros 1-10 | 4....Par o Impar | 5....Promedio 30");
        System.out.println("6....Pares 1-20 | 7....Suma Pares 1-400 | 8....Area Circulo");
        System.out.println("9....Perimetro Circulo | 10....Area Rectangulo | 11....Volumen Esfera");
        System.out.println("12....Area Perimetro Cubo | 13....1-100 Sin Multiplos 3 | 14....1-100 Sin Multiplos 5");
        System.out.println("15....1-100 Sin Multiplos 3-5 | 16....1-100 Cuek Multiplos 3 | 17....Factorial");
        System.out.println("18....Cantidad Digitos | 19....Area Perimetro Cuadrado | 20....Potencia");
        System.out.println("======  FIN MENU  ======\n");
        int opcion = ValidarOpcion();
        MostrarFuncion(opcion);
    }
    
    private void MostrarFuncion(int opcion)
    {
        boolean salir = false;
        switch(opcion)
        {
            case 0:
                System.out.println("Saliendo del programa...");
                salir = true;
                break;
            case 1:
                funciones.Centimetros();
                break;
            case 2:
                funciones.Numeros10();
                break;
            case 3:
                funciones.Suma10();
                break;
            case 4:
                funciones.Par();
                break;
            case 5:
                funciones.Promedio30();
                break;
            case 6:
                funciones.Pares20();
                break;
            case 7:
                funciones.SumaImpares400();
                break;
            case 8:
                funciones.AreaCirculo();
                break;
            case 9:
                funciones.PerimetroCirculo();
                break;
            case 10:
                funciones.AreaRectangulo();
                break;
            case 11:
                funciones.VolumenEsfera();
                break;
            case 12:
                funciones.AreaPerimetroCubo();
                break;
            case 13:
                funciones.SaltarMultiplos3();
                break;
            case 14:
                funciones.SaltarMultiplos5();
                break;
            case 15:
                funciones.SaltarMultiplos3y5();
                break;
            case 16:
                funciones.CuekMultiplos3();
                break;
            case 17:
                funciones.Factorial();
                break;
            case 18:
                funciones.ContarDigitos();
                break;
            case 19:
                funciones.AreaPerimetroCuadrado();
                break;
            case 20:
                funciones.Potencia();
                break;
        }
        if (!salir)
        {
            MostrarOpciones();
        }
    }
    
    private int ValidarOpcion()
    {
        boolean continuar = true;
        int num = 0;
        System.out.println("Ingrese el numero correspondiente a la opcion deseada");
        while (continuar)
        {
            try
            {
                num = leer.nextInt();
                while (num < 0 || num > 20)
                {
                    System.out.println("####Error, esa opcion no es valida, ingrese un numero del 0 al 20 ####");
                    System.out.println("Vuelva a ingresar");
                    num = leer.nextInt();
                }
                continuar = false;
            }
            catch (InputMismatchException ex)
            {
                leer.next();
                continuar = true;
                System.out.println("####Error, debe ingresar un numero entero####");
                System.out.println("Vuelva a ingresar");
            }
        }
        return num;
    }
}
