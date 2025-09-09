# 📱 Abstract Class Example

Pada materi **Abstract**, kita akan menggunakan `Smartphone` sebagai turunan terakhir.  
Urutan pewarisan class:  

`Product → Electronic → Smartphone`

## 📂 Struktur Class

- **Class Product**
  - `displayInfo()` → *abstract method*
  - `beli()` → *concrete method*

- **Class Electronic** (extends Product)
  - Mewarisi semua method dari `Product`
  - Menambahkan `hidupkan()` → *abstract method*

- **Class Smartphone** (extends Electronic)
  - Mengimplementasikan semua abstract method (`displayInfo`, `hidupkan`)

## 🖥️ Main Class

Di `Main`, kita akan membuat object bernama **samsung**  
(samsung adalah object dari class `Smartphone`).

```java
public class Main {
    public static void main(String[] args) {
        Smartphone samsung = new Smartphone();
        
        samsung.beli();
        samsung.displayInfo();
        samsung.hidupkan();
    }

---
# 💳 Materi Interface

Pada materi ini, kita akan **mengimplementasikan 3 interface** (`TransferBank`, `Qris`, dan `Cash`) pada class `Pembayaran`.  
Dengan begitu, class `Pembayaran` akan memiliki semua method dari masing-masing interface.  

Terakhir, pada class `Main`, kita akan membuat object bernama **tokoMajuJaya** untuk menjalankan semua method tersebut.  


## 📂 Struktur Project

- `TransferBank.java` → interface  
- `Qris.java` → interface  
- `Cash.java` → interface  
- `Pembayaran.java` → class implementasi (meng-implements semua interface)  
- `Main.java` → class utama untuk membuat object `tokoMajuJaya`  


## 📂 Struktur Interface & Class

- **Interface TransferBank**
  - `pakaiTransferBank()`

- **Interface Qris**
  - `pakaiQris()`

- **Interface Cash**
  - `pakaiCash()`

- **Class Pembayaran** (implements `TransferBank`, `Qris`, `Cash`)
  - Mengimplementasikan semua method dari ketiga interface.

- **Class Main**
  - Membuat object `tokoMajuJaya` dari class `Pembayaran`.
  - Menjalankan semua method (`pakaiTransferBank()`, `pakaiQris()`, `pakaiCash()`).

---

 TransferBank   Qris   Cash   (Interfaces)
      \         |      /
       \        |     /
        \       |    /
         \      |   /
           Pembayaran (Class)
                 |
                 v
           tokoMajuJaya (Object)

---

# ✨ Materi Overloading

**Overloading** adalah ketika sebuah **class memiliki method dengan nama yang sama tapi parameter berbeda**.  
Semua versi method berada di **class yang sama**, dan Java akan otomatis memilih versi method yang sesuai dengan **tipe dan jumlah parameter** yang diberikan saat dipanggil.  


## 📂 Struktur Project

- `KalkulatorPerkalian.java` → class dengan 2 versi method `perkalian()`
- `Main.java` → class untuk membuat object dan memanggil kedua versi method


# 🚗 Materi Overriding 

Pada materi ini, kita belajar tentang **overriding**, yaitu ketika **subclass membuat versi baru dari method yang sudah ada di superclass**.  
Kita menggunakan contoh: `Transportasi → Mobil → senna`.  

- `senna` adalah object dari class `Mobil`, tapi disimpan di variabel tipe `Transportasi`.  
- Saat memanggil method `jalan()`, yang dijalankan adalah versi dari `Mobil`.  
- Ini juga menunjukkan **polymorphism**, karena satu variabel bisa menjalankan method sesuai object aslinya.  


## 📂 Struktur Project

- `Transportasi.java` → superclass  
- `Mobil.java` → subclass yang meng-override method `jalan()`  
- `Main.java` → class untuk membuat object `senna` dan memanggil method  
