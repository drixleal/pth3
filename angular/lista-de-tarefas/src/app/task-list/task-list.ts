// 1. Add Output and EventEmitter to the import from @angular/core
import { Component, Input, Output, EventEmitter } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Task } from '../task';

@Component({
  selector: 'app-task-list',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './task-list.html',
  styleUrl: './task-list.css',
})
export class TaskList {
  @Input() taskList: Task[] = [];
  // 2. Create the new event emitter for deleting a task
  @Output() deleteTask = new EventEmitter<Task>();

  toggleTaskCompletion(task: Task) {
    task.completed = !task.completed;
  }

  // 3. This function will be called when the delete button is clicked
  onDeleteTask(taskToDelete: Task) {
    // It emits the deleteTask event, sending the specific task object to be deleted
    this.deleteTask.emit(taskToDelete);
  }
}
