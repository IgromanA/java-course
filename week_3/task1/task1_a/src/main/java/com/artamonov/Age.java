package com.artamonov;

public class Age {
    private int age;

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

    public int getAge() {
        return age;
    }
    
    public String getDeclension() {
        int rule = 11 <= (age % 100) && (age % 100) <= 14 ? age : age % 10;

        switch (rule) {
            case 1:
                return "год";
            case 2, 3, 4:
                return "года";
            default:
                return "лет";
        }
    }

    @Override
    public String toString() {
        return String.format("Вам %d %s", getAge(), getDeclension());
    }
}
