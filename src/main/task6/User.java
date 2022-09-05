package main.task6;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String email;

    /*public User(String firstName,String lastName,  int age, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }*/
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public int getAge() {return age;}
    public String getEmail() {return email;}

    public void setFirstName(final String firstName) {this.firstName = firstName;}
    public void setLastName(final String lastName) {this.lastName = lastName;}
    public void setAge(final int age) {this.age = age;}
    public void setEmail(final String email) {this.email = email;}

    @Override
    public  boolean equals(final Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        final User guest = (User) obj;
        return age == guest.age
                && (firstName == guest.firstName
                || (firstName != null &&firstName.equals(guest.getFirstName())))
                && (lastName == guest.lastName
                || (lastName != null && lastName.equals(guest.getLastName())
                && (email == guest.email
                || (email != null && email.equals(guest.getEmail())))
        ));
    }
    @Override
    public  int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + age;
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        return result;
    }

    public static void main(final String[] args) {
        final User a = new User();
        a.setFirstName("Vasul");
        a.setLastName("Nyul");
        a.setAge(17);
        a.setEmail("email@.com");

        final User b = new User();
        b.setFirstName("Vasul");
        b.setLastName("Nyul");
        b.setAge(17);
        b.setEmail("email@.com");

        System.out.println(a.equals(b));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

    }
}

