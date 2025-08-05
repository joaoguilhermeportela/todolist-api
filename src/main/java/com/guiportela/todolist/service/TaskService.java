package com.guiportela.todolist.service;

import com.guiportela.todolist.model.task.Task;
import com.guiportela.todolist.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    // Listar todas as tasks
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    // Criar nova task
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    // Buscar task por ID
    public Optional<Task> getTaskById(Long id) {
        return taskRepository.findById(id);
    }

    // Atualizar task existente
    public Task updateTask(Task task) {
        return taskRepository.save(task);
    }

    // Deletar task por ID
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}