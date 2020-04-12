public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");
        String name="john";
        System.out.println("Hello" + name);
        int myNum = 15;
        myNum = 20;
        System.out.println(myNum);
        final int x = 15;
        System.out.println(x);
        boolean Mybool = true;
        System.out.println(Mybool);
        char Mychar = 'd';
        System.out.println(Mychar);
        int z = 6;
        int y = 5;
        System.out.println(z+y);
        float f1 = 35e3f;
        System.out.println(f1);
        char a = 65 , b = 66 , c = 67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        char A = 97 , B = 69;
        System.out.println(A);
        System.out.println(B);
        int MyInt = 9;
        float MyFloat = MyInt;
        System.out.println(MyInt);
        System.out.println(MyFloat);
        int m = 7;
        System.out.println(!(m>10 || m<3));
        String txt = "asdfghjkl";
        System.out.println("The length of the txt string is: " + txt.length());
        String text = "Hello world";
        System.out.println(text.toLowerCase());
        String matn = "Please locate where 'locate' occurs!";
        System.out.println(matn.indexOf("locate"));
        String firstname = "sara" , lastname = "sheybani";
        int age = 18;
        System.out.println(firstname + " " + lastname + age);
        String book = "It\'s alright";
        System.out.println(book);
        System.out.println(Math.min(8,6));
        System.out.println(Math.abs(-33.7));
        System.out.println(Math.random());
        int time = 12;
        String result = (time<16)? "good" : "bad";
        System.out.println(result);


    }
}
