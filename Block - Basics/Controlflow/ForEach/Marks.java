class Marks{
    public static void main(String[] args){
        int[][] marks= {{10,20,30},{40,50}};
        for(int[] mark:marks){
               for(int m:mark){
                   System.out.println(m);
               }
        }
    }
}