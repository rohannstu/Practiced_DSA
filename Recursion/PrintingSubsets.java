import java.util.ArrayList;
import java.util.List;

public class SubsetGenerator {
    public static void generateSubsets(List<Integer> input, List<Integer> current, int index) {
        // Base case: if we've considered all elements
        if (index == input.size()) {
            System.out.println(current); // Print the current subset
            return;
        }
        // Exclude the current element and proceed to the next
        generateSubsets(input, current, index + 1);

        // Include the current element and proceed to the next
        current.add(input.get(index));
        generateSubsets(input, current, index + 1);

        // Backtrack to remove the element added in the previous step
        current.remove(current.size() - 1);
    }

    public static void main(String[] args) {
        List<Integer> input = List.of(1, 2, 3);  // Example set
        List<Integer> current = new ArrayList<>(); // To store the current subset
        generateSubsets(input, current, 0);
    }
}
