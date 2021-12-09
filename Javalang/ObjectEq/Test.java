class Test{
    public static void main(String[] args){
        String s1 = new String("Rahul");
        String s2 = new String("Rahul");
        String s3 = new String("Priyanka");
        System.out.println(s1 == s2);  //false - ref comparision
        System.out.println(s1.equals(s2));true
    }
}