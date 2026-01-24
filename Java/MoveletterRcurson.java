public class MoveletterRcurson {
    public static void moveAllx(String move,int idx,int count,StringBuilder sb){
        if (idx==move.length()-1) {
            for (int i = 0; i < count; i++) {
                sb.append('x');
            }
            sb.toString();
            System.out.println(sb);
            return;
        }
        if (move.charAt(idx)=='x') {
            count++;
            moveAllx(move, idx+1,count,sb);
        }else{
            sb.append(move.charAt(idx));
            moveAllx(move, idx+1,count,sb);
        }
    }
    public static void main(String[] args) {
        String move="xaxbcxxd";
        StringBuilder sb=new StringBuilder();
        moveAllx(move,0,0,sb);
    }
}
