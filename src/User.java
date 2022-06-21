/**
 * @author Chris Park, Henry Liu
 * Jun 7, 2022
 * 
 * A user class, contains user's private information and subscription details
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
    
    /** subscribed or not */
    private boolean isSubscribed;
   
    /** bank account balance */
    private double bankBalance;

    /* constructor */

    /**
     * Name: User
     * Description: User attributes
     * @param username
     * @param password
     * @param email
     * @param region
     * @param birthday
     * @param isSubscribed
     * @param bankBalance
     */
    public User(String username, String password, String email, String region, String birthday, boolean isSubscribed, double bankBalance) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.region = region;
        this.birthday = birthday;
        this.isSubscribed = isSubscribed;
        this.bankBalance = bankBalance;
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
   
   /**
     * Name: getIsSubscribed
     * Description: return the user's subscription status
     * @return subscribed
     */
   public String getIsSubscribed() {return this.isSubscribed;}
   
   /**
     * Name: getBankBalance
     * Description: return the user's bank balance
     * @return the bank balance
     */
   public String getBankBalance() {return this.bankBalance;}

    /* mutators */

    /**
     * Description: Sets new username
     * @param newUsername
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
     * Description: Sets new region
     * @param newRegion
     */
    public void setRegion(String newRegion){
        if (newRegion.length() > 0) {
            this.region = newRegion;
        }
    }
    
    /**
     * subscribe method
     * let's the user subscribe if they have enough money
     * if they are already subscribed it changes nothing
     *
     */
     public void subscribe() {
        if (isSubscribed == true) {
           isSubscribed = true;
           System.out.println("You are already subscribed");
        } else if (bankBalance < 9.99) {
           isSubscribed = false;
           System.out.println("You do not have enough money to subscribe");
        } else {
           bankBalance -= 9.99;
           isSubscribed = true;
           System.out.println("You have successfuly subscribed");
        }
     }
     
    /**
     * unsubscribe method
     * let's the user unsubscribe
     * If user is subscribed they are now unsubscribed, without a refund of course
     * if user is unsubscribed it changes nothing 
     *
     */
     public void unsubscribe() {
        isSubscribed = false;
        System.out.println("You have unsubscribed");
     }
     

    /** other methods */

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

    /**
     * change username
     * @param oldUsername
     * @param newUsername
     */
    public void changeUsername(String oldUsername, String newUsername) {
        if (newUsername.equals(oldUsername)) { // if the usernames are the same
            System.out.println("Your new username is the same as the last. \nYour username has not been changed.");
        } else {
            this.username = newUsername;
            System.out.println("Your username has been changed.");
        }
    }
    
    /**
     * Main class
     * Description: tests the user class
     */
    public static void main(String[] args) {
        
    }
    
}
