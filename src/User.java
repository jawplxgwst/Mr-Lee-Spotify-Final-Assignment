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
        if (newUsername.length() > 0) {
            this.username = newUsername;
        }
      }
      
    /**
    Description: Sets new password
    @param newPassword
    */
    public void setPassword(String newPassword) {
        if (newPassword.length() > 0) {
            this.password = newPassword;
        }
    }

    /**
    Description: Sets new email 
    @param newEmail
    */
    public void setEmail(String newEmail){
        if (newEmail.length() > 0) {
            this.email = newEmail;
        }
      }

    /**
    Description: Sets new region
    @param newRegion
    */
    public void setRegion(String newRegion){
        if (newRegion.length() > 0) {
            this.region = newRegion;
        }
      }

      /**
       * change password method
       * @param oldPassword
       * @param newPassword
       * @param newPasswordAgain
       */
      public void changePassword(String oldPassword, String newPassword, String newPasswordAgain) {

        if (oldPassword.equals(this.password)) { // if entered old password is the same as what the old password actually is

                    if (newPassword.equals(newPasswordAgain)) { // if both new password input is the same
                        this.password = newPassword;
                        System.out.println("Your password has been changed.");
                    } else {
                        System.out.println("Your new passwords do not match. \nYour password has not been changed.");
                    }
        } else {
            System.out.println("Your new old passwords do not match. \nYour password has not been changed.");
        }
    }


      public void changeUsername(String oldUsername, String newUsername) {

                    if (newUsername.!equals(oldUsername)) { // if the usernames are the same
                        this.username = newUsername;
                        System.out.println("Your username has been changed.");
                    } else {
                        System.out.println("Your new username is the same as the last. \nYour username has not been changed.");
                    }
        }
    }
}
