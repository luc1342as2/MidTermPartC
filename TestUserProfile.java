git add //This program is working just fine.
git fetch <repository>
git merge <repository>

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;

/**
 * The user profile for the OnlineVids system. The user has a userID
 * and a favourite genre that must be one of the choices in the
 * genres array. This code is to be used for SYST 17796 midterm exam.
 * Students are reminded to add themselves as modifiers when editing the
 * code.
 * @author dancye, 2019
 * @modifier Lucas Ghigli 2022
 */
public class TestUserProfile 
{
    public static void main(String[]args) {}
    private String userName; //this will print the userID.
    private String genre; // this will print the genre the user likes.
    private String[] genres = {"Comedy", "Drama", "Action", "Mystery"}; //this are the choices the user can pick.
    
    /**
     * A constructor that takes in the userID and the favourite genre
     * @param givenName the name of the user.
     * @param givenGenre the users favourite genre.
     */
    
    public TestUserProfile(String givenuserName, String givenGenre)
    {
        userName = givenuserName; //it gives a value to userName.
        genre= givenGenre; //it gives a value to genre.
    }

    /**
     * A getter for the userID
     * @return the userID
     */
    public String getUserID() {
        return userName; //this returns the userName of the user.
    }

    /**
     * @param userName the userName to set
     */
    public void setUserID(String userName) {
        this.userName = userName; //this set a value to the userName.
    }

    /**
     * A getter for the genre
     * @return the genre
     */
    public String getGenre() {
        return genre; //this returns the genre the user choose.
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre; //this set the value to the genre.
    }
    
}//end of class
