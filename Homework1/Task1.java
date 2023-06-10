public class Task1 {
    public static void main(String[] args) {
      //divide(10, 0);
      //printLength(null);
    }
    
    public static void printLength(String str) {
        if(str == null) {
            throw new NullPointerException("Строка не может быть null");
        }
        System.out.println("Длина строки: " + str.length());
    }

    public static void divide(int a, int b) {
        if(b == 0) {
            throw new ArithmeticException("Делитель не может быть равен нулю");
        }
        int result = a / b;
        System.out.println("Результат деления: " + result);
    }

    public static void accessArrayElement(int[] arr, int index) {
        if(index < 0 || index >= arr.length) {
            throw new ArrayIndexOutOfBoundsException("Индекс массива выходит за пределы допустимых значений");
        }
        System.out.println("Элемент массива: " + arr[index]);
    }
}