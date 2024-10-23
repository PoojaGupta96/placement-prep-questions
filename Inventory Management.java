import java.util.HashMap;

public class FruitInventory {
    public static HashMap<Character, Integer> calculateFrequencies(String text) {
        text = text.replace(" ", "").replace(",", "").toLowerCase();
        HashMap<Character, Integer> frequencies = new HashMap<>();
        for (char c : text.toCharArray()) {
            frequencies.put(c, frequencies.getOrDefault(c, 0) + 1);
        }
        return frequencies;
    }

    public static void main(String[] args) {
        String inventory = "Apples 10, Bananas 5, Oranges 8, Apples 5, Grapes 12";
        HashMap<Character, Integer> frequencies = calculateFrequencies(inventory);
        for (char c : frequencies.keySet()) {
            System.out.println(c + ": " + frequencies.get(c));
        }
    }
}
