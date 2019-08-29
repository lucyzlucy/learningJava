package Other;

public class Student {
    private String name;
    private String lastName;
    private int number;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getFullName() {
        return this.name + this.lastName;
    }


    public void printFullName () {
        System.out.println(this.name + " " + this.lastName);
    }

    public int getNumber() {
        return number;
    }
}
