package Java_Interfaces;

interface Lava_09 {

    public int num1 = 11;
    static final int num2 = 22;
    final int num3 = 33;
}

class InterfacePrivateProtected implements Lava_09 {

    public static void main(String[] args) {
        InterfacePrivateProtected if9 = new InterfacePrivateProtected();
        System.out.println(if9.num1 + " " + if9.num2);
    }
}