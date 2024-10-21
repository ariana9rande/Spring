public class Test
{
    public static int[] sum(int[] a, int[] b)
    {
        int[] c = new int[a.length];

        for (int i = 0; i < c.length; i++)
        {
            int bb = i < b.length ? b[i] : 0;
            c[i] = a[i] + bb;
        }

        return c;
    }

//    public void testSum()
//    {
//        int[] a = {10, 17, 18, 63, 76};
//        int[] b = {20, 59, 65, 77};
//        int[] c = sum(a, b);
//
//        System.out.print("결과 : ");
//        for (int sum : c)
//        {
//            System.out.print(sum + " ");
//        }
//    }

    public static void main(String[] args)
    {
        int[] a = {10, 17, 18, 63, 76};
        int[] b = {20, 59, 65, 77};
        int[] c = sum(a, b);

        System.out.print("결과 ");
        for (int sum : c)
        {
            System.out.print(sum + " ");
        }
    }
}
