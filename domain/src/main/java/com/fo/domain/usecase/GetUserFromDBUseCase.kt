package com.fo.domain.usecase

import com.fo.domain.model.UserDto
import com.fo.domain.repository.IUserRepository
import kotlinx.coroutines.flow.Flow

class GetUserFromDBUseCase(
    private val userRepository: IUserRepository
) : IUseCase<Nothing, List<UserDto>> {

    override suspend fun invoke(request: Nothing): Flow<List<UserDto>> =
        userRepository.getUserFromDB()
}