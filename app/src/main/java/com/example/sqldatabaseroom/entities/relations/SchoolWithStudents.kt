package com.example.sqldatabaseroom.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.example.sqldatabaseroom.entities.School
import com.example.sqldatabaseroom.entities.Student

data class SchoolWithStudents (
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val students: List<Student>
        )