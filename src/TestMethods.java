public class TestMethods {
//    Tribonacci sequence
    public double[] tri(double[] s, double n) {
        int count = 0;
        double[] list = new double[(int)n];

        if (n < 3) {
            while (count < n) {
                list[count] += s[count];
                count++;
            }
        }

        while (count < n) {
            for (double i : s) {
                if (count <= 2) {
                    list[count] += i;
                } else if (count < n) {
                    list[count] += list[count - 3] + list[count - 2] + list[count - 1];
                }
                count++;
            }
        }
        return list;
    }
//    Another example of checking two values in a list, if they fit.
    public int[] simpleList(int n){
        int[] l = new int[2];

        l[0] = n-n;
        l[1] = n+n;

        return l;
    }
}


