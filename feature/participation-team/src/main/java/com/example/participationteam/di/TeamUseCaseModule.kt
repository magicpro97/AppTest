package com.example.participationteam.di

import com.example.participationteam.domain.usecases.GetTeamsUseCase
import com.example.participationteam.domain.usecases.GetTeamsUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class TeamUseCaseModule {
    @Binds
    @Singleton
    internal abstract fun bindGetTeamUseCase(useCase: GetTeamsUseCaseImpl): GetTeamsUseCase
}