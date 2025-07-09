package day08;

import javax.swing.*;
import java.awt.*;

public class MenuItem {
    String name;
    int price;
    boolean isSignature;

    MenuItem(String name, int price, boolean isSignature){
        this.name = name;
        this.price = price;
        this.isSignature = isSignature;
    }

}
