package main;

import processing.core.PApplet;

public class Cuad implements Runnable{

	private PApplet app;
	private int posX;
	private int posY;
	private int tam = 20;
	private int vel;

	private int dirY;
	
	
	public Cuad(int posX, int posY, PApplet app) {
		this.app = app;
		posX = this.posX;
		posY = this.posY;
		
	
		vel = 3;
	
		dirY = 1;
		
	}
	public void dibujar(int color) {

        if (color == 1) {
            app.fill (255);
        } else {
            app.fill(0);
        } 
        app.rect (this.posX, this.posY, this.tam, this.tam);
    

		System.out.println("pinte RECT1"); 

	}
	

	public void run() {
		
		try {
			Thread.sleep(1000);	
			
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		
		
		
	}
	public void mover() {
		this.posY -= this.vel*dirY;
		
		
	}
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public int getPosY() {
		return posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
	public int getTam() {
		return tam;
	}
	public void setTam(int tam) {
		this.tam = tam;
	}
	
	

}
