import java.util.Scanner;

class Taks1{
    public static void main(String[] args){
        Scanner newObj = new Scanner(System.in);
        System.out.println("Введите ваше имя"); //User вводит свое имя

        String username = newObj.nextLine();
        System.out.println("Hello, " + username); //Вывод приветствия User'а
    }
}
