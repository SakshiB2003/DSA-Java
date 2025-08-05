import java.util.*;
import java.io.*;
class Card{
 char suit;
 int number;
 Card(char suit, int number){
 this.suit=suit;
 this.number=number;
 }
}
class experiment4{
 public static void main(String args[])throws IOException{
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter number of cards");
 int n=sc.nextInt();
 sc.nextLine();
 Map<Character, List<Card>> mp= new TreeMap<>();
 for(int i=0;i<n;i++){
 System.out.println("Enter Card "+(i+1));
 char ch =sc.next().charAt(0);
 int v=sc.nextInt();
 sc.nextLine();
 Card card= new Card(ch,v);
 List<Card> Cards=mp.getOrDefault(ch, new ArrayList<>());
 Cards.add(card);
 mp.put(ch,Cards);
 }
 System.out.println("Distinct Symbols are: ");
 for(char symbol: mp.keySet()){
 System.out.println(symbol+" ");
 }
 System.out.println();
 for(char symbol: mp.keySet()){
 System.out.println("Cards in "+symbol);
 List<Card> cards=mp.get(symbol);
 for(Card card: cards){
 System.out.println(card.suit+" "+card.number);
 }
 System.out.println("Number of cards : "+cards.size());
 int sum = cards.stream().mapToInt(card->card.number).sum();
 System.out.println("Sum of Numbers: "+sum);
 System.out.println();
 }
 sc.close();
 }
}