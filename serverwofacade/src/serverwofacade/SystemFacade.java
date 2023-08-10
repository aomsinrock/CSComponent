/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serverwofacade;

/**
 *
 * @author Exia
 */
public class SystemFacade {

    private static SystemFacade myFacadeObj = null;

    private SystemFacade() {
    }

    public static SystemFacade getMyFacadeObject() {
        if (myFacadeObj == null) {
            myFacadeObj = new SystemFacade();
        }
        return myFacadeObj;
    }

    public void StartFunc() {
        ScheduleServer scheduleServer = new ScheduleServer();
        scheduleServer.startBooting();
        scheduleServer.readSystemConfigFile();
        scheduleServer.init();
        scheduleServer.initializeContext();
        scheduleServer.initializeListeners();
        scheduleServer.createSystemObjects();
        System.out.println("Start working......");

    }

    public void StopFunc() {
        ScheduleServer scheduleServer = new ScheduleServer();
        scheduleServer.releaseProcesses();
        scheduleServer.destory();
        scheduleServer.destroySystemObjects();
        scheduleServer.destoryListeners();
        scheduleServer.destoryContext();
        scheduleServer.shutdown();
        System.out.println("After work done.........");

    }
}
