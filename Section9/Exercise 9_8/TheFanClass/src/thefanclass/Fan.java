/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thefanclass;

/**
 *
 * @author levan
 */
public class Fan {
  public static final int SLOW = 1;
  public static final int MEDIUM = 2;
  public static final int FAST = 3;
  private int speed = SLOW;
  private boolean on =false;
  private double radius = 5;
  private String color = "white";
  
  // create default constructor 
  public Fan () {
    this.speed = 1;
    this.on = false;
    this.radius = 5;
    this.color = "blue";
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public boolean isOn() {
    return on;
  }

  public void setOn(boolean on) {
    this.on = on;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
  
  // create toString()
  @Override
  public String toString(){
    
      return "Fan speed is " + this.speed 
              + " color: " + this.color 
              + " radius: " + this.radius 
              + ((isOn())? "Fan is on " : "Fan is off" );
    
  }
}
