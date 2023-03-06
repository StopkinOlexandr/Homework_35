public class Homework_35 {
  public static void main(String[] args) {
    Student ivanov = new Student();
    ivanov.name = "Вася Иванов";
    ivanov.number = 1;

    Student petrov = new Student();
    petrov.name = "Иван Петров";
    petrov.number = 2;

    Student sidorov = new Student();
    sidorov.name = "Петр Сидоров";
    sidorov.number = 3;

    Student vasiljev = new Student("Сидор Васильев", 4);

    Student romashkin = new Student("Рома Ромашкин", 5);
  }
}
