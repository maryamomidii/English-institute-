package EnglishInstitute;

public class Student {
    private static Course[] courses;
    private Course[] registeredCourses;
    private static int courseCount;

    public Student() {
        this.registeredCourses = new Course[50];
        courseCount = 0;
    }

    public void registerInCourse(Course course) {
        if (checkTheTime(course)){
            registeredCourses[courseCount++] = course;
        }
    }

    //checks if the time is ok or not
    public boolean checkTheTime(Course selectedCourse) {

        for (int i = 0; i < courseCount; i++) {
            Course course = courses[i];
            if (course.getStartTime().trim().equalsIgnoreCase(selectedCourse.getStartTime().trim()) ||
                course.getEndTime().trim().equalsIgnoreCase(selectedCourse.getEndTime().trim())) {
                return false;
            }
        }
        return true;
    }

    public Course[] getRegisteredCourses() {
        return registeredCourses;
    }
}
