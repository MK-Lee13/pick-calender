package mk.pick.server.service

import mk.pick.server.model.TaskType
import mk.pick.server.repository.TaskTypeRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service

@Service
class TaskTypeService: TaskTypeServiceInterface {
    @Autowired
    private lateinit var taskTypeRepository: TaskTypeRepository

    @Autowired
    private lateinit var mongoTemplate: MongoTemplate

    override fun create(taskType: TaskType): TaskType {
        return taskTypeRepository.insert(taskType)
    }
}