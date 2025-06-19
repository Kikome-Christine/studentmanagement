public class Assigment1 {
    public static void main(String[] args){
        String name = "Kikome christine";
        int age = 23;
        System.out.println(age);
        String course = "Computer science";
        String department = "Computer science";
        double distance = 300;
        System.out.println(distance);
        System.out.println("Name:" + name);

        float distancecalculated = (float)age;
        System.out.println(distancecalculated);

        int a = 7;
        int b = 6;
        System.out.println(a>b);
        System.out.println(a==b);
        int c = a+b;
        System.out.println(c);
        System.out.println(c&b);

        Assigment1 test = new Assigment1();
        System.out.println(test instanceof Assigment1);

        String trial = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(trial.length());
        String result = name.concat(trial);
        System.out.println(result);
        System.out.println(name + " "+ trial);
        System.out.println(name.charAt(3));
        String str = new String("chris");
        System.out.println(str);

    }
}
