public class cacsonguyenchannhohon11 {
    public static void main(String[] args){   
        int n = 11;
        int count = 0;
        for(int i= 0; i <= n ;i++)
        {
            if(i%2==0)
            {
                count+=1;
            }
        }
        System.out.printf("Co %d so chan", count);
    }
}
