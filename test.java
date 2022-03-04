package baitap6;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Nhap he so bac 2, a : ");
            double a = input.nextDouble();
            System.out.print("Nhap he so bac 1, b : ");
            double b = input.nextDouble();
            System.out.print("Nhap hang so tu do c : ");
            double c = input.nextDouble();
            
            if(a==0) {
                    if(b==0) {
                        if(c==0) {
                            System.out.println("PT vo so nghiem");
                        }
                        else {
                            System.out.println("PT co nghiem la x = " + c);
                        }
                    }
                    else {
                        System.out.println("PT co nghiem la x = " + -b/c);
                    }
            }
            
            else 
            {
                double delta = (b*b) - (4*a*c);
                double x = (-b)/2*a;
                double x1 = (-b + Math.sqrt(delta))/(2*a);
                double x2 = (-b - Math.sqrt(delta))/(2*a);

                if(delta > 0) 
                {
                    System.out.println("PT co nghiem la:");
                    System.out.println("x = " + x1);
                    System.out.println("x = " + x2);
                }

                if(delta < 0) 
                {
                    System.out.println("PT vo nghiem");
                }

                if(delta == 0) 
                {
                    System.out.println("PT co nghiem kep la x = " + x);
                }
            }
        }
        
        catch(Exception e) 
        {
            System.out.println("Nhap khong hop le");
        }
    }
}