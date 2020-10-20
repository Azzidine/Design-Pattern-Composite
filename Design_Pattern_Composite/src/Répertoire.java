    // this is the " Répertoire" class i.e. Composite. 

    import java.util.ArrayList;  
    import java.util.Iterator;  
    import java.util.List;  
      
    public class Répertoire implements Espace_Disque {  

    private String name; 
    private int id; 
    private int Taille; 
  
    public Répertoire(int id, String name, int Taille) 
    { 

        this.id = id; 
        this.name = name; 
        this.Taille = Taille; 
    } 
      
    @Override
    public void showEspace_DisqueDetails()  
    { 
    	System.out.println("==================================================");  
        System.out.println("l'Id du répertoire :"+id);  
        System.out.println(" le nom du répertoire est :"+name);  
        System.out.println("la taille du rép en Koctes :"+Taille);  
        System.out.println("=================================================");  
       
    } 
 

	
}// End of Répertoire class. 

