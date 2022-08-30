class 5_Pattern {
    public static void main(String[] args) {
        int n=5;
        int i,j,k,l;
        int p = 1;
        for( i= 0;i<n;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(p++);
            }
            for(j=2*(n-i);j > 2;j--)
            {
                System.out.print("_");
            }
            p--;
            for(j=0;j<=i;j++)
            {
                System.out.print(p--);
            }
            p=1;
                System.out.println();
        }
    }
}
