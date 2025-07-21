package com.operation;

import java.util.List;

import com.driver.Driver;
import com.entities.Members;

public class MemberOperation {
	
	public static void addMember(String mem_name, String mem_mail, long mem_mob, String mem_addr) {
        Members member = new Members();
        member.setMem_name(mem_name);
        member.setMem_gmail(mem_mail);
        member.setMem_phone(mem_mob);
        member.setMem_address(mem_addr);
        
        Driver.et.begin();
        Driver.em.persist(member);
        Driver.et.commit();
    }
    
    public static void updateMember(int memberId, String mem_name, String mem_mail, long mem_mob, String mem_addr) {
        Members member = Driver.em.find(Members.class, memberId);
        if (member != null) {
        	member.setMem_name(mem_name);
            member.setMem_gmail(mem_mail);
            member.setMem_phone(mem_mob);
            member.setMem_address(mem_addr);
            
            Driver.et.begin();
            Driver.em.merge(member);
            Driver.et.commit();
        } else {
            System.out.println("Member not found!");
        }
    }
    
    public static void deleteMember(int memberId) {
        Members member = Driver.em.find(Members.class, memberId);
        if (member != null) {
            Driver.et.begin();
            Driver.em.remove(member);
            Driver.et.commit();
        } else {
            System.out.println("Member not found!");
        }
    }
    
    public static void viewMembers() {
        List<Members> members = Driver.em.createQuery("SELECT m FROM Member m", Members.class).getResultList();
        for (Members member : members) {
            System.out.println("Member ID: " + member.getMem_id());
            System.out.println("Name: " + member.getMem_name());
            System.out.println("Email: " + member.getMem_gmail());
            System.out.println("Phone: " + member.getMem_phone());
            System.out.println("Address: " + member.getMem_address());
            System.out.println("----------------------------------------");
        }
    

}
}
