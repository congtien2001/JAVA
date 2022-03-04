/*câu 4-2
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap42;
import java.util.Scanner;
/**
 *
 * @author Storm
 */
public class cau2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Nhap a : ");
            int a = input.nextInt();
            System.out.print("Nhap b : ");
            int b = input.nextInt();

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
