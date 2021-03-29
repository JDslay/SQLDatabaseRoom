package com.example.sqldatabaseroom.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.example.sqldatabaseroom.entities.Director
import com.example.sqldatabaseroom.entities.School

data class SchoolAndDirector(
    @Embedded
    val school: School,

    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val director: Director

)