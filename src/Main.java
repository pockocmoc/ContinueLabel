/*
  Оператор continue может содержать метку объемлющего цикла, который требуется продолжить.
  Ниже приведён пример программы,в которой оператор continue применяется
  для вывода треугольной таблицы умножения чисел от 0 до 9.
 */
public class Main {
    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j > i) {
                    System.out.println();
                continue outer;

            }
            System.out.print(" " + (i * j));

        }

    }
    System.out.println();
}
}