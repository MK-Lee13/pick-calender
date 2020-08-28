package mk.pick.server.repository

import mk.pick.server.model.User
import org.springframework.data.mongodb.repository.MongoRepository

interface UserRepository : MongoRepository<User, String> {

}