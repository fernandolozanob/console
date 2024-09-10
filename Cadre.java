public class Cadre 
{
	private int badge;
	private String nom, prenom;
	
	public Cadre()
	{
		this.badge=0;
		this.nom=this.prenom="";
	}
	
	public Cadre(int badge, String nom, String prenom)
	{
		this.badge=badge;
		this.nom=nom;
		this.prenom=prenom;
	}
	
	public void saisir()
	{
		System.out.println("Veuillez saisir le numéro du badge.");
		this.badge=Console.saisirInt();
		System.out.println("Veuillez saisir le nom.");
		this.nom=Console.saisirString();
		System.out.println("Veuillez saisir le prénom.");
		this.prenom=Console.saisirString();
	}
	
	public void afficher()
	{
		System.out.println("Le cadre dont le badge a pour numéro "
				+ this.badge + " s'appelle "
				+ this.nom + " " + this.prenom + ".");
	}
	
	public String toString()
	{
		String chaine="";
		chaine =+ this.badge + " | " + this.nom + " | " +  this.prenom;
		return chaine;
	}
	
	public String toXML()
	{
		String xml="";
		xml += "<cadre>\n";
		xml += "\t<badge>" + this.badge + "</badge>\n";
		xml += "\t<nom>" + this.nom + "</nom>\n";
		xml += "\t<prenom>" + this.prenom + "</prenom>\n";
		xml += "</cadre>\n";
		return xml;
	}

	// getters et setters
	public int getBadge() {
		return badge;
	}

	public void setBadge(int badge) {
		this.badge = badge;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
}