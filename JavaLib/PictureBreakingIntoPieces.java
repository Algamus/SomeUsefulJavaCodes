import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.*;
import java.io.*;


/*
==================================================================================================================
 Name        : Picture Breaking Into Pieces
 Author      : Gokhan Gobus
 Version     : 
 Copyright   : Gokhan Gobus
 Description : picture breaking into pieces by specific width and height 
 =================================================================================================================
*/

public class PictureBIP { //picture breaking into pieces


	//Settings
	String PicPath="c:/javaTest/img/";//example path + filename +format
	String PicName="test.jpg";

	String PicNewPath="c:/javaTest/img/"; //example path
	String PicCloneNames="img"; //examle name
	String PicClonesFormat="jpg"; //example format

	int line=2; //line / satır
	int column=2;// column / kolon

	///////////////////////////////////////////////////

	public static void main(String[] args) throws IOException {

        //picture loading
		FileImputStream file = new FileInputStream(PicPath);
		Buffered image = ImageIO.read(file);
		//////

		int TotalPic=line*column;

		int height = image.getHeight() / line;
		int width = image.getWidth() / column;

		BufferedImage Clones[] = new BufferedImage[TotalPic];

		int count = 0;

		for(int i=0;i<line;i++){
			for(int k=0;k<column;k++){
				Clones[count] = new BufferedImage(width,height,1);
				Graphics2D g = Clones[count].createGraphics();
				g.drawImage(image,0,0,width,height,width*k,height*i,(width*k)+width,(height*i)+height,null);
				g.dispose();
				count++;
			}
		}

		//breaking done

		//new pieces 

		for(int t=0;t<count;t++){
			ImageIO.write(Clones[t], PicClonesFormat, new File(PicNewPath+PicCloneNames+t+"."+PicClonesFormat));
		}

		//creating done


	}



}