package com.artf.chatapp.di

import dagger.Module

@Module(includes = [(ViewModelModule::class)])
object AppModule {

    // @Provides
    // @Singleton
    // fun provideFirebaseRepositoryModule() : FirebaseRepository {
    //     return FirebaseRepository()
    // }
}

// @Module
// abstract class ApplicationModuleBinds {
//
//     @Singleton
//     @Binds
//     abstract fun bindRepository(repo: FirebaseRepository): FirebaseRepository
// }