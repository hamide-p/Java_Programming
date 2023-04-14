package java_programming.day26_statics.studentTask;

import java.util.ArrayList;
import java.util.Arrays;
public class StudentsGroup { // StudentGroup HAS A Student

    /*
     Create a custom class named StudentsGroup
	            Attributes:
	                groupName, groupId, students (ArrayList<Students>)

	            Add a constructor that can set the groupId and groupName
	                    initialize students arraylist in the constructor's body

	            Methods:
	                addStudent(Student): adds the specified student to the students arrayList

	                removeStudent(id): removes the student with the specified id from the students arraylist

	                toString(): displays the groupName, groupId and total number of students when a group object is passed in the print statement
     */

        public String groupName; // creates the StudentsGroup object by setting the groupName and groupId

        public int groupId;
    // students = new ArrayList<>(); // size : 0

        public ArrayList<Student> students = new ArrayList<>();
       /*
      * can store multiple student objects
      * array is not preferred (size is fixed) so Arraylist is the best usage here
      * we don't want to use String objects here because we also want to store other types of objects, such as int age and char gender. These attributes are contained in the Student object.
*/

    // ArrayList<Student> students) { // we can instantiate the array variable here as well
    public StudentsGroup(String groupName, int groupId) {


        this.groupName = groupName;
        this.groupId = groupId;
       // this.students = new ArrayList<>(); // size : 0 --> inorder to use ArrayList object has to be created all the time --> we can also instantiate here in the constructor
    }


 /*
  * we use here instance method inorder to store different student objects
  * takes one student object, and adds it to the arraylist of students
  */
    public void  addStudent(Student student ){
        students.add(student);
    }


    /*
   * overloaded method
   * takes one array of students, and adds the array of students to the arraylist of students
    */
    public void addStudent(Student[] students){
        this.students.addAll(Arrays.asList(students));
    }



    /*
    * overloaded method
    * takes name , age, gender, id of student info, creates student object by using the given info, then adds the student object to the arraylist of students

     * */
    public void addStudent(String name, int age, char gender, String id){
     //   Student student = new Student(name, age, gender, id);
        students.add(new Student (name, age, gender, id) );
    }


    // removing by id is the best usage here because it can be the same name, gender or age of the students in the arrayList, so we don't want to delete them
    // Takes the id and then removes the student object with the specified id from arraylist of students


    public void removeStudent(String id){
        students.removeIf(p -> p.id.equals(id));
    }



    public String toString() {
        return "StudentsGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                ", number of students=" + students.size() +
                '}';
    }
}
