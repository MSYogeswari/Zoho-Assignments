class 4_Equi_Triangle {
    public static void main(String[] args) {
        int n=5;
        System.out.println(" Pattern");
        for(int i=1;i<=n;i++)
        {
            for(int k = i; k<= (n-1);k++)
            {
                System.out.print("_");
            }
            for(int j = 1;j<=i;j++)
            {
                System.out.print("*  ");
            }
            System.out.println("");
        }
    }
}
