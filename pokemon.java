import java.awt.Image;

import javax.swing.ImageIcon;

class pokemon {
	public int hasarPuani;
	public String pokemonID;
	public String pokemonAdi;
	public String pokemonTip;
	public boolean kartKullanildiMi;
	public Image resim;
	public pokemon() {
		this.pokemonID="Bilgi yok.";
		this.pokemonAdi="Bilgi yok";
		this.pokemonTip="Bilgi yok";
	}
    public pokemon(String pokemonAdi) {
		this.pokemonAdi=pokemonAdi;
	}
    public pokemon(String pokemonAdi,String pokemonTip) {
		this.pokemonAdi=pokemonAdi;
		this.pokemonTip=pokemonTip;
		
    }
	void hasarpuanigoster() {
		
	}
	public String getPokemonID() {
		return pokemonID;
	}
	public void setPokemonID(String pokemonID) {
		this.pokemonID = pokemonID;
	}	
	public String getPokemonAdi() {
		return pokemonAdi;
	}
	public void setPokemonAdi(String pokemonAdi) {
		this.pokemonAdi = pokemonAdi;
	}
	public String getPokemonTip() {
		return pokemonTip;
	}
	public void setPokemonTip(String pokemonTip) {
		this.pokemonTip = pokemonTip;
	}
	public Image getResim() {
		return resim;
	}
	public void setResim(Image resim) {
		this.resim = resim;
	}
	public boolean isKartKullanildiMi() {
		return kartKullanildiMi;
	}
	public void setKartKullanildiMi(boolean kartKullanildiMi) {
		this.kartKullanildiMi = kartKullanildiMi;
	}
	public int getHasarPuani() {
		return hasarPuani;
	}
	public void setHasarPuani(int hasarPuani) {
		this.hasarPuani = hasarPuani;
	}
}
class Pikachu extends pokemon{
	public int hasarPuani=40;
	public boolean kartKullanildiMi=false;
	public Image resim=new ImageIcon(this.getClass().getResource("/pikachu.jpg")).getImage();
	public Pikachu() {
		super("Pikachu","Elektrik");
	}
	public Pikachu(String pokemonAdi, String pokemonTip) {
		super(pokemonAdi, pokemonTip);
	}
	public Pikachu(String pokemonAdi) {
		super(pokemonAdi);
	}
	public boolean isKartKullanildiMi() {
		return kartKullanildiMi;
	}
	public void setKartKullanildiMi(boolean kartKullanildiMi) {
		this.kartKullanildiMi = kartKullanildiMi;
	}
	void hasarpuanigoster() {
		this.hasarPuani=40;
		System.out.println(this.hasarPuani);
		super.hasarpuanigoster();
	}
	public Image getResim() {
		return resim;
	}
	public void setResim(Image resim) {
		this.resim = resim;
	}
	public int getHasarPuani() {
		return hasarPuani;
	}
	public void setHasarPuani(int hasarPuani) {
		this.hasarPuani = hasarPuani;
	}
}
class Bulbasaur extends pokemon{
	public int hasarPuani=50;
	public boolean kartKullanildiMi=false;
	public Image resim=new ImageIcon(this.getClass().getResource("/bulbasaur.jpg")).getImage();
	public Bulbasaur() {
		super("Bulbasaur","Cim");
		}
		public Bulbasaur(String pokemonAdi, String pokemonTip) {
			super(pokemonAdi, pokemonTip);
		}
		public Bulbasaur(String pokemonAdi) {
			super(pokemonAdi);
		}
		void hasarpuanigoster() {
			this.hasarPuani=50;
			System.out.println(this.hasarPuani);
			super.hasarpuanigoster();
		}
		public Image getResim() {
			return resim;
		}
		public void setResim(Image resim) {
			this.resim = resim;
		}
		public boolean isKartKullanildiMi() {
			return kartKullanildiMi;
		}
		public void setKartKullanildiMi(boolean kartKullanildiMi) {
			this.kartKullanildiMi = kartKullanildiMi;
		}
		public int getHasarPuani() {
			return hasarPuani;
		}
		public void setHasarPuani(int hasarPuani) {
			this.hasarPuani = hasarPuani;
		}
	
}
class Charmander extends pokemon{
	public int hasarPuani=60;
	public boolean kartKullanildiMi=false;
	public Image resim=new ImageIcon(this.getClass().getResource("/charmander.jpg")).getImage();
	public Charmander() {
		super("Charmander","Ates");
	}
	public Charmander(String pokemonAdi, String pokemonTip) {
		super(pokemonAdi, pokemonTip);
	}
	public Charmander(String pokemonAdi) {
		super(pokemonAdi);
	}
	void hasarpuanigoster() {
		this.hasarPuani=60;
		System.out.println(this.hasarPuani);
		super.hasarpuanigoster();
	}
	public Image getResim() {
		return resim;
	}
	public void setResim(Image resim) {
		this.resim = resim;
	}
	public boolean isKartKullanildiMi() {
		return kartKullanildiMi;
	}
	public void setKartKullanildiMi(boolean kartKullanildiMi) {
		this.kartKullanildiMi = kartKullanildiMi;
	}
	public int getHasarPuani() {
		return hasarPuani;
	}
	public void setHasarPuani(int hasarPuani) {
		this.hasarPuani = hasarPuani;
	}
}
class Squirtle extends pokemon{
	public int hasarPuani=30;
	public boolean kartKullanildiMi=false;
	public Image resim=new ImageIcon(this.getClass().getResource("/squirtle.jpg")).getImage();
	public Squirtle() {
		super("Squirtle","Su");
	}
	public Squirtle(String pokemonAdi, String pokemonTip) {
		super(pokemonAdi, pokemonTip);
	}
	public Squirtle(String pokemonAdi) {
		super(pokemonAdi);
	}
	void hasarpuanigoster() {
		this.hasarPuani=30;
		System.out.println(this.hasarPuani);
		super.hasarpuanigoster();
	}
	public Image getResim() {
		return resim;
	}
	public void setResim(Image resim) {
		this.resim = resim;
	}
	public boolean isKartKullanildiMi() {
		return kartKullanildiMi;
	}
	public void setKartKullanildiMi(boolean kartKullanildiMi) {
		this.kartKullanildiMi = kartKullanildiMi;
	}
	public int getHasarPuani() {
		return hasarPuani;
	}
	public void setHasarPuani(int hasarPuani) {
		this.hasarPuani = hasarPuani;
	}
}
class Zubat extends pokemon{
	public int hasarPuani=50;
	public boolean kartKullanildiMi=false;
	public Image resim=new ImageIcon(this.getClass().getResource("/zubat.jpg")).getImage();
	public Zubat() {
		super("Zubat","Hava");
	}
	public Zubat(String pokemonAdi, String pokemonTip) {
		super(pokemonAdi, pokemonTip);
	}
	public Zubat(String pokemonAdi) {
		super(pokemonAdi);
	}
	void hasarpuanigoster() {
		this.hasarPuani=50;
		System.out.println(this.hasarPuani);
		super.hasarpuanigoster();
	}
	public Image getResim() {
		return resim;
	}
	public void setResim(Image resim) {
		this.resim = resim;
	}
	public boolean isKartKullanildiMi() {
		return kartKullanildiMi;
	}
	public void setKartKullanildiMi(boolean kartKullanildiMi) {
		this.kartKullanildiMi = kartKullanildiMi;
	}
	public int getHasarPuani() {
		return hasarPuani;
	}
	public void setHasarPuani(int hasarPuani) {
		this.hasarPuani = hasarPuani;
	}
}
class Psyduck extends pokemon{
	public int hasarPuani=20;
	public boolean kartKullanildiMi=false;
	public Image resim=new ImageIcon(this.getClass().getResource("/psyduck.jpg")).getImage();
	public Psyduck() {
		super("Psyduck","Su");
	}
	public Psyduck(String pokemonAdi, String pokemonTip) {
		super(pokemonAdi, pokemonTip);
	}
	public Psyduck(String pokemonAdi) {
		super(pokemonAdi);
	}
	void hasarpuanigoster() {
		this.hasarPuani=20;
		System.out.println(this.hasarPuani);
		super.hasarpuanigoster();
	}
	public Image getResim() {
		return resim;
	}
	public void setResim(Image resim) {
		this.resim = resim;
	}
	public boolean isKartKullanildiMi() {
		return kartKullanildiMi;
	}
	public void setKartKullanildiMi(boolean kartKullanildiMi) {
		this.kartKullanildiMi = kartKullanildiMi;
	}
	public int getHasarPuani() {
		return hasarPuani;
	}
	public void setHasarPuani(int hasarPuani) {
		this.hasarPuani = hasarPuani;
	}
}
class Snorlax extends pokemon{
	public int hasarPuani=30;
	public boolean kartKullanildiMi=false;
	public Image resim=new ImageIcon(this.getClass().getResource("/snorlax.jpg")).getImage();
	public Snorlax() {
		super("Snorlax","Normal");
	}
	public Snorlax(String pokemonAdi, String pokemonTip) {
		super(pokemonAdi, pokemonTip);
	}
	public Snorlax(String pokemonAdi) {
		super(pokemonAdi);
	}
	void hasarpuanigoster() {
		this.hasarPuani=30;
		System.out.println(this.hasarPuani);
		super.hasarpuanigoster();
	}
	public Image getResim() {
		return resim;
	}
	public void setResim(Image resim) {
		this.resim = resim;
	}
	public boolean isKartKullanildiMi() {
		return kartKullanildiMi;
	}
	public void setKartKullanildiMi(boolean kartKullanildiMi) {
		this.kartKullanildiMi = kartKullanildiMi;
	}
	public int getHasarPuani() {
		return hasarPuani;
	}
	public void setHasarPuani(int hasarPuani) {
		this.hasarPuani = hasarPuani;
	}
}
class Butterfree extends pokemon{
	public int hasarPuani=10;
	public boolean kartKullanildiMi=false;
	public Image resim=new ImageIcon(this.getClass().getResource("/butterfree.jpg")).getImage();
	public Butterfree() {
		super("Butterfree","Hava");
	}
	public Butterfree(String pokemonAdi, String pokemonTip) {
		super(pokemonAdi, pokemonTip);
	}
	public Butterfree(String pokemonAdi) {
		super(pokemonAdi);
	}
	void hasarpuanigoster() {
		this.hasarPuani=10;
		System.out.println(this.hasarPuani);
		super.hasarpuanigoster();
	}
	public Image getResim() {
		return resim;
	}
	public void setResim(Image resim) {
		this.resim = resim;
	}
	public boolean isKartKullanildiMi() {
		return kartKullanildiMi;
	}
	public void setKartKullanildiMi(boolean kartKullanildiMi) {
		this.kartKullanildiMi = kartKullanildiMi;
	}
	public int getHasarPuani() {
		return hasarPuani;
	}
	public void setHasarPuani(int hasarPuani) {
		this.hasarPuani = hasarPuani;
	}
}
class Jigglypuff extends pokemon{
	public int hasarPuani=70;
	public boolean kartKullanildiMi=false;
	public Image resim=new ImageIcon(this.getClass().getResource("/jigglypuff.jpg")).getImage();
	public Jigglypuff() {
		super("Jigglypuff","Ses");
	}
	public Jigglypuff(String pokemonAdi, String pokemonTip) {
		super(pokemonAdi, pokemonTip);
	}
	public Jigglypuff(String pokemonAdi) {
		super(pokemonAdi);
	}
	void hasarpuanigoster() {
		this.hasarPuani=70;
		System.out.println(this.hasarPuani);
		super.hasarpuanigoster();
	}
	public Image getResim() {
		return resim;
	}
	public void setResim(Image resim) {
		this.resim = resim;
	}
	public boolean isKartKullanildiMi() {
		return kartKullanildiMi;
	}
	public void setKartKullanildiMi(boolean kartKullanildiMi) {
		this.kartKullanildiMi = kartKullanildiMi;
	}
	public int getHasarPuani() {
		return hasarPuani;
	}
	public void setHasarPuani(int hasarPuani) {
		this.hasarPuani = hasarPuani;
	}
}
class Meowth extends pokemon{
	public int hasarPuani=40;
	public boolean kartKullanildiMi=false;
	public Image resim=new ImageIcon(this.getClass().getResource("/meowth.jpg")).getImage();
	public Meowth() {
		super("Meowth","Normal");
	}
	public Meowth(String pokemonAdi, String pokemonTip) {
		super(pokemonAdi, pokemonTip);
	}
	public Meowth(String pokemonAdi) {
		super(pokemonAdi);
	}
	void hasarpuanigoster() {
		hasarPuani=40;
		System.out.println(this.hasarPuani);
		super.hasarpuanigoster();
	}
	public int getHasarPuani() {
		return hasarPuani;
	}
	public void setHasarPuani(int hasarPuani) {
		this.hasarPuani = hasarPuani;
	}
	public Image getResim() {
		return resim;
	}
	public void setResim(Image resim) {
		this.resim = resim;
	}
	public boolean isKartKullanildiMi() {
		return kartKullanildiMi;
	}
	public void setKartKullanildiMi(boolean kartKullanildiMi) {
		this.kartKullanildiMi = kartKullanildiMi;
	}
}
