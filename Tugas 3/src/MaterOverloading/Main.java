package MaterOverloading;

public class Main {

    public static void main(String[] args) {
        KalkulatorPerkalian obj = new KalkulatorPerkalian();
        
        System.out.println("perkalian int: " + obj.perkalian(6, 10));
        System.out.println("perkalian double: " + obj.perkalian(6.5, 10.5));
    }
    
}
