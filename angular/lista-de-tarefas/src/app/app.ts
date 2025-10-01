import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { TaskForm } from './task-form/task-form';
import { TaskList } from './task-list/task-list';
import { Task } from './task'; // <-- 1. Import our new Task interface

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, TaskForm, TaskList],
  templateUrl: './app.html',
  styleUrl: './app.css',
})
export class AppComponent {
  // 2. The list is now an array of Task objects
  tasks: Task[] = [
    { text: 'My first example task', completed: false },
    { text: 'My second (completed) task', completed: true },
  ];

  // 3. This function now creates a Task object
  handleAddTask(newTaskText: string) {
    const newTask: Task = {
      text: newTaskText,
      completed: false, // New tasks always start as not completed
    };
    this.tasks.unshift(newTask);
  }
  // 4. This function handles the deleteTask event emitted by TaskList
  // ADD THE FUNCTION BELOW
  handleDeleteTask(taskToDelete: Task) {
    // The filter() method creates a new array with all elements
    // that pass the test implemented by the provided function.
    this.tasks = this.tasks.filter((task) => task !== taskToDelete);
  }
}
