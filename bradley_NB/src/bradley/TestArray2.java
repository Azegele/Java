/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bradley;

import java.util.Scanner;

/**
 *
 * @author AzegeleBradley
 */
public class TestArray2 {

    double salary[];
    int n;
    public void getsalaries(){
        Scanner obj = new Scanner(System.in);
        System.out.println("How many employees");
        n=obj.nextInt();
        salary=new double[n];
        
        System.out.println("Enter salaries now");
        for(int i=0; i<salary.length;i++)
            salary[i]=obj.nextDouble();
        
        increment(salary);
        for(double x:salary)
            System.out.println(x);
    }
    public static void main(String[] args){
        
    }
    private void increment(double[] salary2){
        for(int i=0; i<salary2.length;i++)
            salary2[i]=salary2[i]*1.15;
    }
    
}
