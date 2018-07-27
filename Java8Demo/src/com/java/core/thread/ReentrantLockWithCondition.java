package com.java.core.thread;

import java.util.Stack;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockWithCondition {
	Stack<String> stack = new Stack<>();
    int CAPACITY = 5;
 
    ReentrantLock lock = new ReentrantLock();
    Condition stackEmptyCondition = lock.newCondition();
    Condition stackFullCondition = lock.newCondition();
 
    public void pushToStack(String item){
        try {
            lock.lock();
            while(stack.size() == CAPACITY){
                stackFullCondition.await();
            }
            stack.push(item);
            stackEmptyCondition.signalAll();
        }catch(Exception exp){
        	exp.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public String popFromStack() {
        try {
            lock.lock();
            while(stack.size() == 0){
                stackEmptyCondition.await();
            }
            return stack.pop();
        }catch(Exception exp){
        	exp.printStackTrace();
        } finally {
            stackFullCondition.signalAll();
            lock.unlock();
        }
        return null;
    }
}