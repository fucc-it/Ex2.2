import java.util.Scanner;

public class Louader {
    public static void main(String[] args) {

        Dog dogs1 = new Dog("Sobaka", 1);
        Dog dogs2 = new Dog("Kolobaka", 10);
        Dog dogs3 = new Dog("Vlad A4 Sinkevich", 12);

        Scanner in = new Scanner(System.in);

        System.out.println("Информация о собаках: ");
        System.out.println(dogs1.toString() + "\n" + dogs2.toString() + "\n" +dogs3.toString());
        System.out.println("Введите информацию о собаке №3: ");
        String name = in.nextLine();
        dogs3.setName(name);
        int age = in.nextInt();
        dogs3.setAge(age);
        System.out.println("Измененная информация о собаках: ");
        System.out.println(dogs1.toString() + "\n" + dogs2.toString() + "\n" +dogs3.toString());

    }
}
