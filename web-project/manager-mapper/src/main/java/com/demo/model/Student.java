package com.demo.model;

public class Student {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.student_id
     *
     * @mbg.generated Tue Dec 04 23:27:16 CST 2018
     */
    private Long studentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.password
     *
     * @mbg.generated Tue Dec 04 23:27:16 CST 2018
     */
    private Long password;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.student_id
     *
     * @return the value of student.student_id
     *
     * @mbg.generated Tue Dec 04 23:27:16 CST 2018
     */
    public Long getStudentId() {
        return studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.student_id
     *
     * @param studentId the value for student.student_id
     *
     * @mbg.generated Tue Dec 04 23:27:16 CST 2018
     */
    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.password
     *
     * @return the value of student.password
     *
     * @mbg.generated Tue Dec 04 23:27:16 CST 2018
     */
    public Long getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.password
     *
     * @param password the value for student.password
     *
     * @mbg.generated Tue Dec 04 23:27:16 CST 2018
     */
    public void setPassword(Long password) {
        this.password = password;
    }
}