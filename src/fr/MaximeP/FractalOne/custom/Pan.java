package fr.MaximeP.FractalOne.custom;

import java.awt.Graphics;
import java.util.Scanner;

import javax.swing.JPanel;
 
@SuppressWarnings("serial")
public class Pan extends JPanel{ 
	
	public void paintComponent(Graphics g){
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(" \n-> Veuillez entrer le nombre d'itérations.");
		
		String str = sc.nextLine();
		
		if(str.equalsIgnoreCase("stop")) {
			
			System.exit(0);
			
		}else {
			
			int it = 0;
			try {
				
				it = Integer.parseInt(str);
				
			}catch (Exception e) {
				
				System.out.println("Vous devez saisir un nombre !");
				paint(g);
				
			}
			
			String chars[] = null;
			
			System.out.println("[|] Génération de la fractale...");
			for(int i = 0; i < it; i++) {
				
				System.out.println("# Iteration -> "+i);
				
				if(i == 0) {
					
					chars = "A".split(",");
					
				}else{
					
					String cts = "";
					
					for(String c : chars) {
						
						cts = cts+c;
							
					}
					
					cts = cts.replaceAll("A", ",A,B,A,C,A,B,A,");
					
					chars = cts.replaceFirst(",", "").split(",");
					
				}
				
			}
			
			//PAINT
			int co = 0;
			for(String a : chars) {
				
				if(a.equalsIgnoreCase("A")) {
					
					//suite
					
				}
				
			}
			
		}
		    
	}
  
}