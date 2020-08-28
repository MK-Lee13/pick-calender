package mk.pick.server.service

import mk.pick.server.model.User
import mk.pick.server.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.stereotype.Service

@Service
class UserService: UserServiceInterface {
    @Autowired
    private lateinit var userRepository: UserRepository

    @Autowired
    private lateinit var mongoTemplate: MongoTemplate

    override fun create(user: User): User { // 유저를 등록하는 함수
        return userRepository.insert(user)
    }
}