package tr.edu.medipol.odevler.betul_ozdemir.odev2;
import java.io.*;
import java.util.*;

// HATALI: OgrenciBilgi cevrim ve okuma, hepsi null -35

public class DosyaOkumaYazma3 {
	

	public static void main(String[] args) throws FileNotFoundException {
		List<OgrenciBilgi> ogrenciListesi = dosyaOkumaOrnegi();
		consoleYazdirmaOrnegi(ogrenciListesi);
		
		ogrenciListesi = kullanicidanGirdiAl(ogrenciListesi);
		consoleYazdirmaOrnegi(ogrenciListesi);
		
		dosyaYazmaOrnegi(ogrenciListesi);
	}

	private static List<OgrenciBilgi> kullanicidanGirdiAl(List<OgrenciBilgi> ogrenciListesi) {
		String kullaniciGirdi = "";
		Scanner consoleScanner = new Scanner(System.in);
		do {
			System.out.print("Eklenecek ogrenciyi gir: ");
			kullaniciGirdi = consoleScanner.nextLine();
			if (kullaniciGirdi == null || kullaniciGirdi.trim().isEmpty() || kullaniciGirdi.equals("*") ) { 
				break;
			} else {
				OgrenciBilgi ogrenci=new OgrenciBilgi(kullaniciGirdi);
				ogrenciListesi.add(0, ogrenci); 
			}
		} while(true); 
		consoleScanner.close();
		return ogrenciListesi;
	}
	
	private static List<OgrenciBilgi> dosyaOkumaOrnegi() {
		List<OgrenciBilgi> ogrenciListesi = new ArrayList<>();
		
		File ogrencilerDosya = new File(".\\tr.edu.medipol.hafta05\\src\\ogrenciBilgi.txt"); 
		
		
		Scanner dosyaOkuyucu = null;
		try {
			dosyaOkuyucu = new Scanner(ogrencilerDosya);
			
			
			for(int satirSayisi=1;dosyaOkuyucu.hasNext();satirSayisi++) {
				System.out.println(satirSayisi + " inci satir okunuyor.");
/* ozkans HATALI */				OgrenciBilgi satir =OgrenciBilgi.nextLine();
				ogrenciListesi.add(satir);
			}
		
		} catch (FileNotFoundException | NullPointerException e) {
			System.out.println("Dosya bulunamad�" + e.getMessage());
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("Bilinmeyen bir hata " + e.getMessage());
		} finally {
			if (dosyaOkuyucu != null) {
				dosyaOkuyucu.close();
			}
		}
		return ogrenciListesi;
	}
	
	private static void dosyaYazmaOrnegi(List<OgrenciBilgi> ogrenciListesi) throws FileNotFoundException {
		File ciktiDosyasi = new File(".\\config\\Ogrenciler_Program.txt");
		PrintWriter dosyaYazici = new PrintWriter(ciktiDosyasi);
		for (OgrenciBilgi o : ogrenciListesi) {
			dosyaYazici.println(o);
		}
		dosyaYazici.close();
	}
	
	private static void consoleYazdirmaOrnegi(List<OgrenciBilgi> ogrenciListesi) {
		
		System.out.println("Mevcut Ogrenciler --------------------");
		for (int i = 0; i < ogrenciListesi.size(); i++) {
			System.out.println(ogrenciListesi.get(i));
		}
		System.out.println("-------------------------------------");
	}
}


