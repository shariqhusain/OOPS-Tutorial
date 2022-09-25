 

 class Account{
    public String name;
    // protected String details;
    private String password;
    public String getPass(){
        return this.password;

    }
    public void setPass(String pass){
        this.password=pass;

    }
    // private String password;
 }

 public class Bank{
    public static void  main( String args[]) {
        Account account=new Account();
        account.name="customer1";
        account.setPass("hello123");
        System.out.println(account.getPass());
        
        
    }


}