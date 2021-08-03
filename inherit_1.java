//import java.util.*;

class animal {
    animal() {
        System.out.println("This is animal");
    }
}

class mammal extends animal {
    mammal() {
        System.out.println("This is mammal extends animal"); // hierarchical
    }
}

class reptile extends animal {
    reptile() {
        System.out.println("This is reptile extends animal"); // hierarchical
    }
}

class dog extends mammal {
    dog() {
        System.out.println("This is dog extends mammal"); // multilevel
    }
}

public class inherit_1 {
    public static void main(String args[]) {
        // animal obj1 = new animal();
        // mammal obj2 = new mammal();
        // reptile obj3 = new reptile();
        // dog obj4 = new dog();
    }
}
