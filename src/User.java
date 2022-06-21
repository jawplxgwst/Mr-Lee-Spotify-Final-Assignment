/**
 * @author Chris Park
 * Jun 7, 2022
 * 
 * A user class, contains user's favourite music and subscription details
 */
public class User {
 
    /* attributes */

    /** username of the user */
    private String username;

    /** password of the user */
    private String password;

    /** email adress of the user */
    private String email;

    /** region of the user */
    private String region;

    /** Birthdate of the user */
    private String birthday;

    /* constructor */

    /**
     * Name: User
     * Description: User attributes
     * @param username
     * @param password
     * @param email
     * @param region
     * @param birthday
     */
    public User(String username, String password, String email, String region, String birthday) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.region = region;
        this.birthday = birthday;
    }

    /* accessots */

    /**
     * Name: getUsername
     * Description: return the username
     * @return
     */
    public String getUsername() {return this.username;}

    /**
     * Name: getPassword
     * Description: return the password
     * @return
     */
    public String getPassword() {return this.password;}

    /**
     * Name: getEmail
     * Decription: return the email
     * @return
     */
    public String getEmail() {return this.email;}

    /**
     * Name: getRegion
     * Description: return the region
     * @return
     */
    public String getRegion() {return this.region;}

   /**
     * Name: getBirthday
     * Description: return the user's brithday
     * @return
     */
    public String getBirthday() {return this.birthday;}

    /**
    Description: Sets new username
    @param String newUsername
    @return void
    */
    public void setUsername(String newUsername){
        this.username = newUsername;      
      }
      
    /**
    Description: Sets new password
    @param String newPassword
    @return void
    */
    public void setPassword(String newPassword){
        this.password = newPassword;      
      }

    /**
    Description: Sets new email 
    @param String newEmail
    @return void
    */
    public void setEmail(String newEmail){
        this.email = newEmail;      
      }

    /**
    Description: Sets new region
    @param String newRegion
    @return void
    */
    public void setRegion(String newRegion){
        this.region = newRegion;      
      }
}
