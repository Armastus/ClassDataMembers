package ClassDataMembers;

public class Name {
    /**A private declaration means the exposure of the variable
     * is only within the definition of the class 'Name' and not to
     * any other part of the program. **/
    private String first;
    private String middle;
    private String last;

    /** METHODS **/
    /** Methods have 4 parts:
     * TYPE: A method by default is public.
     * Return Type: So String in this case.
     * Name: Name of the method.
     * Arguments: This can be left blank.**/
    public String displayName() {
        return first + " " + middle + " " + last;
    }

    public String getInitial() {
        /** substring(0, 1)
         * The first parameter means where we want to start
         * in the string of characters. The second parameter is
         * the number of characters to pull. **/
        return first.substring(0, 1) + middle.substring(0, 1) +
                last.substring(0, 1);
    }

    public String toString() {
        return first + " " + middle + " " + last;
    }

    /**********************************************************************/

    /** CONSTRUCTOR METHODS **/
    /** Constructor methods allow us to instantiate (declare) a class
     * object and provide that object with some data.
     * Constructor Methods have 3 parts:
     * TYPE: A constructor methods by default are public.
     * Name: Name of the constructor method, which is always the same
     * as the name of the class, so 'Name'.
     * Arguments: This can be left blank. **/
    public Name (String f, String m, String l) {
        first = f;
        middle = m;
        last = l;
    }

    /** NOTE: We can have multiple constructor methods in a class
     * but they must each have different arguments.
     * By creating multiple constructor methods we call this, "Overloading"
     * So we are overloading our constructor methods. The computer knows
     * which constructor to use by the number of parameters we pass when
     * we call our constructor method. **/
    public Name (String f, String l) {
        first = f;
        middle = "";
        last = l;
    }

    public Name (String l) {
        first = "";
        middle = "";
        last = l;
    }

    /** DEFAULT CONSTRUCTOR METHOD **/
    /** A default constructor method contains no arguments passed.
     * This is because a default value for a constructor method is empty
     * arguments, just like a default value for a string is an empty string.
     * NOTE: It's always a good idea to have a default constructor in case
     * the programmers needs to utilize a constructor and provide their own
     * unique values.
     * FYI: The compiler will automatically provide a default constructor method
     * but it's good to do it yourself for readability to others and yourself. **/
    public Name() {
        first = "";
        middle = "";
        last = "";
    }

    /** GETTER AND SETTER METHODS **/
    /** These are used to GET data from a class object and then SET
     * the data members to a particular value. **/
    /** Getter and Setter Methods have 3 parts:
     * TYPE: A GET/SET method by default is public.
     * Return Type: It is a String function because our data members are strings.
     * Name: Name of the method.
     * Arguments: This can be left blank.**/
    public String getFirst() {
        return first;
    }

    public String getMiddle() {
        return middle;
    }

    public String getLast() {
        return last;
    }

    //This one is void since it has no return type.
    public void setFirst(String fname) {
        first = fname;
    }

    public void setMiddle(String mname) {
        middle = mname;
    }

    public void setLast(String lname) {
        last = lname;
    }

    public void setName(String f, String m, String l) {
        first = f;
        middle = m;
        last = l;
    }
}
