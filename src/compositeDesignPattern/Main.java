package compositeDesignPattern;

public class Main {

    public static void main(String[] args) {

        //leaf nodes: teachers
        Teacher drReyes    = new Teacher("Dr. Reyes",    "Computer Science", 85_000);
        Teacher profSantos = new Teacher("Prof. Santos", "Algorithms",       75_000);
        Teacher profLim    = new Teacher("Prof. Lim",    "Networking",       70_000);
        Teacher drCruz     = new Teacher("Dr. Cruz",     "Finance",          80_000);
        Teacher profTorres = new Teacher("Prof. Torres", "Management",       68_000);

        //leaf nodes: students
        Student juan   = new Student("Juan dela Cruz",  "2024-CS-001", 25_000);
        Student maria  = new Student("Maria Garcia",    "2024-CS-002", 25_000);
        Student pedro  = new Student("Pedro Bautista",  "2024-IT-001", 22_000);
        Student ana    = new Student("Ana Ramos",       "2024-IT-002", 22_000);
        Student carlo  = new Student("Carlo Mendoza",   "2024-BS-001", 20_000);
        Student lea    = new Student("Lea Santos",      "2024-MG-001", 21_000);

        //dept: cs
        Department csDept = new Department("Department of Computer Science");
        csDept.add(drReyes);
        csDept.add(profSantos);
        csDept.add(juan);
        csDept.add(maria);

        //dept: it
        Department itDept = new Department("Department of Information Technology");
        itDept.add(profLim);
        itDept.add(pedro);
        itDept.add(ana);

        //dept: management
        Department mgmtDept = new Department("Department of Management");
        mgmtDept.add(profTorres);
        mgmtDept.add(lea);

        //college of engineering
        College engineering = new College("College of Engineering");
        engineering.add(csDept);
        engineering.add(itDept);

        //college of business
        College business = new College("College of Business");
        business.add(drCruz);      // teacher at college level
        business.add(carlo);       // student at college level
        business.add(mgmtDept);

        //neu(root college of colleges)
        College university = new College("New Era University");
        university.add(engineering);
        university.add(business);


        printSeparator("          COMPLETE UNIVERSITY DETAILS");
        university.displayDetails("");

        System.out.println();
        printSeparator("          STUDENT COUNTS");
        System.out.printf("%-45s : %d%n",
                "Total students – New Era University",   university.getStudentCount());
        System.out.printf("%-45s : %d%n",
                "Total students – College of Engineering", engineering.getStudentCount());
        System.out.printf("%-45s : %d%n",
                "Total students – College of Business",    business.getStudentCount());
        System.out.printf("%-45s : %d%n",
                "Total students – Dept. of Computer Science", csDept.getStudentCount());

        System.out.println();
        printSeparator("          BUDGET CALCULATIONS");
        System.out.printf("%-45s : PHP %,15.2f%n",
                "Budget – New Era University",    university.getBudget());
        System.out.printf("%-45s : PHP %,15.2f%n",
                "Budget – College of Engineering", engineering.getBudget());
        System.out.printf("%-45s : PHP %,15.2f%n",
                "Budget – College of Business",    business.getBudget());
        System.out.printf("%-45s : PHP %,15.2f%n",
                "Budget – Dept. of Computer Science", csDept.getBudget());
        System.out.printf("%-45s : PHP %,15.2f%n",
                "Budget – Dept. of Information Technology", itDept.getBudget());
        System.out.printf("%-45s : PHP %,15.2f%n",
                "Budget – Dept. of Management",    mgmtDept.getBudget());

        System.out.println();
        printSeparator("          INDIVIDUAL UNIT DETAILS");
        System.out.println("--- Deptartment of Computer Science ---");
        csDept.displayDetails("  ");
        System.out.println("\n--- Dr. Cruz (College of Business) ---");
        drCruz.displayDetails("  ");
        System.out.println("\n--- Juan dela Cruz ---");
        juan.displayDetails("  ");
    }

    //utility
    private static void printSeparator(String title) {
        System.out.println(title);
        System.out.println();
    }
}