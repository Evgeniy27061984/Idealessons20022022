package CoursePackages.Course.HomeWork.Lesson25;


public class Test1 {
    public static void main(String[] args) {
        Animal a1 = new GoldFish("Name is GoldFish1");
        Animal a2 = new Penguin("Name is Penguin1");
        Animal a3 = new Lion("Name is Lion1");

        Fish a4 = new GoldFish("Name is GoldFish2");
        Bird a5 = new Penguin("Name is Penguin2");
        Mammal a6 = new Lion("Name is Lion2");

        GoldFish a7 = new GoldFish("Name is GoldFish3");
        Penguin a8 = new Penguin("Name is Penguin3");
        Lion a9 = new Lion("Name is Lion3");

        Speakable s1 = new Lion("Name is Lion3");
        Speakable s2 = new Penguin("Name is Lion3");

        Animal [] array1 = {a1,a2,a3,a4,a5,a6,a7,a8,a9};
        Speakable [] array2 = {s1, s2};

        for (Animal arr: array1)  {
            if (arr instanceof GoldFish) {
                GoldFish g = (GoldFish) arr;
                System.out.println(g.name);
                g.eat();
                g.swim();
                g.sleep();
            }
            else if (arr instanceof Penguin) {
                Penguin g = (Penguin) arr;
                System.out.println(g.name);
                g.eat();
                g.sleep();
                //g.speak();
            }

            else if (arr instanceof Lion) {
                Lion g = (Lion) arr;
                System.out.println(g.name);
                g.eat();
                g.sleep();
               // g.speak();
                g.run();
            }

            System.out.println("*******************");
        }

        for (Speakable arr: array2)  {
            if (arr instanceof Lion) {
                Lion g = (Lion) arr;
                System.out.println(g.name);
                g.eat();
                g.sleep();
                //g.speak();
                g.run();
            }

            else if (arr instanceof Penguin) {
                Penguin g = (Penguin) arr;
                System.out.println(g.name);
                g.eat();
                g.sleep();
               // g.speak();
            }
            System.out.println("*******************");

        }

    }
}
