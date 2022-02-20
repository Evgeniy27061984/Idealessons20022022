package CoursePackages.Course.Lesson26equalstoString;



public class Test7 {
    public static void main(String[] args) {
//        Animal a = new Animal();
//        static of Animal
//        non static Animal
//        constructor of animal

        Lion b = new Lion();
//        static of Animal
//        static of Mammal
//        static of Lion

//        non static Animal
//        constructor of Animal

//        non static Mammal
//        constructor of Mammal

//        non static Lion
//        constructor of Lion



    }
}
class Animal {
    Animal() {
        System.out.println("constructor of Animal");
    }
    static {
        System.out.println("static of Animal");//1
    }

    {
        System.out.println("non static Animal");
    }
}

class Mammal extends Animal{
    Mammal() {
        System.out.println("constructor of Mammal");
    }
    static {
        System.out.println("static of Mammal");//2
    }

    {
        System.out.println("non static Mammal");
    }
}

class Lion extends Mammal{
    Lion() {
        System.out.println("constructor of Lion");
    }
    static {
        System.out.println("static of Lion");//3
    }

    {
        System.out.println("non static Lion");
    }
}