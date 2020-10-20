import java.util.ArrayList;  
import java.util.Iterator;  
import java.util.List; 
    
    
public class Utilisateur {

	public static void main(String[] args) {
	  
		        Répertoire rép1 = new Répertoire(100, "Images", 8745); 
		        Répertoire rép2 = new Répertoire(101, "Study dossier",4152); 
		        Composite engDirectory = new Composite(); 
		        engDirectory.addrépertoire(rép1); 
		        engDirectory.addrépertoire(rép2); 
		          
		        Fichier fich1 = new Fichier(200, "TP1 ",214); 
		        Fichier fich2 = new Fichier(201, "Documents ", 215); 
		          
		        Composite accDirectory = new Composite(); 
		        accDirectory.addrépertoire(fich1); 
		        accDirectory.addrépertoire(fich2); 
		      
		        Composite directory = new Composite(); 
		        directory.addrépertoire(engDirectory); 
		        directory.addrépertoire(accDirectory); 
		        directory.showEspace_DisqueDetails();  
		
	            }  
	    }  
