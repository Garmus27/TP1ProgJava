import javax.swing.*;
import java.awt.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int ejercicio = 14;

        if (ejercicio == 1) {
            Scanner sc = new Scanner(System.in);
            System.out.print("ingresa tu nombre");
            String nombre = sc.nextLine();
            System.out.print("Bienvenido " + nombre);

        } else if (ejercicio == 2) {

            String nombre = JOptionPane.showInputDialog("Ingresa tu nombre");
            System.out.print("Bienvenido " + nombre);
        } else if (ejercicio == 3) {
            int num1 = 9;
            int num2 = 4;
            System.out.println("suma: " + (num1 + num2));
            System.out.println("resta: " + (num1 - num2));
            System.out.println("mulitplicacion: " + (num1 * num2));
            System.out.println("division: " + (num1 / num2));
            System.out.println("resto: " + (num1 % num2));
        } else if (ejercicio == 4) {
            int num1 = 25;
            int num2 = 25;
            if (num1 == num2) {
                System.out.println("Los numeros " + num1 + " y " + num2 + " son iguales");

            } else if (num1 < num2) {
                System.out.println("El numero " + num2 + " es mas grande que el numero " + num1);
            } else if (num1 > num2) {
                System.out.println("El numero " + num1 + " es mayor que el numero " + num2);
            }
        } else if (ejercicio == 5) {
            int num = Integer.parseInt(JOptionPane.showInputDialog(" ingrese un numero entero"));
            if (num % 2 == 0) {

                System.out.println("El numero " + num + " es par");
            } else {
                System.out.println("El numero " + num + " es impar");
            }
        } else if (ejercicio == 6) {
            double iva = (double) 21 / 100;
            double precio = Double.parseDouble(JOptionPane.showInputDialog(" ingrese el precio del producto"));
            double precioFinal = precio + (precio * iva);

            System.out.println("precio final del articulo adicionando el IVA es de : " + precioFinal);
        } else if (ejercicio == 7) {
            int num = 0;
            while (num <= 100) {
                System.out.print(num + " , ");
                num++;
            }
        } else if (ejercicio == 8) {
            for (int cont = 0; cont <= 100; cont++) {
                System.out.print(cont + " , ");
            }
        } else if (ejercicio == 9) {
            for (int cont = 0; cont <= 100; cont++) {
                if (cont % 2 == 0 || cont % 3 == 0) {
                    System.out.print(cont + " , ");

                }
            }

        } else if (ejercicio == 10) {
            int num=Integer.parseInt(JOptionPane.showInputDialog("porfavor ingresa un numero"));
            while (num<0){
                System.out.println("El numero es invalido, porfavor ingresa un numero mayor o igual a 0");
                num=Integer.parseInt(JOptionPane.showInputDialog("porfavor ingresa un numero"));
            }
        }else if (ejercicio == 11) {
            boolean valido= false;
            int intentos =0;
            String userPass = "salsa123567";

             while(intentos<3){
                 String pass=JOptionPane.showInputDialog("Porfavor ingrese su password");
                 if(userPass.equals(pass)){
                     System.out.println("Bienvenido puton!");
                     break;

                 }else{
                     System.out.println("password incorrecte, intente de nuevo");
                     intentos=intentos+1;
                     if(intentos==3){
                         System.out.println("Llegaste al limite de intentos, chupate mansa");
                     }

                 }

             }
        }else if (ejercicio == 12) {
            String dia = JOptionPane.showInputDialog(" por favor ingrese un dia de la semana");
            switch (dia){
                case "lunes":
                    System.out.println("El dia lunes es un dia laboral");
                    break;
                case "martes":
                    System.out.println("El dia martes es un dia laboral");
                    break;
                case "miercoles":
                    System.out.println("El dia miercoles es un dia laboral");
                    break;
                case "jueves":
                    System.out.println("El dia jueves es un dia laboral");
                    break;
                case "viernes":
                    System.out.println("El dia viernes es un dia laboral");
                    break;
                case "sabado":
                    System.out.println("El dia sabado no es un dia laboral");
                    break;
                case "domingo":
                    System.out.println("El dia domingo no es un dia laboral");
                    break;
                default:
                    System.out.println("Te pedi que ingresaras un dia e ingresaste cualquier wea");
            }
        }else if (ejercicio == 13) {
            int num= Integer.parseInt(JOptionPane.showInputDialog("porfavor ingresa un numero"));
            int x=0;

            for(int i=1 ; i<=num ; i++){
                if (num%i==0){
                    x= x + 1;
                }
            }
            if(x<3){
                System.out.println("El numero  "+num+" es un numero primo");
            }else
                System.out.println("El numero  "+num+" NO es un numero primo");
        }else if (ejercicio == 14) {
            int num= (int) (Math.random() * 100) + 1;
            boolean encontrado= false;
            int intentos= 0;
            while (!encontrado){
                int num2=Integer.parseInt(JOptionPane.showInputDialog(" Por favor ingrese un numero"));
                intentos=intentos+1;
                if (num2<num){
                    System.out.println("El numero ingresado es bajo");
                } else if (num2>num) {
                    System.out.println("El numero ingresado es alto");
                }else {
                    System.out.println("Felicitaciones has encontrado el numero");
                    System.out.println("Cantidad de intentos: "+intentos);
                    encontrado=true;
                }

            }



        }
    }
}
