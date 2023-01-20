package Business;

public class Company {
    private String middleName="Muhith";
    private char getMiddleInitial() {
        return middleName.charAt(2);
    }
    public void sayHello(){
        System.out.println("say hello");
    }
    public void saySomething(String Lastname){
        System.out.println(Lastname);
    }
    public int add(int a,int b){
        return a-b;
    }


    public static void main(String[] args) {
        Company c1 = new Company();
        c1.sayHello();
        System.out.println(c1.getMiddleInitial());
        c1.saySomething("Muhith");
        System.out.println(c1.add(5,3));
        System.out.println(c1.add(5,3));
        System.out.println(c1.add(5,3));
        System.out.println(c1.add(5,3));
        System.out.println(c1.add(5,3));


    }
}
