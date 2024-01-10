import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Введите число: ");
int number = scanner.nextInt();

if (number > 7) {
System.out.println("Привет");
}

scanner.close();
}
}

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Введите имя: ");
String name = scanner.nextLine();

if ("Вячеслав".equals(name)) {
System.out.println("Привет, Вячеслав");
} else {
System.out.println("Нет такого имени");
}

scanner.close();
}
}

public class Main {
    public static void main(String[] args) {
    int[] array = {1, 3, 6, 9, 12, 15, 18};
    
    System.out.println("Элементы массива, кратные 3:");
    
    for (int element : array) {
    if (element % 3 == 0) {
    System.out.println(element);
    }
    }
    }
    }
//Данная скобочная последовательность "[((())()(())]]" не является правильной.
//Чтобы сделать эту последовательность правильной, 
//необходимо изменить расположение скобок.
//Открывающиеся и закрывающиеся скобки должны совпадать по количеству и быть правильно упорядочены.
