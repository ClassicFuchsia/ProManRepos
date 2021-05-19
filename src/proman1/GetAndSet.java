/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proman1;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author MC03353
 */
public class GetAndSet {
    private static String sPages, sAddInfo, sGame, sWebsite, sProjectName, sClientName, 
                    sProjectType, sPlatform, sGenre, sServerName, sProjectPrice;
    private static Date dDate;
    private static int aRow = 0, aColumn = 0;
    private static String[][] aProject = new String [10][4];
    
    public static int updateArray(){
        if(aProject[aRow][0] != null){
            GetAndSet.aRow++;
        }
        return aRow;
    }
    
    public static String[] getArray(){
        String[] aClientName = new String[10];
        
        for(int j = 0;j <= aRow ;j++){
            aClientName[j] = aProject[j][1];
//            System.out.println("This " + Arrays.toString(aClientName) + "is saved to " + (aRow-1));
        }
        
        return aClientName;
    }
   
    public static void setArray(){
        GetAndSet.aProject[aRow][0] = getProjectName()+"";
        GetAndSet.aProject[aRow][1] = getClientName()+"";
        GetAndSet.aProject[aRow][2] = getProjectType()+"";
        GetAndSet.aProject[aRow][3] = getAddInfo()+"";        
    }
    
    public static String getArrayString(){
//        System.out.println(Arrays.deepToString(aProject));
        return Arrays.toString(aProject);
    }
    
    public static void setProjectPrice(String sProjectPrice){
        GetAndSet.sProjectPrice = sProjectPrice;
    }
    
    public static String getProjectPrice(){
        return sProjectPrice;
    }
    
    public static Date getDate(){
        dDate = Calendar.getInstance().getTime();
        return dDate;
    }
    
    public static void setAddInfo(String sAddInfo){
        GetAndSet.sAddInfo = sAddInfo;
    }
    
    public static void setAddInfo(String sPlatform, String sGenre){
        GetAndSet.sPlatform = sPlatform;
        GetAndSet.sGenre = sGenre;
    }
    
    public static String getAddInfo(){
        return sAddInfo;
    }
    
    public static void setPlatform(String sPlatform){
        GetAndSet.sPlatform = sPlatform;        
    }
    
    public static String getPlatform(){
        return sPlatform;
    }
        
    public static void setGame(String sPlatform, String sGenre){
        GetAndSet.sPlatform = sPlatform;
        GetAndSet.sGenre = sGenre;
    }
    
    public static String getGame(){
        sGame = "A " + sGenre + " game, on " + sPlatform;        
        return sGame;
    }
      
    public static void setWebsite(String sServerName, String sPages){
        GetAndSet.sServerName = sServerName;
        GetAndSet.sPages = sPages;
    }
    
    public static String getWebsite(){
        sWebsite = "A " + sPages + " page website, at address " + sServerName;
        return sWebsite;
    }
    
    public static String getProjectType() {
        return sProjectType;
    }

    public static void setProjectType(String sProjectType) {
        GetAndSet.sProjectType = sProjectType;
    }

    public static String getClientName(){
        return sClientName;
    }
    
    public static void setClientName(String sClientName){
        GetAndSet.sClientName = sClientName;
    }
    
    public static String getProjectName() { 
        return sProjectName;
    }

    public static void setProjectName(String sProjectName) {
        GetAndSet.sProjectName = sProjectName;
    }
}
