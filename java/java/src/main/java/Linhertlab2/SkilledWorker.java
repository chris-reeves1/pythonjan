package Linhertlab2;

import java.util.ArrayList;

public class SkilledWorker extends Employee {
    private ArrayList<String> skills;

    // Constructor
    public SkilledWorker(String name, String jobTitle) {
        super(name, jobTitle);
        this.skills = new ArrayList<>();
    }

    // Add skill
    public void addSkill(String skill) {
        skills.add(skill);
    }

    // Get info
    @Override
    public String getInfo() {
        String info = super.getInfo();
        info += "Skills:\n";
        for (String skill : skills) {
            info += "- " + skill + "\n";
        }
        return info;
    }
}