package com.company.observers;

import com.company.Teacher;

public class Student implements IObserver{
    private Teacher teacher;

    public Student(Teacher teacher) {
        this.teacher = teacher;
        teacher.AddObserver(this);
    }

    @Override
    public void update(Object o) {
        String inputMessage = (String)o;
        String outputMessage;
        switch (inputMessage.toLowerCase()){
            case "доброго дня!":
                outputMessage = "Доброго дня, ми раді Вас бачити!";
            break;
            case "що з приводу контрольної?":
                outputMessage = "Давайте якось іншим разом";
                break;
            case "до зустрічі":
                outputMessage = "До побачення. Дякуємо за заняття";
                break;
            default:
                outputMessage = "Error!";
                break;
        }
        System.out.println(outputMessage);
    }
}
