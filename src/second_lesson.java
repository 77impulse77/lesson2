
/*



*/


 public class second_lesson {
  public static void main(String[] agrs) {
    //1
    int a = 5;
    int b = 16;
    int max = 20;
    int min = 10;
   boolean flag = sum(a,b,max,min);
   System.out.println(flag);
    //2
   printNumber(0);
    //3
      boolean p = cifer(-1);
      System.out.println(p);
    //4
      printMessage2(5, "САЛЮТ");
    //5
      boolean pp = printYear(16);
      System.out.println(pp);

  }

//1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20
//(включительно), если да – вернуть true, в противном случае – false.
     public static boolean sum(int a, int b, int max, int min){
       return min <= a + b && a + b <= max;
  }

//  2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
// положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

     public static void printNumber(int number) {
         if (0 <= number) {
             System.out.println("Положительное число");
         } else if (number < 0) {
             System.out.println("отрицательное число"); /* не хочет делать вот так
                                                          if (0 <= number) {
                                                          System.out.println("Положительное число");
                                                          } else  (number < 0) {
                                                          System.out.println("отрицательное число"); */
         }
     }
// 3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
//если число отрицательное, и вернуть false если положительное.
        public static boolean cifer(int aa){
            boolean flag = aa < 0;
            return flag;

        }
//4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль
//указанную строку, указанное количество раз;

     public static void printMessage2(int count, String message){
                int counter = 0;
                while (counter < count){
                    System.out.println(message);
                    counter++;
                }
     }
//5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true,
//не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

     public static boolean printYear(int year) {
         boolean flag2 = (year%4==0&&!(year%100==0)||year%400==0);
         return flag2;
     }
 }
//  УРА УРА УРА
