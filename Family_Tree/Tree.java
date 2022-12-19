package OOP_Java_Homework.Family_Tree;

import java.util.ArrayList;
import java.util.List;

public class Tree{
    private List<Person> PersonList;

    public Tree(List<Person> PersonList){
        this.PersonList = PersonList;
    }

    public Tree(){
        this(new ArrayList<>());
    }

    public List<Person> getPersonList(){
        return PersonList;
    }

    public void setPersonList(List<Person> PersonList){
        this.PersonList = PersonList;
    }

    public void addPersonList(Person Person){
        PersonList.add(Person);
    }

    public List<Person> getPersonFiltr(String last_name){
        List<Person> res = new ArrayList<>();
        for(Person Person: PersonList){
            if(Person.getlast_name().equalsIgnoreCase(last_name)){
                res.add(Person);
            }
            if(Person.getgender().equalsIgnoreCase("жен")){
                if(Person.getlast_name().length()>=last_name.length()){
                    String f = Person.getlast_name().substring(0, last_name.length());
                    if(f.equalsIgnoreCase(last_name)){
                        res.add(Person);
                    }
    
                }
            }
        }

        return res;
    }

}