import java.util.ArrayList;

public class Personnage {
	
	protected String Nom ;
	public ArrayList<Equipement> Equipements ;
	protected Race Race;
	protected int Force ;
	protected int Agilite;
	protected int Endurance;
	protected int Intelligence;
	protected int Sagesse;
	
	public Personnage() {
		
		this.Nom = "Sans nom";
		this.Force = 10;
		this.Agilite = 10;
		this.Endurance = 10;
		this.Intelligence = 10;
		this.Sagesse = 10;
		this.Race = new Humain(); 
		this.Equipements = new ArrayList<Equipement>();
		}
	
	public Personnage(String nom, int Force, int Agilite, int Endurance, int Intelligence, int Sagesse, Race race) {
		this.Nom = nom;
		this.Force = Force;
		this.Agilite = Agilite;
		this.Endurance = Endurance;
		this.Intelligence = Intelligence;
		this.Sagesse = Sagesse;
		this.Race = race; 
		this.Equipements = new ArrayList<Equipement>();
		
	} 
	
	public String getNom() {
		return Nom ;
	}
	public int getForce() {
		return Force ;
	}
	public int getAgilite() {
		return Agilite ;
	}
	public int getEndurance() {
		return Endurance ;
	}
	public int getIntelligence() {
		return Intelligence ;
	}
    public int getSagesse() {
		return Sagesse ;
	}
    
    
    public void AddEquipement(final Equipement Equipement) {
    	this.Equipements.add(Equipement);
    	
    }
    
}
