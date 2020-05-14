package ua.khpi.lms.helper.mocks.db.entity

import ua.khpi.lms.helper.mocks.db.converter.ListToStringConverter
import javax.persistence.*

@Entity
@Table(name = "scorm_course")
data class ScormCourseEntity(
        @Id
        @Column(name = "course_id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var courseId: Long?,
        @Column(name = "title")
        var title: String,
        @Column(name = "scope")
        var scope: String,
        @Column(name = "complexity")
        var complexity: String,
        @Column(name = "keyWords")
        @Convert(converter = ListToStringConverter::class)
        var keyWords: List<String>,
        @Column(name = "creator")
        var creator: String,
        @Column(name = "content", columnDefinition = "LONGBLOB")
        var content: ByteArray,
        @Column(name = "fileName")
        var fileName: String
)