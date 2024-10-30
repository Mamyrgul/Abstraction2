package abstraction;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
/*
        EducationCenter деген абстракт класс тузунуз. Полелери: name, locatedCountry, LocalDate foundationYear;
        Абстракт класска School , University, College деген саб класстарды тузунуз.
        Study деген интерфейс тузуп, ичине void getStudentsEducationCenter(), void getStudentsStudyingYear()  деген 2 метод тузунуз.
        Student деген класс тузунуз. Полелери: name, surname, Gender gender,  LocalDate dateOfStart()(студент кайсыл жылы окуп баштаганы),
        EducationCenter educationCenter;
        Main класста студенттердин массивин тузуп ичине 10 студент салыныз. Студенттер ар кандай окуу жайда окусун.
        Main класста 1 метод тузунуз.
        1 - метод бардык студенттер жонундо маалыматты, кайсыл студент кайсы окуу жайда окуганы тууралу маалыматты жана окуганыны канча
        жыл болгону тууралу маалыматты чыгарып берсин.
*/
        College college1 = new College("KGTU","Kyrgyzstan", LocalDate.of(1990,10,12));
        College college2= new College("Politeh","Kazahstan",LocalDate.of(2020,2,14));
        College college3= new College("KNU","Kyrgyzstan",LocalDate.of(1990,9,12));

        School school1= new School("Kurmanzhan","Kazahstan",LocalDate.of(2013,6,23));
        School school2= new School("Turganbaev","Uzbekstan",LocalDate.of(1998,3,30));
        School school3= new School("Otunchiev","Kyrgyzstan",LocalDate.of(2020,11,3));

        University university1 = new University("Garvard","America",LocalDate.of(1980,12,12));
        University university2 = new University("Step Korea","Korea",LocalDate.of(1967,4,23));
        University university3 = new University("Arabaev","Kyrgyzstan",LocalDate.of(2008,1,7));
        University university4 = new University("KMU","Kyrgyzstan",LocalDate.of(2012,2,3));

        Student [] students = {new Student("Maral","Zhursunbekova","Female",LocalDate.of(2021,9,12),college1),
                new Student("Bektur","Muratbekov","Male",LocalDate.of(2022,9,1),college2),
                new Student("Saikal","Zhursunbekova","Female",LocalDate.of(2023,9,2),college3),
                new Student("Eldiar","Kozubaev","Male",LocalDate.of(2013,9,3),school1),
                new Student("Maya","Zhursunbekova","Female",LocalDate.of(2017,9,4),school2),
                new Student("Nurik","Karmyshakov","Male",LocalDate.of(2018,9,5),school3),
                new Student("Nuriz","Rahmanova","Female",LocalDate.of(2001,9,7),university1),
                new Student("Bakai","Samaev","Male",LocalDate.of(2014,9,8),university2),
                new Student("Aika","Nurlanova","Female",LocalDate.of(2020,9,9),university3),
                new Student("Islam","Aitanov","Male",LocalDate.of(2021,9,10),university4)};


        Main main = new Main();
        main.information(students);

    } public void information(Student [] students){
        for (Student student:students){
            System.out.println("Name: " + student.getName() + ", Surname: " + student.getSirName());
            student.getStudentsEducationCenter();
            student.getStudentsStudyingYear();
 }
}
}