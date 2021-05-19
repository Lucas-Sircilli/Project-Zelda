package com.nomedaempresa.entities;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.nomedaempresa.main.Game;
import com.nomedaempresa.world.Camera;

public class Entity {
	public static BufferedImage LIFEPACK_EN = Game.spritesheet.getSprite(96, 0, 16,16);
	public static BufferedImage WEAPON_EN = Game.spritesheet.getSprite(112, 0, 16,16);
	public static BufferedImage BULLET_EN = Game.spritesheet.getSprite(96, 16, 16,16);
	public static BufferedImage ENEMY_EN = Game.spritesheet.getSprite(112, 16, 16,16);
	protected double x;
	protected double y;
	protected int width;
	protected int height;
	protected BufferedImage sprite;
	public Entity(int x, int y, int width, int height, BufferedImage sprite){
		// Não foi o inserido o this nas variáveis para teste, se não der certo apenas coloca-lo
		this.x = x;
		this.y= y;
		this.width = width;
		this.height = height;
		this.sprite = sprite;
	}
	public void setX(double newX){
		this.x = newX;
	}
	public void setY(double newY){
		this.y = newY;
	}
	public int getX(){
		return (int) this.x;
	}
	public int getY(){
		return (int) this.y;
	}
	public int getWidth(){
		return this.width;
	}
	public int getHeight(){
		return this.height;
	}
	public void render(Graphics g){
		// getX e getY estão sem o this, apenas recoloca-los
		g.drawImage(sprite,this.getX() - Camera.x,this.getY() - Camera.y,null);
	}
	public void tick() {
		}
}
