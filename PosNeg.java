/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Sanghavi
 */
public class PosNeg {
    public static void main(String[] args) {
        int i,n;
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n>0)
        {
            System.out.println("it is positive");}
        else if(n==0){
            System.out.println("it is zero");}
        else if(n<0){
           System.out.println("it is negative");
    }
}
}
