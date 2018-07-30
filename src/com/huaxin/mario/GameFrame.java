package com.huaxin.mario;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
 
import javax.swing.ImageIcon;
import javax.swing.JFrame;
 
import com.huaxin.enery.Enery;
import com.huaxin.enery.Pipe;
 
import Util.Map;
 
public class GameFrame extends JFrame{
	
	public Mario mario;
	public Enery pipe,cion,brick;
	//����ͼƬ
	public BackgroundImage bg ;
	
	//����װ����
	public ArrayList<Enery> eneryList = new ArrayList<Enery>();
	
	//�ӵ�����
	public ArrayList<Boom> boomList = new ArrayList<Boom>();
	
	//�ӵ����ٶ�
	public int bspeed=0;
	
	//����ͼ���ƶ�������1��שͷ����2����ң���3��ˮ��
	public int [][] map =null;
	
	//���캯�������ʼ������ͼƬ������¶���
	public GameFrame() throws Exception {
		
		mario = new Mario(this);
		mario.start();
		Map mp= new Map();
		bg = new BackgroundImage();
		
		//�����ػ��߳�
		new Thread(){
			public void run(){
				while(true){
					//�ػ洰��
					repaint();
					//����ӵ��Ƿ����
					checkBoom();
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		map=mp.readMap();
		//��ȡ��ͼ�������õ�ͼ
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				//��ȡ������1����שͷ
				if(map[i][j]==1){
					brick = new Pipe(j*30,i*30,30,30,new ImageIcon("image/brick.png").getImage());
					eneryList.add(brick);
				}
				//����2�����
				if(map[i][j]==2){
					cion = new Pipe(j*30,i*30,30,30,new ImageIcon("image/coin_brick.png").getImage());
					eneryList.add(cion);
				}
				//����3��ˮ��
				if(map[i][j]==3){
					pipe = new Pipe(j*30,i*30,60,120,new ImageIcon("image/pipe.png").getImage());
					eneryList.add(pipe);
				}
				
			}
		}
		//���ñ�������
		//com.huaxin.music.Util.startMusic("music/bg1.wav");
	}
	
	public void initFrame(){
		//���ô����������
		this.setSize(800,450);
		this.setTitle("ɽկ�泬������");
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(3);
		this.setVisible(true);
		
		//�ô�����Ӽ��̼���
		KeyListener kl = new KeyListener(this);
		this.addKeyListener(kl);
	}
	
	public void paint(Graphics g) {
		//����˫���廭����ͼƬ�������
		BufferedImage bi =(BufferedImage)this.createImage(this.getSize().width,this.getSize().height);
		Graphics big =bi.getGraphics();
		big.drawImage(bg.img, bg.x, bg.y, null);
		
		for (int i = 0; i <eneryList.size(); i++) {
			Enery e =eneryList.get(i);
			big.drawImage(e.img, e.x, e.y, e.width, e.height,null);
		}
		
		//���ӵ�
		for (int i = 0; i < boomList.size(); i++) {
			Boom b =boomList.get(i);
			Color c =big.getColor();
			big.setColor(Color.red);
			big.fillOval(b.x+=b.speed, b.y, b.width, b.width);
			big.setColor(c);
		}
		
		//������
		big.drawImage(mario.img, mario.x, mario.y, mario.width, mario.height,null);
		g.drawImage(bi,0,0,null);
		
	}
	
	//����ӵ��Ƿ���磬��������������Ƴ������Ƴ��Ļ����ڴ��й©
	public void checkBoom(){
		for (int i = 0; i < boomList.size(); i++) {
			Boom b = boomList.get(i);
			if(b.x<0 || b.x>800){
				boomList.remove(i);
			}
		}
	}
 
}
