
public class PersonController {
    public static void main(String[] args) {
        Person sue=new Person("sue",25);
        System.out.println(sue.getAge());
        System.out.println(sue.getName());

        sue.setAge(-23);
        System.out.println(sue.getAge());
        sue.plusAge();
        System.out.println(sue.getAge());
    }
}
