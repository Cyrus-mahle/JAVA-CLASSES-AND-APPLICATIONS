/*
 * Author : Nyakama Mahle 219295387 
 * Date created :16/May/2021
 * class : MusicAlbums.java
 * Description : class that Allocate memory for Attributes of Albums
 * 
 */
public class MusicAlbums {
	
  private String nameOfAlbum;
  private String titleOfAlbum;
  private String artistName;
  private int min,sec;
  
  public MusicAlbums(String nameOfAlbum,String titleOfAlbum,String artistName,int min,int sec) {
	  this.nameOfAlbum=nameOfAlbum;
	  this.titleOfAlbum=titleOfAlbum;
	  this.artistName=artistName;
	  this.min =min;
	  this.sec=sec;
  }
  
 

  public void setArtistName(String artistName){
	  this.artistName=artistName;
  }
  
  public void setName(String nameOfAlbum){
	  this.nameOfAlbum=nameOfAlbum;
  }
  
  public void setTitle(String titleOfAlbum) {
	  
	  this.titleOfAlbum=titleOfAlbum;
  }
  
  public void setMin(int min) {
	  
	  this.min=min;
  }
  
  public void setSec(int sec) {
	  
	  this.sec=sec;
  }
  
  
  public String getArtistName() {
	  
	return artistName;
	  
  }
  
  public String getName() {
	  
	  return nameOfAlbum;
  }
  
  public String getTitle() {
	  
	  return titleOfAlbum;
  }
  
  public int getMin() {
	  return min;
  }
  public int getSec() {
	return sec;
	  
  }
  
  @Override
  public String toString() {
  
	  return " Album name  : "+nameOfAlbum +" ; " + " Album title : "+titleOfAlbum +" ; "+
			  "Artist name : "+artistName +" ; "+min+" : "+sec;
  }
}




