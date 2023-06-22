import java.util.*;

public class Main {
//    Реализовать консольное приложение, которое:
//    1. Принимает от пользователя и “запоминает” строки.
//    2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//    3. Если введено revert, удаляет предыдущую введенную строку из памяти.
//    4. Если введено exit, то программа завершается
//
//      > - ввод в консоль (stdin), < - вывод на консоль (stdout)
//      > java
//      > python
//      > c#
//      > print
//      < [c#, python, java]
//      > revert
//      > print
//      < [python, java]
//      > revert
//      > revert
//      > print
//      < []
//      > revert -> throw new NoSuchElementException
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LinkedList<String> languages = new LinkedList<>();
        while(true) {
            String command = scanner.nextLine();
            if ("print".equals(command)){
                Iterator<String> itr = languages.descendingIterator();
//                while(itr.hasNext()){
//                    System.out.print(Arrays.toString(itr.next().toCharArray()));
//                }
                System.out.print("[ ");
                itr.forEachRemaining(nb -> System.out.print(nb + " "));
                System.out.print("]");
//                languages.descendingIterator().forEachRemaining(System.out::println);
                System.out.println();
                continue;
            }else if ("revert".equals(command)){
                if (languages.size() ==0){
                    throw  new NoSuchElementException();
                }
                languages.pop();
                continue;
            }else if ("exit".equals(command)){
                System.exit(0);
            } else {
                languages.add(command);
                continue;
            }

        }


    }
    public static Stack reverse(Stack<String> arr){
        arr.sort(Collections.reverseOrder());
        System.out.println(arr);
        return arr;
    }
}