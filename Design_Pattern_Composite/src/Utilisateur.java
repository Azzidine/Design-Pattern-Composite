import java.util.ArrayList;  
import java.util.Iterator;  
import java.util.List; 
    
    
public class Utilisateur {

	public static void main(String[] args) {
	  
		        R�pertoire r�p1 = new R�pertoire(100, "Images", 8745); 
		        R�pertoire r�p2 = new R�pertoire(101, "Study dossier",4152); 
		        Composite engDirectory = new Composite(); 
		        engDirectory.addr�pertoire(r�p1); 
		        engDirectory.addr�pertoire(r�p2); 
		          
		        Fichier fich1 = new Fichier(200, "TP1 ",214); 
		        Fichier fich2 = new Fichier(201, "Documents ", 215); 
		          
		        Composite accDirectory = new Composite(); 
		        accDirectory.addr�pertoire(fich1); 
		        accDirectory.addr�pertoire(fich2); 
		      
		        Composite directory = new Composite(); 
		        directory.addr�pertoire(engDirectory); 
		        directory.addr�pertoire(accDirectory); 
		        directory.showEspace_DisqueDetails();  
		
	            }  
	    }  
