package mk.pick.server.repository

import mk.pick.server.model.Task
import org.springframework.data.mongodb.repository.MongoRepository

interface TaskRepository : MongoRepository<Task, String>{
}