package exercises.technology;

public class Main {
    public static void main(String[] args){
       System.out.println("--------------------");
       Laptop lenovo = new Laptop("Lenovo", "IdeaPad 5 15ITL05",2.8,500,15.6);
       System.out.println(lenovo.getId());
       System.out.println(lenovo.getMake());
       System.out.println(lenovo.getModelName());
       System.out.println(lenovo.display(lenovo.getScreenSize()));
       System.out.println("--------------------");

       SmartPhone iPhone = new SmartPhone("iPhone", "iPhone 11 Pro Max",2.66 ,64,226);
       System.out.println(iPhone.getId());
       System.out.println(iPhone.getMake());
       System.out.println(iPhone.getModelName());
       System.out.println(iPhone.isHeavy());
       System.out.println("--------------------");

       Computer mac = new Laptop("Mac", "MacBook Air",1.1 ,2000, 13.3);
       System.out.println(mac.getId());
       System.out.println(mac.getMake());
       System.out.println(mac.getModelName());
       System.out.println("--------------------");

       SmartPhone samsung = new SmartPhone("Samsung", "Galaxy Note20 Ultra",2.7 ,512, 208);
       System.out.println(samsung.getId());
       System.out.println(samsung.getMake());
       System.out.println(samsung.getModelName());
       System.out.println("--------------------");
       System.out.println(samsung.isHeavy());

    }
}
