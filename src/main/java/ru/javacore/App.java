package ru.javacore;
public class App
{
    public static void main( String[] args )
    {
        Tester t1 = new Tester();
        Tester t2 = new Tester("Дикалова", "Вероника", 2,1000);
        Tester t3 = new Tester("Пупкин", "Пупкинович",6,1,567.28);
        t1.work("Алина");
        t2.work();
        t3.work(59);
        t1.earn("Алина",1000.38);
    }
}
