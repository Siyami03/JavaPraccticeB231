package Day6.inheritance01;

public class Child extends Parent{
    public static void main(String[] args) {

        System.out.println(Parent.isim);
        System.out.println(Parent.soyisim);
        Parent.method1();
        Parent.method2();
        System.out.println("------------------------");

        Parent obje1 = new Parent();
        System.out.println(obje1.yas);
        obje1.method3();
        obje1.method4();
        System.out.println("-----------------------");

        Child obje2 = new Child();
        System.out.println(obje2.yas);
        obje2.method3();
        obje2.method4();














    }
}
