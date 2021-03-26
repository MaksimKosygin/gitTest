import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] roomCounts = new int[6];                  // 1 способ задать массив
        roomCounts[0] = 15;
        roomCounts[1] = 5;
        roomCounts[2] = 52;
        roomCounts[3] = 54;
        Arrays.stream(roomCounts).forEach(System.out::println);


        System.out.println("=====================вывод массива с конца ====================");
        int[] roomCounts2 = new int[4];
        roomCounts2[0] = 7;
        roomCounts2[1] = 3;
        roomCounts2[2] = 2;
        roomCounts2[3] = 4;
        for (int i = roomCounts2.length - 1; i >= 0; i--) {
            System.out.println(roomCounts2[i]);
        }
        System.out.println("==============================================");


        String[] colors = {"красный", "оранжевый"};             // 2 способ задать массив
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }
        System.out.println("==============================================");
        String radugaa = "каждый охотник охотник желает знать, где сидит сидит фазан";
        String[] txtt = radugaa.split(",?\\s");    // перед пробелом может быть запятая или ее может и не быть
        for (int z = 0; z < txtt.length; z++) {          //1 способ
           if (z > 0 && txtt[z].equals(txtt[z - 1])){
               continue;
           }
            System.out.println(txtt[z]);                 //если условие if выполнено то данная строка не выполняется ( т.е не будет напеатано повторяющееся слово)
        }
        System.out.println("-------------------2 способ--------------------");
        for (String colorWord : txtt)
        {
            System.out.println(colorWord);
        }

        System.out.println("==============================================");
        int[] ticketNumber = new int[1000];                 // всего билетов
        int[] winTicket = new int[10];                // выигрышных из них
        for (int i = 0; i < ticketNumber.length; i++) {
            int value = (int) (100 * Math.random());        //1000 билетов. билет имеет номер от 0 до 100
            ticketNumber[i] = value;
            if (i % 100 == 0) {                             // каждый сотый билет является выигрышным
                winTicket[i / 100] = value;           // каждому сотому билету присваивается номер ( 0 100 200... билет)
                System.out.println(value);                  // номера выигрышных билетов     //1 способ напечатать используя цикл и зная индекс
            }
        }
        System.out.println("-----------------------2способ------------------");
        for (int winTicketNumber : winTicket)                // 2 способ. не позволяет узнать индекс элемента на котормо находимся но последовательно  от 0 до конца
                                                            // получить все элеенты указанной переменной
        {
            System.out.println(winTicketNumber);
        }
    }
}
