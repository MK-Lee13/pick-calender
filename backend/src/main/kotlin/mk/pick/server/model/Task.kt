package mk.pick.server.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "task")
data class Task (
        @Id
        var id: Int,
        var title: String,
        var desc: String,
        var markComplete: Boolean,
        var timestamp: Int,
        var taskType: Int
)
