package edu.rice.comp504.model;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.jetty.websocket.api.Session;

import edu.rice.comp504.model.obj.ChatRoom;
import edu.rice.comp504.model.obj.Message;
import edu.rice.comp504.model.obj.User;
import edu.rice.comp504.model.res.*;

public class DispatcherAdapter extends Observable {

    private int nextUserId;
    private int nextRoomId;
    private int nextMessageId;

    // Maps user id to the user
    private Map<Integer, User> users;

    // Maps room id to the chat room
    private Map<Integer, ChatRoom> rooms;

    // Maps message id to the message
    private Map<Integer, Message> messages;

    // Maps session to user id
    private Map<Session, Integer> userIdFromSession;

    /**
     * Constructor.
     */
    public DispatcherAdapter() {
        this.nextRoomId = 0;
        this.nextUserId = 0;
        this.nextMessageId = 0;
        this.users = new ConcurrentHashMap<>();
        this.rooms = new ConcurrentHashMap<>();
        this.messages = new ConcurrentHashMap<>();
        this.userIdFromSession = new ConcurrentHashMap<>();
    }

    public void newSession(Session session) {

    }

    public int getUserIdFromSession(Session session) {
        return this.userIdFromSession.get(session);
    }

    public boolean containsSession(Session session) {
        return this.userIdFromSession.containsKey(session);
    }

    /**
     * Load a user into the environment.
     * @param session session
     * @param body of format "name age location school"
     * @return the user loaded
     */
    public User loadUser(Session session, String body) {
        return null;
    }

    /**
     * Load a room into the environment.
     * @param session session
     * @param body of format "name ageLower ageUpper {[location],}*{[location]} {[school],}*{[school]}"
     * @return return
     */
    public ChatRoom loadRoom(Session session, String body) {
        return null;
    }

    /**
     * Remove a user with given userId from the environment.
     * @param userId the id of the user to be removed
     */
    public void unloadUser(int userId) {

    }

    /**
     * Remove a room with given roomId from the environment.
     * @param roomId the id of the room to be removed
     */
    public void unloadRoom(int roomId) {

    }

    /**
     * Make a user join a chat room.
     * @param session session
     * @param body of format "roomId"
     */
    public void joinRoom(Session session, String body) {

    }

    /**
     * Make a user volunteer to leave a chat room.
     * @param session session
     * @param body of format "roomId"
     */
    public void leaveRoom(Session session, String body) {

    }

    /**
     * Make modification on chat room filer by the owner.
     * @param session session
     * @param body of format "roomId lower upper {[location],}*{[location]} {[school],}*{[school]}"
     */
    public void modifyRoom(Session session, String body) {

    }

    /**
     * A sender sends a string message to a receiver.
     * @param session session
     * @param body of format "roomId receiverId rawMessage"
     */
    public void sendMessage(Session session, String body) {

    }

    /**
     * Acknowledge the message from the receiver.
     * @param session session
     * @param body of format "msgId"
     */
    public void ackMessage(Session session, String body) {

    }

    /**
     * Send query result from controller to front end.
     * @param session session
     * @param body of format "type roomId [senderId] [receiverId]"
     */
    public void query(Session session, String body) {

    }

    /**
     * Notify the client for refreshing.
     * @param user user expected to receive the notification
     * @param response the information for notifying
     */
    public void notifyClient(User user, AResponse response) {

    }

    /**
     * Get the names of all chat room members.
     * @param roomId the id of the room
     * @return names of all chat room members
     */
    private Map<Integer, String> getUsers(int roomId) {
        return null;
    }

    /**
     * Get notifications in the chat room.
     * @param roomId the id of the room
     * @return notifications of the chat room
     */
    private List<String> getNotifications(int roomId) {
        return null;
    }

    /**
     * Get chat history between user A and user B (commutative).
     * @param roomId the id of the chat room
     * @param userAId the id of user A
     * @param userBId the id of user B
     * @return chat history between user A and user B
     */
    private List<Message> getChatHistory(int roomId, int userAId, int userBId) {
        return null;
    }
}
