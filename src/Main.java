public class Main {
    public static void main(String[] args) {
    var totalHours = 640;
    var workday = 8;
    var totalEmployers = totalHours / workday;
    System.out.println("Всего работников в компании – " + totalEmployers + " человек");
    totalEmployers = totalEmployers + 94;
    var totalHours2 = totalEmployers * workday;
        System.out.println("Если в компании работает " + totalEmployers + " человек, то всего " + totalHours2 + " часа работы может быть поделено между сотрудниками.");

    }
}