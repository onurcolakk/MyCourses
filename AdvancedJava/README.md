# ILERI JAVA UYGULAMALARI 2018 BAHAR

## YAPTIKLARI PROJEYİ A4 KAĞITLARINA/DEFTERLERİNE YAZANLARA (ÇIKTI DEĞİL) VE ÖDEVİ ADIM ADIM AÇIKLAYANLARA EK PUAN VERİLECEKTİR

Dersler Cumartesi 09:00-10:00 ve 10:15-11:30 arasında iki oturum halinde yapılacaktır.
Derse mazeretiniz yoksa %80 devam zorunludur. Derse devam ve derse katılımdan not verilecektir.

## VİZE PROJE

### Teslim Tarihi: 20 Nisan Cuma 23:59:59'a kadar ozkan.sari@outlook.com adresine sadece kod dosyalarınızı gönderiniz. Geç teslim kabul edilmeyecektir.

Vize Saatinde Projelerinizi Derste Sunacaksınız. 
Sunum yapmayanlardan -40 puan eksiltilerek not verilecektir.
Aynı ve benzer proje teslimlerini kopya olarak değerlendirilecektir

### Aciklama: 

Java Swing GUI uygulamasi olarak çalışan bir "Kütüphane Yönetim" uygulaması geliştirmelisiniz. 

Uygulamada menu halinde aşağıdaki seçenekler bulunacaktır: 
* Yayın evi ekle : Yayın evi adı ve e-posta adresi girdi olarak alınacaktır. Eklenen yayınevleri kitap eklemede seçenek olarak sunulacaktır. E-posta adresi eklemede düzenli ifade (regular expression) kontrolü yapılmalıdır. Hatalı formatta e-posta girişine izin verilmemelidir. Aynı şekilde boş girişe de izin verilmemelidir.
* Kitap Ekle : Sistemde eklenmiş yayın evi yoksa kitap eklemeye izin verilmemelidir. Kitap eklerken kitap adı, yazarı, türü, yayın evi, sayfa sayısı vb. sorular sorulacaktır. Yayın evi için sisteme eklenenler arasından seçim yaptırılmalıdır. Sayfa sayısı alanına sayı dışında bir değer girilmesine izin verilmemelidir. Aynı şekilde boş girişe de izin verilmemelidir.
* Kitapları Listele : Kitaplar bilgileriyle birlikte listelenebilecektir. Listelenen kitapların yanında silme seçeneği de bulunacaktır.
* Çıkış: Uygulamadan çıkış

Uygulama çıkışta sistemdeki kayitlari dosyaya yazacak ve uygulama acilirken kaldigi yerden devam edebilmesi icin dosyadan kayitlari okuyacaktir. 

Önemli noktalar:
* Uygulamanızda Kitap ve Yayinevi isimli sınıflar tanımlanmalı ve bunlar sistemde ArrayList olarak tutulmalı.
* Kullanıcı girişlerinde boş girişlere ya da sayfa sayısı gibi sayı beklenen yerlere harf girişine izin verilmemelidir.

## ODEVLER

### ODEV-1

* 1-) *Hayvan* sınıfı ve bundan türeyen *Kedi*, *Kopek*, *Zurafa* vb. sınıflar olusturulacak. 
* 2-) Programin calisacagi main metodu iceren *HayvanatBahcesi* isimli bir sinif yapilacak.
* 3-) HayvanatBahcesi sinifi icine *sesCikar* isimli bir metod yapilacak. Bu metod *sesSeviyesi* ve *Hayvan* siniflarini parametre alacak. Bu metod icerisinde parametre alinan hayvan nesnesinin tipine gore (Kedi,Kopek,Zurafa vb.) uygun ses ekrana yazilacak. Uygun sesin ekrana yazilmasi icin ilgili hayvan sınıflarına metod da tanımlanabilir.

    private static int sesCikar(int sesSeviyesi, Hayvan hayvan)

*İpucu:* https://github.com/ozkansari/MyCourses/blob/master/AdvancedJava/src/main/java/tr/edu/medipol/hafta02/IleriMatematik.java sınıfındaki islemYap() metodundan fikir alabilirsiniz.

Odevleri *ozkan.sari@outlook.com* adresine (projenin tümünü değil) sadece kaynak dosyaları zipleyip gönderiniz.

### ODEV -2 

List<String> kullanımı ile hafta 5'te yapılan [örneği](https://github.com/ozkansari/MyCourses/blob/master/AdvancedJava/src/main/java/tr/edu/medipol/hafta05/DosyaOkumaYazma3.java) , List<OgrenciBilgi> seklinde String yerine tanımlayacağınız OgrenciBilgi sinifi kullanarak yapınız.

