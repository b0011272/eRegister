import uk.ac.shu.webarch.eregister.*;

class BootStrap {

    def init = { servletContext ->

println("BootStrap::init");

def ian_instructor = Instructor.findByStaffId('15755675') ?: new Instructor(staffId:'15755675', 
									    name:'Ian Ibbotson').save();

def web_arch_course = Course.findByCourseCode('7458536') ?: new Course(courseCode:'7458536',
								       courseName:'Web Architectures',
								       description:'Brilliant lectures').save();

def ste_student = Student.findByStudentNumber('1407885') ?: new Student(studentNumber:'1407885',
								        fullStudentName:'Stephen Clark',
								        notes:'Top Student').save();
								     

    }
    def destroy = {
    }
}
