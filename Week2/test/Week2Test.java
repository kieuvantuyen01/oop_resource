import org.junit.Test;

import static org.junit.Assert.*;

public class Week2Test {
    @Test
    public void Test1() {
        Student s1 = new Student();
        s1.setName("a b c");
        s1.setEmail("email@vnu.edu.vn");
        s1.setId("17020001");
        s1.setGroup("K62CC");
        assertEquals(s1.getInfo(), "a b c - 17020001 - K62CC - email@vnu.edu.vn");
    }

    @Test
    public void Test2() {
        Student s1 = new Student();
        assertEquals(s1.getName(), "Student");
        assertEquals(s1.getId(), "000");
        assertEquals(s1.getGroup(), "K62CB");
        assertEquals(s1.getEmail(), "uet@vnu.edu.vn");
    }

    @Test
    public void Test3() {
        Student s1 = new Student("a b c", "17020010", "abc@vnu.edu.vn");
        assertEquals(s1.getName(), "a b c");
        assertEquals(s1.getId(), "17020010");
        assertEquals(s1.getGroup(), "K62CB");
        assertEquals(s1.getEmail(), "abc@vnu.edu.vn");
    }

    @Test
    public void Test4() {
        Student s0 = new Student("a b c d", "17020011", "K62CLC", "abcd@vnu.edu.vn");
        Student s1 = new Student(s0);
        assertEquals(s1.getName(), "a b c d");
        assertEquals(s1.getId(), "17020011");
        assertEquals(s1.getGroup(), "K62CLC");
        assertEquals(s1.getEmail(), "abcd@vnu.edu.vn");
    }

    @Test
    public void Test5() {
        Student student1 = new Student("NGUYEN THI HONG", "17020020", "K62_CC", "ha@gmail.com");
        Student student2 = new Student("NGUYEN MINH PHU", "17020960", "K62_CC", "hot@gmail.com");
        Student student3 = new Student("NGUYEN VU TUNG", "17020057", "K62_CG", "nguyen@gmail.com");

        StudentManagement sm = new StudentManagement();
        assertEquals(sm.sameGroup(student1, student2), true);
        assertEquals(sm.sameGroup(student3, student2), false);
    }

    @Test
    public void Test6() {
        StudentManagement sm = new StudentManagement();
        Student student1 = new Student("NGUYEN THI HONG", "17020020", "K62_CC", "ha@gmail.com");
        sm.getStudents().add(student1);
        Student student2 = new Student("NGUYEN MINH PHU", "17020960", "K62_CF", "hot@gmail.com");
        sm.getStudents().add(student2);
        Student student3 = new Student("NGUYEN VU TUNG", "17020057", "K62_CG", "nguyen@gmail.com");
        sm.getStudents().add(student3);

        sm.removeStudent("17020000");
        assertEquals(sm.getStudents().size(), 3);

        sm.removeStudent("17020057");

        assertEquals(sm.getStudents().size(), 2);
        assertEquals(sm.getStudents().get(0).getId(), "17020020");
        assertEquals(sm.getStudents().get(1).getId(), "17020960");
    }

    @Test
    public void Test7() {
        StudentManagement sm = new StudentManagement();
        Student student1 = new Student("NGUYEN THI HONG", "17020020", "K62CC", "ha@gmail.com");
        sm.getStudents().add(student1);
        Student student2 = new Student("NGUYEN MINH PHU", "17020960", "K62CF", "hot@gmail.com");
        sm.getStudents().add(student2);
        Student student3 = new Student("NGUYEN VU TUNG", "17020057", "K62CC", "nguyen@gmail.com");
        sm.getStudents().add(student3);
        Student student4 = new Student("NGUYEN HUU DANH", "17020058", "K62CF", "nguyen33@gmail.com");
        sm.getStudents().add(student4);

        assertEquals(sm.studentsByGroup(),
                "K62CC\n" +
                "NGUYEN THI HONG - 17020020 - K62CC - ha@gmail.com\n" +
                "NGUYEN VU TUNG - 17020057 - K62CC - nguyen@gmail.com\n" +
                "K62CF\n" + 
                "NGUYEN MINH PHU - 17020960 - K62CF - hot@gmail.com\n" +
                "NGUYEN HUU DANH - 17020058 - K62CF - nguyen33@gmail.com");
    }
}