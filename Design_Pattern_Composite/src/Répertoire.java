    // this is the " R�pertoire" class i.e. Composite. 

    import java.util.ArrayList;  
    import java.util.Iterator;  
    import java.util.List;  
      
    public class R�pertoire implements Espace_Disque {  

    private String name; 
    private int id; 
    private int Taille; 
  
    public R�pertoire(int id, String name, int Taille) 
    { 

        this.id = id; 
        this.name = name; 
        this.Taille = Taille; 
    } 
      
    @Override
    public void showEspace_DisqueDetails()  
    { 
    	System.out.println("==================================================");  
        System.out.println("l'Id du r�pertoire :"+id);  
        System.out.println(" le nom du r�pertoire est :"+name);  
        System.out.println("la taille du r�p en Koctes :"+Taille);  
        System.out.println("=================================================");  
       
    } 
 

	
}// End of R�pertoire class. 

