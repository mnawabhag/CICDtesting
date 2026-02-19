public class ConstructorChaining {

    ConstructorChaining(){
        this("Unknown");
        System.out.println("Default constructor");
    }

    ConstructorChaining(String name) {
        System.out.println("Name: " + name);
    }

}
