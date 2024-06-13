package Java_Interfaces;

//interface
interface Lava_7 {
    void methodOne();
}

//inherited interface
interface Lava_07 extends Lava_7 {
    void methodTwo();
}

class InheritedInterface implements Lava_07 {
    //override method of interface Jala_7
    @Override
    public void methodOne() {
        System.out.println("This is first method");
    }
    //override method of inherited interface Jala_07
    @Override
    public void methodTwo() {
        System.out.println("This is second method");
    }

    public static void main(String[] args) {
        //creating obj of InheritedInterface
        InheritedInterface if7 = new InheritedInterface();
        //Calling the methods implemented
        if7.methodOne();
        if7.methodTwo();
    }
}