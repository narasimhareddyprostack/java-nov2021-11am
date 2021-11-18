interface Test{
    int x=100;
    int y=200;
}
class TestImpl implements Test{
    public static void main(String[] args){
         System.out.print(x);
         System.out.print(TestImpl.x);

    }
}