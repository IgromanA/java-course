package com.artamonov;

public class Age {
    private int age;
    String old = "";

   
    public Age(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public void getAge() {
         int rule = 11 <= (age % 100) && (age % 100) <= 14 ? age : age % 10;
         switch(rule){
            case 1:
                System.out.printf("Вам %d год\n", age);
                break;
            case 2, 3, 4:
                System.out.printf("Вам %d года\n", age);
                break;
            case 0, 5, 6, 7, 8, 9, 11, 12, 13, 14:
                System.out.printf("Вам %d лет\n", age);
                break;
        }
    }
}
