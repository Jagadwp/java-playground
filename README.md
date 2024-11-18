Berikut adalah **10 pertanyaan interview** mengenai **Java** yang sering ditanyakan, dengan fokus pada berbagai konsep dasar hingga menengah:

### 1. **Apa perbedaan antara `==` dan `equals()` dalam Java?**
   - `==` membandingkan referensi atau alamat memori objek, sedangkan `equals()` digunakan untuk membandingkan isi atau nilai objek, yang dapat diimplementasikan ulang pada kelas tertentu.

### 2. **Jelaskan konsep **Inheritance** (Pewarisan) dalam OOP dan bagaimana Java mengimplementasikannya.**
   - Inheritance memungkinkan sebuah kelas untuk mewarisi atribut dan metode dari kelas lain. Di Java, ini dilakukan dengan kata kunci `extends`. Kelas yang mewarisi disebut subclass, dan kelas yang diwarisi disebut superclass.

### 3. **Apa itu `null` di Java dan bagaimana cara menangani `NullPointerException`?**
   - `null` adalah nilai khusus yang menunjukkan bahwa objek belum diinisialisasi atau tidak menunjuk ke objek apapun. `NullPointerException` terjadi ketika program mencoba mengakses atau memodifikasi objek yang bernilai `null`.

### 4. **Apa perbedaan antara `ArrayList` dan `LinkedList` di Java?**
   - `ArrayList` menggunakan array dinamis untuk menyimpan elemen, sehingga akses elemen lebih cepat, tetapi operasi seperti penambahan atau penghapusan elemen memerlukan waktu lebih lama. `LinkedList` menggunakan struktur data linked list yang memungkinkan operasi penambahan dan penghapusan lebih cepat tetapi lebih lambat dalam mengakses elemen.

### 5. **Apa itu `Java Virtual Machine (JVM)` dan apa peranannya?**
   - JVM adalah mesin yang menjalankan bytecode Java di platform yang berbeda. JVM bertanggung jawab untuk mengonversi bytecode menjadi instruksi yang dapat dijalankan oleh sistem operasi yang digunakan.

### 6. **Jelaskan perbedaan antara `abstract class` dan `interface` di Java.**
   - `abstract class` dapat memiliki metode yang diimplementasikan maupun yang tidak diimplementasikan, dan bisa memiliki variabel atau konstruktor. `interface` hanya dapat mendeklarasikan metode tanpa implementasi (di versi Java sebelum 8), dan tidak bisa memiliki state atau konstruktor.

### 7. **Apa itu `final`, `finally`, dan `finalize()` dalam Java?**
   - **`final`**: Digunakan untuk mendeklarasikan variabel, metode, atau kelas yang tidak dapat diubah.
   - **`finally`**: Blok kode yang akan selalu dijalankan setelah eksekusi blok `try`, terlepas dari apakah ada pengecualian atau tidak.
   - **`finalize()`**: Sebuah metode dalam kelas `Object` yang dipanggil oleh garbage collector sebelum objek dihancurkan.

### 8. **Apa itu `synchronized` dalam Java dan bagaimana penggunaannya?**
   - Kata kunci `synchronized` digunakan untuk memastikan bahwa hanya satu thread yang dapat mengakses metode atau blok kode tertentu pada saat yang bersamaan. Ini digunakan untuk mencegah kondisi balapan (race condition) dalam aplikasi multithreaded.

### 9. **Jelaskan perbedaan antara `String`, `StringBuilder`, dan `StringBuffer` di Java.**
   - `String` adalah objek yang tidak dapat diubah (immutable), artinya perubahan pada string akan menghasilkan objek baru. `StringBuilder` dan `StringBuffer` adalah kelas yang dapat dimodifikasi (mutable), tetapi `StringBuffer` lebih aman dalam penggunaan multithreading karena memiliki mekanisme sinkronisasi, sedangkan `StringBuilder` lebih cepat tetapi tidak thread-safe.

### 10. **Apa itu `Garbage Collection` di Java dan bagaimana cara kerjanya?**
   - Garbage collection adalah proses otomatis yang dilakukan oleh JVM untuk mengelola memori dengan cara menghapus objek yang tidak lagi digunakan atau dapat diakses oleh program. JVM akan melacak objek yang masih digunakan dan menghapus objek yang sudah tidak diperlukan, sehingga mencegah kebocoran memori.

---

Semoga pertanyaan-pertanyaan ini membantu Anda dalam mempersiapkan wawancara Java! Jika Anda membutuhkan penjelasan lebih lanjut tentang konsep-konsep ini atau ingin pertanyaan lainnya, beri tahu saya! 😊