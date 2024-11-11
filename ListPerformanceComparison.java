import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPerformanceComparison {
    public static void main(String[] args) {
        int size = 100000;
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("Performance Comparison for ArrayList and LinkedList:");
        System.out.println("\nAdding Elements:");
        System.out.println("ArrayList: " + measureAddPerformance(arrayList, size) + " ns");
        System.out.println("LinkedList: " + measureAddPerformance(linkedList, size) + " ns");

        System.out.println("\nAccessing Elements:");
        System.out.println("ArrayList: " + measureAccessPerformance(arrayList) + " ns");
        System.out.println("LinkedList: " + measureAccessPerformance(linkedList) + " ns");

        System.out.println("\nRemoving Elements:");
        System.out.println("ArrayList: " + measureRemovePerformance(arrayList) + " ns");
        System.out.println("LinkedList: " + measureRemovePerformance(linkedList) + " ns");
    }

    public static long measureAddPerformance(List<Integer> list, int size) {
        long startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        return System.nanoTime() - startTime;
    }

    public static long measureAccessPerformance(List<Integer> list) {
        long startTime = System.nanoTime();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        return System.nanoTime() - startTime;
    }

    public static long measureRemovePerformance(List<Integer> list) {
        long startTime = System.nanoTime();
        while (!list.isEmpty()) {
            list.remove(0);
        }
        return System.nanoTime() - startTime;
    }
}
