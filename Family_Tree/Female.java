package OOP_Java_Homework.Family_Tree;

public class Female extends Person {
        private String last_name_fem;
    
        public Female(String last_name, String last_name_fem, String first_name, String gender, double birth_year){
            super(last_name, first_name, gender, birth_year);
            this.last_name_fem = last_name_fem;
        }
    
        public String getlast_name_fem(){
            return last_name_fem;
        }
        public void setlast_name_fem(String last_name_fem){
            this.last_name_fem = last_name_fem;
        }
        
        @Override
        public String toString(){
            return super.toString()+", \nдевичья фамилия - "+last_name_fem;
        }
    
    
    }