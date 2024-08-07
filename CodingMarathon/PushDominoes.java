package CodingMarathon;

public class PushDominoes {
    public static void main(String[] args) {
        String dominoes = ".L.R...LR..L..";
        System.out.println(pushDominoes(dominoes));
    }
    public static String pushDominoes(String dominoes) {
        char[] arr = dominoes.toCharArray();
        int n = arr.length;
        int[] force = new int[n];
        int f = 0;
        for(int i=0;i<n;i++){
            if(arr[i]=='R'){
                f=n;
            }else if(arr[i]=='L'){
                f=0;
            }else{
                f = Math.max(f-1,0);
            }
            force[i] += f;
        }
        f = 0;
        for(int i=n-1;i>=0;i--){
            if(arr[i]=='L'){
                f=n;
            }else if(arr[i]=='R'){
                f=0;
            }else{
                f = Math.max(f-1,0);
            }
            force[i] -= f;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            if(force[i]>0){
                sb.append('R');
            }else if(force[i]<0){
                sb.append('L');
            }else{
                sb.append('.');
            }
        }
        return sb.toString();
    }
}
