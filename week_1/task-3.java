import java.util.Scanner;

class Task3{
    public static void main(String[] arg){
        System.out.println("Введите сторонe додекаэдра: "); //Вводим длину стороны
        Scanner sc = new Scanner(System.in); 
        
        int lenght = sc.nextInt(); // Считываем введенное значение

        Double Ans = ((15 + 7 * Math.sqrt(5)) / 4 * Math.pow(lenght, 3)); // Вычисляем объем
        System.out.println("Объем додекаэдра: " + Ans);
    }
}
