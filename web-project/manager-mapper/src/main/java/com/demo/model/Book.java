package com.demo.model;

public class Book {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.book_id
     *
     * @mbg.generated Wed Dec 05 23:21:39 CST 2018
     */
    private Long bookId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.name
     *
     * @mbg.generated Wed Dec 05 23:21:39 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.introd
     *
     * @mbg.generated Wed Dec 05 23:21:39 CST 2018
     */
    private String introd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.number
     *
     * @mbg.generated Wed Dec 05 23:21:39 CST 2018
     */
    private Integer number;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.book_id
     *
     * @return the value of book.book_id
     *
     * @mbg.generated Wed Dec 05 23:21:39 CST 2018
     */
    public Long getBookId() {
        return bookId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.book_id
     *
     * @param bookId the value for book.book_id
     *
     * @mbg.generated Wed Dec 05 23:21:39 CST 2018
     */
    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.name
     *
     * @return the value of book.name
     *
     * @mbg.generated Wed Dec 05 23:21:39 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.name
     *
     * @param name the value for book.name
     *
     * @mbg.generated Wed Dec 05 23:21:39 CST 2018
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.introd
     *
     * @return the value of book.introd
     *
     * @mbg.generated Wed Dec 05 23:21:39 CST 2018
     */
    public String getIntrod() {
        return introd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.introd
     *
     * @param introd the value for book.introd
     *
     * @mbg.generated Wed Dec 05 23:21:39 CST 2018
     */
    public void setIntrod(String introd) {
        this.introd = introd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.number
     *
     * @return the value of book.number
     *
     * @mbg.generated Wed Dec 05 23:21:39 CST 2018
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.number
     *
     * @param number the value for book.number
     *
     * @mbg.generated Wed Dec 05 23:21:39 CST 2018
     */
    public void setNumber(Integer number) {
        this.number = number;
    }
}