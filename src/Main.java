import java.util.*;

public class Main {
//    ����������� ���������� ����������, �������:
//    1. ��������� �� ������������ � ����������� ������.
//    2. ���� ������� print, ������� ������ ���, ����� ��������� ��������� ���� ������ � ������, � ������ - ���������.
//    3. ���� ������� revert, ������� ���������� ��������� ������ �� ������.
//    4. ���� ������� exit, �� ��������� �����������
//
//      > - ���� � ������� (stdin), < - ����� �� ������� (stdout)
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