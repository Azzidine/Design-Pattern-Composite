
import java.util.ArrayList; 
import java.util.List; 
  
public class Composite implements Espace_Disque { 
	
    private List<Espace_Disque> Espace_DisqueList = new ArrayList<Espace_Disque>(); 
       
    @Override
    public void showEspace_DisqueDetails()  
    { 
        for(Espace_Disque emp:Espace_DisqueList) 
        { 
            emp.showEspace_DisqueDetails(); 
        } 
    } 
       
    public void addrépertoire(Espace_Disque emp) 
    { 
    	Espace_DisqueList.add(emp); 
    } 
       
    public void removerépertoire(Espace_Disque emp) 
    { 
    	Espace_DisqueList.remove(emp); 
    } 
} 

