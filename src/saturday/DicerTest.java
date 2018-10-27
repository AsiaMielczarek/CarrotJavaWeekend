package saturday;

public class DicerTest {

    public static void main(String[] args) {

        Dicer dicer = new Dicer(4);
        Dicer dicer2 = new Dicer(6);
        Dicer dicer3 = new Dicer(0);

        System.out.println("Arrays:");
        dicer.throwDiceArray();
        dicer2.throwDiceArray();
        dicer3.throwDiceArray();

        System.out.println("StringBuilder:");
        System.out.println(dicer.throwDiceString());
        System.out.println(dicer2.throwDiceString());
        System.out.println(dicer3.throwDiceString());
    }
}
