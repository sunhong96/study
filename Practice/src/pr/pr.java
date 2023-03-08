package pr;

public class pr {
    public static void main(String[] args) {
        System.out.println("Card.weight =" + Card.width);

        Card1 c1 = new Card1();

        Card1 c2 = new Card1();

        c1.width2++;
        c1.width++;
        System.out.printf("c1의 [%d],c1의 [%d]%n",c1.width2,c1.width);
        System.out.printf("c2의 [%d],c2의 [%d]%n",c2.width2,c2.width);
    }

}

class Card1{
    static int width = 70;
    int width2 = 60;

}
