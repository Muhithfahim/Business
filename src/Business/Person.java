package Business;

 public class Person {
    private String firstname;
    private String lastname;
    private  int age;

    public Person (String firstname,String lastname,int age){
        this.firstname= firstname;
        this.lastname=lastname;
        this.age=age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

         public static void main(String... args) {
             Person person1 = new Person("johnny","smith",21);
             System.out.println("firstname: "+ person1.firstname +
                     "  lastname: "+
                     person1.lastname+
                     "  Age:"+
                     +person1.age);
         }



}
