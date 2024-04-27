package CourseScheduler;

class UniversityMembers {
    // common attributes
    // for both students and faculty
     private String firstName;
    private String lastName;
    private String id;
    private String birthDate;
    private String email;
    private String phoneNumber;
    private String city;
    private String zipCode;
    private String startDate;

    // constructor
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

    // setters methods
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setBirthDate(String birthDate){
        this.birthDate = birthDate;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setZipCode(String zipCode){
        this.zipCode = zipCode;
    }
    public void setStartDate(String startDate){
        this.startDate = startDate;
    }

    // getters methods
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getId(){
        return id;
    }
    public String getBirthDate(){
        return birthDate;
    }
    public String getEmail(){
        return email;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getCity(){
        return city;
    }
    public String getZipCode(){
        return zipCode;
    }
    public String getStartDate(){
        return startDate;
    }

    // display method
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
