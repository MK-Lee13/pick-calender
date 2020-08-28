package mk.pick.server.model

import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.annotation.Id

@Document(collection = "tasktype")
data class TaskType (
    @Id
    var id: Int,
    var title: String
)