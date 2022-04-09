import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.PriorityQueue;
import java.util.Stack;

class MainTest {
    @Test
    void test1(){
        String[] arr = { "green", "blue", "red" };
        int[] ord = { 5, 8, 1 };
        String[] exp = {"red", "green", "blue"};

        Main.sort(arr, ord);

        Assertions.assertArrayEquals(exp, arr);
    }

    @Test
    void test2(){
        String[] arr = { "green", "blue", "red" };
        int[] ord = { 1, 5, 9 };
        String[] exp = {"green", "blue", "red"};

        Main.sort(arr, ord);

        Assertions.assertArrayEquals(exp, arr);
    }

    @Test
    void test3(){
        ExampleClass obj1 = new ExampleClass();
        ExampleClass obj2 = new ExampleClass();
        ExampleClass obj3 = new ExampleClass();
        ExampleClass obj4 = new ExampleClass();

        ExampleClass[] arr = {obj1, obj4, obj2, obj3};
        int[] ord = { 9, 2, 1, 5 };
        ExampleClass[] exp = {obj2, obj4, obj3, obj1};

        Main.sort(arr, ord);

        Assertions.assertArrayEquals(exp, arr);
    }

    @Test
    void test4(){
        PriorityQueue<Integer> obj1 = new PriorityQueue<>();
        PriorityQueue<Integer> obj2 = new PriorityQueue<>();
        PriorityQueue<Integer> obj3 = new PriorityQueue<>();
        PriorityQueue<Integer> obj4 = new PriorityQueue<>();

        PriorityQueue[] arr = {obj1, obj4, obj2, obj3};
        int[] ord = { 2, 2, 1, 5 };
        PriorityQueue[] exp = {obj2, obj1, obj4, obj3};

        Main.sort(arr, ord);

        Assertions.assertArrayEquals(exp, arr);
    }

    @Test
    void test5(){
        Stack<String> obj1 = new Stack<>();
        Stack<String> obj2 = new Stack<>();
        Stack<String> obj3 = new Stack<>();
        Stack<String> obj4 = new Stack<>();

        Stack[] arr = {obj1, obj4, obj2, obj3};
        int[] ord = { 2, 2, 2, 2 };
        Stack[] exp = {obj1, obj4, obj2, obj3};

        Main.sort(arr, ord);

        Assertions.assertArrayEquals(exp, arr);
    }
}