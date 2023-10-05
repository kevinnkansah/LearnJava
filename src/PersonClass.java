public class PersonClass {
    private String name;
    private int age;

    public PersonClass() {
    }

    public PersonClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    class Student extends PersonClass {
        private int studentID;
        private double yearMark;

        public Student() {
        }

        public Student(String name, int age, int studentID, double yearMark) {
            super(name, age);
            this.studentID = studentID;
            this.yearMark = yearMark;
        }

        class UndergradStudent extends Student{
            private String majorSubject;
            private int gradYear;

            public UndergradStudent() {
            }

            public UndergradStudent(String name, int age, int studentID, double yearMark, String majorSubject, int gradYear) {
                super(name, age, studentID, yearMark);
                this.majorSubject = majorSubject;
                this.gradYear = gradYear;
            }
        }
    }


}