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

    /* accessors */

    /**
     * Name: getUsername
     * Description: return the username
     * @return the username
     */
    public String getUsername() {return this.username;}

    /**
     * Name: getPassword
     * Description: return the password
     * @return the password
     */
    public String getPassword() {return this.password;}

    /**
     * Name: getEmail
     * Description: return the email
     * @return the email
     */
    public String getEmail() {return this.email;}

    /**
     * Name: getRegion
     * Description: return the region
     * @return the region
     */
    public String getRegion() {return this.region;}

   /**
     * Name: getBirthday
     * Description: return the user's brithday
     * @return the birthday
     */
    public String getBirthday() {return this.birthday;}

    /* mutators */

    /**
    Description: Sets new username
    @param newUsername
    */
    public void setUsername(String newUsername){
        this.username = newUsername;      
      }
      
    /**
    Description: Sets new password
    @param newPassword
    */
    public void setPassword(String newPassword){
        this.password = newPassword;      
      }

    /**
    Description: Sets new email 
    @param newEmail
    */
    public void setEmail(String newEmail){
        this.email = newEmail;      
      }

    /**
    Description: Sets new region
    @param newRegion
    */
    public void setRegion(String newRegion){
        this.region = newRegion;      
      }
}
