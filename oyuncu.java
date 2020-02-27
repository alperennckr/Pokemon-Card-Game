import java.util.ArrayList;

public class oyuncu {
	pokemon poke=new pokemon();
	String oyuncuID;
	String oyuncuAdi;
	public ArrayList<pokemon> kartlar=new ArrayList<pokemon>();
	int skor=0;
	public oyuncu() {
		this.oyuncuAdi="Bilgi girilmedi.";
		this.oyuncuID="Bilgi girilmedi.";
		skor=0;
	}
	public oyuncu(String oyuncuID, String oyuncuAdi, int skor) {
		this.oyuncuID = oyuncuID;
		this.oyuncuAdi = oyuncuAdi;
		this.skor = skor;
	}
	public oyuncu(String oyuncuID,String oyuncuAdi) {
		this.oyuncuID = oyuncuID;
		this.oyuncuAdi = oyuncuAdi;
	}
	public String getOyuncuID() {
		return oyuncuID;
	}
	public void setOyuncuID(String oyuncuID) {
		this.oyuncuID = oyuncuID;
	}
	public String getOyuncuAdi() {
		return oyuncuAdi;
	}
	public void setOyuncuAdi(String oyuncuAdi) {
		this.oyuncuAdi = oyuncuAdi;
	}
	public ArrayList<pokemon> getKartlar() {
		return kartlar;
	}
	public void setKartlar(ArrayList<pokemon> kartlar) {
		this.kartlar = kartlar;
	}
	public int getSkor() {
		return skor;
	}
	public void setSkor(int skor) {
		this.skor = skor;
	}
	void skorGoster() {
		
	}
	void kartSec() {
		
	}
}
abstract class oyuncutemel{
	
}
class bilgisayar extends oyuncu{

	@Override
	void skorGoster() {
		// TODO Auto-generated method stub
		super.skorGoster();
	}

	@Override
	void kartSec() {
		// TODO Auto-generated method stub
		super.kartSec();
	}
	public String getOyuncuID() {
		return oyuncuID;
	}
	public void setOyuncuID(String oyuncuID) {
		this.oyuncuID = oyuncuID;
	}
	public String getOyuncuAdi() {
		return oyuncuAdi;
	}
	public void setOyuncuAdi(String oyuncuAdi) {
		this.oyuncuAdi = oyuncuAdi;
	}
	public ArrayList<pokemon> getKartlar() {
		return kartlar;
	}
	public void setKartlar(ArrayList<pokemon> kartlar) {
		this.kartlar = kartlar;
	}
	public int getSkor() {
		return skor;
	}
	public void setSkor(int skor) {
		this.skor = skor;
	}
	
	
}
class kullanici extends oyuncu{

	@Override
	void skorGoster() {
		// TODO Auto-generated method stub
		super.skorGoster();
	}

	@Override
	void kartSec() {
		// TODO Auto-generated method stub
		super.kartSec();
	}
	public String getOyuncuID() {
		return oyuncuID;
	}
	public void setOyuncuID(String oyuncuID) {
		this.oyuncuID = oyuncuID;
	}
	public String getOyuncuAdi() {
		return oyuncuAdi;
	}
	public void setOyuncuAdi(String oyuncuAdi) {
		this.oyuncuAdi = oyuncuAdi;
	}
	public ArrayList<pokemon> getKartlar() {
		return kartlar;
	}
	public void setKartlar(ArrayList<pokemon> kartlar) {
		this.kartlar = kartlar;
	}
	public int getSkor() {
		return skor;
	}
	public void setSkor(int skor) {
		this.skor = skor;
	}
	
}
