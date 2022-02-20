package CoursePackages.Course.Lesson16String;

public class Test2 {

    public static void main(String[] args) {

        String s1 = new String ("privet Tim");
        String s2 = new String (" privet Tim  ");

        String c13 = s1.substring(1); // substring(int beginIndex) rivet Tim
        System.out.println(c13);

        String c14 = s1.substring(1, 3); // substring(int beginIndex, int endIndex) ri (3 не включено)
        System.out.println(c14);

        String c15 = s2.trim(); // без пробелов
        System.out.println(c15);

        String c16 = s2.replace('i', 'z'); // все меняет на z przvet Tzm
        System.out.println(c16);

        String c17 = s2.replace("vet", "z"); // priz Tim
        System.out.println(c17);

        String c18 = "Hello";
        String c19 = c18.replace("e", "e");
        String c20 = c18.replace('e', 'e');
        String c21 = c18.replace("l", "g");
        System.out.println(c18 == c19); // если одинаковые то не создается новый объект
        System.out.println(c20 == c19);
        System.out.println(c21 == c19);

        String c22 = "Hello";
        String c23 = "friend";
        System.out.println(c22.concat(c23));





    }
}
