import { Component, EventEmitter, Output } from '@angular/core';
import { FormsModule } from '@angular/forms'; // <-- Import FormsModule for ngModel

@Component({
  selector: 'app-task-form',
  standalone: true,
  imports: [FormsModule], // <-- Add FormsModule here
  templateUrl: './task-form.html',
  styleUrl: './task-form.css',
})
export class TaskForm {
  // This will hold the text from the input field
  newTask: string = '';

  // This creates a custom event named 'addTask' that other components can listen to
  @Output() addTask = new EventEmitter<string>();

  // This function will be called when the form is submitted
  onAddTask() {
    // We check if the input is not empty
    if (this.newTask.trim()) {
      // We emit the custom event, sending the new task's text as the data
      this.addTask.emit(this.newTask);
      // We clear the input field after adding the task
      this.newTask = '';
    }
  }
}
