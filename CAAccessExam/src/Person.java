public class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age){
        if(age>0 && age<100){
            this.age=age;
            System.out.println(this.age);
        }else{
            System.out.println("1부터 99사이의 숫자를 입력하세요; 100세 이상은 사람이 아니라 산신령입니다.");
        }
    }

    public Integer plusAge() {
        return this.age++;
    }
}
