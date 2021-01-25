import java.util.Objects;

public class Student implements Comparable<Student>{

	private int stdNo;
	private String stdName;

	public Student(int stdNo, String stdName) {
        super();
        this.stdNo = stdNo;
        this.stdName = stdName;
    }

	public int getStdNo() {
		return stdNo;
	}

	public void setStdNo(int stdNo) {
		this.stdNo = stdNo;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	@Override
	public String toString() {
		return "Student [stdNo=" + stdNo + ", stdName=" + stdName + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Student))
			return false;

		Student temp = (Student) obj;
		if (this.stdNo == temp.stdNo)
			return true;
		else
			return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(stdNo);
	}

	@Override
	public int compareTo(Student o) {
		return this.stdNo -o.stdNo;
	}
}
