public class ADVANCED_PATTERNS {
    public static void main(String[] args) {
        System.out.println("1.BUTTERFLY PATTERN");
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            int spaces = 2 * (n - i);
            for (int j = 1; j <=spaces; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

                int spaces=2*(n-i);
                for(int j=1; j<=spaces;j++)
                {
                    System.out.print("  ");
                }
                for(int j=1;j<=i;j++)
                {
                    System.out.print(" *");
                }
            System.out.println();
        }
        System.out.println("<------------------------------------------------>");

        System.out.println("2.SOLID RHOMBUS");
        int n1 = 5;
        for (int i = 1; i <= n1; i++) {
            int spaces = n1- i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("<------------------------------------------------>");
    

System.out.println("3.NUMBER PYRAMID");
        int n2=6;
        for(int i=1 ; i<=n2 ;i++)
        {
            int spaces = n2-i;
            for(int j=1 ; j<=spaces ; j++)
            {
                System.out.print(" ");
            }
            for(int j=1 ;j<=i;j++)
            {
                System.out.print(i+" ");
            }

            System.out.println();
        }
        System.out.println("<------------------------------------------------>");

    }
}