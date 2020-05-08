package main;

import processing.core.PApplet;

public class Main extends PApplet {
	Cuad[][] matrizz = new Cuad[20][30]; 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("main.Main");
		

	}
	public void settings() {
		
		size(700,400);
	}
	public void setup() {
		background(0);
		

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 30; j++) {
                matrizz[i][j] = new Cuad(j+20,i+20, this);
            }
        }
		  
		
	
	}
	public void draw() {
		background(0);

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 30; j++) {

                if(i%2==0) {
                	
                	
                	
                    if (j%2==0)
                    	
                    	
                    	matrizz[i][j].dibujar(0);
                    
                    else matrizz[i][j].dibujar(1);
                    } else {

                    if (j%2==0) 
                        matrizz[i][j].dibujar(1);
                    else matrizz[i][j].dibujar(0);
                    }
            
        
		}
        }
	}
		
		
		
		
		
		
	
	
	
	public void mousePressed() {
		if(mouseX > 0 && mouseX < 700  && mouseY >0 && mouseY < 400){
			// Cuad.add(new Cuad(this));
			
	   

	        }
		
		
	}

	}

	