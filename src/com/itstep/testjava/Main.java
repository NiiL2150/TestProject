package com.itstep.testjava;

import com.itstep.testjava.models.SticksGame;
import com.itstep.testjava.models.Student;
import com.itstep.testjava.models.TreeSet;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*
        Comparator<Student> comp1 = (s1, s2) -> s1.getAverageMark() - s2.getAverageMark();

        Comparator<Student> comp2 = (s1, s2) -> s1.getFirstName().compareTo(s2.getFirstName());

        Comparator<Student> comp3 = (s1, s2) -> -(s1.getLastName().compareTo(s2.getLastName()));

        ArrayList<Student> students = new ArrayList<Student>();

        students.add(new Student("Ivan", "Ivanov", 5));
        students.add(new Student("Petr", "Petrov", 4));
        students.add(new Student("Sidor", "Sidorov", 3));
        students.add(new Student("Ivan", "Sidorov", 2));
        students.add(new Student("Ivan", "Sidorov", 3));
        students.add(new Student("Ivan", "Petrov", 1));

        TreeSet<Student> treeSet = new TreeSet<>(students, comp1.thenComparing(comp2).thenComparing(comp3));

        treeSet.balance();
        System.out.println("Students sorted by average mark: " + treeSet);
        treeSet.setComparator(comp2.thenComparing(comp3).thenComparing(comp1));
        System.out.println("Students sorted by first name: " + treeSet);
        treeSet.setComparator(comp3.thenComparing(comp2).thenComparing(comp1));
        System.out.println("Students sorted by last name: " + treeSet);
        */

        /*
        Scanner sc = new Scanner(System.in);
        boolean cancel = false;
        System.out.println("Welcome to \"15 sticks game\"\nCPU will go first (in order to win)\n");
        System.out.print("Name yourself: ");
        SticksGame game = new SticksGame(sc.next());
        do {
            System.out.println("Game started!");
            game.Start();
            System.out.print("Do you want to continue? [y/N]: ");
            cancel = !sc.next().toLowerCase().equals("y");
        } while(!cancel);
        */
    }
}