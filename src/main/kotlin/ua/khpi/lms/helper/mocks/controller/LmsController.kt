package ua.khpi.lms.helper.mocks.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import ua.khpi.lms.helper.mocks.model.ScormCourse
import ua.khpi.lms.helper.mocks.service.ScormCourseService


@RestController("/api")
class LmsController(private val scormCourseService: ScormCourseService) {
    @PostMapping("v1/course")
    fun createCourse(@RequestBody scormCourse: ScormCourse): ResponseEntity<Any> {
        return ResponseEntity.ok(scormCourseService.add(scormCourse))
    }
/*
    @PutMapping("v1/course")
    fun updateCourse(): ResponseEntity<Any> {
        return ResponseEntity.ok().build()
    }*/

    @GetMapping("v1/course/{courseId}")
    fun getCourse(@PathVariable courseId: String): ResponseEntity<Any> {
        return ResponseEntity.ok(scormCourseService.findById(courseId.toLong()))
    }

    @DeleteMapping("v1/course/{courseId}")
    fun deleteCourse(@PathVariable courseId: String): ResponseEntity<Any> {
        return ResponseEntity.ok().build()
    }

    @GetMapping("v1/courses")
    fun getCourses(): ResponseEntity<Set<ScormCourse>> {
        return ResponseEntity.ok(scormCourseService.getAll())
    }
}