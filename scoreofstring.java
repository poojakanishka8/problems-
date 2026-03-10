public class scoreofstring {
    public static void main(String[] args) {
    String str="code";
    int a=0;
    int sum=0;
    for(int i=0;i<str.length()-1;i++)
        {
            a=Math.abs(str.charAt(i)-str.charAt( i+1));
             sum=sum+a;
        }
      System.out.print(sum);
}
}

