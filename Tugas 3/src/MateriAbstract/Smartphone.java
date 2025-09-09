package MateriAbstract;

public class Smartphone extends Electronic{
    @Override
    protected void displayInfo(){
        System.out.println("Ini adalah produk Smartphone");
    }
    
    @Override
    public void hidupkan(){
        System.out.println("Smartphone dinyalakan");
    }
    
}
