package tr.edu.medipol.odevler.betul_ozdemir.odev1;
import org.junit.*;

// Tum siniflarda: @Test annotation yok -20

public class HesaplamaTest {
	@Test
	public void KüpAlma(){
		Assert.assertEquals(1000,Matematikselİslemler.KüpAlma(10));
	
	}
	public void Bölme() {
		int sonuc=Matematikselİslemler.Bölme(20, 5);
	    Assert.assertEquals(4,sonuc);
	   
	}
	public void Toplama() {
		int sonuc=Matematikselİslemler.Toplama(10, 10);
		Assert.assertEquals(20,sonuc);
	}
	public void Çıkarma() {
		int sonuc=Matematikselİslemler.Çıkarma(10, 2);
		Assert.assertEquals(8,sonuc);
	}
	public void Çarpma() {
		int sonuc=Matematikselİslemler.Çarpma(5, 2);
		Assert.assertEquals(10,sonuc);
	}
	public void KökAlma() {
		double sonuc=Matematikselİslemler.KökAlma(7);
		Assert.assertEquals(2,64,sonuc);
	}
	public void MutlakDeğer() {
		int sonuc=Matematikselİslemler.MutlakDeğer(7);
		Assert.assertEquals(7,sonuc);
	}
	public void MinSayi() {
		int sonuc=Matematikselİslemler.MinSayi(10, 5);
		Assert.assertEquals(5,sonuc);
	}
	public void MaxSayi() {
		int sonuc=Matematikselİslemler.MaxSayi(10, 5);
		Assert.assertEquals(10,sonuc);
	}
	public void ModAlma() {
		int sonuc=Matematikselİslemler.ModAlma(10, 5);
		Assert.assertEquals(0,sonuc);
}
}
