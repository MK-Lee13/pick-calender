package mk.pick.server.repository

import mk.pick.server.model.TaskType
import org.springframework.data.mongodb.repository.MongoRepository

interface TaskTypeRepository : MongoRepository<TaskType, String> {
}