public class SingleInheritance{
    public static void main(String[] args) {
        greet g = new greet();
        g.getIntro();
        g.print();
    }
}

class intro{

    public void getIntro(){
        System.out.println("Hey there!, This is bhavani");
    }
}

class greet extends intro{

    public void print(){
       System.out.println("Nice to meet you!");
    }
}
