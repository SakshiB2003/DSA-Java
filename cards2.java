import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
class Card {
    String symbol;
    int number;
    Card(String symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }
}
public class cards2 {
    public static void main(String[] args) {
        collectUniqueSymbols();
    }
    public static void collectUniqueSymbols() {
        Scanner scanner = new Scanner(System.in);
        Set<Card> cards = new HashSet<>();
        Set<String> symbolsCollected = new HashSet<>();
        while (symbolsCollected.size() < 4) {
            System.out.println("Enter a card:");
            String symbol = scanner.nextLine().trim().toLowerCase();
            int number = scanner.nextInt();
            scanner.nextLine(); 
            if (!symbolsCollected.contains(symbol)) {
                symbolsCollected.add(symbol);
            }
            cards.add(new Card(symbol, number));
        }
        System.out.println("Four symbols gathered in " + cards.size() + " cards.");
        System.out.println("Cards in Set are:");
        Set<Card> sortedCards = new TreeSet<>((c1, c2) -> {
            if (!c1.symbol.equals(c2.symbol)) {
                return c1.symbol.compareTo(c2.symbol);
            }
            return Integer.compare(c1.number, c2.number);
        });
        sortedCards.addAll(cards);
        for (Card card : sortedCards) {
            System.out.println(card.symbol + " " + card.number);
        }

        scanner.close();
    }}