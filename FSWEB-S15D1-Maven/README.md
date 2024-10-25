#  Java Lists

### Proje Kurulumu

Projeyi öncelikle forklayın ve clone edin.
Daha sonra projeyi IntellijIDEA kullanarak açınız. README.md dosyasını dikkatli bir şekilde okuyarak istenenleri yapmaya çalışın.
Proje sayımız ilerledikçe proje yönetimimizi kolaylaştırmak adına projelerimizi belli klasör kalıplarında saklamak işimizi kolaylaştırmak adına iyi bir alışkanlıktır.
Örnek bir Lokasyon: Workintech/Sprint_1/Etud.

### Hedeflerimiz:

### ArrayList Challenge

 * Amacımız bir pazar arabası listesi oluşturmak.
 * org.example.models paketi altında Grocery adında bir sınıf oluşturunuz. Tüm işlemleri bu sınıf altında dizayn ediniz.
 * Bir tane  ```groceryList``` adında ArrayList tipinde bir objeye ihtiyacımız var. ```public static``` olacak şekilde bu listeyi tanımlayınız.
 * ```startGrocery()``` adında bir method yazınız. Method içerisinde bir konsol uygulaması oluşturmalı. Kullanıcı 0, 1 veya 2 değerlerini girebilir.(Scanner sınıfını kullanarak yapabilirsiniz.)
 * 0 uygulamayı durduracak.
 * 1 e tıklandığında ekrana bir prompt bastırın. ```Eklenmesini istediğiniz elemanları giriniz.``` Kullanıcı bu opsiyonu 2 farklı biçimde kullanabilir. Tek bir eleman ekleyebilir. Ya da virgüllerle ayırarak birden çok eleman ekleyebilir(tomato, orange, peach)
 * 2 e tıklandığında ekrana bir prompt bastırın. ```Cıkarılmasını istediğiniz elemanları giriniz.``` Kullanıcı bu opsiyonu 2 farklı biçimde kullanabilir. Tek bir eleman çıkarabilir. Ya da virgüllerle ayırarak birden çok eleman çıkarabilir(tomato, orange, peach)
 *  Kullanıcıların tüm yaptıkları ekleme ve çıkarma işlemleri bu liste üzerinde yapılmalı.
 * 4 tane static metod yazmalıyız. ```addItems(String input)``` => listeye eleman eklemeli., ```removeItems(String input)``` => listeden eleman silmeli, ```checkItemIsInList(String product)``` => eklenmeye ya da silinmeye çalışılan elaman listede varmı kontrolü yapmalı, ```printSorted``` => tüm listeyi sıralayarak ekrana basmalı.
 * Her operasyon sonrasında liste sort edilmeli
 * Listede hiçbir şekilde tekrar eden veri bulunmamalı.
 
### Mobile Phone

* org.example.mobile paketi altında ```MobilePhone``` ve ```Contact``` isimli bir sınıf oluşturacağız.
* ```MobilePhone``` sınıfını 2 tane field tutması lazım. Bir tanesi ```myNumber``` isminde ve String tipinde, ```myContacts``` isminde ve Contact ArrayList'i olmalı. 2 field içinde getter methodu tanımlayınız.
* Constructor metodu myNumber değerini doldurmalı.
* 7 tane metodumuz olmalı
* ```addNewContact``` Contact türünde bir parametre alır. Boolean türünde bir değer döndürür. Contact listede yoksa Contact objesini listeye ekleyip ```true``` varsa ```false``` değeri döner.  
* ```updateContact``` Contact türünde iki parametre alır. Contact lardan biri eskisi biri yenisinin değerini tutar. Boolean bir değer döner. Eğer Contact listede varsa ve doğru bir şekilde update edilirse ```true``` değer döner. Aksi durumda  ```false``` değeri döner.
* ```removeContact``` Contact türünde bir parametre alır. Eğer Contact listede varsa ve başarılı bir şekilde silinirse ```true``` aksi durumda ```false``` değeri döner.,
* ```findContact``` Contact türünde bir parametre alır ve ```int``` değer döndürür. Dönüş değeri Contact objesinin listedeki indeksi olmalıdır. Eğer eleman listede yoksa ```-1``` değeri döner.
* ```findContact``` yukardaki findContact metodu ile aynı şekilde çalışır. Sadece parametresinin tipi ```String``` olmalıdır.
* ```queryContact``` String tipinde bir değer alır ve Contact türünde bir değer döndürür. String parametre Contact ismini içerir. Eğer ilgili isimdeki Contact listede varsa ilgili Contact objesini döndürür. Yoksa null döndürür
* ```printContact``` parametre almaz return değeri de yoktur. Contactların tamamını  aşağıdaki formattaki gibi listeler.
  Contact List:
1. Bob -> 31415926
2. Alice -> 16180339
3. Tom -> 11235813
4. Jane -> 23571113

* Contact sınıfını tanımlayınız. ```name``` ve ```phoneNumber``` adında String tipinde 2 değişkeni olmalı.
* Constructor metodu ```name``` ve ```phoneNumber``` parametrelerini almalı ve değer atamalarını yapmalı.
* ```getName``` name için getter metodu, ```getPhoneNumber``` phoneNumber için getter metodu tanımlanmalı. 
* ```createContact``` iki parametre alan bir metod olmalı.(Name ve phoneNumber ikiside String olmalı) aldığı iki değeri kullanarak bir Contact ```instance``` oluşturmalı ve bunu dönmeli.
* ```createContact``` metodu ```static``` olmalı.
