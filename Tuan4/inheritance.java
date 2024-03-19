package Tuan4;

import java.util.Scanner;

public class inheritance {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Employee emp= new Employee("Trung","20","Ba Vi",20000000);
        emp.outPut();
        System.out.println("Yeu cau 2:");

        Employee emp2=new Employee();
        emp2.inPut();
        emp2.outPut();
    }

}
