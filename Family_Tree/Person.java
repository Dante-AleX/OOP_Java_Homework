package OOP_Java_Homework.Family_Tree;

public class Person {
    private String last_name;
    private String first_name;
    private String gender;
    private double birth_year;

    public Person(String last_name, String first_name, String gender, double birth_year){
        this.last_name = last_name;
        this.first_name = first_name;
        this.gender = gender;
        this.birth_year = birth_year;
    }

    public String getlast_name(){
        return last_name;
    }
    public void setlast_name(String last_name){
        this.last_name = last_name;
    }

    public String getfirst_name(){
        return first_name;
    }
    public void setfirst_name(String first_name){
        this.first_name = first_name;
    }

    public String getgender(){
        return gender;
    }
    public void setgender(String gender){
        this.gender = gender;
    }

    public double getbirth_year(){
        return birth_year;
    }
    public void setbirth_year(double birth_year){
        this.birth_year = birth_year;
    }

    @Override
    public String toString(){
        return "\nчеловек-{"+"Фамилия - "+last_name+", Имя - "+first_name+", Пол - "+gender+", Год рождения - "+birth_year+"}";
    }

}