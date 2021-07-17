package com.bl.programs;

import java.util.Date;
import java.util.Scanner;

public class DeadLine {
    private static Object Date;
    Scanner scanner;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Task");
        int num = scanner.nextInt();
        taskAssign(num);
        //completeTask();
    }

    private static void taskAssign(int num) {
        for (int i=0;i<num;i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the task::");
            String task = scanner.next();
            Date d1 = new Date(2323223232L);
            System.out.println("Task::" +task+ "   Deadline to complete task::" +d1);
            completedTask();
        }
    }

    private static <d1> void completedTask() {
        Date d2 = new Date();
        System.out.println("Completed date::" +d2);
    }
}
