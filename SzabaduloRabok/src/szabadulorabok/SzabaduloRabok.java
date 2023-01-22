/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package szabadulorabok;

/**
 *
 * @author szeke
 */
public class SzabaduloRabok {

    /**
     * @param args the command line arguments
     */
    static boolean[] tombInit(int cellak){
        boolean[] borton = new boolean[cellak];
        for (boolean b : borton) { b = false; }
        return borton;
    }
    static void nyitottCellak(boolean[] borton){
        System.out.println("A nyitott cellák sorszáma: ");
        for (int i = 0; i < borton.length; i++) {
            if (borton[i]){ System.out.print(i+"; ");}
        }
    }
    static void kulcsHasznalat(boolean[] borton){
        for (int i = 1; i <= borton.length; i++) {
            for (int j = 0; j < borton.length; j=j+i) {
                if(borton[j])
                    borton[j]=false;
                else
                    borton[j]=true;
            }
            
        }
    }
    
    public static void main(String[] args) {
        boolean[] cellak = tombInit(1000);
        
        kulcsHasznalat(cellak);
        
        nyitottCellak(cellak);

        /* Alternatív matematikai megoldás:
        int i=1;
        while(i*i<1000){
            System.out.print(i*i+"; ");
            i++;
        }*/
        
    }
    
}
