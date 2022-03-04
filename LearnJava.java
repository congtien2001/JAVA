/*cau4
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learnjava;
import java.util.Scanner;
/**
 *
 * @author Storm
 */
public class LearnJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double c;
        try 
        {
            System.out.print("Nhap ban kinh : ");
            double r = input.nextDouble();
            c = 2*r*3.1415;
            System.out.print(c);
        } catch(Exception e) {
            System.out.print(e);
        }

    }
    
}