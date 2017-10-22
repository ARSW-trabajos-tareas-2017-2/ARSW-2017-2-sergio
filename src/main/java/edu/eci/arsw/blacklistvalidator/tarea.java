/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.blacklistvalidator;

import edu.eci.arsw.spamkeywordsdatasource.HostBlacklistsDataSourceFacade;

/**
 *
 * @author sergioxl
 */
public class tarea extends Thread{
    
    private int id;
    private String ipadd;
    private HostBlacklistsDataSourceFacade sdks;
    private boolean isBlack;
    
    public tarea(HostBlacklistsDataSourceFacade sdks, int id, String ipadd){
        this.id=id;
        this.ipadd=ipadd;    
        this.sdks = sdks;
        
    }
    
    public void run(){
        isBlack = sdks.isInBlackListServer(id, ipadd);        
    }

    public boolean isIsBlack() {
        return isBlack;
    }
    
}