package org.ieslosremedios.daw1.prog.ut5.actividad52;

public class Actividad52 {
    public static void main(String[] args) {

        String type = "arraylist"; // Esto es como si el usuario seleccionase arraylist
        TaskList taskList = new TaskList();

        taskList.addTask("Hacer la colada");
        taskList.addTask("Estudiar programación");
        taskList.addTask("Reservar partido de pádel");

        taskList.removeTask("Hacer la colada");

        taskList.completeTask("Reservar partido de pádel");

        System.out.println("===== Tareas pendientes =====");
        String[] tasks = taskList.getTasks();
        for (int i = 0; i < tasks.length; i++) {
            System.out.printf("%d. %s\n", i + 1, tasks[i]);
        }
    }
}
