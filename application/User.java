package application;

public class User
{
    protected String firstName;
    protected String lastName;
    protected String password;
    protected String email;
    protected String userID;
     
    public User(){
    }
     
    /**
     * Sets attributes for ECTracker User.
     *
     * @params firstName, lastName, password, email 
     * and userID are all Strings.
     * @throws Illegal Arguement Exception if any attribute equals null.
     */
    public void setAttributes(String firstName, String lastName, String password, String email, String userID) {
        if (firstName == null || lastName == null || password == null || email == null || userID == null){ 
             throw new IllegalArgumentException("No attribute can't be null");
            }
            
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.userID = userID;
    }
    
    /**
     * Returns Users first name.
     *
     * @returns firstName
     */
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * Returns Users last name.
     *
     */
    public String getLastName(){
        return lastName;
    }
    
    /**
     * Returns Users password.
     *
     * @returns password
     */
    public String getPassword(){
        return password;
    }
    
    /**
     * Returns Users email.
     *
     * @returns email
     */
    public String getEmail(){
        return email;
    }
    
    /**
     * Returns Users ID.
     *
     * @returns userID
     */
    public String getUserID(){
        return userID;
    }
    
    /**
     * Resets User password.
     *
     * @param newPassword is a String.
     * @throws Illegal Arguement Exception if attribute is null.
     */
    public void setPassword(String newPassword) {
        if (newPassword == null){ 
             throw new IllegalArgumentException("New password can't be null");
            }
        password = newPassword;
    }
    
   /**
     * Updates User email.
     *
     * @param newEmail is a String.
     * @throws Illegal Arguement Exception if attribute is null.
     */
    public void updateEmail(String newEmail){
        if (newEmail == null){ 
             throw new IllegalArgumentException("Updated email can't be null");
            }
        email = newEmail;
    }
    
    /**
     * Resets User password.
     *
     * @param newID is a String.
     * @throws Illegal Arguement Exception if attribute is null.
     */
    public void updateID(String newID){
        if (newID == null){ 
             throw new IllegalArgumentException("New user ID can't be null");
            }
        userID = newID;
    }
}

