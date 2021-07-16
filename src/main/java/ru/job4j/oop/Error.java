package ru.job4j.oop;

public class Error {
    boolean active;
    int status;
    String massage;

     public Error(){

     }
     public Error(boolean active, int status, String massage) {
         this.active = active;
         this.status = status;
         this.massage = massage;
     }

     public void showInfoError(){
         System.out.println("Есть ошибка: " + active);
         System.out.println("Статус: " + status);
         System.out.println(massage);
     }

    public static void main(String[] args) {
        Error error = new Error();
        Error fatalError = new Error(true, 13, "You are died");
        Error canFix = new Error(true, 7, "Try again");
        Error deepError = new Error(true, 666, "You are loоser");
        error.showInfoError();
        fatalError.showInfoError();
        canFix.showInfoError();
        deepError.showInfoError();
    }
}