Bunun icin,
* OgrenciBilgi isimli bir class osuturun ve icine ogrenciAdSoyad isimli bir String nesne degişkeni ekleyin. Değişkenin private olmasına dikkat edin.
* Daha sonra OgrenciBilgi sınıfını programınızda Dosya okurken, kullanıcıdan girdi alırken ve dosyaya yazarken kullanın.
* Programdaki tüm List<String> kullanımları List<OgrenciBilgi>  şeklinde değişmiş olmalı.

## DERS ICERIKLERI

* [SUNUMLAR](https://github.com/ozkansari/MyCourses/tree/master/AdvancedJava/_docs)

### Hafta 1-2-3 : Java Konu Tekrarları

* [1a_JavaProgramlamayaGiris](https://github.com/ozkansari/MyCourses/blob/master/AdvancedJava/_docs/1a_JavaProgramlamayaGiris.pdf)
* [2a_Basit_veri_turleri](https://github.com/ozkansari/MyCourses/blob/master/AdvancedJava/_docs/2a_Basit_veri_turleri.pdf)
* [2b_Degisken_tipleri](https://github.com/ozkansari/MyCourses/blob/master/AdvancedJava/_docs/2b_Degisken_tipleri.pdf)
* [2c_NesnelerVeSiniflaraGiris](https://github.com/ozkansari/MyCourses/blob/master/AdvancedJava/_docs/2c_NesnelerVeSiniflaraGiris.pdf)
* [3a_Denetleyiciler](https://github.com/ozkansari/MyCourses/blob/master/AdvancedJava/_docs/3a_Denetleyiciler.pdf)
* [3b_Operatorler](https://github.com/ozkansari/MyCourses/blob/master/AdvancedJava/_docs/3b_Operatorler.pdf)
* [3c_Donguler](https://github.com/ozkansari/MyCourses/blob/master/AdvancedJava/_docs/3c_Donguler.pdf)
* [3d_Karar_Ifadeleri](https://github.com/ozkansari/MyCourses/blob/master/AdvancedJava/_docs/3d_Karar_Ifadeleri.pdf)
* [3e_Faydalı_Metotlar](https://github.com/ozkansari/MyCourses/blob/master/AdvancedJava/_docs/3e_Faydal%C4%B1_Metotlar.pdf)
* [3f_Karakter_String_Islemleri](https://github.com/ozkansari/MyCourses/blob/master/AdvancedJava/_docs/3f_Karakter_String_Islemleri.pdf)

### Hafta 4 : Diziler, Zaman, Duzenli Ifadeler (regular Expressions)

* [4a_Diziler](https://github.com/ozkansari/MyCourses/blob/master/AdvancedJava/_docs/4a_Diziler.pdf)
* [4b_Zaman](https://github.com/ozkansari/MyCourses/blob/master/AdvancedJava/_docs/4b_Zaman.pdf)
* [4c_Duzenli_Ifadeler](https://github.com/ozkansari/MyCourses/blob/master/AdvancedJava/_docs/4c_Duzenli_Ifadeler.pdf)

### Hafta 5 : Dosya Islemleri ve Istisnalar

* [5a_Dosya_Islemleri](https://github.com/ozkansari/MyCourses/blob/master/AdvancedJava/_docs/5a_Dosya_Islemleri.pdf)
* [5b_Istisnalar](https://github.com/ozkansari/MyCourses/blob/master/AdvancedJava/_docs/5b_Istisnalar.pdf)

### Hafta 6 & 7 : Swing GUI

* [6a_JavaGUI](https://github.com/ozkansari/MyCourses/blob/master/AdvancedJava/_docs/6a_JavaGUI.pdf)
* [7a_JavaGUI_1](https://github.com/ozkansari/MyCourses/blob/master/AdvancedJava/_docs/7a_JavaGUI_1.pdf)
* [7b_JavaGUI_2](https://github.com/ozkansari/MyCourses/blob/master/AdvancedJava/_docs/7b_JavaGUI_2.pdf)

### Hafta 7

    // Acilirken dosyadan oku
    ArrayList ogrenciListesi = new ArrayList();
    while(scanner.hasNext()) {
      String satir = scanner.nextLine();
      String [] alanlar = satir.split(",");
      Ogrenci ogrenci = new Ogrenci(alanlar[0], alanlar[1], alanlar [2], alanlar[3]);
      ogrenciListesi.add(ogrenci);
    }
    
    // Cikarken dosyaya yaz
    PrintWriter dosyaYazici ....
    for(Ogrenci : ogrenciListesi) {
       dosyaYazici.writeLine(ogrenci.getAd()+","+ogrenci.getSoyad()+","+ .....);
    }
    dosyaYazici.close();


## Notlar

![Notlar](https://raw.githubusercontent.com/ozkansari/MyCourses/master/AdvancedJava/_docs/Notlar.png)

