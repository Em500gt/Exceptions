try {
   int d = 0;
   double catchedRes1 = intArray[7] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}

Индекс 8 является недопустимым для входного массива intArray. Индексы массива начинаются с 0, поэтому индекс 8 находится за пределами допустимого диапазона.
Здесь мы используем индекс 7 вместо 8, так как последний элемент массива имеет индекс 7.