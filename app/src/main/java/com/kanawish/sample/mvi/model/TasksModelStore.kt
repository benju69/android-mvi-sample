package com.kanawish.sample.mvi.model

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TasksModelStore @Inject constructor() :
    ModelStore<TasksState>(
            TasksState(
                    listOf(
                            Task(title = "One"),
                            Task(title = "Two"),
                            Task(title = "Three")
                    ),
                            // emptyList(),
                    FilterType.ANY,
                    SyncState.IDLE
            )
    )