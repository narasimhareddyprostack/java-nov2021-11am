interface UserLogin{
    public abstract void login();
    void logout();
}
interface User{}
class UserLoginImpl implements UserLogin,User{
  public void login(){
      System.out.println("Login Successfull:");
  }
  public void logout(){
      System.out.println("Successfully Logout");
  }
  public static void main(String[] args){
      UserLoginImpl obj = new UserLoginImpl();
      obj.login();
      obj.logout();
  }
}