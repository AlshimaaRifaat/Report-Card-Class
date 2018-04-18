package com.example.shosho.report_card;

/**
 * Created by shosho on 11/22/2017.
 */

public class ReportCard {
    private int name;
    private int age;
    private int first_term_grade;
    private int second_term_grade;
    final int total_grade = 200;
    private String final_grade;

    public ReportCard(int first_term_grade,int age, int second_term_grade, String final_grade) {
        this.first_term_grade = first_term_grade;
        this.second_term_grade = second_term_grade;
        this.final_grade = final_grade;
        this.age=age;
    }
    public void setName(int age) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirst_term_grade(int first_term_grade) {
        this.first_term_grade = first_term_grade;
    }

    public void setSecond_term_grade(int second_term_grade) {
        this.second_term_grade = second_term_grade;
    }
    public void setFinal_grade(String final_grade) {
        final_grade=calc_grade(first_term_grade,second_term_grade);
    }



    public int getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public int getFirst_term_grade() {
        return first_term_grade;
    }

    public int getSecond_term_grade() {
        return second_term_grade;
    }

    public String getFinal_grade() {
        final_grade=calc_grade(first_term_grade,second_term_grade);
        return final_grade;
    }
    public int getTotal_grade() {
        return total_grade;
    }




    public String calc_grade(int first_term_grade,int second_term_grade) {
        if ((first_term_grade + second_term_grade) >= 100 && (first_term_grade + second_term_grade) <= total_grade)
            final_grade = "passed";
        else if ((first_term_grade + second_term_grade) < 100 && (first_term_grade + second_term_grade) >= 0)
            final_grade = "failed";
        return final_grade;
    }

    @Override
    public String toString() {
        return "first term grade:" + first_term_grade
                + " , second_term_grade" + second_term_grade + " ,then your final grade is" + final_grade ;
    }
}

