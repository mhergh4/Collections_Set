package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;

public class EmailList {
  TreeSet<String> emails = new TreeSet<>();
  String regex = "[a-z]+" + "@" + "[a-z]+" + "[.]" + "[a-z]+";
  ArrayList<String> arrayList = new ArrayList<>();
    public void add(String email) {
        // TODO: валидный формат email добавляется, email это строка, она быть может любой
        // принять решение добавлять аргумент email или нет должен этот метод
      email = email.toLowerCase(Locale.ROOT);
      if(email.matches(regex)) {
        emails.add(email);
      } else {
        System.out.println("Неверный формат email");
      }
    }

    public List<String> getSortedEmails() {
        // TODO: возвращается сортированный список электронных адресов в алфавитном порядке
        return new ArrayList<>(emails);
    }
    public  void printList(List list) {
      for(Object m : list) {
        System.out.println(m + "\n");
      }
    }

}
