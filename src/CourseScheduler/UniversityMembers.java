package CourseScheduler;

/**
 * This class represents a member of the university, either a student or a faculty member.
 * It contains common attributes and methods for both students and faculty.
 */
class UniversityMembers {
    // Common attributes for both students and faculty
    private String firstName;
    private String lastName;
    private String id;
    private String birthDate;
    private String email;
    private String phoneNumber;
    private String city;
    private String zipCode;
    private String startDate;

    /**
     * This is the constructor for the UniversityMembers class.
     * It initializes the attributes with the getter methods.
     */
    public UniversityMembers(){
        this.firstName = getFirstName();
        this.lastName = getLastName();
        this.id = getId();
        this.birthDate = getBirthDate();
        this.email = getEmail();
        this.phoneNumber = getPhoneNumber();
        this.city = getCity();
        this.zipCode = getZipCode();
        this.startDate = getStartDate();
    }

    // Setter methods

    /**
     * This method sets the first name of the university member.
     * @param firstName The first name to set.
     */
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    /**
     * This method sets the last name of the university member.
     * @param lastName The last name to set.
     */
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    /**
     * This method sets the ID of the university member.
     * @param id The ID to set.
     */
    public void setId(String id){
        this.id = id;
    }

    /**
     * This method sets the birth date of the university member.
     * @param birthDate The birth date to set.
     */
    public void setBirthDate(String birthDate){
        this.birthDate = birthDate;
    }

    /**
     * This method sets the email of the university member.
     * @param email The email to set.
     */
    public void setEmail(String email){
        this.email = email;
    }

    /**
     * This method sets the phone number of the university member.
     * @param phoneNumber The phone number to set.
     */
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    /**
     * This method sets the city of the university member.
     * @param city The city to set.
     */
    public void setCity(String city){
        this.city = city;
    }

    /**
     * This method sets the zip code of the university member.
     * @param zipCode The zip code to set.
     */
    public void setZipCode(String zipCode){
        this.zipCode = zipCode;
    }

    /**
     * This method sets the start date of the university member.
     * @param startDate The start date to set.
     */
    public void setStartDate(String startDate){
        this.startDate = startDate;
    }

    // Getter methods

    /**
     * This method returns the first name of the university member.
     * @return The first name of the university member.
     */
    public String getFirstName(){
        return firstName;
    }

    /**
     * This method returns the last name of the university member.
     * @return The last name of the university member.
     */
    public String getLastName(){
        return lastName;
    }

    /**
     * This method returns the ID of the university member.
     * @return The ID of the university member.
     */
    public String getId(){
        return id;
    }

    /**
     * This method returns the birth date of the university member.
     * @return The birth date of the university member.
     */
    public String getBirthDate(){
        return birthDate;
    }

    /**
     * This method returns the email of the university member.
     * @return The email of the university member.
     */
    public String getEmail(){
        return email;
    }

    /**
     * This method returns the phone number of the university member.
     * @return The phone number of the university member.
     */
    public String getPhoneNumber(){
        return phoneNumber;
    }

    /**
     * This method returns the city of the university member.
     * @return The city of the university member.
     */
    public String getCity(){
        return city;
    }

    /**
     * This method returns the zip code of the university member.
     * @return The zip code of the university member.
     */
    public String getZipCode(){
        return zipCode;
    }

    /**
     * This method returns the start date of the university member.
     * @return The start date of the university member.
     */
    public String getStartDate(){
        return startDate;
    }

    /**
     * This method displays the information of the university member.
     */
    public void display(){
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("ID: " + getId());
        System.out.println("Birth Date: " + getBirthDate());
        System.out.println("Email: " + getEmail());
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("City: " + getCity());
        System.out.println("Zip Code: " + getZipCode());
        System.out.println("Start Date: " + getStartDate());
    }
}