public class Test2 {
    public static String [] abc(String[] ... array1) {
        int length = 0;
        for (String [] array2 : array1) {
           length += array2.length;         // посчитали общую длину всех
        }

        String [] target = new String[length];
        int count = 0;
        for (String [] array3: array1) {
            for (String s: array3) {
                target[count] = s;
                count++;
            }
        }
        return target;
     }

    public static void main(String[] args) {
      

        String [] target = abc(new String[]{"ok", "привет", "пока"},
                new String[]{"ok", "hello", "bye"});

//        for (String s : args) {
//            for (int i = 0; i < target.length; i++) {
//                if (s.equals(target[i])) {
//                    target[i] = null;
//                }
//            }
//        }

       
        for (String s : args) {
            int count = 0;
            for (String f : target) {

                if (s.equals(f)) {
                    target[count] = null;
                }
                count++;
            }
        }


        for (String s : target) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}

