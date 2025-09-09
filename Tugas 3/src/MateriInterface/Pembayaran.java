package MateriInterface;

public class Pembayaran implements Cash, Qris, TransferBank{
    
    //implements Cash 
    public void pakaiCash(){
        System.out.println("Pembayaran bisa menggunakan uang tunai");
    }
    //implements Qris
    public void pakaiQris(){
        System.out.println("Pembayaran bisa melalui Qris");
    }
    
    //implements TrasferBank
    public void pakaiTransferBank(){
        System.out.println("Pembayaran bisa melalui tranfer bank");
    }
   
}
