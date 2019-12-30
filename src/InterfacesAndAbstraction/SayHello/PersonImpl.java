package InterfacesAndAbstraction.SayHello;

public class PersonImpl  implements Person{
    private String name;

    public PersonImpl(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello");
    }
}
