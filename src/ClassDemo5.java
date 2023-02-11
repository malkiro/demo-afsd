public class ClassDemo5 {
    public static void main(String[] args) {
        //copy --> java Object
        ClassDemo5_Student std1 = new ClassDemo5_Student();
        std1.name="Yasindu";
        std1.age=27;
        std1.isDrink=false;
        std1.isSing=true;
        std1.sing();

        ClassDemo5_Student std2 = new ClassDemo5_Student();
        std2.name="Kasun";
        std2.age = 40;
        std2.isHaveGF = true;
        std2.isDrink=true;
        std2.dance();

        System.out.println(std1.name);
        System.out.println(std1.age);

        System.out.println(std2.name);
        System.out.println(std2.age);

        ClassDemo5_Student.sing();

        //
        ClassDemo5_CustomerController.addStudent();
    }
}
