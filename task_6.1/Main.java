package FamilyTree;
/* В нашем мире у Person не должно быть больше 100 ед хдоровья */
public class Main {
    public  static void main(String[] args) {
        int medKit = 50;
        Person nina = new Person("Нина", 60, null, null);
        Person irina = new Person("Светлана", 62, null, null);
        Person nikolai = new Person("Николай", 60, null, null);
        Person yurii = new Person("Юрий", 65, null, null);
        Person oleg = new Person("Олег",40, irina, yurii);
        Person olga = new Person("Ольга", 35, nina, nikolai);
        Person igor = new Person("Игорь",15, olga, oleg);
        igor.getInfo();
        }
}

class Person{
    private String name;
    private int age;
    private int hp;
    private Person mother;
    private Person father;

    public Person(java.lang.String name, int age, Person mother, Person father) {
        this.name = name;
        this.age = age;
        this.hp = 100;
        this.mother = mother;
        this.father = father;
    }
    public void getInfo(){
        String Info= "Меня зовут "+this.name+"\n";

        if (this.mother != null){
            Info += "Мою маму зовут "+this.mother.name+"\n"; // Info = Info + "";
            if (this.mother.mother != null){
                Info += "Бабушка по маме "+this.mother.mother.name+'\n';
            }
            if (this.mother.father != null){
                Info += "Дедушка по маме "+this.mother.father.name+ "\n";
            }
        }
        if (this.father != null) {
            Info += "Моего папу зовут " + this.father.name + "\n";
            if (this.father.mother != null) {
                Info += "Бабушка по папе " + this.father.mother.name+ "\n";
            }
            if (this.father.father != null) {
                Info += "Дедушка по папе " + this.father.father.name;
            }
        }
        System.out.println(Info);
    }
    public Person getMother() {
        return mother;
    }
    public Person getFather() {
        return father;
    }
    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        if(this.hp + hp > 100) this.hp = 100;
        else this.hp = this.hp + hp;
    }

    public java.lang.String getName() {
        return name;
    }

        public int getAge() {
        return age;
    }
}
