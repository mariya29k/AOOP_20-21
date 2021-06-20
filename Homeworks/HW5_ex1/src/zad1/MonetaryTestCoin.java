package zad1;

public class MonetaryTestCoin {
    public static void main(String[] args) {
        MonetaryCoin coin1 = new MonetaryCoin(Face.TAIL, 50);
        MonetaryCoin coin2 = new MonetaryCoin(Face.HEAD,20);
        MonetaryCoin coin3 = new MonetaryCoin(Face.TAIL, 5);
        MonetaryCoin coin4 = new MonetaryCoin(Face.HEAD, 10);
        MonetaryCoin coin5 = new MonetaryCoin(Face.HEAD, 20);

        int sum = coin1.getValue() + coin2.getValue() + coin3.getValue() + coin4.getValue() + coin5.getValue();

        System.out.println("Computed sum of five coins: " + sum);

        System.out.println("Coin to be flipped: " + coin2);
        System.out.println("Flip coin 15 times: ");

        for(int i = 0; i < 15; i++){
            coin2.flip();
            System.out.println(coin2.getFace());
        }
    }
}
