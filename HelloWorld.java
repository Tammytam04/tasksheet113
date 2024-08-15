/*Create all of the primitives (except long and double) with different values.
Concatenate them into a string and  print it to the screen so 
it will print: H3110 w0r1d 2.0 true*/
public class HelloWorld {
    public static void main(String[] args) {
        char h = 'H';
        int e = 3;
        int l_1 = 1;
        int l_2 = 1;
        int o = 0;
        char space = ' ';
        char w = 'w';
        int o_2 = 0;
        char rr = 'r';
        int r2 = 1;
        char d = 'd';
        float two = 2.0f;
        boolean isTrue = true;

        String result = "" + h + e + l_1 + l_2 + o + space + w + o_2 + rr + r2 + d + space + two + space + isTrue;

        System.out.println(result);
    }
}
