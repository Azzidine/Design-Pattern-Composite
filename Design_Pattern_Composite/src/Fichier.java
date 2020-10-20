// this is the " Fichier" class i.e. Composite. 

    import java.util.ArrayList;  
    import java.util.Iterator;  
    import java.util.List;  
      
    public class Fichier implements Espace_Disque {  
    	
    	   private String name; 
    	    private int id; 
    	    private int Taille; 
    	  
    	    public Fichier(int id, String name, int Taille) 
    	    { 
    	        this.id = id; 
    	        this.name = name; 
    	        this.Taille = Taille; 
    	    } 
    	      
    	    @Override
    	    public void showEspace_DisqueDetails()  
    	    { 
    	    	System.out.println("==================================================");  
    	        System.out.println("l'Id du Fichier est :"+id);  
    	        System.out.println(" le nom du Fichier est :"+name);  
    	        System.out.println("la taille du Fichier en Koctes :"+Taille);  
    	        System.out.println("================================================="); 
    	    } 
    	} 
