package coreJava;

class Student {

    private static int  nextRollNumber = 1; 
    private int id;
    private String name;
    private String adrress;
    private String gender;

    public Student(String name, String adrress, String gender) {
        this.name = name;
        this.adrress = adrress;
        this.gender= gender;
        this.id = nextRollNumber ; 
        nextRollNumber = nextRollNumber + 1  ; 
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        String salutation = "";
        if (getGender().equals("Male")) {
            salutation = "Mr.";
        } else if (getGender().equals("Female")) {
            salutation = "Ms.";
        }

        return salutation + " " + name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdrress() {
        return adrress;
    }

    public void setAdrress(String adrress) {
        this.adrress = adrress;
    }

}
