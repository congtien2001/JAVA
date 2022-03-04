/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt4;
import java.util.Scanner;
/**
 *
 * @author quang
 */
public class cau1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Nhap a : ");
            byte a = input.nextByte();
            System.out.print("Nhap b : ");
            byte b = input.nextByte();

            System.out.println("a + b = " + (a+b));
            System.out.println("a - b = " + (a-b));
            System.out.println("a * b = " + (a*b));
            System.out.println("a / b = " + (a/b));
            System.out.println("a % b = " + (a%b));
            System.out.println("a^b = " + (Math.pow(a,b)));

        } catch(Exception e) {
            System.out.print(e);
        }

    }
    
}