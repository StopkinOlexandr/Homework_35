// Задача 1
// Создать класс Student c полями (переменными) имя и номер.
// Создать несколько обьектов этого класса
// Задача 2
// Добавить в класс Student конструктор с параметрами имя и номер.
// Создать еще несколько обьектов класса с использованием этого конструктора
public class Student {
  String name;
  int number;
  public Student(){
  }

  public Student(String name, int number) {
    this.name = name;
    this.number = number;
  }
}
