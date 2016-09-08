package cpe200;
import org.omg.PortableInterceptor.ACTIVE;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import javax.lang.model.element.Name;

public class Student {

    public Student(){
        this.Name= "John Doe";
        this.ID="560610000";
        this.YearOfBirth=1990;
        this.Status=false;
    }

    public Student(String Name , String ID) {
        // implement here
        this.Name=!Name.equalsIgnoreCase("")?Name:"John Doe";
        String idREGEX="^(5)+([6-9])+(061)+([0-2])+([0-9]{3})$";
        Pattern p = Pattern.compile(idREGEX);
        Matcher m = p.matcher(ID);
        this.ID=m.matches()?ID:"560610000";
    }

    public Student(String Name , String ID ,int YearOfBirth) {
        // implement here
        this.Name=!Name.equalsIgnoreCase("")?Name:"John Doe";
        String idREGEX="^(5)+([6-9])+(061)+([0-2])+([0-9]{3})$";
        Pattern p = Pattern.compile(idREGEX);
        Matcher m = p.matcher(ID);
        this.ID=m.matches()?ID:"560610000";
        this.YearOfBirth=YearOfBirth>1989?YearOfBirth:1990;
    }

    public Student(String Name , String ID ,int YearOfBirth , boolean Status) {
        // implement here
        this.Name=Name.length()>0?Name:"John Doe";
        String idREGEX="^(5)+([6-9])+(061)+([0-2])+([0-9]{3})$";
        Pattern p = Pattern.compile(idREGEX);
        Matcher m = p.matcher(ID);
        this.ID=m.matches()?ID:"560610000";
        this.YearOfBirth=YearOfBirth>1989?YearOfBirth:1990;
        this.Status=Status;
    }

    public void setName(String Name){
        this.Name=!Name.equalsIgnoreCase("")?Name:this.Name;
    }

    public void setStudent_id(String ID){
        String idREGEX="^(5)+([6-9])+(061)+([0-2])+([0-9]{3})$";
        Pattern p = Pattern.compile(idREGEX);
        Matcher m = p.matcher(ID);
        this.ID=m.matches()?ID:this.ID;
    }

    public void setYearOfBirth(int YearOfBirth){
        this.YearOfBirth=YearOfBirth>1989?YearOfBirth:this.YearOfBirth;
    }

    public String getName (){
        return Name;
    }

    public String getStudent_id(){
        return ID;
    }

    public int getYearOfBirth(){
        return YearOfBirth;
    }

    public boolean isActive(){
        return Status;
    }

    // implement all missing constructors here

    // implement all get and set methods here

    @Override
    public String toString() {
        String o = Name + " (" + ID + ") was born in " + YearOfBirth + " is an " + (Status?"ACTIVE":"INACTIVE") + " student.";
        return o;
    }

    private boolean isValidStudent_id(String id) {
        return true;
    }

    private boolean isValidYOB(int yob) {
        return true;
    }

    // declare your attributes here
    private String Name;
    private String ID;
    private int YearOfBirth;
    private boolean Status;


}
