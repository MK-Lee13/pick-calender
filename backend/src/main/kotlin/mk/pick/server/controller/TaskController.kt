package mk.pick.server.controller

import mk.pick.server.model.Task
import mk.pick.server.service.TaskService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.lang.Exception

@RestController
@RequestMapping("/api/task/*")
class TaskController {
    @Autowired
    private val taskService = TaskService()

    @GetMapping("all")
    fun showAllTask(): List<Task> {
        return taskService.all
    }

    @PostMapping("insert")
    fun insertTask(@RequestBody task: Task): String {
        try {
            taskService.create(task)
        } catch(e: Exception) {
            e.printStackTrace()
            return "err"
        }
        return "ok"
    }

}