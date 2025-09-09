package MateriInterface;

public class Main {
     public static void main(String[] args){
        Pembayaran tokoMajuJaya = new Pembayaran();
        
        tokoMajuJaya.pakaiCash();
        tokoMajuJaya.pakaiQris();
        tokoMajuJaya.pakaiTransferBank();
        
    }
}
