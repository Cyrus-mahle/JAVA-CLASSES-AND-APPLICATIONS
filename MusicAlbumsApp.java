/*
 * Author : Nyakama Mahle 219295387 
 * Date created :16/May/2021
 * class : MusicAlbumsApp.java
 * Description : Application that output 5 albums with 
 * 1Name
 * 2Title
 * 3Minutes
 * 4Seconds
 */
import javax.swing.JOptionPane;

public class MusicAlbumsApp {

	public static void main(String[] args) {
		
		MusicAlbums[] obj =new MusicAlbums[5];
		
        for(int ctr=0;ctr<obj.length;ctr++) 
		  obj[ctr]=new MusicAlbums(null, null,null,0,0);
        	
        	obj[0].setName(" Indigo ");
        	obj[0].setTitle(" Dear God !");
        	obj[0].setArtistName("Chris Brown");
        	obj[0].setMin(4);
        	obj[0].setSec(23);
        	
        	obj[1].setName(" Suncity ");
        	obj[1].setTitle(" vertigo ");
        	obj[1].setArtistName("Khalid");
        	obj[1].setMin(2);
        	obj[1].setSec(30);
        	
        	obj[2].setName(" Free ");
        	obj[2].setTitle("Never know ");
        	obj[2].setArtistName("6lack");
        	obj[2].setMin(4);
        	obj[2].setSec(20);
        	
        	obj[3].setName(" After hours ");
        	obj[3].setTitle("Alone again ");
        	obj[3].setArtistName("The weekend");
        	obj[3].setMin(5);
        	obj[3].setSec(15);
        	
        	obj[4].setName(" Fool for you ");
        	obj[4].setTitle("its you ");
        	obj[4].setArtistName("Zayn Malik");
        	obj[4].setMin(7);
        	obj[4].setSec(2);
        	
        	
        for(int ctr=0;ctr<obj.length;ctr++) {
		JOptionPane.showMessageDialog(null, obj[ctr], null, 1);
        }
        System.exit(0);
	}
}
