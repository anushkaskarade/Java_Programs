
import java.util.Scanner;



class Roman {
    public int romanToInt(String s) 
    {
       //Scanner sc = new Scanner(System.in);
        int digit = 0;
        
        if(s.length() <= 15 && s.length() >= 1) {
            int c[] = new int[s.length()];
            
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == 'I') {
                    c[i] = 1;
                } else if(s.charAt(i) == 'V') {
                    c[i] = 5;
                } else if(s.charAt(i) == 'X') {
                    c[i] = 10;
                } else if(s.charAt(i) == 'L') {
                    c[i] = 50;
                } else if(s.charAt(i) == 'C') {
                    c[i] = 100;
                } else if(s.charAt(i) == 'D') {
                    c[i] = 500;
                } else if(s.charAt(i) == 'M') {
                    c[i] = 1000;
                }

                if(i > 0 && c[i-1] < c[i]) {
                    digit += (c[i] - 2 * c[i-1]);
                } else {
                    digit += c[i];
                }
            }
            
        }
        return digit;
    }
}

    class Solution{
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        Roman s=new Roman();
        System.out.println("Enter the roman number:");
        String r=sc.nextLine();
        int result=s.romanToInt(r);
        System.out.print(result);
    }
}


