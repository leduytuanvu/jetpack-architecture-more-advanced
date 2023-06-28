package com.example.roomdatapersistencelibrarymastery.database

import android.content.Context
import androidx.lifecycle.ViewModelProvider.NewInstanceFactory.Companion.instance
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

// Room database class
@Database(entities = [Subscriber::class], version = 1)
abstract class SubscriberDatabase : RoomDatabase() {
    abstract val subscriberDAO: SubscriberDAO

    companion object {
        @Volatile
        private var INSTANCE: SubscriberDatabase = TODO()
        fun getInstance(context: Context):SubscriberDatabase {
            synchronized(this) {
                var instance: SubscriberDatabase = INSTANCE
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    SubscriberDatabase::class.java,
                    "subscriber_data_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}