import java.util.Scanner;

public class EmailApp {
   private String firstname;
   private String lastname;
   private String department;
    private String password;
    private String email;

   private int  mailboxCapacity=500;
    private String alternateEmail;
    private int defaultpassworldLength=10;
    private String cumpanysuffix = "muraliakontechies.com";

    public EmailApp(String firstname,String lastname)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        System.out.println ("Your Email created Your Email id Name :"+this.firstname+" "+this.lastname);
        this.department = setdepartment ();
        System.out.println ("Department :"+this.department);


        this.password = randompassword (defaultpassworldLength);
        System.out.println ("The Default Password is :"+this.password);

        String email = firstname.toLowerCase ()+"."+lastname.toLowerCase () +"@"+department+""+cumpanysuffix;
        System.out.println ("Your Default Email id :"+email);


    }
    private String setdepartment()
    {
        System.out.println ("New Worker: "+firstname+" Enter the Department codes \n1 For Sales \n2 For Development \n3 For Accounting  \n0 None of the Above  \nEnter your Department Codes :");
        Scanner sc = new Scanner (System.in);
        int selectchoice = sc.nextInt ();
        if(selectchoice==1){return "Sales";}
        else if(selectchoice==2){return "Development";}
        else if(selectchoice==3){return "Accounting";}
        else { return null;}
    }
    private String randompassword(int length)
    {
        String passwordset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$%^&*!";
        char [] password = new char[length];
        for(int i=0; i<length; i++)
        {
          int rand =   (int ) (Math.random () * passwordset.length ());
          password[i] = passwordset.charAt (rand);

        }
        return new String (password);
    }

    private void setMailboxCapacity(int capacity)
    {
        this.mailboxCapacity = capacity;
    }
    public void setPassword(String password)
    {
        this.password = password  ;
    }
    public  int getMailboxCapacity(){return mailboxCapacity;}
    public String getAlternateEmail(){return alternateEmail;}
    public String getPassword() {return  password;}

    public  String showinfo(){
        return "Display name "+firstname+""+lastname+""+"\nCumpany Email:"+email+""+mailboxCapacity+"mb";
    }










}
