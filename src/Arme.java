
public class Arme extends Equipement{

	protected int PointsDeDegats; 
	
	
	
	
	public Arme(String nom, int Degat) {
		super(nom);
		this.PointsDeDegats = Degat;
		
	}
	
	public int getDegat() {
		return PointsDeDegats;
		
	}
	
	
	
	

}
