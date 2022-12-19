package OOP_Java_Homework.Family_Tree;

public class main{
  public static void main(String[] args) {
      Tree tree = new Tree();
      
      Person Person1 = new Person("Кожокарь", "Семён", "мужской", 1959);
      Person Person2 = new Person("Кожокарь", "Зиновья", "женский", 1954);
      Person Person3 = new Person("Кожокарь", "Александр", "мужской", 1979);
      Person Person4 = new Person("Унгуряну", "Георгий", "мужской", 1956);
      Person Person5 = new Person("Унгуряну", "Надежда", "женский", 1958);
      Person Person6 = new Female("Кожокарь", "Унгуряну", "Галина", "женский", 1979);
      Person Person7 = new Person("Кожокарь", "Александр", "мужской", 2002);
      Person Person8 = new Person("Кожокарь", "Владислав", "мужской", 2005);
      Person Person9 = new Person("Карауш", "Евгений", "мужской", 1979);
      Person Person10 = new Female("Карауш", "Унгуряну", "Мария", "женский", 1980);
      Person Person11 = new Person("Карауш", "Екатерина", "женский", 2006);
      Person Person12 = new Person("Зоп", "Григорий", "мужской", 1980);
      Person Person13 = new Female("Зоп", "Унгуряну", "Ирина", "женский", 1981);
      Person Person14 = new Person("Зоп", "Давид", "мужской", 2011);

      tree.addPersonList(Person1);
      tree.addPersonList(Person2);
      tree.addPersonList(Person3);
      tree.addPersonList(Person4);
      tree.addPersonList(Person5);
      tree.addPersonList(Person6);
      tree.addPersonList(Person7);
      tree.addPersonList(Person8);
      tree.addPersonList(Person9);
      tree.addPersonList(Person10);
      tree.addPersonList(Person11);
      tree.addPersonList(Person12);
      tree.addPersonList(Person13);
      tree.addPersonList(Person14);

      System.out.println(tree.getPersonList());
      System.out.println("\n");
  }
}