public class string {
    public int fun() {

        int a = 30;
        int b = 40;
        return a * b;
    }

    public static void main(String[] args) {
        // String Search = "peter piper picked a" + "peck of pipe and pickled peppers";
        // int max = Search.length();
        // int num = 0;
        // for (int i = 0; i < Search.length(); i++) {
        // if (Search.charAt(i) == 'p') {
        // num++;
        // continue;
        // }

        // }
        // System.out.println(num);

        string obj = new string();
        int result = obj.fun();
        System.out.println(result);

    }
}
