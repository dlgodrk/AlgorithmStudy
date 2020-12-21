class Solution {
    public int solution(int n) {
        int answer = 0;
        String to3 = to3(n);
        String reverse = reverse(to3);
        int to10 = to10(reverse);
        answer = to10;
        return answer;
    }

    public static String to3(int n){
        //45 - 1200
        String result;
        int num = n;
        StringBuilder sb = new StringBuilder();
        while(num != 0){
            sb = sb.append(num % 3);
            num = num / 3;
        }
        sb.reverse();
        result = sb.toString();
        System.out.println("to3 "+n+" -> "+result);
        return result;
    }

    public static int to10(String n){
        int result = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        sb.reverse();
        String num = sb.toString();
        int N = num.length();
        for(int i = 0 ; i < N; i++){
            int check = num.charAt(i) - '0';
            result += power3(i)*check;
        }
        System.out.println("to10 "+n+" -> "+result);
        return result;
    }

    public static String reverse(String n){
        String result;
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        sb.reverse();
        result = sb.toString();
        System.out.println("reverse "+n+" -> "+result);
        return result;
    }

    public static int power3(int n){
        if(n == 0){
            return 1;
        }
        else{
            return 3*power3(n-1);
        }
    }
}
