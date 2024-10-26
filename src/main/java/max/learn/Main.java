package max.learn;

public class Main {
    public static void main(String[] args) {
        CustomArrayList<Integer> myList = new CustomArrayList<>();
        myList.add(0, 5);
        myList.add(1, 3);
        myList.add(2, 8);
        myList.add(3, 7); // Вставка по индексу
        myList.add(4, 1); // Вставка по индексу
        myList.sort(Integer::compareTo); // Сортировка
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
        System.out.println(myList.get(3));
    }
}