package Numbers;

/*
 * ✅ What does the program do?
It checks if the number n is automorphic.

➥ A number is called automorphic if its square ends with the same digits as the number itself.

✅ Examples
25 → 25² = 625 → ends with 25 → automorphic → ✔
 */

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
