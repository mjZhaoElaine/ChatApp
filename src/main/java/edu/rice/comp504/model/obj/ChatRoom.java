package edu.rice.comp504.model.obj;

import edu.rice.comp504.model.DispatcherAdapter;

import java.util.*;
import java.util.Observable;
import java.util.concurrent.ConcurrentHashMap;

public class ChatRoom extends Observable {

    private int id;
    private String name;
    private User owner;
    private int ageLowerBound;
    private int ageUpperBound;
    private String[] locations;
    private String[] schools;

    private DispatcherAdapter dis;

    // notifications contain why the user left, etc.
    private List<String> notifications;

    // Maps key("smallId&largeId") to list of chat history strings
    private Map<String, List<Message>> chatHistory;

    /**
     * Constructor.
     */
    public ChatRoom(int id, String name, User owner,
                    int lower, int upper, String[] locations, String[] schools,
                    DispatcherAdapter dispatcher) {
        this.id = id;

        this.name = name;
        this.owner = owner;

        this.ageLowerBound = lower;
        this.ageUpperBound = upper;
        this.locations = locations;
        this.schools = schools;

        this.dis = dispatcher;

        this.notifications = new LinkedList<>();
        this.chatHistory = new ConcurrentHashMap<>();
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public User getOwner() {
        return this.owner;
    }

    public List<String> getNotifications() {
        return this.notifications;
    }

    public Map<String, List<Message>> getChatHistory() {
        return this.chatHistory;
    }

    public DispatcherAdapter getDispatcher() {
        return this.dis;
    }

    public Map<Integer, String> getUsers() {
        return null;
    }


    public boolean applyFilter(User user) {
        return false;
    }


    public void modifyFilter(int lower, int upper, String[] locations, String[] schools) {

    }


    public boolean addUser(User user) {
        return false;
    }


    public boolean removeUser(User user, String reason) {
        return false;
    }


    public void storeMessage(User sender, User receiver, Message message) {

    }


    private void freeChatHistory(User user) {
        // TODO: parse the key and remove chat history related to user
    }
}
