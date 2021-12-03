class Marks{
    public static void main(String[] args){
        int[][] marks= {{10,20,30},{40,50}};
        for(int i=0; i<=marks.length-1;i++){
                for(int j=0;j<=marks[i].length-1; j++){
                    System.out.println(marks[i][j]);
                }
        }
    }
}