import java.util.Scanner;

public class Menu {

    public static String mainMenu() {
        Scanner in = new Scanner(System.in);
        System.out.println("1- Добавить работника");
        System.out.println("2- Изменить отдел");
        System.out.println("3- показать список работников");

        System.out.println(". ".repeat(25));
        System.out.println("Выберите действие: ");
        int input = in.nextInt();

        switch (input) {
            case 1:
                String FIO;
                String Sex;
                int Age;
                System.out.println("-".repeat(25));
                System.out.println("ФИО работника: ");
                FIO = in.nextLine();
                System.out.println("ПОЛ работника: ");
                Sex = in.nextLine();
                System.out.println("Возраст работника: ");
                Age = in.nextInt();
                Persona p = new Persona(FIO, Sex, Age);
                p.Display();
                break;
            case 2:
                String persona;
                String group;
                System.out.println("ФИО работника: ");
                persona = in.nextLine();
                Scanner in1 = new Scanner(System.in);
                System.out.println("Хотите перейти в другой отдел?:");
                System.out.println("0 - НЕТ\n1 - ДА");
                int answer = in.nextInt();

                if (answer == 0) {
                    System.out.println("Хорошо");
                }
                if (answer == 1) {
                    System.out.println("В какой отдел желаете перейти?");
                    System.out.println("IT\nLogistics\nFinance");
                }
                String answer1 = in.next();
                break;
        }
        return null;
    }
}




