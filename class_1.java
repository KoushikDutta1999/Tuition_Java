//import java.util.*;

class abc {
    int x;
    float y;
    String z;

    public void print() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}

class class_1 {
    public static void main(String[] args) {
        abc obj = new abc();
        obj.x = 10;
        obj.y = 5.0f;
        obj.z = "koushik";
        obj.print();
    }
}