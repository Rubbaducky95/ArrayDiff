public class Kata {

    public static int[] arrayDiff(int[] a, int[] b) {

        int j = 0;
        int[] temp = new int[a.length];
        int count = 0;

        for (int i = 0; i < a.length; i++) {

            for (int k = 0; k < b.length; k++){
                while(a[i] == b[k]){
                    i++;
                    count++;
                }
            }
            temp[j] = a[i];
            j++;
        }
        int[] temp2 = new int[a.length-count];
        for (int i = 0; i < temp2.length; i++)
            temp2[i] = temp[i];

        return temp2;
    }

    public static void main(String[] args) {

        int[] a = {1,2,2,3,4}, b ={};
        int[] c = arrayDiff(a,b);
        for(int i : c)
            System.out.println(i + ", ");
    }
}
