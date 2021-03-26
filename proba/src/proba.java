//readme
public class proba {
    public static void main(String[] args) {
        System.out.println(2 * 2);
        var value = Math.random();
        var newValue = "\n\t/t slovo";
        int value1 = 0;
        System.out.println(value);
        System.out.println(newValue);
        if (value < value1) {
            System.out.println("true " + !true);
        } else {
            System.out.println(1 > 2 ? "true" : 2 + 6);
        }
        int i = 0;
        int j = i++; // j = 0 i = 1
        int J = ++i; // j = 1 i = 1

        for (int z = 2000; z < 2011; z++) {
            System.out.println(z);
        }
        System.out.println();
        int w = 2020;
        while (w < 2031) {
            System.out.println(w);
            w++;

        }
        Integer age1 = 55;
        int age2 = 6;
        System.out.println(age1 < age2);
        System.out.println();
        String text = "1234";
        System.out.println("1234".charAt(1)); //2
        System.out.println(Integer.toString(age1));


        int chislo = 12345;
        var u = String.valueOf(chislo);
        int jj = u.length();
        int sum = 0;
        for (int ii = 0; ii < jj; ii++) {
            sum = sum + Integer.parseInt(String.valueOf(u.charAt(ii)));
        }
        System.out.println("===============================");
        System.out.println(u);
        System.out.println(String.valueOf(u.charAt(0)));

        System.out.println("===============================");
        int a = 3;
        int b = 2;
        Integer intA = Integer.valueOf(a);
        double c = (double) a / b;
        System.out.println(a);
        System.out.println(c);
//        String number = "123.4232";
//        float floatNumber = Float.parseFloat(number);
//        System.out.println(floatNumber);  // 123.4232

        Integer q = -123;
        System.out.println(q.toString()); // -123
        Double MAX_VALUE = Double.MAX_VALUE;
        Short MIN_VALUE = Short.MIN_VALUE;
        System.out.println("double :" + MAX_VALUE + "\nshort : " + MIN_VALUE);

        System.out.println("===============================");

        String text1 = "Какой-то текст";
        String text2 = "          Какой-то текст  ";
        System.out.println(text1.indexOf('о')); // 3
        System.out.println(text1.lastIndexOf('о')); //7
        int space = text1.indexOf(' ');
        System.out.println(text1.substring(0, space)); // пишет текст с начала до указанного момента не включает указанный символ (0,8)
        System.out.println(text1.substring(0, 4)); // пишет текст с начала до указанного момента
        System.out.println(text1.substring(9)); // пишет текст с указанного символа включительно
        System.out.println(text1.substring(space + 1)); // пишет текст с указанного символа не включая его
        System.out.println(text2);
        System.out.println(text2.trim());
    }
}
