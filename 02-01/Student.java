
public class Student {
    private String firstName;
    private String lastName;
    private int id;
    private int age;
    
     /**
     * Sets the value of the age. This value must be non-negative. 
     *
     * @param value the new, non-negative value of the age.
     * @throws IllegalArgumentException if a non-negative value is given.
     */
    public Student (String firstName, String lastName, int id, int age) {
        this.firstName = firstName;
        this.lastName  = lastName;
        this.id        = id;
        this.age       = age;
    }
    /**
     * Returns the string value of the firstName.
     */
    public String getFirstName(){
        return firstName;
    }
        /**
     * Returns the string value of the lastName.
     */
    public String getLastName(){
        return lastName;
    }
    /**
     * Returns the integer value of the id.
     */
    public int getid(){
        return id;
    }
    /**
     * Returns the integer value of the age. 
     */
    public int getAge(){
        return age;
    }
    /**
     * Sets the value of the firstName.
     *
     * @param value the new, string value of the firstname.
     */
    public void setFirstName(String firstname){
        this.firstName = firstname;
    }
    /**
     * Sets the value of the lastName.
     *
     * @param value the new, string value of the lastname.
     */
    public void setLastName(String lastname){
        this.lastName = lastname;
    }
    
    /**
     * Sets the value of the id. 
     *
     * @param value the new, non-negative integer value of the age.
     * @throws IllegalArgumentException if a non-negative value is given.
     */
    public void setid(int id){
        if (id > 0) {
            this.id = id;
        } else {
            throw new IllegalArgumentException();
        }
    }

    /**
     * Sets the value of the age. This value must be non-negative. 
     *
     * @param value the new, non-negative value of the age.
     * @throws IllegalArgumentException if a non-negative value is given.
     */
    public void setAge(int age){
        if (age > 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException();
        }
    }
	
	
    public static void main(String[] args) {
        Student student = new Student("Jacob", "Jeff", 10, 25);
        student.setLastName("Johnson");
        student.setFirstName("Steve");
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
    }

}
