package java8;
 
class Student {
 
    // private member variables
    private int id;
    private String name;
    private double percentage;
    private int rank;
 
    // public 4-arg constructor
    public Student(int id, String name, double percentage, int rank) {
        super();
        this.id = id;
        this.name = name;
        this.percentage = percentage;
        this.rank = rank;
    }
 
    // getters & setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPercentage() {
        return percentage;
    }
    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
    public int getRank() {
        return rank;
    }
    public void setRank(int rank) {
        this.rank = rank;
    }
 
    // toString() method
    @Override
    public String toString() {
        return "Student [id=" + id 
                + ", name=" + name 
                + ", percentage=" + percentage 
                + ", rank=" + rank 
                + "]";
    }
 
    // hashCode() method
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }
 
    // equals() method
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (id != other.id)
            return false;
        return true;
    }
}