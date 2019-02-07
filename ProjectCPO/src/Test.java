import Communication.ConvertisseurOctet;

/**
 * Test class
 *
 */
public class Test {
    public static void main(String[] args) {
        byte a = (byte)236;

        float f = 0;
        ConvertisseurOctet convertisseurOctet= new ConvertisseurOctet();
        f = (float) convertisseurOctet.ByteToInt(a)/10;
        System.out.println(f);
    }
}
