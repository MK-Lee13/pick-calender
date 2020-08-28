package mk.pick.server.service

import mk.pick.server.model.Task
import mk.pick.server.model.User
import mk.pick.server.repository.TaskRepository
import mk.pick.server.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.stereotype.Service

@Service
class TaskService: TaskServiceInterface {
    @Autowired
    private lateinit var taskRepository: TaskRepository

    @Autowired
    private lateinit var mongoTemplate: MongoTemplate

    override fun create(task: Task): Task { // 유저를 등록하는 함수
        return taskRepository.insert(task)
    }

    val all: List<Task> // 유저의 모든 정보를 제공하는 함수
        get() = taskRepository.findAll()
}