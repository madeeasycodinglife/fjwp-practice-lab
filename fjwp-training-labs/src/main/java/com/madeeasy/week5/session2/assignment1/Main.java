package com.madeeasy.week5.session2.assignment1;

import java.util.LinkedList;
import java.util.Queue;

class MessageQueue {
    private Queue<String> messages = new LinkedList<>();
    private int capacity;

    public MessageQueue(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void sendMessage(String message) {
        while (messages.size() == capacity) {
            try {
                System.out.println("Queue is full. Sender is waiting...");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        messages.add(message);
        System.out.println("Message sent: " + message);
        notifyAll();
    }

    public synchronized String receiveMessage() {
        while (messages.isEmpty()) {
            try {
                System.out.println("Queue is empty. Receiver is waiting...");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String message = messages.poll();
        System.out.println("Message received: " + message);
        notifyAll();
        return message;
    }
}

public class Main {
    public static void main(String[] args) {
        MessageQueue messageQueue = new MessageQueue(5);

        Thread senderThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                messageQueue.sendMessage("Message " + (i + 1));
            }
        });

        Thread receiverThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                messageQueue.receiveMessage();
            }
        });

        senderThread.start();
        receiverThread.start();
    }
}

