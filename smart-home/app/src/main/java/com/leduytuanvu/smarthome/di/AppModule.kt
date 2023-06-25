package com.leduytuanvu.smarthome.di

import com.leduytuanvu.smarthome.data.repository.*
import dagger.Module
import dagger.Provides

@Module
class AppModule {
    @Provides
    fun provideAutomationRepository(): AutomationRepository {
        return AutomationRepository()
    }

    @Provides
    fun provideCameraRepository(): CameraRepository {
        return CameraRepository()
    }

    @Provides
    fun provideDeviceRepository(): DeviceRepository {
        return DeviceRepository()
    }

    @Provides
    fun provideEnergyUsageRepository(): EnergyUsageRepository {
        return EnergyUsageRepository()
    }

    @Provides
    fun provideNotificationRepository(): NotificationRepository {
        return NotificationRepository()
    }

    @Provides
    fun provideRoomRepository(): RoomRepository {
        return RoomRepository()
    }

    @Provides
    fun provideScheduleRepository(): ScheduleRepository {
        return ScheduleRepository()
    }

    @Provides
    fun provideSecurityEventRepository(): SecurityEventRepository {
        return SecurityEventRepository()
    }

    @Provides
    fun provideUserRepository(): UserRepository {
        return UserRepository()
    }
}
