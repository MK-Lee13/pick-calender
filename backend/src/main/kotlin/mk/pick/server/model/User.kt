package mk.pick.server.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "user")
data class User (
        @Id
        var id: String,
        var name: String,
        var sex: String,
        var age: String,
        var mail: String,
        var subscribeHobIdList: ArrayList<Int>,
        var endHobIdList: ArrayList<Int>
)