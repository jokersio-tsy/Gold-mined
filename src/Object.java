import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Object {
	int x,y;
	int width,height;
	int score;
	int type;//����1��� 2ʯ��
	int m;
	Image img;
	boolean is_catch=false;public Object() {
		// TODO Auto-generated constructor stub
	}
	void paintself(Graphics g)
	{
		g.drawImage(img,x,y,null);
	}
	public Rectangle getrec()
	{
		return new Rectangle(x,y,width,height);
	}
}
