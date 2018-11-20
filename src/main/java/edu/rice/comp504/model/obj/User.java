package edu.rice.comp504.model.obj;

import org.eclipse.jetty.websocket.api.Session;

import java.util.*;
import java.util.Observable;
import java.util.Observer;

public class User implements Observer {

    private int id;
    private transient Session session;

    private String name;
    private int age;
    private String location;
    private String school;

    private List<Integer> joinedRoomIds;
    private List<Integer> availableRoomIds;

    /**
     * Constructor.
     */
    public User(int id, Session session, String name, int age,
                String location, String school, ChatRoom[] rooms) {
        this.id = id;
        this.session = session;

        this.name = name;
        this.age = age;
        this.location = location;
        this.school = school;

        this.joinedRoomIds = new LinkedList<>();
        this.availableRoomIds = new LinkedList<>();

        for (ChatRoom room : rooms) {
            this.availableRoomIds.add(room.getId());
        }
    }

    public int getId() {
        return this.id;
    }

    public Session getSession() {
        return this.session;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getLocation() {
        return this.location;
    }

    public String getSchool() {
        return this.school;
    }

    public List<Integer> getJoinedRoomIds() {
        return this.joinedRoomIds;
    }

    public List<Integer> getAvailableRoomIds() {
        return this.availableRoomIds;
    }

    public void addRoom(ChatRoom room) {

    }

    public void removeRoom(ChatRoom room) {

    }

    public void moveToJoined(ChatRoom room) {

    }

    public void moveToAvailable(ChatRoom room) {

    }

    @Override
    public void update(Observable o, Object arg) {

    }

}
