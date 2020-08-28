package mk.pick.server.service

import mk.pick.server.model.Task

interface TaskServiceInterface {
    fun create(task: Task): Task
}