package mk.pick.server.controller

import mk.pick.server.model.Task
import mk.pick.server.model.User
import mk.pick.server.service.TaskService
import mk.pick.server.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.lang.Exception

@RestController
@RequestMapping("/api/auth/*")
class AuthController {
    @Autowired
    private val userService = UserService()

    @GetMapping("all")
    fun showAllTask(): List<Task> {
        return userService.all
    }

    @PostMapping("insert")
    fun insertTask(@RequestBody user: User): String {
        try {
            userService.create(user)
        } catch(e: Exception) {
            e.printStackTrace()
            return "err"
        }
        return "ok"
    }
}