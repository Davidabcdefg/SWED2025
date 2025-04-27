public class Developer {
    //Atrributes
    private String name;
    private int age;
    private String programmingLang;
    private int yearsOfExperience;
    private boolean isActive;


    //Constructor
     public Developer(String name, int age, String programmingLang, int yearsOfExperience, boolean isActive) {
        this.name = name;
        this.age = age;
        this.programmingLang = programmingLang;
        this.yearsOfExperience = yearsOfExperience;
        this.isActive = isActive;
    }

    //Getters and Setters
    public String getName(){
        return name;
    }
    public void setName(String name){
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }       
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age < 0){
            throw new IllegalArgumentException("Age cannot be negative.");
        }
        this.age = age;
    }
    //Methods
    public void addExperience(int years){
        this.yearsOfExperience += years;
}
    public void updateStatus(boolean isActive){
        this.isActive = isActive;
}
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Programming Language: " + programmingLang);
        System.out.println("Years of Experience: " + yearsOfExperience);
        System.out.println("Active Status: " + (isActive ? "Active" : "Inactive"));
}

    //Main method
    public static void main(String[] args){
        Developer developer = new Developer("David", 24, "Java", 3, true);

        developer.displayInfo();
    }

}