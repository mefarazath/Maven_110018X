package cse;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
public class NICinfo {
private int[] DOB ;
private String sex;
private boolean isVoter;

    public NICinfo() {
        DOB = new int[3];
    }

    public void setDOB(int[] DOB) {
       this.DOB=DOB;
    }

    public int[] getDOB() {
        return DOB;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public boolean getIsVoter() {
        return isVoter;
    }

    public void setIsVoter(boolean isVoter) {
        this.isVoter = isVoter;
    }


}
