package mk.pick.server.service

import mk.pick.server.model.TaskType

interface TaskTypeServiceInterface {
    fun create(taskType: TaskType): TaskType
}