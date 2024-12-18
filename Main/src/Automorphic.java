public class Automorphic {
    public static void main(String[] args) {
        int n = 76;

        int sq = n*n;

        String nStr = String.valueOf(n);
        String sqStr = String.valueOf(sq);

        if(sqStr.endsWith(nStr))
        {
            System.out.println("Automorpic");
        }
        else
        {
            System.out.println("Not Automorphic");
        }
    }
}
