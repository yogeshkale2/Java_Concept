// 1. THE CLASS (Aapka Blank Resume Format)
class Resume {

    // Attributes (Jankari jo resume mein honi chahiye)
    String name;
    String education;
    String skills;

    // 2. THE CONSTRUCTOR (Jankari fill karna)
    public Resume(String myName, String myEducation, String mySkills) {
        this.name = myName;
        this.education = myEducation;
        this.skills = mySkills;
    }

    // 3. A METHOD (Resume ko screen par dikhana)
    public void printResume() {
        System.out.println("=== RESUME ===");
        System.out.println("Naam: " + this.name);
        System.out.println("Padhai: " + this.education);
        System.out.println("Skills: " + this.skills);
        System.out.println("==============\n");
    }
}

// 4. MAIN PROGRAM (Jahan hum asli resume banayenge)
public class ResumeEx {
    public static void main(String[] args) {

        // Pehla Object: Aapka apna resume banana
        Resume myResume = new Resume("Rahul Kumar", "B.Tech Computer Science", "Java, HTML, CSS");

        // Dusra Object: Dost ka resume banana
        Resume friendResume = new Resume("Amit Singh", "B.Com", "Accounting, Tally");

        // Dono resume ko print karna
        myResume.printResume();
        friendResume.printResume();
    }
}