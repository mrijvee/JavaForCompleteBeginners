package tutorial19_stringbuilderandstringformatting;

public class StringBuilderAndStringFormatting {

    public static void main(String[] args) {

        //Inefficient code
        String info = "";
        info += "My name is Goku.";
        info += " ";
        info += "I'm a Super Sayiyan";
        System.out.println(info);

        //More efficient
        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append("My power level is over: " + 9000);
        stringBuilder.append(" ");
        stringBuilder.append("My best friend is Vegeta");
        System.out.println(stringBuilder.toString());
        //Shortcut
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("I'm Nappa and his.....").append(" his power level is over ").append("9000000000000000000");
        System.out.println(stringBuilder1.toString());

        //Formatting
        System.out.printf("Total cost %d; quantity is %d\n", 5, 120);
        System.out.printf("Total cost %10d; quantity is %d\n", 5, 120);
        System.out.printf("Total cost %-10d; quantity is %d", 5, 120);
        for (int i = 0; i < 20; i++) {
            System.out.printf("%-2d: some text here\n", i); //%-2d will move the numbers to the left
        }
        //Formatting floating point
        System.out.printf("Total value: %.2f\n", 5.6874); //%.2f will round to two decimal places
        System.out.printf("Total value: %6.1f\n", 343.23423); //will move empty spaces to the right
        System.out.printf("Total value: %-6.1f\n", 343.23423); //will bring it to the left side
    }
}
