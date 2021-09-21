package coreJava;

public class Test {

    public static void main(String[] args) {
        Student s1 = new Student("Navya", "Pune", "Female");
        Student s2 = new Student("Madhav", "Pimpri", "Male");
        Student s3 = new Student("Harshit", "Mumbai", "Male");
        // s1.setId(31);
        // s2.setId(32);
        // s3.setId(33);

        System.out.println(s1.getId() + "   " + s1.getName() + "\t" + s1.getAdrress() + "\t " + s1.getGender());
        System.out.println(s2.getId() + "   " + s2.getName() + "\t" + s2.getAdrress() + "\t " + s2.getGender());
        System.out.println(s3.getId() + "   " + s3.getName() + "\t" + s3.getAdrress() + "\t " + s3.getGender());

        // s3.setId(100);
        System.out.println(s3.getId() + "   " + s3.getName() + "\t" + s3.getAdrress() + "\t " + s3.getGender());

    }

	public void except(String[] strings) {
		// TODO Auto-generated method stub
		
	}

}
