package pr;

public class Practice {

    public static void main(String[] args) {
        System.out.println("Card.weight =" + Card.width);
        System.out.println("Card.height =" + Card.height);

        Card c1 = new Card("Heart", 7);

        Card c2 = new Card("spade",4);

        c1.width1++;
        c1.width++;
        System.out.printf("%d,%d%n",c1.width1,c1.width);
        System.out.printf("%d,%d%n",c2.width1,c2.width);
        System.out.println(c1);
        System.out.println(c2);
    }

}

class Card{
    String kind;
    int number;
    static int width = 90;
    int width1 = 70;
    static int height = 250;

    public Card(String kind, int number){
        this.kind = kind;
        this.number = number;
    }


    public String toString(){
        return String.format("카드종류:%s 카드번호:%d 카드넓이:%d 카드높이:%d", this.kind, this.number, width, height);
    }

}