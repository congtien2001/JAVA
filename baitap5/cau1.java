/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap5;
import java.util.Scanner;

/**
 *
 * @author Storm
 */
public class cau1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Nhap a : ");
            double a = input.nextDouble();
            System.out.print("Nhap b : ");
            double b = input.nextDouble();
            
                if(a==0) {
                    if(b==0) {
                        System.out.println("PT vo so nghiem");
                    }
                    if(b!=0) {
                        System.out.println("PT vo nghiem");
                    }
                }
                if(a!=0) {
                    System.out.println("PT co nghiem la : x =" + (-b/a));
                }
                
        } catch(Exception e) {
            System.out.print(e);
        }
    }
}