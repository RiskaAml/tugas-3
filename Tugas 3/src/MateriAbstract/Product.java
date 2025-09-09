package MateriAbstract;

abstract class Product {
    //abstract method
    protected abstract void displayInfo();
    
    //concrete method
    protected void beli(){
        System.out.println("produk dibeli");
    }
    
}
