package com.company;

public class Main {

    public static void main(String[] args) {
        Student[] IDNumber = new Student[5];
        IDNumber[0] = new Student("Lopatina Kristina", 12);
        IDNumber[1] = new Student("Lopatina Polina", 3);
        IDNumber[2] = new Student("Cheglakova Margorita", 4);
        IDNumber[3] = new Student("Kopcova Dary", 6);
        IDNumber[4] = new Student("Kolomarov Vladimir", 25);
        insertionSort(IDNumber);
        for (int i=0; i<5; i++){
            System.out.println(IDNumber[i]);
        }
    }
    static void insertionSort(Student[] array)
    {
        for (int l = 0; l < array.length; l++) {
            var value = array[l];
            int i = l - 1;
            for (; i >= 0; i--) {
                if (value.getId() < array[i].getId()) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
    }

}
