package com.example.sqldatabaseroom.entities.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.example.sqldatabaseroom.entities.Student
import com.example.sqldatabaseroom.entities.Subject

data class SubjectWithStudents(
    @Embedded val student: Subject,
    @Relation(
        parentColumn = "subjectName",
        entityColumn = "studentName",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )
    val subjects: List<Student>
)