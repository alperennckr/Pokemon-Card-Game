import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class gamescreen2 extends JFrame {

	private JPanel contentPane;
	private JPanel a;
	static JLabel[] label=new JLabel[12];
	static JLabel[] arka=new JLabel[10];
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gamescreen2 frame = new gamescreen2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	static int sayac=0;
	oyuncu player=new oyuncu();
	oyuncu bilgisayar=new oyuncu();
	Pikachu pikachu=new Pikachu();
	Bulbasaur bulbasaur=new Bulbasaur();
	Charmander charmander=new Charmander();
	Squirtle squirtle=new Squirtle();
	Zubat zubat=new Zubat();
	Psyduck psyduck=new Psyduck();
	Snorlax snorlax=new Snorlax();
	Butterfree butterfree=new Butterfree();
	Jigglypuff jigglypuff=new Jigglypuff();
	Meowth meowth=new Meowth();
	pokemon poke=new pokemon();
	Random rnd=new Random();
	public JTextField Player;
	public JTextField puanp;
	public JTextField Computer;
	public JTextField puanc;
	public JTextField ekranbas;
	static int a1=-1,saypc=0,sayp=0,x,g=0,artisx=-171,sayacm=0,sayindex=0,say0=0,say=0,say1=0,say2=0,bir=0,iki=0,uc=0,say4=0;
	static int sayindex2=0,ataki=0,ilk=-1,son=-1,temp=6,x1=0,hasar1=0,hasar2=0,yaz1=0,yaz2=0,sayac1=0,gir=0,say00=0,say5=0;
	static int say6=0,say7=0,say8=0,say9=0,say10=0,say11=0,say12=0,say13=0,say14=0,say15=0,sayacson=0,tutp=0,tutc=0;
	static float y;
	ArrayList<pokemon> kartlar=new ArrayList<pokemon>();
	ArrayList<pokemon> karma=new ArrayList<pokemon>();
	static int[] atak= {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
	static int[] atak2= {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
	public void CvCT() {
		a=new JPanel();
		a.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(a);
		a.setLayout(null);
		a.setBounds(0,0,1100,853);
		Player = new JTextField();
		Player.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Player.setHorizontalAlignment(SwingConstants.CENTER);
		Player.setText("Computer 1");
		Player.setBounds(58, 13, 131, 22);
		a.add(Player);
		Player.setColumns(10);
		
		puanp = new JTextField();
		puanp.setText("0");
		puanp.setHorizontalAlignment(SwingConstants.CENTER);
		puanp.setBounds(83, 48, 85, 22);
		a.add(puanp);
		puanp.setColumns(10);
		
		Computer = new JTextField();
		Computer.setText("Computer 2");
		Computer.setHorizontalAlignment(SwingConstants.CENTER);
		Computer.setBounds(775, 13, 131, 22);
		a.add(Computer);
		Computer.setColumns(10);
		
		puanc = new JTextField();
		puanc.setText("0");
		puanc.setHorizontalAlignment(SwingConstants.CENTER);
		puanc.setBounds(796, 48, 85, 22);
		a.add(puanc);
		puanc.setColumns(10);
		Image kart=new ImageIcon(this.getClass().getResource("/Card.jpg")).getImage();
		int j=0;
		for(int i=0;i<10;i++) {
		label[i]=new JLabel("");
		label[i] = new JLabel(new ImageIcon(kart));
		label[i].setBounds(759+j,236+j,150,210);
		getContentPane().add(label[i]);
		label[i].repaint();
		j++;
		a.add(label[i]);
		}
		label[11]=new JLabel("");
		label[11] = new JLabel(new ImageIcon(kart));
		getContentPane().add(label[11]);
		label[11].repaint();
		a.add(label[11]);
		label[10]=new JLabel("");
		label[10] = new JLabel(new ImageIcon(kart));
		getContentPane().add(label[10]);
		label[10].repaint();
		a.add(label[10]);
	    move(label);
	    kartlar.add(pikachu); 
        kartlar.add(bulbasaur); 
        kartlar.add(charmander); 
        kartlar.add(squirtle); 
        kartlar.add(zubat); 
        kartlar.add(psyduck); 
        kartlar.add(snorlax); 
        kartlar.add(butterfree); 
        kartlar.add(jigglypuff); 
        kartlar.add(meowth);
        
        boolean durum=true;
		while(durum) {
        		a1=0+rnd.nextInt(10);
        		if((kartlar.get(a1).isKartKullanildiMi())==false && sayp<3 && sayac<3) {
        			arka[sayac]=new JLabel("");
        			sayp++;
        			player.kartlar.add(kartlar.get(a1));
        			karma.add(kartlar.get(a1));
        			kartlar.get(a1).setKartKullanildiMi(true);
        			arka[sayac]=new JLabel(new ImageIcon(kartlar.get(a1).getResim()));
        			getContentPane().add(arka[sayac]);
        			arka[sayac].repaint();
        			a.add(arka[sayac]);
        			sayac++;
        		}
        		if((kartlar.get(a1).isKartKullanildiMi())==false && saypc<3 && sayac>2) {
        			arka[sayac]=new JLabel("");
        			saypc++;
        			bilgisayar.kartlar.add(kartlar.get(a1));
        			karma.add(kartlar.get(a1));
        			kartlar.get(a1).setKartKullanildiMi(true);
        			arka[sayac]=new JLabel(new ImageIcon(kartlar.get(a1).getResim()));
        			getContentPane().add(arka[sayac]);
        			arka[sayac].repaint();
        			a.add(arka[sayac]);
        			sayac++;
        		}
        		if(sayp==3 && saypc==3) {
        			durum=false;
        		}
        }
       durum=true;
       while(durum) {
    	   a1=0+rnd.nextInt(10);
    	   	if((kartlar.get(a1).isKartKullanildiMi())==false && sayac==6) {
    	   	arka[sayac]=new JLabel("");
   			sayp++;
   			player.kartlar.add(kartlar.get(a1));
   			karma.add(kartlar.get(a1));
   			kartlar.get(a1).setKartKullanildiMi(true);
   			arka[sayac]=new JLabel(new ImageIcon(kartlar.get(a1).getResim()));
   			getContentPane().add(arka[sayac]);
			arka[sayac].repaint();
			a.add(arka[sayac]);
   			sayac++;
   		}
    	 	if((kartlar.get(a1).isKartKullanildiMi())==false && sayac==8) {
    	 		arka[sayac]=new JLabel("");
       			sayp++;
       			player.kartlar.add(kartlar.get(a1));
       			karma.add(kartlar.get(a1));
       			kartlar.get(a1).setKartKullanildiMi(true);
       			arka[sayac]=new JLabel(new ImageIcon(kartlar.get(a1).getResim()));
       			getContentPane().add(arka[sayac]);
    			arka[sayac].repaint();
    			a.add(arka[sayac]);
       			sayac++;
       		}
    		if((kartlar.get(a1).isKartKullanildiMi())==false && sayac==7) {
    			arka[sayac]=new JLabel("");
       			sayp++;
       			bilgisayar.kartlar.add(kartlar.get(a1));
       			karma.add(kartlar.get(a1));
       			kartlar.get(a1).setKartKullanildiMi(true);
       			arka[sayac]=new JLabel(new ImageIcon(kartlar.get(a1).getResim()));
       			getContentPane().add(arka[sayac]);
    			arka[sayac].repaint();
    			a.add(arka[sayac]);
       			sayac++;
       		}
    		if((kartlar.get(a1).isKartKullanildiMi())==false && sayac==9) {
    			arka[sayac]=new JLabel("");
       			sayp++;
       			bilgisayar.kartlar.add(kartlar.get(a1));
       			karma.add(kartlar.get(a1));
       			kartlar.get(a1).setKartKullanildiMi(true);
       			arka[sayac]=new JLabel(new ImageIcon(kartlar.get(a1).getResim()));
       			getContentPane().add(arka[sayac]);
    			arka[sayac].repaint();
    			a.add(arka[sayac]);
       			sayac++;
       		}
    	   	if(sayac==10) {
    	   		durum=false;
    	   	}
       }
       durum=true;        //social.msdn.microsoft.com'dan alýnmýstýr.
       boolean durum2=true;
       boolean durum3=true;
       boolean durum4=true;
       for(int i=0;i<5;i++) {
    	   durum=true;
    	   while(durum) {
    		   int sayi=10+rnd.nextInt(13);
    		   if(i==0) {
    			   sayi=0+rnd.nextInt(3);
    		   }
    		   if(i==1) {
    			   sayi=0+rnd.nextInt(8);
    			   durum2=true;
    			   while(durum2) {
    				   if(sayi==7 || sayi==0 || sayi==1 || sayi==2) {
    					   durum2=false;
    				   }
    				   else if(sayi==6 || sayi==5 || sayi==4 || sayi==3) {
    					  sayi=0+rnd.nextInt(8);
    				   }
    			   }
    		   }
    		    if(i==2) {
    			   sayi=0+rnd.nextInt(10);
    			   durum3=true;
    			   while(durum3) {
    				   if(sayi==7 || sayi==0 || sayi==1 || sayi==2 || sayi==9) {
    					   durum3=false;
    				   }
    				   else if(sayi==6 || sayi==5 || sayi==4 || sayi==3 || sayi==8) {
    					  sayi=0+rnd.nextInt(10);
    				   }
    			   }
    		   }
    		   if(i>2) {
    			  sayi=0+rnd.nextInt(10);
    			  durum4=true;
   			   while(durum4) {
   				   if(sayi==7 || sayi==0 || sayi==1 || sayi==2 || sayi==9) {
   					   durum4=false;
   				   }
   				   else if(sayi==6 || sayi==5 || sayi==4 || sayi==3 || sayi==8) {
   					  sayi=0+rnd.nextInt(10);
   				   }
   			   }
    		  }
    		   boolean varmi=false;
    		   for(int h = 0; h <5; h++)
               { 
                   if (atak[h] == sayi)
                   {
                       varmi = true;
                       break;
                   }
               }
                   if (!varmi)
                   {
                       atak[i] = sayi;
                        durum = false;
                   }
                 
    	   }
       }
       tutc=1;
       durum=true;        //social.msdn.microsoft.com'dan alýnmýstýr.
       durum2=true;
       durum3=true;
       durum4=true;
       for(int i=0;i<5;i++) {
    	   durum=true;
    	   while(durum) {
    		   int sayi=10+rnd.nextInt(13);
    		   if(i==0) {
    			   sayi=3+rnd.nextInt(3);
    		   }
    		   if(i==1) {
    			   sayi=0+rnd.nextInt(7);
    			   durum2=true;
    			   while(durum2) {
    				   if(sayi==6 || sayi==5 || sayi==4 || sayi==3) {
    					   durum2=false;
    				   }
    				   else if(sayi==7 || sayi==0 || sayi==1 || sayi==2) {
    					  sayi=0+rnd.nextInt(7);
    				   }
    			   }
    		   }
    		    if(i==2) {
    			   sayi=0+rnd.nextInt(9);
    			   durum3=true;
    			   while(durum3) {
    				   if(sayi==6 || sayi==5 || sayi==4 || sayi==3 || sayi==8) {
    					   durum3=false;
    				   }
    				   else if(sayi==7 || sayi==0 || sayi==1 || sayi==2 || sayi==9) {
    					  sayi=0+rnd.nextInt(9);
    				   }
    			   }
    		   }
    		   if(i>2) {
    			  sayi=0+rnd.nextInt(9);
    			  durum4=true;
   			   while(durum4) {
   				   if(sayi==6 || sayi==5 || sayi==4 || sayi==3 || sayi==8) {
   					   durum4=false;
   				   }
   				   else if(sayi==7 || sayi==0 || sayi==1 || sayi==2 || sayi==9) {
   					  sayi=0+rnd.nextInt(9);
   				   }
   			   }
    		  }
    		   boolean varmi=false;
    		   for(int h = 0; h <5; h++)
               { 
                   if (atak2[h] == sayi)
                   {
                       varmi = true;
                       break;
                   }
               }
                   if (!varmi)
                   {
                       atak2[i] = sayi;
                        durum = false;
                   }
                 
    	   }
       }
       if(sayac1!=1 && gir==1) {
        say=0;
       	say1=0;
       	say2=0;
       	say0=0;
       	say4=0;
       	Timer zaman0=new Timer();
       	TimerTask gorev0=new TimerTask() {
				public void run() {
					label[10].setVisible(true);
					label[11].setVisible(true);
					say0++;
					if(say0==1000)
						cancel();
				}
			};zaman0.schedule(gorev0,0,1);
			Timer zaman=new Timer();
			TimerTask gorev1=new TimerTask() {
				
				public void run() {
					if(say==400) {
					label[10].setBounds(400,300,150,210);
					arka[atak2[sayac1]].setVisible(false);
					}
					if(say==600) {
						label[11].setBounds(200,300,150,210);
						arka[atak[sayac1]].setVisible(false);
						}
			
					say++;
					
					if(say==1201)
						cancel();
			     }
			};
			zaman.schedule(gorev1,0,1);
			Timer zaman1=new Timer();
			TimerTask gorev2=new TimerTask() {
				
				public void run() {
				    say1++;
					if(say1>800 && say1<1200) {
						label[10].setVisible(false);
						label[11].setVisible(false);
					}
					if(say1>1000 && say1<1602) {
						arka[atak2[sayac1]].setBounds(400,300,150,210);
						arka[atak[sayac1]].setBounds(200,300,150,210);
						arka[atak2[sayac1]].setVisible(true);
						arka[atak[sayac1]].setVisible(true);
					}
					if(say1>1401 && say1<1800) {
						arka[atak2[sayac1]].setVisible(false);
						arka[atak[sayac1]].setVisible(false);
				   }
				   if(say1==1801) {
					   cancel(); 
				   }
			     }
			};
			zaman1.schedule(gorev2,0,1);
			Timer zaman3=new Timer();
			TimerTask gorev4=new TimerTask() {
				public void run() {
					say4++;
					if(say4==800) {
						karsilastir(atak2[sayac1],atak[sayac1]);
						yenic(atak2[sayac1],atak[sayac1]);
						
					}
					if(say4==801) {
						cancel();
					}
				}
			};zaman3.schedule(gorev4,0,1);
			Timer zaman5=new Timer();
	       	TimerTask gorev6=new TimerTask() {
					public void run() {
						if(say00==1400) {
							label[10].setVisible(true);
							arka[atak2[sayac1+1]].setVisible(false);
						}
						if(say00==1500) {
							label[11].setVisible(true);
							arka[atak[sayac1+1]].setVisible(false);
						}
						say00++;
						if(say00==1600)
							cancel();
					}
				};zaman5.schedule(gorev6,0,1);
				Timer zaman6=new Timer();
				TimerTask gorev7=new TimerTask() {
					
					public void run() {
						if(say5==1600) {
							arka[atak2[sayac1+1]].setBounds(400,300,150,210);
							arka[atak[sayac1+1]].setBounds(200,300,150,210);
							arka[atak2[sayac1+1]].setVisible(true);
							arka[atak[sayac1+1]].setVisible(true);
						}
						say5++;
						if(say5>1700 && say5<2100) {
							label[10].setVisible(false);
							label[11].setVisible(false);
						}
						
						if(say5==2101)
							cancel();
				     }
				};
				zaman6.schedule(gorev7,0,1);
				Timer zaman7=new Timer();
				TimerTask gorev8=new TimerTask() {
					public void run() {
						if(say6==2101) {
							arka[atak2[sayac1+1]].setVisible(false);
							arka[atak[sayac1+1]].setVisible(false);
						}
						say6++;
						if(say6==2150) {
							karsilastir(atak2[sayac1+1],atak[sayac1+1]);
							yenic(atak2[sayac1+1],atak[sayac1+1]);
						}
						
						if(say6==2301)
							cancel();
				     }
				};
				zaman7.schedule(gorev8,0,1);
				Timer zaman8=new Timer();
		       	TimerTask gorev9=new TimerTask() {
						public void run() {
							if(say7==2302) {
								label[10].setVisible(true);
								arka[atak2[sayac1+2]].setVisible(false);
							}
							if(say7==2402) {
								label[11].setVisible(true);
								arka[atak[sayac1+2]].setVisible(false);
							}
							say7++;
							if(say7==2500)
								cancel();
						}
					};zaman8.schedule(gorev9,0,1);
				Timer zaman9=new Timer();
			    TimerTask gorev10=new TimerTask() {
				public void run() {
					if(say8==2600) {
						arka[atak2[sayac1+2]].setBounds(400,300,150,210);
						arka[atak[sayac1+2]].setBounds(200,300,150,210);
						arka[atak2[sayac1+2]].setVisible(true);
						arka[atak[sayac1+2]].setVisible(true);
					}
					say8++;
					if(say8>2700 && say8<2800) {
						label[10].setVisible(false);
						label[11].setVisible(false);
					}
					
					if(say8==2801)
						cancel();
			     }
				};zaman9.schedule(gorev10,0,1);	
				Timer zaman10=new Timer();
				TimerTask gorev11=new TimerTask() {
					public void run() {
						if(say9==2801) {
							arka[atak2[sayac1+2]].setVisible(false);
							arka[atak[sayac1+2]].setVisible(false);
						}
						say9++;
						if(say9==2850) {
							karsilastir(atak2[sayac1+2],atak[sayac1+2]);
							yenic(atak2[sayac1+2],atak[sayac1+2]);
						}
						
						if(say9==2901)
							cancel();
				     }
				};
				zaman10.schedule(gorev11,0,1);
				Timer zaman11=new Timer();
		       	TimerTask gorev12=new TimerTask() {
						public void run() {
							if(say10==3002) {
								label[10].setVisible(true);
								arka[atak2[sayac1+3]].setVisible(false);
							}
							if(say10==3102) {
								label[11].setVisible(true);
								arka[atak[sayac1+3]].setVisible(false);
							}
							say10++;
							if(say10==3500)
								cancel();
						}
					};zaman11.schedule(gorev12,0,1);
					Timer zaman12=new Timer();
				    TimerTask gorev13=new TimerTask() {
					public void run() {
						if(say12==3600) {
							arka[atak2[sayac1+3]].setBounds(400,300,150,210);
							arka[atak[sayac1+3]].setBounds(200,300,150,210);
							arka[atak2[sayac1+3]].setVisible(true);
							arka[atak[sayac1+3]].setVisible(true);
						}
						say12++;
						if(say12>3700 && say12<3800) {
							label[10].setVisible(false);
							label[11].setVisible(false);
						}
						
						if(say12==3801)
							cancel();
				     }
					};zaman12.schedule(gorev13,0,1);
					Timer zaman13=new Timer();
					TimerTask gorev14=new TimerTask() {
						public void run() {
							if(say11==3901) {
								arka[atak2[sayac1+3]].setVisible(false);
								arka[atak[sayac1+3]].setVisible(false);
							}
							say11++;
							if(say11==3950) {
								karsilastir(atak2[sayac1+3],atak[sayac1+3]);
							}
							
							if(say11==4001)
								cancel();
					     }
					};
					zaman13.schedule(gorev14,0,1);
					Timer zaman14=new Timer();
			       	TimerTask gorev15=new TimerTask() {
							public void run() {
								if(say15==4002) {
									label[10].setVisible(true);
									arka[atak2[sayac1+4]].setVisible(false);
								}
								if(say15==4102) {
									label[11].setVisible(true);
									arka[atak[sayac1+4]].setVisible(false);
								}
								say15++;
								if(say15==4500)
									cancel();
							}
						};zaman14.schedule(gorev15,0,1);
					Timer zaman15=new Timer();
				    TimerTask gorev16=new TimerTask() {
					public void run() {
						if(say13==4600) {
								arka[atak2[sayac1+4]].setBounds(400,300,150,210);
								arka[atak[sayac1+4]].setBounds(200,300,150,210);
								arka[atak2[sayac1+4]].setVisible(true);
								arka[atak[sayac1+4]].setVisible(true);
							}
							say13++;
							if(say13>4700 && say13<4800) {
								label[10].setVisible(false);
								label[11].setVisible(false);
							}
							
							if(say13==4801)
								cancel();
					     }
						};zaman15.schedule(gorev16,0,1);
					Timer zaman16=new Timer();
					TimerTask gorev17=new TimerTask() {
							public void run() {
								if(say14==4901) {
									arka[atak2[sayac1+4]].setVisible(false);
									arka[atak[sayac1+4]].setVisible(false);
								}
								say14++;
								if(say14==4950) {
									karsilastir(atak2[sayac1+4],atak[sayac1+4]);
								}
								
								if(say14==5001)
									cancel(); 
						     }
						};
						zaman16.schedule(gorev17,0,1);
       }
		
	}
	public void PvCT() {
		a=new JPanel();
		a.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(a);
		a.setLayout(null);
		a.setBounds(0,0,1100,853);
		Player = new JTextField();
		Player.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Player.setHorizontalAlignment(SwingConstants.CENTER);
		Player.setText("Player");
		Player.setBounds(58, 13, 131, 22);
		a.add(Player);
		Player.setColumns(10);
		tutp=1;
		puanp = new JTextField();
		puanp.setText("0");
		puanp.setHorizontalAlignment(SwingConstants.CENTER);
		puanp.setBounds(83, 48, 85, 22);
		a.add(puanp);
		puanp.setColumns(10);
		
		Computer = new JTextField();
		Computer.setText("Computer");
		Computer.setHorizontalAlignment(SwingConstants.CENTER);
		Computer.setBounds(775, 13, 131, 22);
		a.add(Computer);
		Computer.setColumns(10);
		
		puanc = new JTextField();
		puanc.setText("0");
		puanc.setHorizontalAlignment(SwingConstants.CENTER);
		puanc.setBounds(796, 48, 85, 22);
		a.add(puanc);
		puanc.setColumns(10);
		
		oyuncu player=new oyuncu();
		oyuncu bilgisayar=new oyuncu();
		Image kart=new ImageIcon(this.getClass().getResource("/Card.jpg")).getImage();
		int j=0;
		for(int i=0;i<10;i++) {
		label[i]=new JLabel("");
		label[i] = new JLabel(new ImageIcon(kart));
		label[i].setBounds(759+j,236+j,150,210);
		getContentPane().add(label[i]);
		label[i].repaint();
		j++;
		a.add(label[i]);
		}
		label[11]=new JLabel("");
		label[11] = new JLabel(new ImageIcon(kart));
		getContentPane().add(label[11]);
		label[11].repaint();
		a.add(label[11]);
		label[10]=new JLabel("");
		label[10] = new JLabel(new ImageIcon(kart));
		getContentPane().add(label[10]);
		label[10].repaint();
		a.add(label[10]);
		kartlar.add(pikachu); 
        kartlar.add(bulbasaur); 
        kartlar.add(charmander); 
        kartlar.add(squirtle); 
        kartlar.add(zubat); 
        kartlar.add(psyduck); 
        kartlar.add(snorlax); 
        kartlar.add(butterfree); 
        kartlar.add(jigglypuff); 
        kartlar.add(meowth);
        
        boolean durum=true;
		while(durum) {
        		a1=0+rnd.nextInt(10);
        		if((kartlar.get(a1).isKartKullanildiMi())==false && sayp<3 && sayac<3) {
        			arka[sayac]=new JLabel("");
        			sayp++;
        			player.kartlar.add(kartlar.get(a1));
        			karma.add(kartlar.get(a1));
        			kartlar.get(a1).setKartKullanildiMi(true);
        			arka[sayac]=new JLabel(new ImageIcon(kartlar.get(a1).getResim()));
        			getContentPane().add(arka[sayac]);
        			arka[sayac].repaint();
        			a.add(arka[sayac]);
        			sayac++;
        		}
        		if((kartlar.get(a1).isKartKullanildiMi())==false && saypc<3 && sayac>2) {
        			arka[sayac]=new JLabel("");
        			saypc++;
        			bilgisayar.kartlar.add(kartlar.get(a1));
        			karma.add(kartlar.get(a1));
        			kartlar.get(a1).setKartKullanildiMi(true);
        			arka[sayac]=new JLabel(new ImageIcon(kartlar.get(a1).getResim()));
        			getContentPane().add(arka[sayac]);
        			arka[sayac].repaint();
        			a.add(arka[sayac]);
        			sayac++;
        		}
        		if(sayp==3 && saypc==3) {
        			durum=false;
        		}
        }
       durum=true;
       while(durum) {
    	   a1=0+rnd.nextInt(10);
    	   	if((kartlar.get(a1).isKartKullanildiMi())==false && sayac==6) {
    	   	arka[sayac]=new JLabel("");
   			sayp++;
   			player.kartlar.add(kartlar.get(a1));
   			karma.add(kartlar.get(a1));
   			kartlar.get(a1).setKartKullanildiMi(true);
   			arka[sayac]=new JLabel(new ImageIcon(kartlar.get(a1).getResim()));
   			getContentPane().add(arka[sayac]);
			arka[sayac].repaint();
			a.add(arka[sayac]);
   			sayac++;
   		}
    	 	if((kartlar.get(a1).isKartKullanildiMi())==false && sayac==8) {
    	 		arka[sayac]=new JLabel("");
       			sayp++;
       			player.kartlar.add(kartlar.get(a1));
       			karma.add(kartlar.get(a1));
       			kartlar.get(a1).setKartKullanildiMi(true);
       			arka[sayac]=new JLabel(new ImageIcon(kartlar.get(a1).getResim()));
       			getContentPane().add(arka[sayac]);
    			arka[sayac].repaint();
    			a.add(arka[sayac]);
       			sayac++;
       		}
    		if((kartlar.get(a1).isKartKullanildiMi())==false && sayac==7) {
    			arka[sayac]=new JLabel("");
       			sayp++;
       			bilgisayar.kartlar.add(kartlar.get(a1));
       			karma.add(kartlar.get(a1));
       			kartlar.get(a1).setKartKullanildiMi(true);
       			arka[sayac]=new JLabel(new ImageIcon(kartlar.get(a1).getResim()));
       			getContentPane().add(arka[sayac]);
    			arka[sayac].repaint();
    			a.add(arka[sayac]);
       			sayac++;
       		}
    		if((kartlar.get(a1).isKartKullanildiMi())==false && sayac==9) {
    			arka[sayac]=new JLabel("");
       			sayp++;
       			bilgisayar.kartlar.add(kartlar.get(a1));
       			karma.add(kartlar.get(a1));
       			kartlar.get(a1).setKartKullanildiMi(true);
       			arka[sayac]=new JLabel(new ImageIcon(kartlar.get(a1).getResim()));
       			getContentPane().add(arka[sayac]);
    			arka[sayac].repaint();
    			a.add(arka[sayac]);
       			sayac++;
       		}
    	   	if(sayac==10) {
    	   		durum=false;
    	   	}
       }
        a.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(e.getX()>758 && e.getX()<919 && e.getY()>235 && e.getY()<456) {
				    move(label);
				}
			}
		});
        durum=true;        //social.msdn.microsoft.com'dan alýnmýstýr.
        boolean durum2=true;
        boolean durum3=true;
        boolean durum4=true;
        for(int i=0;i<5;i++) {
     	   durum=true;
     	   while(durum) {
     		   int sayi=10+rnd.nextInt(13);
     		   if(i==0) {
     			   sayi=0+rnd.nextInt(3);
     		   }
     		   if(i==1) {
     			   sayi=0+rnd.nextInt(8);
     			   durum2=true;
     			   while(durum2) {
     				   if(sayi==7 || sayi==0 || sayi==1 || sayi==2) {
     					   durum2=false;
     				   }
     				   else if(sayi==6 || sayi==5 || sayi==4 || sayi==3) {
     					  sayi=0+rnd.nextInt(8);
     				   }
     			   }
     		   }
     		    if(i==2) {
     			   sayi=0+rnd.nextInt(10);
     			   durum3=true;
     			   while(durum3) {
     				   if(sayi==7 || sayi==0 || sayi==1 || sayi==2 || sayi==9) {
     					   durum3=false;
     				   }
     				   else if(sayi==6 || sayi==5 || sayi==4 || sayi==3 || sayi==8) {
     					  sayi=0+rnd.nextInt(10);
     				   }
     			   }
     		   }
     		   if(i>2) {
     			  sayi=0+rnd.nextInt(10);
     			  durum4=true;
    			   while(durum4) {
    				   if(sayi==7 || sayi==0 || sayi==1 || sayi==2 || sayi==9) {
    					   durum4=false;
    				   }
    				   else if(sayi==6 || sayi==5 || sayi==4 || sayi==3 || sayi==8) {
    					  sayi=0+rnd.nextInt(10);
    				   }
    			   }
     		  }
     		   boolean varmi=false;
     		   for(int h = 0; h <5; h++)
                { 
                    if (atak[h] == sayi)
                    {
                        varmi = true;
                        break;
                    }
                }
                    if (!varmi)
                    {
                        atak[i] = sayi;
                         durum = false;
                    }
                  
     	   }
        }
        a.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
			if(e.getX()>489 && e.getX()<619 && e.getY()>500 && e.getY()<680 && bir==0) {
				say=0;
            	say1=0;
            	say2=0;
            	say0=0;
            	say4=0;
            	Timer zaman0=new Timer();
            	TimerTask gorev0=new TimerTask() {
					public void run() {
						label[10].setVisible(true);
						label[11].setVisible(true);
						say0++;
						if(say0==100)
							cancel();
					}
				};zaman0.schedule(gorev0,0,1);
            	Timer zaman=new Timer();
				TimerTask gorev1=new TimerTask() {
					
					public void run() {
						label[10].setBounds(200,300,150,210);
						label[11].setBounds(400,300,150,210);
						arka[5].setVisible(false);
						arka[atak[sayindex2]].setVisible(false);
						say++;
						if(say==200) {
							label[10].setVisible(false);
							label[11].setVisible(false);
						}
						if(say==201)
							cancel();
						    
					}
				};
				zaman.schedule(gorev1,0,1);
				Timer zaman1=new Timer();
				TimerTask gorev2=new TimerTask() {
					
					public void run() {
						arka[5].setBounds(400,300,150,210);
						arka[atak[sayindex2]].setBounds(200,300,150,210);
						arka[5].setVisible(true);
						arka[atak[sayindex2]].setVisible(true);
						say1++;
						if(say1==301) {
							cancel();
						}
					}
				}; zaman1.schedule(gorev2,0,1);
				Timer zaman2=new Timer();
				TimerTask gorev3=new TimerTask() {
					public void run() {
						say2++;
						if(say2==600) {
							arka[5].setVisible(false);
							arka[atak[sayindex2]].setVisible(false);
							karsilastir(5,atak[sayindex2]);
						}
						if(say2==601) {
							cancel();
							sayindex2++;
						}
					}
				};zaman2.schedule(gorev3,0,1);
				Timer zaman3=new Timer();
				TimerTask gorev4=new TimerTask() {
					public void run() {
						say4++;
						if(say4==600) {
							yeni(1,atak[ataki]);
							ataki++;
						}
						if(say4==601) {
							cancel();
							bir++;
						}
					}
				};zaman3.schedule(gorev4,0,1);
				if(ilk==-1) ilk=1;
				else if(ilk!=-1 && son==-1) son=1;
			}
            if(e.getX()>319 && e.getX()<449 && e.getY()>500 && e.getY()<680 && iki==0) {
            	say=0;
            	say1=0;
            	say2=0;
            	say0=0;
            	say4=0;
            	Timer zaman0=new Timer();
            	TimerTask gorev0=new TimerTask() {
					public void run() {
						label[10].setVisible(true);
						label[11].setVisible(true);
						say0++;
						if(say0==100)
							cancel();
					}
				};zaman0.schedule(gorev0,0,1);
            	Timer zaman=new Timer();
				TimerTask gorev1=new TimerTask() {
					
					public void run() {
						label[10].setBounds(200,300,150,210);
						label[11].setBounds(400,300,150,210);
						arka[4].setVisible(false);
						arka[atak[sayindex2]].setVisible(false);
						say++;
						if(say==200) {
							label[10].setVisible(false);
							label[11].setVisible(false);
						}
						if(say==201)
							cancel();
						    
					}
				};
				zaman.schedule(gorev1,0,1);
				Timer zaman1=new Timer();
				TimerTask gorev2=new TimerTask() {
					
					public void run() {
						arka[4].setBounds(400,300,150,210);
						arka[atak[sayindex2]].setBounds(200,300,150,210);
						arka[4].setVisible(true);
						arka[atak[sayindex2]].setVisible(true);
						say1++;
						if(say1==301) {
							cancel();
						}
					}
				}; zaman1.schedule(gorev2,0,1);
				Timer zaman2=new Timer();
				TimerTask gorev3=new TimerTask() {
					public void run() {
						say2++;
						if(say2==600) {
							arka[4].setVisible(false);
							arka[atak[sayindex2]].setVisible(false);
						    karsilastir(4,atak[sayindex2]);
						}
						if(say2==601) {
							cancel();
							sayindex2++;
						}
					}
				};zaman2.schedule(gorev3,0,1);
				Timer zaman3=new Timer();
				TimerTask gorev4=new TimerTask() {
					public void run() {
						say4++;
						if(say4==600) {
							yeni(2,atak[ataki]);
							ataki++;
						}
						if(say4==601) {
							cancel();
							iki++;
						}
					}
				};zaman3.schedule(gorev4,0,1);
				if(ilk==-1) ilk=2;
				else if(ilk!=-1 && son==-1) son=2;
			}
            if(e.getX()>149 && e.getX()<279 && e.getY()>500 && e.getY()<680 && uc==0) {
            	say=0;
            	say1=0;
            	say2=0;
            	say0=0;
            	say4=0;
            	Timer zaman0=new Timer();
            	TimerTask gorev0=new TimerTask() {
					public void run() {
						label[10].setVisible(true);
						label[11].setVisible(true);
						say0++;
						if(say0==100)
							cancel();
					}
				};zaman0.schedule(gorev0,0,1);
            	Timer zaman=new Timer();
				TimerTask gorev1=new TimerTask() {
					
					public void run() {
						label[10].setBounds(200,300,150,210);
						label[11].setBounds(400,300,150,210);
						arka[3].setVisible(false);
						arka[atak[sayindex2]].setVisible(false);
						say++;
						if(say==200) {
							label[10].setVisible(false);
							label[11].setVisible(false);
						}
						if(say==201)
							cancel();
						    
					}
				};
				zaman.schedule(gorev1,0,1);
				Timer zaman1=new Timer();
				TimerTask gorev2=new TimerTask() {
					
					public void run() {
						arka[3].setBounds(400,300,150,210);
						arka[atak[sayindex2]].setBounds(200,300,150,210);
						arka[3].setVisible(true);
						arka[atak[sayindex2]].setVisible(true);
						say1++;
						if(say1==301) {
							cancel();
						}
					}
				}; zaman1.schedule(gorev2,0,1);
				Timer zaman2=new Timer();
				TimerTask gorev3=new TimerTask() {
					public void run() {
						say2++;
						if(say2==600) {
							arka[3].setVisible(false);
							arka[atak[sayindex2]].setVisible(false);
							karsilastir(3,atak[sayindex2]);
						}
						if(say2==601) {
							cancel();
							sayindex2++;
						}
					}
				};zaman2.schedule(gorev3,0,1);
				Timer zaman3=new Timer();
				TimerTask gorev4=new TimerTask() {
					public void run() {
						say4++;
						if(say4==600) {
							yeni(3,atak[ataki]);
							ataki++;
						}
						if(say4==601) {
							cancel();
							uc++;
						}
					}
				};zaman3.schedule(gorev4,0,1);
				if(ilk==-1) ilk=3;
				else if(ilk!=-1 && son==-1) son=3;
            }
			}
		});
        a.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(e.getX()>489 && e.getX()<619 && e.getY()>500 && e.getY()<680 && bir==1 && ilk==1) {
					say=0;
	            	say1=0;
	            	say2=0;
	            	say0=0;
	            	say4=0;
	            	Timer zaman0=new Timer();
	            	TimerTask gorev0=new TimerTask() {
						public void run() {
							label[10].setVisible(true);
							label[11].setVisible(true);
							say0++;
							if(say0==100)
								cancel();
						}
					};zaman0.schedule(gorev0,0,1); 
					Timer zaman=new Timer();
					TimerTask gorev1=new TimerTask() {
						
						public void run() {
							label[10].setBounds(200,300,150,210);
							label[11].setBounds(400,300,150,210);
							arka[6].setVisible(false);
							arka[atak[sayindex2]].setVisible(false);
							say++;
							if(say==200) {
								label[10].setVisible(false);
								label[11].setVisible(false);
							}
							if(say==201)
								cancel();
							    
						}
					};
					zaman.schedule(gorev1,0,1);
					Timer zaman1=new Timer();
					TimerTask gorev2=new TimerTask() {
						
						public void run() {
							arka[6].setBounds(400,300,150,210);
							arka[atak[sayindex2]].setBounds(200,300,150,210);
							arka[6].setVisible(true);
							arka[atak[sayindex2]].setVisible(true);
							say1++;
							if(say1==301) {
								cancel();
							}
						}
					}; zaman1.schedule(gorev2,0,1);
					Timer zaman2=new Timer();
					TimerTask gorev3=new TimerTask() {
						public void run() {
							say2++;
							if(say2==600) {
								arka[6].setVisible(false);
								arka[atak[sayindex2]].setVisible(false);
								karsilastir(6,atak[sayindex2]);
							}
							if(say2==601) {
								cancel();
								sayindex2++;
							}
						}
					};zaman2.schedule(gorev3,0,1);
					Timer zaman3=new Timer();
					TimerTask gorev4=new TimerTask() {
						public void run() {
							say4++;
							if(say4==600) {
								yeni(1,atak[ataki]);
								ataki++;
							}
							if(say4==601) {
								cancel();
								bir++;
							}
						}
					};zaman3.schedule(gorev4,0,1);
				}
				if(e.getX()>489 && e.getX()<619 && e.getY()>500 && e.getY()<680 && bir==1 && son==1) {
					say=0;
	            	say1=0;
	            	say2=0;
	            	say0=0;
	            	say4=0;
	            	Timer zaman0=new Timer();
	            	TimerTask gorev0=new TimerTask() {
						public void run() {
							label[10].setVisible(true);
							label[11].setVisible(true);
							say0++;
							if(say0==100)
								cancel();
						}
					};zaman0.schedule(gorev0,0,1); 
					Timer zaman=new Timer();
					TimerTask gorev1=new TimerTask() {
						
						public void run() {
							label[10].setBounds(200,300,150,210);
							label[11].setBounds(400,300,150,210);
							arka[8].setVisible(false);
							arka[atak[sayindex2]].setVisible(false);
							say++;
							if(say==200) {
								label[10].setVisible(false);
								label[11].setVisible(false);
							}
							if(say==201)
								cancel();
							    
						}
					};
					zaman.schedule(gorev1,0,1);
					Timer zaman1=new Timer();
					TimerTask gorev2=new TimerTask() {
						
						public void run() {
							arka[8].setBounds(400,300,150,210);
							arka[atak[sayindex2]].setBounds(200,300,150,210);
							arka[8].setVisible(true);
							arka[atak[sayindex2]].setVisible(true);
							say1++;
							if(say1==301) {
								cancel();
							}
						}
					}; zaman1.schedule(gorev2,0,1);
					Timer zaman2=new Timer();
					TimerTask gorev3=new TimerTask() {
						public void run() {
							say2++;
							if(say2==600) {
								arka[8].setVisible(false);
								arka[atak[sayindex2]].setVisible(false);
								karsilastir(8,atak[sayindex2]);
							}
							if(say2==601) {
								cancel();
								sayindex2++;
							}
						}
					};zaman2.schedule(gorev3,0,1);
					Timer zaman3=new Timer();
					TimerTask gorev4=new TimerTask() {
						public void run() {
							say4++;
							if(say4==600) {
							    yeni(1,atak[ataki]);
								ataki++;
							}
							if(say4==601) {
								cancel();
								bir++;
							}
						}
					};zaman3.schedule(gorev4,0,1);
				}
				if(e.getX()>489 && e.getX()<619 && e.getY()>500 && e.getY()<680 && bir==2) {
					say=0;
	            	say1=0;
	            	say2=0;
	            	say0=0;
	            	say4=0;
	            	Timer zaman0=new Timer();
	            	TimerTask gorev0=new TimerTask() {
						public void run() {
							label[10].setVisible(true);
							label[11].setVisible(true);
							say0++;
							if(say0==100)
								cancel();
						}
					};zaman0.schedule(gorev0,0,1); 
					Timer zaman=new Timer();
					TimerTask gorev1=new TimerTask() {
						
						public void run() {
							label[10].setBounds(200,300,150,210);
							label[11].setBounds(400,300,150,210);
							arka[8].setVisible(false);
							arka[atak[sayindex2]].setVisible(false);
							say++;
							if(say==200) {
								label[10].setVisible(false);
								label[11].setVisible(false);
							}
							if(say==201)
								cancel();
							    
						}
					};
					zaman.schedule(gorev1,0,1);
					Timer zaman1=new Timer();
					TimerTask gorev2=new TimerTask() {
						
						public void run() {
							arka[8].setBounds(400,300,150,210);
							arka[atak[sayindex2]].setBounds(200,300,150,210);
							arka[8].setVisible(true);
							arka[atak[sayindex2]].setVisible(true);
							say1++;
							if(say1==301) {
								cancel();
							}
						}
					}; zaman1.schedule(gorev2,0,1);
					Timer zaman2=new Timer();
					TimerTask gorev3=new TimerTask() {
						public void run() {
							say2++;
							if(say2==600) {
								arka[8].setVisible(false);
								arka[atak[sayindex2]].setVisible(false);
								karsilastir(8,atak[sayindex2]);
							}
							if(say2==601) {
								cancel();
								sayindex2++;
							}
						}
					};zaman2.schedule(gorev3,0,1);
					Timer zaman3=new Timer();
					TimerTask gorev4=new TimerTask() {
						public void run() {
							say4++;
							if(say4==600) {
								yeni(1,atak[ataki]);
								ataki++;
							}
							if(say4==601) {
								cancel();
								bir++;
							}
						}
					};zaman3.schedule(gorev4,0,1);
				}
				if(e.getX()>319 && e.getX()<449 && e.getY()>500 && e.getY()<680 && iki==1 && ilk==2) {
					say=0;
	            	say1=0;
	            	say2=0;
	            	say0=0;
	            	say4=0;
	            	Timer zaman0=new Timer();
	            	TimerTask gorev0=new TimerTask() {
						public void run() {
							label[10].setVisible(true);
							label[11].setVisible(true);
							say0++;
							if(say0==100)
								cancel();
						}
					};zaman0.schedule(gorev0,0,1); 
					Timer zaman=new Timer();
					TimerTask gorev1=new TimerTask() {
						
						public void run() {
							label[10].setBounds(200,300,150,210);
							label[11].setBounds(400,300,150,210);
							arka[6].setVisible(false); 
							arka[atak[sayindex2]].setVisible(false);
							say++;
							if(say==200) {
								label[10].setVisible(false);
								label[11].setVisible(false);
							}
							if(say==201)
								cancel();
							    
						}
					};
					zaman.schedule(gorev1,0,1);
					Timer zaman1=new Timer();
					TimerTask gorev2=new TimerTask() {
						
						public void run() {
							arka[6].setBounds(400,300,150,210);
							arka[atak[sayindex2]].setBounds(200,300,150,210);
							arka[6].setVisible(true);
							arka[atak[sayindex2]].setVisible(true);
							say1++;
							if(say1==301) {
								cancel();
							}
						}
					}; zaman1.schedule(gorev2,0,1);
					Timer zaman2=new Timer();
					TimerTask gorev3=new TimerTask() {
						public void run() {
							say2++;
							if(say2==600) {
								arka[6].setVisible(false);
								arka[atak[sayindex2]].setVisible(false);
								karsilastir(6,atak[sayindex2]);
							}
							if(say2==601) {
								cancel();
								sayindex2++;
							}
						}
					};zaman2.schedule(gorev3,0,1);
					Timer zaman3=new Timer();
					TimerTask gorev4=new TimerTask() {
						public void run() {
							say4++;
							if(say4==600) {
								yeni(2,atak[ataki]);
								ataki++;
							}
							if(say4==601) {
								cancel();
								iki++;
							}
						}
					};zaman3.schedule(gorev4,0,1);
				}
				if(e.getX()>319 && e.getX()<449 && e.getY()>500 && e.getY()<680 && iki==1 && son==2) {
					say=0;
	            	say1=0;
	            	say2=0;
	            	say0=0;
	            	say4=0;
	            	Timer zaman0=new Timer();
	            	TimerTask gorev0=new TimerTask() {
						public void run() {
							label[10].setVisible(true);
							label[11].setVisible(true);
							say0++;
							if(say0==100)
								cancel();
						}
					};zaman0.schedule(gorev0,0,1); 
					Timer zaman=new Timer();
					TimerTask gorev1=new TimerTask() {
						
						public void run() {
							label[10].setBounds(200,300,150,210);
							label[11].setBounds(400,300,150,210);
							arka[8].setVisible(false);
							arka[atak[sayindex2]].setVisible(false);
							say++;
							if(say==200) {
								label[10].setVisible(false);
								label[11].setVisible(false);
							}
							if(say==201)
								cancel();
							    
						}
					};
					zaman.schedule(gorev1,0,1);
					Timer zaman1=new Timer();
					TimerTask gorev2=new TimerTask() {
						
						public void run() {
							arka[8].setBounds(400,300,150,210);
							arka[atak[sayindex2]].setBounds(200,300,150,210);
							arka[8].setVisible(true);
							arka[atak[sayindex2]].setVisible(true);
							say1++;
							if(say1==301) {
								cancel();
							}
						}
					}; zaman1.schedule(gorev2,0,1);
					Timer zaman2=new Timer();
					TimerTask gorev3=new TimerTask() {
						public void run() {
							say2++;
							if(say2==600) {
								arka[8].setVisible(false);
								arka[atak[sayindex2]].setVisible(false);
							karsilastir(8,atak[sayindex2]);
							}
							if(say2==601) {
								cancel();
								sayindex2++;
							}
						}
					};zaman2.schedule(gorev3,0,1);
					Timer zaman3=new Timer();
					TimerTask gorev4=new TimerTask() {
						public void run() {
							say4++;
							if(say4==600) {
								yeni(2,atak[ataki]);
								ataki++;
							}
							if(say4==601) {
								cancel();
								iki++;
							}
						}
					};zaman3.schedule(gorev4,0,1);
				}
				if(e.getX()>319 && e.getX()<449 && e.getY()>500 && e.getY()<680 && iki==2) {
					say=0;
	            	say1=0;
	            	say2=0;
	            	say0=0;
	            	say4=0;
	            	Timer zaman0=new Timer();
	            	TimerTask gorev0=new TimerTask() {
						public void run() {
							label[10].setVisible(true);
							label[11].setVisible(true);
							say0++;
							if(say0==100)
								cancel();
						}
					};zaman0.schedule(gorev0,0,1); 
					Timer zaman=new Timer();
					TimerTask gorev1=new TimerTask() {
						
						public void run() {
							label[10].setBounds(200,300,150,210);
							label[11].setBounds(400,300,150,210);
							arka[8].setVisible(false); 
							arka[atak[sayindex2]].setVisible(false);
							say++;
							if(say==200) {
								label[10].setVisible(false);
								label[11].setVisible(false);
							}
							if(say==201)
								cancel();
							    
						}
					};
					zaman.schedule(gorev1,0,1);
					Timer zaman1=new Timer();
					TimerTask gorev2=new TimerTask() {
						
						public void run() {
							arka[8].setBounds(400,300,150,210);
							arka[atak[sayindex2]].setBounds(200,300,150,210);
							arka[8].setVisible(true);
							arka[atak[sayindex2]].setVisible(true);
							say1++;
							if(say1==301) {
								cancel();
							}
						}
					}; zaman1.schedule(gorev2,0,1);
					Timer zaman2=new Timer();
					TimerTask gorev3=new TimerTask() {
						public void run() {
							say2++;
							if(say2==600) {
								arka[8].setVisible(false);
								arka[atak[sayindex2]].setVisible(false);
								karsilastir(8,atak[sayindex2]);
							}
							if(say2==601) {
								cancel();
								sayindex2++;
							}
						}
					};zaman2.schedule(gorev3,0,1);
					Timer zaman3=new Timer();
					TimerTask gorev4=new TimerTask() {
						public void run() {
							say4++;
							if(say4==600) {
								yeni(2,atak[ataki]);
								ataki++;
							}
							if(say4==601) {
								cancel();
								iki++;
							}
						}
					};zaman3.schedule(gorev4,0,1);
				}
				if(e.getX()>149 && e.getX()<279 && e.getY()>500 && e.getY()<680 && uc==1 && ilk==3) {
					say=0;
	            	say1=0;
	            	say2=0;
	            	say0=0;
	            	say4=0;
	            	Timer zaman0=new Timer();
	            	TimerTask gorev0=new TimerTask() {
						public void run() {
							label[10].setVisible(true);
							label[11].setVisible(true);
							say0++;
							if(say0==100)
								cancel();
						}
					};zaman0.schedule(gorev0,0,1); 
					Timer zaman=new Timer();
					TimerTask gorev1=new TimerTask() {
						
						public void run() {
							label[10].setBounds(200,300,150,210);
							label[11].setBounds(400,300,150,210);
							arka[6].setVisible(false); 
							arka[atak[sayindex2]].setVisible(false);
							say++;
							if(say==200) {
								label[10].setVisible(false);
								label[11].setVisible(false);
							}
							if(say==201)
								cancel();
							    
						}
					};
					zaman.schedule(gorev1,0,1);
					Timer zaman1=new Timer();
					TimerTask gorev2=new TimerTask() {
						
						public void run() {
							arka[6].setBounds(400,300,150,210);
							arka[atak[sayindex2]].setBounds(200,300,150,210);
							arka[6].setVisible(true);
							arka[atak[sayindex2]].setVisible(true);
							say1++;
							if(say1==301) {
								cancel();
							}
						}
					}; zaman1.schedule(gorev2,0,1);
					Timer zaman2=new Timer();
					TimerTask gorev3=new TimerTask() {
						public void run() {
							say2++;
							if(say2==600) {
								arka[6].setVisible(false);
								arka[atak[sayindex2]].setVisible(false);
							karsilastir(6,atak[sayindex2]);
							}
							if(say2==601) {
								cancel();
								sayindex2++;
							}
						}
					};zaman2.schedule(gorev3,0,1);
					Timer zaman3=new Timer();
					TimerTask gorev4=new TimerTask() {
						public void run() {
							say4++;
							if(say4==600) {
								yeni(3,atak[ataki]);
								ataki++;
							}
							if(say4==601) {
								cancel();
								uc++;
							}
						}
					};zaman3.schedule(gorev4,0,1);
				}
				if(e.getX()>149 && e.getX()<279 && e.getY()>500 && e.getY()<680 && uc==1 && son==3) {
					say=0;
	            	say1=0;
	            	say2=0;
	            	say0=0;
	            	say4=0;
	            	Timer zaman0=new Timer();
	            	TimerTask gorev0=new TimerTask() {
						public void run() {
							label[10].setVisible(true);
							label[11].setVisible(true);
							say0++;
							if(say0==100)
								cancel();
						}
					};zaman0.schedule(gorev0,0,1); 
					Timer zaman=new Timer();
					TimerTask gorev1=new TimerTask() {
						
						public void run() {
							label[10].setBounds(200,300,150,210);
							label[11].setBounds(400,300,150,210);
							arka[8].setVisible(false);
							arka[atak[sayindex2]].setVisible(false);
							say++;
							if(say==200) {
								label[10].setVisible(false);
								label[11].setVisible(false);
							}
							if(say==201)
								cancel();
							    
						}
					};
					zaman.schedule(gorev1,0,1);
					Timer zaman1=new Timer();
					TimerTask gorev2=new TimerTask() {
						
						public void run() {
							arka[8].setBounds(400,300,150,210);
							arka[atak[sayindex2]].setBounds(200,300,150,210);
							arka[8].setVisible(true);
							arka[atak[sayindex2]].setVisible(true);
							say1++;
							if(say1==301) {
								cancel();
							}
						}
					}; zaman1.schedule(gorev2,0,1);
					Timer zaman2=new Timer();
					TimerTask gorev3=new TimerTask() {
						public void run() {
							say2++;
							if(say2==600) {
								arka[8].setVisible(false);
								arka[atak[sayindex2]].setVisible(false);
								karsilastir(8,atak[sayindex2]);
							}
							if(say2==601) {
								cancel();
								sayindex2++;
							}
						}
					};zaman2.schedule(gorev3,0,1);
					Timer zaman3=new Timer();
					TimerTask gorev4=new TimerTask() {
						public void run() {
							say4++;
							if(say4==600) {
								yeni(3,atak[ataki]);
								ataki++;
							}
							if(say4==601) {
								cancel();
								uc++;
							}
						}
					};zaman3.schedule(gorev4,0,1);
				}
				if(e.getX()>149 && e.getX()<279 && e.getY()>500 && e.getY()<680 && uc==2) {
					say=0;
	            	say1=0;
	            	say2=0;
	            	say0=0;
	            	say4=0;
	            	Timer zaman0=new Timer();
	            	TimerTask gorev0=new TimerTask() {
						public void run() {
							label[10].setVisible(true);
							label[11].setVisible(true);
							say0++;
							if(say0==100)
								cancel();
						}
					};zaman0.schedule(gorev0,0,1); 
					Timer zaman=new Timer();
					TimerTask gorev1=new TimerTask() {
						
						public void run() {
							label[10].setBounds(200,300,150,210);
							label[11].setBounds(400,300,150,210);
							arka[8].setVisible(false); 
							arka[atak[sayindex2]].setVisible(false);
							say++;
							if(say==200) {
								label[10].setVisible(false);
								label[11].setVisible(false);
							}
							if(say==201)
								cancel();
							    
						}
					};
					zaman.schedule(gorev1,0,1);
					Timer zaman1=new Timer();
					TimerTask gorev2=new TimerTask() {
						
						public void run() {
							arka[8].setBounds(400,300,150,210);
							arka[atak[sayindex2]].setBounds(200,300,150,210);
							arka[8].setVisible(true);
							arka[atak[sayindex2]].setVisible(true);
							say1++;
							if(say1==301) {
								cancel();
							}
						}
					}; zaman1.schedule(gorev2,0,1);
					Timer zaman2=new Timer();
					TimerTask gorev3=new TimerTask() {
						public void run() {
							say2++;
							if(say2==600) {
								arka[8].setVisible(false);
								arka[atak[sayindex2]].setVisible(false);
								karsilastir(8,atak[sayindex2]);
							}
							if(say2==601) {
								cancel();
								sayindex2++;
							}
						}
					};zaman2.schedule(gorev3,0,1);
					Timer zaman3=new Timer();
					TimerTask gorev4=new TimerTask() {
						public void run() {
							say4++;
							if(say4==600) {
								yeni(3,atak[ataki]);
								ataki++;
							}
							if(say4==601) {
								cancel();
								uc++;
							}
						}
					};zaman3.schedule(gorev4,0,1);
				}
			}
			
		});
        
	}
	public gamescreen2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,1000,800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton pvc = new JButton("PvC");
		pvc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PvCT();
			}
		});
		pvc.setBounds(470, 297, 132, 32);
		contentPane.add(pvc);
		JButton cvc = new JButton("CvC");
		cvc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CvCT();
			}
		});
		cvc.setBounds(470,352,132,32);
		contentPane.add(cvc);
		
		Image menu=new ImageIcon(this.getClass().getResource("/menu.png")).getImage();
		JLabel lblNewLabel = new JLabel(new ImageIcon(menu));
		lblNewLabel.setBounds(0,0,1100,853);
		getContentPane().add(lblNewLabel);
	}
	public void move(JLabel[] label) {
		Timer time=new Timer();
		TimerTask gorev=new TimerTask() {
			public void run() {
				while(sayacm<3) {
				x=(int)label[sayacm].getX();
				y=(float)label[sayacm].getY();
				if(y!=70) {
					y-=0.2;
				}
				if(y!=70) {
					label[sayacm].setBounds(x,(int)y,150,210);
					a.add(label[sayacm]);
				}
				if(y==70 && g==0) {
					artisx+=170;
					g=1;
				}
				if(x!=(150+artisx)) {
					x-=1;
				}
				if(x!=(150+artisx)) {
				label[sayacm].setBounds(x,(int)y,150,210);
				a.add(label[sayacm]);
				}
				else {
					cevir(label,arka);
					sayacm++;
					g=0;
				}
				if(sayacm==3) {
					artisx+=170;
				}
			}
				while(sayacm>2 && sayacm<6) {
					x=(int)label[sayacm].getX();
					y=(float)label[sayacm].getY();
					if(y!=500) {
						y+=1;
					}
					if(y!=500) {
						label[sayacm].setBounds(x,(int)y,150,210);
						a.add(label[sayacm]);
					}
					if(y==500 && g==0) {
						artisx-=170;
						g=1;
					}
					if(x!=(490-artisx)) {
						x-=1;
					}
					if(x!=(490-artisx)) {
					label[sayacm].setBounds(x,(int)y,150,210);
					a.add(label[sayacm]);
					}
					else {
						cancel();
						cevir(label,arka);
						sayacm++;
						g=0;
					}
				}
		}
		};
		time.schedule(gorev,0,1);
		gir=1;
	}
     public void cevir(JLabel[] label,JLabel[] arka) {
		
	    if(sayacm<3) {
	     label[sayindex].setVisible(false);
	     arka[sayindex].setBounds(150+artisx,70,150,210);
	     a.add(arka[sayindex]);
	     }
	    else if(sayacm>2) {
	    	 label[sayindex].setVisible(false);
	    	 arka[sayindex].setBounds(490-artisx,500,150,210);
		     a.add(arka[sayindex]);
	     }
	    sayindex++;
	    
	}
     public void yeni(int sayi1,int indis) {
 		if(temp<10) {
 		if(sayi1==1) {
 			arka[temp].setBounds(490,500,150,210); 
 			temp++;
 			if(indis==0) {
 			arka[temp].setBounds(150,70,150,210); 
 			if(temp==7) x1=150; }
 			if(indis==1) {
 			arka[temp].setBounds(320,70,150,210); 
 			if(temp==7) x1=320; }
 			if(indis==2) {
 			arka[temp].setBounds(490,70,150,210); 
 			if(temp==7) x1=490;}
 			if(indis==7) {
 				arka[temp].setBounds(x1,70,150,210);
 			}
 		}
 		if(sayi1==2) {
 			arka[temp].setBounds(320,500,150,210); 
 			temp++;
 			if(indis==0) {
 				arka[temp].setBounds(150,70,150,210); 
 				if(temp==7) x1=150; }
 			if(indis==1) {
 				arka[temp].setBounds(320,70,150,210); 
 				if(temp==7) x1=320; }
 			if(indis==2) {
 				arka[temp].setBounds(490,70,150,210); 
 				if(temp==7) x1=490;}
 			if(indis==7) {
 				arka[temp].setBounds(x1,70,150,210);
 			}
 		}
 		if(sayi1==3) {
 			arka[temp].setBounds(150,500,150,210);
 			temp++;
 			if(indis==0) {
 				arka[temp].setBounds(150,70,150,210); 
 			if(temp==7) x1=150; }
 			if(indis==1) {
 				arka[temp].setBounds(320,70,150,210); 
 		     	if(temp==7) x1=320; }
 			if(indis==2) {
 				arka[temp].setBounds(490,70,150,210); 
 				if(temp==7) x1=490;}
 			if(indis==7) {
 				arka[temp].setBounds(x1,70,150,210);
 			}
 			
 		}
 		temp++;
 		}
 		label[temp-2].setVisible(false);
 		label[temp-1].setVisible(false);
 	}
     public void karsilastir(int kart1,int kart2) {
    	hasar1=karma.get(kart1).getHasarPuani();
    	hasar2=karma.get(kart2).getHasarPuani();
    	if(hasar1>hasar2) {
    		yaz1+=5;
    		puanp.setText(String.valueOf(yaz1));
    	}
    	if(hasar2>hasar1) {
    		yaz2+=5;
    		puanc.setText(String.valueOf(yaz2));
    	}
    	sayacson++;
    	if(sayacson==5) {
    		if(yaz1>yaz2 && tutp==1) {
    		ekranbas = new JTextField();
    		ekranbas.setFont(new Font("Tahoma", Font.PLAIN, 16));
    		ekranbas.setHorizontalAlignment(SwingConstants.CENTER);
    		ekranbas.setText("Player Kazandi.");
    		ekranbas.setBounds(200,200,200,200);
    		a.add(ekranbas);
    		ekranbas.setColumns(10);
    		}
    		if(yaz1>yaz2 && tutc==1) {
        		ekranbas = new JTextField();
        		ekranbas.setFont(new Font("Tahoma", Font.PLAIN, 16));
        		ekranbas.setHorizontalAlignment(SwingConstants.CENTER);
        		ekranbas.setText("Computer 1 Kazandi.");
        		ekranbas.setBounds(200,200,200,200);
        		a.add(ekranbas);
        		ekranbas.setColumns(10);
        	}
    		if(yaz2>yaz1 && tutp==1) {
        		ekranbas = new JTextField();
        		ekranbas.setFont(new Font("Tahoma", Font.PLAIN, 16));
        		ekranbas.setHorizontalAlignment(SwingConstants.CENTER);
        		ekranbas.setText("Computer Kazandi.");
        		ekranbas.setBounds(200,200,200,200);
        		a.add(ekranbas);
        		ekranbas.setColumns(10);
        	}
    		if(yaz2>yaz1 && tutc==1) {
        		ekranbas = new JTextField();
        		ekranbas.setFont(new Font("Tahoma", Font.PLAIN, 16));
        		ekranbas.setHorizontalAlignment(SwingConstants.CENTER);
        		ekranbas.setText("Computer 2 Kazandi.");
        		ekranbas.setBounds(300,300,200,200);
        		a.add(ekranbas);
        		ekranbas.setColumns(10);
        	}
    	}
    	
     }
     public void yenic(int sayi1,int indis) {
  		if(temp<10) {
  		if(sayi1==5) {
  			arka[temp].setBounds(490,500,150,210); 
  			temp++;
  			if(indis==0) {
  			arka[temp].setBounds(150,70,150,210); 
  			if(temp==7) x1=150; }
  			if(indis==1) {
  			arka[temp].setBounds(320,70,150,210); 
  			if(temp==7) x1=320; }
  			if(indis==2) {
  			arka[temp].setBounds(490,70,150,210); 
  			if(temp==7) x1=490;}
  			if(indis==6) {
  				arka[temp].setBounds(x1,70,150,210);
  			}
  			if(temp==6) {
  				if(ilk==-1) {
  					ilk=5;
  				}
  				if(ilk!=-1 && son==-1) {
  					son=5;
  				}
  			}
  		}
  		if(sayi1==4) {
  			arka[temp].setBounds(320,500,150,210); 
  			temp++;
  			if(indis==0) {
  				arka[temp].setBounds(150,70,150,210); 
  				if(temp==7) x1=150;}
  			if(indis==1) {
  				arka[temp].setBounds(320,70,150,210); 
  				if(temp==7) x1=320; }
  			if(indis==2) {
  				arka[temp].setBounds(490,70,150,210); 
  				if(temp==7) x1=490;}
  			if(indis==7) {
  				arka[temp].setBounds(x1,70,150,210);
  			}
  			if(temp==6) {
  				if(ilk==-1) {
  					ilk=2;
  				}
  				if(ilk!=-1 && son==-1) {
  					son=2;
  				}
  			}
  		}
  		if(sayi1==3) {
  			arka[temp].setBounds(150,500,150,210);
  			temp++;
  			if(indis==0) {
  				arka[temp].setBounds(150,70,150,210); 
  			if(temp==7) x1=150; }
  			if(indis==1) {
  				arka[temp].setBounds(320,70,150,210); 
  		     	if(temp==7) x1=320; }
  			if(indis==2) {
  				arka[temp].setBounds(490,70,150,210); 
  				if(temp==7) x1=490;}
  			if(indis==7) {
  				arka[temp].setBounds(x1,70,150,210);
  			}
  			if(temp==6) {
  				if(ilk==-1) {
  					ilk=3;
  				}
  				if(ilk!=-1 && son==-1) {
  					son=3;
  				}
  			}
  			
  		}
  		if(sayi1==6) {
  			arka[temp].setBounds(150,500,150,210);
  			temp++;
  			if(ilk==5) {
  				arka[temp].setBounds(490,500,150,210);
  			}
  			if(ilk==4) {
  				arka[temp].setBounds(320,500,150,210);
  			}
  			if(ilk==3) {
  				arka[temp].setBounds(150,500,150,210);
  			}
  		}
  		temp++;
  		}
  		label[temp-2].setVisible(false);
  		label[temp-1].setVisible(false);
  	}
	
}
