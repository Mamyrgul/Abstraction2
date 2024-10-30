package abstraction;

import java.time.LocalDate;
import java.time.Period;

public class Student implements Study {
   private String name;
   private String sirName;
   private String gender;
   private LocalDate dateOfStart;
   private EducationCenter educationCenter;

    public Student(String name, String sirName, String gender, LocalDate dateOfStart, EducationCenter educationCenter) {
        this.name = name;
        this.sirName = sirName;
        this.gender = gender;
        this.dateOfStart = dateOfStart;
        this.educationCenter = educationCenter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSirName() {
        return sirName;
    }

    public void setSirName(String sirName) {
        this.sirName = sirName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(LocalDate dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public EducationCenter getEducationCenter() {
        return educationCenter;
    }

    public void setEducationCenter(EducationCenter educationCenter) {
        this.educationCenter = educationCenter;
    }

    @Override
    public void getStudentsEducationCenter() {
        System.out.println(name+" "+ sirName+ "\n"+" University: "+educationCenter.getName());
    }

    @Override
    public void getStudentsStudyingYear() {
        int years = Period.between(dateOfStart,LocalDate.now()).getYears();
        System.out.println("Has been studying for "+years+ " years"+"\n");
    }

    @Override
    public String toString() {
        return
                "\nName: " + name +
                "\nSirName: " + sirName +
                "\nGender: " + gender +
                "\nDate of start: " + dateOfStart +
                "\nEducation center: " + educationCenter;
    }
}
