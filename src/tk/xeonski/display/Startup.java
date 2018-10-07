package tk.xeonski.display;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class Startup extends JFrame implements ActionListener {
    private JPanel pan = new JPanel();
    private JLabel label = new JLabel("Project Cars Pit strategist");
    private JButton new_file = new JButton("New File");
    private JButton existing_file = new JButton("Open File");

    /**
     * display the main menu, ask if a new file has to be created or if a file has to be opened
     * @return location of sqlite db file
     */
    public Startup(){

        this.setSize(300, 500);
        this.setTitle("Project cars pit strategy");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);



        pan.setBackground(Color.LIGHT_GRAY);





        pan.add(label);
        pan.add(new_file);
        pan.add(existing_file);

        new_file.addActionListener(this);
        existing_file.addActionListener(this);

        this.setContentPane(pan);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent arg0) {
        if (arg0.getSource() == new_file) {
            //Create temporary file and launch main program
                this.setVisible(false);
                //Launch Main program
                MainMenu m = new MainMenu(null, true);
        } else if (arg0.getSource() == existing_file) {
            //Get file by filechooser and launch main program
            JFileChooser fc = new JFileChooser();
            int ret = fc.showOpenDialog(this);

            if(ret == JFileChooser.APPROVE_OPTION){
                File file = fc.getSelectedFile();

                //TODO Check if the selected file is a sqlitedb

                this.setVisible(false);
                //Launch Main program
                MainMenu m = new MainMenu(file, false);
            }
        }
    }
}
