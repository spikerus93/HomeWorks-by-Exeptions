package task1;

class Answer {
    public static void arrayOutOfBoundsException() {
        // Напишите свое решение ниже
        int[] array = new int[] {1,2,3,4,5};
        int result = 0;
        for (int i = 0; i < array.length; i++)
            result += array[i];

    }

    public static void divisionByZero() {
        // Напишите свое решение ниже
        int div = 10/0;

    }

    public static void numberFormatException() {
        // Напишите свое решение ниже
        String str = "test";
        int num = Integer.parseInt (str);

    }
}
class Printer {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}
