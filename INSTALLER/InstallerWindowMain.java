package INSTALLER;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URI;
import java.io.*;
import java.nio.file.*;

// Driver Class
public class InstallerWindowMain {
    static String modsPath;
    static boolean pathFound;

    public static void main(String[] args) {
        pathFound = false;
        
        String userMessageHtml = "<html>" +
            "<div style='text-align: center; font-weight: bold; font-size: 18pt;'>" +
            "Welcome to Will's Minecraft Mod Installer (TM) (not actually trademarked)<br><br>" +
            "</div>" +
            "If you have not installed the <a href='https://fabricmc.net/use/installer/'>Fabric loader</a>, please do so. " +
            "You can find it below. Once you do, please close this program and reopen it." +
            "</html>";

        String appDataPath = System.getenv("APPDATA");
        modsPath = appDataPath + "\\.minecraft\\mods";

        File modsFolder = new File(modsPath);
        if (modsFolder.exists() && modsFolder.isDirectory()) {
            System.out.println("Mods folder path: " + modsPath);
            pathFound = true;
        } else {
            modsPath = "Mods folder not found please either install Fabric or Minecraft";
            System.out.println("Mods folder not found");
            pathFound = false;
        }
        
        System.out.println("Mods folder path: " + modsPath);

        JLabel linkLabel = new JLabel("<html><a href=''>Click here for fabric</a></html>");
        linkLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));

        // Create the main frame
        JFrame frame = new JFrame("Will's Minecraft Mod Installer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        ///////// UNUSED//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(openItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // Create a panel with a button
        JPanel panel = new JPanel();
        JTextField inputField = new JTextField(30);
        inputField.setText(modsPath);
        panel.add(inputField);
        JButton button = new JButton("Click Me To Download Mods");
        panel.add(button);

        // Add action to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pathFound) {
                    deleteJarFilesInModsFolder(modsPath);
                    copyModsToMinecraftFolder(modsPath);
                    JOptionPane.showMessageDialog(frame, "Mods copied!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Please fix file structure!");
                }
            }
        });

        // Create another panel with text
        JPanel textPanel = new JPanel();
        textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.Y_AXIS)); // stack components vertically

        JLabel label = new JLabel(userMessageHtml);
        label.setCursor(new Cursor(Cursor.HAND_CURSOR));

        label.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://fabricmc.net/use/installer/"));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        textPanel.add(label);

        // Set layout for the main frame
        frame.setLayout(new BorderLayout());
        //frame.setJMenuBar(menuBar); // unused
        frame.add(panel, BorderLayout.CENTER);
        frame.add(textPanel, BorderLayout.NORTH);
        frame.setVisible(true);
    }

    public static void copyModsToMinecraftFolder(String destinationPath) {
        // FIX: Look in Mods2.0 folder that sits next to INSTALLER
        File sourceDir = new File("MODS2.0");  
        File destDir = new File(destinationPath);

        if (!sourceDir.exists() || !sourceDir.isDirectory()) {
            System.out.println("Source 'Mods2.0' folder not found.");
            return;
        }

        if (!destDir.exists()) {
            System.out.println("Destination folder does not exist: " + destinationPath);
            return;
        }

        File[] files = sourceDir.listFiles();
        if (files == null || files.length == 0) {
            System.out.println("No files found in 'Mods2.0' folder.");
            return;
        }

        for (File file : files) {
            if (file.isFile()) {
                Path src = file.toPath();
                Path dst = Paths.get(destDir.getAbsolutePath(), file.getName());

                try {
                    Files.copy(src, dst, StandardCopyOption.REPLACE_EXISTING);
                    System.out.println("Copied: " + file.getName());
                } catch (IOException e) {
                    System.err.println("Failed to copy " + file.getName() + ": " + e.getMessage());
                }
            }
        }
    }

    public static void deleteJarFilesInModsFolder(String modsPath) {
        File modsDir = new File(modsPath);

        if (!modsDir.exists() || !modsDir.isDirectory()) {
            System.out.println("Mods folder does not exist: " + modsPath);
            return;
        }

        File[] jarFiles = modsDir.listFiles((dir, name) -> name.toLowerCase().endsWith(".jar"));
        if (jarFiles == null || jarFiles.length == 0) {
            System.out.println("No .jar files found in: " + modsPath);
            return;
        }

        for (File jar : jarFiles) {
            if (jar.delete()) {
                System.out.println("Deleted: " + jar.getName());
            } else {
                System.err.println("Failed to delete: " + jar.getName());
            }
        }
    }

}
