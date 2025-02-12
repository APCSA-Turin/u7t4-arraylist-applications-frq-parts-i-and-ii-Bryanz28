package com.example.project.Student;

import java.util.ArrayList;

public class Utility {

    public static ArrayList<Student> sortStudents(ArrayList<Student> list) {
 
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (compareStudents(list.get(j), list.get(j + 1)) > 0) {
                
                    Student temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        return list;
    }

    private static int compareStudents(Student s1, Student s2) {
        int lastNameCompare = s1.getLastName().compareTo(s2.getLastName());
        if (lastNameCompare != 0) {
            return lastNameCompare;
        }

        int firstNameCompare = s1.getFirstName().compareTo(s2.getFirstName());
        if (firstNameCompare != 0) {
            return firstNameCompare;
        }

      
        return Double.compare(s2.getGpa(), s1.getGpa());

    }
}
