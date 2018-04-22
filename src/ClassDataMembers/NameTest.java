package ClassDataMembers;

public class NameTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        /** INSTANIATION **/
        /** Instantiation is when we are declaring a class object and assigning
         * data to it. **/
        //This calls the constructor with 3 parameters.
        Name myName = new Name("Micheal", "Mason", "McMillan");
        //This calls the constructor with 2 parameters.
        Name yourName = new Name("Raymond", "Williams");
        //This calls the constructor with 1 parameters.
        Name aName = new Name("Durr");
        //This calls the constructor with NO parameters.
        Name someName = new Name();

        System.out.println("myName: " + myName.toString());
        System.out.println("myName: " + yourName.toString());
        System.out.println("myName first name: " + myName.getFirst());
        yourName.setLast("Brown");
        System.out.println("yourName: " + yourName.toString());
        someName.setName("John", "Quincy", "Adams");
        System.out.println("someName: " + someName.toString());
    }
}
