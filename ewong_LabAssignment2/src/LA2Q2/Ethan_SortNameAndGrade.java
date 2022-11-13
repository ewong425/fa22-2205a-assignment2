package LA2Q2;

import java.util.Collections;
import java.util.Vector;

public class Ethan_SortNameAndGrade {
    public static void main(String[] args) {
        header(2,2);
        //creating firstname, lastname, and grade arrays
        String[] fnArray = {"Hermione", "Ron", "Harry", "Luna", "Ginny", "Draco", "Dean", "Fred"};
        String[] lnArray = {"Granger", "Weasley", "Potter", "Lovegood", "Weasley", "Malfoy", "Thomas", "Weasley"};
        Integer[] grd = {(int)(60 + Math.random()*26),(int)(60 +
                Math.random()*26),(int)(60 + Math.random()*26),(int)(60 +
                Math.random()*26),(int)(60 + Math.random()*26),(int)(60 +
                Math.random()*26),(int)(60 + Math.random()*26),(int)(60 +
                Math.random()*26)};
        //creating a new vector that store StudentGrade objects
        Vector<StudentGrade> sg = new Vector<>();
        //populating the Vector
        for(int i = 0; i < fnArray.length; i++) {
            sg.add(i, new StudentGrade(fnArray[i], lnArray[i], grd[i]));
        }
        //Sorting with collections sort
        System.out.println("Unsorted Array.....");
        System.out.println(sg.toString() + "\b");
        //sorted array with collections sort
        System.out.println("Sorted by Grades.....");
        Collections.sort(sg);
        System.out.println(sg.toString() + "\b");
        //creating new StudentGrade array
        StudentGrade[] studentArray = new StudentGrade[fnArray.length];
        StudentGrade[] studentArray2 = new StudentGrade[fnArray.length];
        //copying the StudentGrade array with elements from the Vector list
        sg.copyInto(studentArray);
        sg.copyInto(studentArray2);
        //sorting with insertion sort based on first names
        System.out.println("Sorted by First Names.....");
        insertionSort(studentArray, 1);
        //print sorted list
        printArray(studentArray);
        //sorting based on last names
        System.out.println();
        System.out.println("Sorted by Last Names.....");
        insertionSort(studentArray, 2);
        printArray(studentArray);
        footer(2,2);
    }
    public static void insertionSort(StudentGrade[] gradeArray, int key) {
        int n = gradeArray.length;
        //sort by first name
        if(key == 1) {
            for(int i = 1; i < n; i++) {
                StudentGrade k = gradeArray[i];
                int j = i - 1;
                while (j >= 0 && gradeArray[j].getFirst().compareTo(k.getFirst()) > 0) { //comparing first names of the key and the ith grade array
                    gradeArray[j+1] = gradeArray[j];
                    j = j - 1;
                }
                gradeArray[j+1] = k;
            }
        }
        //sort by last name
        if(key == 2) {
            for(int i = 1; i< n; i++) {
                StudentGrade k = gradeArray[i];
                for(int j = i - 1; j>=0 && gradeArray[j].getLast().compareTo(k.getLast()) > 0; j--) { //comparing the last name of the key and the ith grade array
                    gradeArray[j+1] = gradeArray[j];
                    gradeArray[j] = k;
                }
            }
        }
    }
    public static void printArray(StudentGrade[] arr) {
        int n = arr.length;
        for (int i = 0; i< n; i++) { //loops over the array and prints each element
            System.out.print(arr[i] + " ");
        }
    }
    public static void header(int n, int q) {
        System.out.println("Lab Assignment " + n + ", Q" + q);
        System.out.println("Prepared by: Ethan Wong");
        System.out.println("Student Number: 251205049");
        System.out.println("Goal: To see the time that it takes");
        System.out.println("=============================================");
    }
    public static void footer(int n, int q) {
        int lab = n;
        System.out.println("=============================================");
        System.out.println("Completion of Lab Assignment " + n + ", Q" + q + " is successful!");
        System.out.println("Signing off -Ethan ");
    }

}
