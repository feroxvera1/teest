package ru.javacore;

public class Tester {

    int years;
    int english;
    double pay;
    String name;
    String surname;

    public Tester(){
        name = "Алина";
        surname = "Кнотько";
        expirianceInYears = 2;
        englishlvl = 2;
        salary = 300;
    }

    public Tester(String name){
        this.name = name;
    }

    public Tester(String name, String surname, int yearsears, double pay){
        this(name);
        this.surname = surname;
        this.expirianceInYears = yearsears;
        this.salary = pay;
    }


    public Tester(String name, String surname, int years, int english, double pay){
        this(name, surname, years, pay);
        this.englishlvl = english;
    }

    public void work(String name){
        System.out.println("Имя рабочего: " + name);
    }

    public void work(){
        System.out.println(name + " " + surname + " с опытом работы: " + expirianceInYears + " получает: " + salary);
    }

    public void work(double yearpay){
        yearpay = salary * 12;
        System.out.println(name + " " + surname + " с опытом " + expirianceInYears + " и уровнем английского " + englishlvl
                + " получает в месяц = " + salary + " и в год выходит = " + yearpay);
    }
    public static void earn(String name, double salary){
        System.out.println(name + " зарабатывает деньги в размере: " + salary + " руб. в месяц");
    }
}
