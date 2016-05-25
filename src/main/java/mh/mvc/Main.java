package mh.mvc;

// MVC
// Model - heart of the application, business classes, logic
// View - observer of changes in the model, only presentation of data (+only logic connected with display)
// Controller - react on user activity and changes model (as little as possible logic, runs model methods).

// TODO SPRING !!!

public class Main {

    public static void main(String[] args) {
        StudentModel model  = retriveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setStudentName("John");

        controller.updateView();
    }

    private static StudentModel retriveStudentFromDatabase(){
        StudentModel student = new StudentModel();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }

}
