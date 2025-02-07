package heartsjava.KidInASquid;
import java.util.Random;


public class Card {
    char suit;
    int num;

    String[] CARD_VALUE = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    
    public Card (char s, int n) {
        if (s=='s'||s=='c'||s=='d'||s=='h') suit =s;
        else suit='s';
        if (n<=13&&n>=1)num=n;
        else num=1;

    }

    
    @Override// to string
    public String toString(){
        return ""+CARD_VALUE[num-1]+" of "+this.getSuit();

    }
    
    public String getSuit() {
        switch (suit) {
            case 's' -> {
                return "Spades";
            }
            case 'd' -> {
                return "Diamonds";
            }
            case 'c' -> {
                return "Clubs";
            }
            case 'h' -> {
                return "Hearts";
            }
        }return"";}

    public char getSuit(char a) {return suit;}

    public int getNum() {return num;}
    
    public static Card[] getDeck(){
        Card[] deck =new Card[52];
        int n=0;
        for (char i:("scdh").toCharArray()){
            for(int j=1; j<=13;j++){
                deck[n] = new Card(i,j);
                n++;
            }
        }
        return deck;
    }

    
    public static Card[] shuffle(Card[] deck){
        Random rand = new Random();
		for(int f=0;f<deck.length*3;f++){
            for (int i = 0; i < deck.length; i++) {
			    int randomIndexToSwap = rand.nextInt(deck.length);
			    Card temp = deck[randomIndexToSwap];
			    deck[randomIndexToSwap] = deck[i];
			    deck[i] = temp;
		    }
        } return deck;
    }

    public static Card[] concat(Card[] a, Card[] b){
        Card[] n= new Card[a.length+b.length];
        int j=0;
        for(Card i:a){
            n[j]=i;
            j++;
        }
        for(Card i:b){
            n[j]=i;
            j++;
        }
        return n;
    }

    public static Card[] sub(Card[] a, int start){
        Card[] n= new Card[a.length-start];
        int j=0;
        for(int i=start;i<a.length;i++){
            n[j]=a[i];
            j++;
        }
        return n;
    }
    
    public static Card[] sub(Card[] a, int start,int end){
        Card[] n= new Card[end-start];
        int j=0;
        for(int i=start;i<end;i++){
            n[j]=a[i];
            j++;
        }
        return n;
    }
    public static Card[] sortHand(Card[] hand){
        Card[] newHand = new Card[0];
        Card[] temp = new Card[1];

        for(char i:("sdch").toCharArray()){
            for(int j=0; j<hand.length;j++){
                temp[0]=hand[j];
                if(hand[j].getSuit('c')==i)newHand=concat(newHand, temp);
            }

        }
        hand=copyOf(newHand);
        temp[0]=newHand[0];
        for(int j=1; j<newHand.length;j++){
            if (newHand[j].getSuit('a'))

        }
        return newHand;
    }
}