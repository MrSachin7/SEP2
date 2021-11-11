package shared.utils.User;

import java.io.Serializable;

/**
 * A child class that is extends of the User
 * @author Adrian
 * @version 1
 */
public class Cleaner extends User implements Serializable {
    private String userType;

    /**
     * A 2 argument constructor
     * @param userName
     * @param password
     */
    public Cleaner(String userName, String password){
        super(userName, password);
        this.userType="Cleaner";
    }

    /**
     * A 4 argument constructor, when the user will be created in the app and after pushed to the database
     * @param firstname
     * @param lastname
     * @param userName
     * @param password
     */
    public Cleaner (String firstname,String lastname,String userName,String password){
        super(firstname, lastname, userName, password);
        this.userType="Cleaner";
    }

    /**
     * A 5 argument constructor, used only when is needed to show a list of users and the admin needs to see the specific userID from the database.
     * @param userID
     * @param firstname
     * @param lastname
     * @param userName
     * @param password
     */
    public Cleaner (int userID, String firstname,String lastname,String userName,String password){
        super(userID, firstname, lastname, userName, password);
        this.userType="Cleaner";
    }

    /**
     * A method that will return the employee type
     * @return "Cleaner"
     */
    @Override
    public String getEmployeeType() {
        return userType;
    }
}
