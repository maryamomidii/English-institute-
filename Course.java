package EnglishInstitute;

public class Course {
    private String name;
    private int capacity;
    private double price;
    private String startTime;
    private String endTime;
    private String examDate;

    public Course(String name, int capacity, double price, String startTime, String endTime, String examDate) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
        this.startTime = startTime;
        this.endTime = endTime;
        this.examDate = examDate;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getExamDate() {
        return examDate;
    }

    public void setExamDate(String examDate) {
        this.examDate = examDate;
    }
}