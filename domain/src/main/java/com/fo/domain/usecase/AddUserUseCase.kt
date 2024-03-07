package com.fo.domain.usecase

import com.fo.domain.model.UserRequest
import com.fo.domain.repository.IUserRepository
import kotlinx.coroutines.flow.Flow

class AddUserUseCase(
    private val userRepository: IUserRepository
) : IUseCase<UserRequest, Unit> {

    override suspend fun invoke(request: UserRequest): Flow<Unit> =
        userRepository.addUserToDB(request)
}