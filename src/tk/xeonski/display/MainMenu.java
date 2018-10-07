package tk.xeonski.display;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class MainMenu extends JFrame implements ActionListener{
    private JPanel pan = new JPanel();
    public MainMenu(File file, boolean temporary){
        this.setSize(1000, 800);
        this.setTitle("Project cars pit strategy");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        pan.setBackground(Color.LIGHT_GRAY);

        this.add(pan);

        if(temporary){
            //TODO CREATE DATABASE
            try {
                file = File.createTempFile("pcars-pit-strat-", ".db");
            }catch(IOException i){
                i.printStackTrace();
                System.exit(0);
            }
        }
        else{
            //TODO Copy selected db to temporary file
        }

        //TODO CONNECT TO DATABASE Car/Track
        //TODO CONNECT TO USER DATABASE
        //TODO Verify that user database correspond to the model

        this.setVisible(true);


    }

    private JList getCars(){
        //TODO Get cars from db and put them in list
    }

    private JList getTracks{
        //TODO Get tracks from db and put them in list
    }

    public void actionPerformed(ActionEvent arg0) {
        //TODO handle buttons
    }
}
