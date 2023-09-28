import java.util.ArrayList;
import java.util.List;

public class ArrayActions {
    public static void main(String[] args) {
        ArrayActions func = new ArrayActions();
        int[] array = {2, 3, 1, 0};
        System.out.println(func.getTotal(array));
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(0);
        System.out.println("--------------------------");
        System.out.println(func.getAverage(list));
        System.out.println("--------------------------");
        func.multiplicationTable(15);
        System.out.println("--------------------------");
        func.countTo100();
        System.out.println("--------------------------");
        List<String> firstList = new ArrayList<>();
        firstList.add("a");
        firstList.add("b");
        firstList.add("c");
        List<String> secondList = new ArrayList<>();
        secondList.add("1");
        secondList.add("2");
        secondList.add("3");
        System.out.println(func.getJoinedList(firstList, secondList));
        System.out.println("--------------------------");
        func.printTriangle(6);
        System.out.println("--------------------------");
        System.out.println(func.returnListOfDigits(2342));


    }

    public int getTotal(int[] a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    public double getAverage(List<Integer> a) {
        double sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum / a.size();
    }

    public void multiplicationTable(int n) {
        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i : a) {
            int result = i * n;
            System.out.println(n + " * "+ i +" = "+ result);
        }
    }

    public void countTo100() {
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else {
                    System.out.println("Fizz");
                }
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public List<String> getJoinedList(List<String> a, List<String> b) {
        List<String> newArray = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            newArray.add(a.get(i));
            newArray.add(b.get(i));

        }
        return newArray;
    }

    public void printTriangle(int n) {
        String str = "*";
        String a = "*";
        for (int y = 0; y < n; y++) {
            System.out.println(a);
            a = a + str;
        }
    }

    public List<Integer> returnListOfDigits(int n) {
        int x = 10;
        int y = n;
        List<Integer> result = new ArrayList<>();
        List<Integer> invertedArray = new ArrayList<>();
        while (y % x > 0) {
            result.add(y % x);
            y = y / x;
        }
        for (int i = result.size() - 1; i >= 0; i--) {
            invertedArray.add(result.get(i));
        }

        return invertedArray;
    }

}

