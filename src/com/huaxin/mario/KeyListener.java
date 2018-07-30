package com.huaxin.mario;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
 
import javax.swing.ImageIcon;
 
 
//���̰��¼�����
public class KeyListener extends KeyAdapter{
	
	public GameFrame gf;
	public boolean jumpFlag=true;
	
	public KeyListener(GameFrame gf) {
		this.gf=gf;
	}
	
	//���̼���
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		switch(code){
		//������
		case 39:
			gf.mario.right=true;
			break;
			//������
		case 37:
			gf.mario.left=true;
		break;
		
		case 66:
			addBoom();
		break;
		
		//������
		case 74:
			gf.mario.up=true;
			break;
	}
	}
	
	//����ӵ�
	public void addBoom() {	
		Boom b = new Boom(gf.mario.x,gf.mario.y+5,10);
		if(gf.mario.left) b.speed=-2;
		if(gf.mario.right) b.speed=2;
		gf.boomList.add(b);
	}
 
	//�����ͷż���
	public void keyReleased(KeyEvent e) {
		
		int code=e.getKeyCode();
		if(code==39){
			
			gf.mario.right=false;
			
			gf.mario.img=new ImageIcon("image/mari1.png").getImage();
		}
		if(code==37){
			gf.mario.left=false;
			
			gf.mario.img=new ImageIcon("image/mari_left1.png").getImage();
		}
		
		if(code==74){
			gf.mario.up=false;
			
		}
	}
 
}
