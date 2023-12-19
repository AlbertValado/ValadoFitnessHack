/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package avp.valadofitnesshack;

import avp.fitnessexercisecomponent.FitnessExerciseComponent;
import avp.valadofitnesshack.dataaccess.DataAccess;
import avp.valadofitnesshack.dialogs.ReviewDialog;
import avp.valadofitnesshack.dto.Intent;
import avp.valadofitnesshack.dto.Review;
import avp.valadofitnesshack.dto.Usuari;
import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobClientBuilder;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.File;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import uk.co.caprica.vlcj.player.component.EmbeddedMediaPlayerComponent;

/**
 *
 * @author Albert
 */
public class InstructorView extends javax.swing.JFrame {

    private DataAccess da = new DataAccess();
    private Usuari instructor;
    private Intent selectedIntent;
    private boolean isReview;

    private javax.swing.JList<Intent> lstAttemptsPendingReview;
    private javax.swing.JList<Usuari> lstUsuaris;
    private javax.swing.JList<Intent> lstAttemptsPerUser;
    private javax.swing.JList<String> lstVideos;

    private EmbeddedMediaPlayerComponent mediaPlayer;
    private JFileChooser fileChooser;
    private boolean isPlaying = false;
    private String videoFile;

    private String userName = System.getProperty("user.home");

    private String connectStr = "DefaultEndpointsProtocol=https;AccountName=valadovideoserver;AccountKey=dxk5mJBL6Aiqs6jf/E8kC697v4uTToJRLD1I7vDbxVVjY/1eTsv/7RaMQRiHedgscU8PVS6oszsB+AStIBnSuQ==;EndpointSuffix=core.windows.net";
    private String containerName = "valadovideos";
    private String tempDir = System.getProperty("java.io.tmpdir");

    /**
     * Creates new form UserView
     */
    public InstructorView() {
        initComponents();
        setSize(720, 630);
        setLocationRelativeTo(null);

        lstAttemptsPendingReview = new javax.swing.JList<>();
        lstUsuaris = new javax.swing.JList<>();
        lstAttemptsPerUser = new javax.swing.JList<>();
        lstVideos = new javax.swing.JList<>();

        fileChooser = new JFileChooser();
        mediaPlayer = new EmbeddedMediaPlayerComponent();
        pnlVideoPlayer.add(mediaPlayer, BorderLayout.CENTER);

        //Estos tres botones permanecen ocultos hasta que se selecciona un intento
        btnReview.setVisible(false);
        btnEditReview.setVisible(false);
        btnDeleteReview.setVisible(false);

        //LISTENERS
        lstAttemptsPendingReview.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstAttemptsPendingReviewValueChanged(evt);
            }
        });

        lstUsuaris.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstUsuarisValueChanged(evt);
            }
        });

        lstVideos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstVideosValueChanged(evt);
            }
        });

        lstAttemptsPerUser.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstAttemptsPerUserValueChanged(evt);
            }
        });
    }

    public Usuari getInstructor() {
        return instructor;
    }

    public void setInstructor(Usuari instructor) {
        this.instructor = instructor;
    }

    public boolean isIsReview() {
        return isReview;
    }

    public void setIsReview(boolean isReview) {
        this.isReview = isReview;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fitnessExerciseComponent2 = new avp.fitnessexercisecomponent.FitnessExerciseComponent();
        pnlVideoPlayer = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtInfo = new javax.swing.JTextField();
        btnLogOut = new javax.swing.JButton();
        btnReview = new javax.swing.JButton();
        btnEditReview = new javax.swing.JButton();
        btnDeleteReview = new javax.swing.JButton();
        btnGetAttemptsPendingReview = new javax.swing.JButton();
        btnGetUsers = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        btnPauseResumeVideo = new javax.swing.JButton();
        btnLoadFile = new javax.swing.JButton();
        pnlUsers = new javax.swing.JScrollPane();
        pnlAttempts = new javax.swing.JScrollPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itmExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itmAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        pnlVideoPlayer.setBorder(javax.swing.BorderFactory.createTitledBorder("Video"));
        pnlVideoPlayer.setLayout(new java.awt.BorderLayout());
        getContentPane().add(pnlVideoPlayer);
        pnlVideoPlayer.setBounds(14, 0, 680, 270);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Info"));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(txtInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(20, 510, 679, 60);

        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogOut);
        btnLogOut.setBounds(560, 590, 130, 70);

        btnReview.setText("Review");
        btnReview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReviewActionPerformed(evt);
            }
        });
        getContentPane().add(btnReview);
        btnReview.setBounds(140, 580, 72, 23);

        btnEditReview.setText("Edit");
        btnEditReview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditReviewActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditReview);
        btnEditReview.setBounds(220, 580, 72, 23);

        btnDeleteReview.setText("Delete");
        btnDeleteReview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteReviewActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeleteReview);
        btnDeleteReview.setBounds(300, 580, 72, 23);

        btnGetAttemptsPendingReview.setText("Get Attempts Pending Review");
        btnGetAttemptsPendingReview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetAttemptsPendingReviewActionPerformed(evt);
            }
        });
        getContentPane().add(btnGetAttemptsPendingReview);
        btnGetAttemptsPendingReview.setBounds(20, 300, 187, 23);

        btnGetUsers.setText("Get Users");
        btnGetUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetUsersActionPerformed(evt);
            }
        });
        getContentPane().add(btnGetUsers);
        btnGetUsers.setBounds(20, 330, 190, 23);

        jTextField1.setText("txtVideosPath");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(20, 640, 140, 22);

        btnPauseResumeVideo.setText("Pause/Resume");
        btnPauseResumeVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPauseResumeVideoActionPerformed(evt);
            }
        });
        getContentPane().add(btnPauseResumeVideo);
        btnPauseResumeVideo.setBounds(20, 610, 120, 23);

        btnLoadFile.setText("Load Video");
        btnLoadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadFileActionPerformed(evt);
            }
        });
        getContentPane().add(btnLoadFile);
        btnLoadFile.setBounds(20, 580, 110, 23);

        pnlUsers.setBorder(javax.swing.BorderFactory.createTitledBorder("Users"));
        getContentPane().add(pnlUsers);
        pnlUsers.setBounds(20, 370, 170, 130);
        getContentPane().add(pnlAttempts);
        pnlAttempts.setBounds(230, 290, 460, 200);

        jMenu1.setText("File");

        itmExit.setText("Exit");
        itmExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExitActionPerformed(evt);
            }
        });
        jMenu1.add(itmExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        itmAbout.setText("About");
        itmAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAboutActionPerformed(evt);
            }
        });
        jMenu2.add(itmAbout);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        Main main = new Main();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogOutActionPerformed

    //Los dos métodos siguientes permiten obtener una lista que se muestra en el mismo panel
    //O bien, una de intentos pendientes de revisión o una de usuarios
    private void btnGetAttemptsPendingReviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetAttemptsPendingReviewActionPerformed
        
        ArrayList<Intent> intents = da.getAttemptsPendingReview();
        pnlAttempts.setLayout(new BoxLayout(pnlAttempts, BoxLayout.PAGE_AXIS));
        DefaultListModel dfmu = new DefaultListModel<>();
        for (Intent i : intents) {
            //dfmu.addElement(i);
            FitnessExerciseComponent fec = new FitnessExerciseComponent();
            fec.setPreferredSize(new Dimension(300,90));
            

            fec.setExerciseName(i.getNomExercici());
            fec.setExerciseUserName(i.getNomUsuari());
            
            pnlAttempts.add(fec);
            
            fec.setVisible(true);

        }
        
        pnlAttempts.revalidate();
        pnlAttempts.repaint();
        //lstAttemptsPendingReview.removeAll();
        //lstAttemptsPendingReview.setModel(dfmu);
    }//GEN-LAST:event_btnGetAttemptsPendingReviewActionPerformed

    private void btnGetUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetUsersActionPerformed
        pnlUsers.setViewportView(lstUsuaris);
        ArrayList<Usuari> usuaris = da.getAllUsers();
        DefaultListModel dfmu = new DefaultListModel<>();
        for (Usuari u : usuaris) {
            dfmu.addElement(u);
        }
        lstUsuaris.removeAll();
        lstUsuaris.setModel(dfmu);
    }//GEN-LAST:event_btnGetUsersActionPerformed

    //Este método servía para cargar manualmente el video asociado al intento seleccionado
    //Ahora se reproduce automáticamente, pero he decidido dejarlo.
    private void btnLoadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadFileActionPerformed
//        pnlPendingReviewsUsers.setViewportView(lstVideos);
//        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
//        int result = fileChooser.showOpenDialog(this);
        if (videoFile != null) {
            jTextField1.setText(videoFile);
            String videoLocation = userName + "\\AppData\\Local\\ValadoFitnessHack\\videos\\" + videoFile;
            mediaPlayer.mediaPlayer().media().play(videoLocation);
            isPlaying = true;
            btnPauseResumeVideo.setText("Pause");
//            File[] videos = videosFolder.listFiles();
//            DefaultListModel dlm = new DefaultListModel();
//            for (int i=0; i<videos.length;i++){
//                File video = new File(videos[i].getAbsolutePath());
//                if(video.isFile()){
//                    dlm.addElement(video.getName());
//                }
//            }
//            lstVideos.removeAll();
//            lstVideos.setModel(dlm);
        } else {
            JOptionPane.showMessageDialog(this, "Error: an attempt has not been selected");
        }
    }//GEN-LAST:event_btnLoadFileActionPerformed

    //Métodos de botones:
    //Pausar/Reanudar
    private void btnPauseResumeVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPauseResumeVideoActionPerformed
        if (isPlaying) {
            mediaPlayer.mediaPlayer().controls().pause();
            isPlaying = false;
            btnPauseResumeVideo.setText("Resume");
        } else {
            mediaPlayer.mediaPlayer().controls().start();
            isPlaying = true;
            btnPauseResumeVideo.setText("Pause");
        }
    }//GEN-LAST:event_btnPauseResumeVideoActionPerformed

    //Revisar un intento
    private void btnReviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReviewActionPerformed
        isReview = true;
        ReviewDialog reviewDialog = new ReviewDialog(this, true);
        reviewDialog.setIntent(selectedIntent);
        reviewDialog.setReviewer(instructor);
        reviewDialog.setVisible(true);

    }//GEN-LAST:event_btnReviewActionPerformed

    //Borrar un intento
    private void btnDeleteReviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteReviewActionPerformed
        da.deleteReview(selectedIntent);
        checkReview(selectedIntent);
    }//GEN-LAST:event_btnDeleteReviewActionPerformed

    //Editar un intento
    private void btnEditReviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditReviewActionPerformed
        isReview = false;
        ReviewDialog reviewDialog = new ReviewDialog(this, true);
        reviewDialog.setIntent(selectedIntent);
        reviewDialog.setReviewer(instructor);
        reviewDialog.setVisible(true);


    }//GEN-LAST:event_btnEditReviewActionPerformed

    //Métodos del menú:
    private void itmExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_itmExitActionPerformed

    private void itmAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAboutActionPerformed
        JOptionPane.showMessageDialog(this, "Realizado por Albert Valado Pujol\n"
                + "\n"
                + "Se ha resuelto un primer problema de conexión entre Netbeans y la base de datos buscando el error arrojado por la build en Google\n"
                + "y usando el siguiente enlace: https://es.stackoverflow.com/questions/32148/error-al-conectar-netbeans-con-una-base-de-datos-de-sql-server-2008\n"
                + "\n"
                + "Otra problemática recurrente ha sido la comunicación entre las distintas views y sus respectivos dialogs, en particular\n"
                + "a la hora de pasar información. En general, esto ha sido resuelto a través de la parametrización de la información y el uso de getters/setters. \n"
                + "El principal punto en el que se ha tenido este problema ha sido a la hora de mantener un único JDialog para los métodos de crear una\n"
                + "review y de actualizarla, para pasar información acerca de qué botones mostrar. La solución fue usar un parámetro de la ventana padre. \n"
                + "\n"
                + "Por algú motivo, añadir las imágenes al main, da error al compilar. \n"
                + "\n"
                + "Icono del login: https://www.flaticon.com/free-icons/login created by Freepik - Flaticon\n"
                + "Logo de la aplicación por gentileza de Tófol Martínez Lorenzo");
    }//GEN-LAST:event_itmAboutActionPerformed

    //Métodos para ejecutar las distintas tareas al seleccionar un valor de una lista
    //Mostrar la información, reproducir vídeos, etc...
    private void lstAttemptsPendingReviewValueChanged(javax.swing.event.ListSelectionEvent evt) {
        if (evt.getValueIsAdjusting()) {
            return;
        }

        selectedIntent = lstAttemptsPendingReview.getSelectedValue();
        txtInfo.setText(selectedIntent.toString());

        String blobName = lstAttemptsPendingReview.getSelectedValue().getVideofile();
        BlobClient blobClient = new BlobClientBuilder().connectionString(connectStr)
                .blobName(blobName)
                .containerName(containerName)
                .buildClient();

        //videoFile = selectedIntent.getVideofile();
        checkReview(selectedIntent);
        jTextField1.setText(blobName);

        String downloadPath = tempDir + File.separator + blobName;
        //String videoLocation = userName + "\\AppData\\Local\\ValadoFitnessHack\\videos\\" + videoFile;
        blobClient.downloadToFile(downloadPath);

        mediaPlayer.mediaPlayer().media().play(downloadPath);
        isPlaying = true;
        btnPauseResumeVideo.setText("Pause");

    }

    private void lstUsuarisValueChanged(javax.swing.event.ListSelectionEvent evt) {
        if (evt.getValueIsAdjusting()) {
            return;
        }
        Usuari selectedUser = lstUsuaris.getSelectedValue();
        txtInfo.setText(selectedUser.getId() + ": " + selectedUser);
        ArrayList<Intent> intents = da.getAttemptsPerUser(selectedUser);

        //pnlAttempts.setViewportView(lstAttemptsPerUser);
        DefaultListModel dfmu = new DefaultListModel<>();
        for (Intent i : intents) {
            dfmu.addElement(i);
        }
        lstAttemptsPerUser.removeAll();
        lstAttemptsPerUser.setModel(dfmu);
    }

    private void lstAttemptsPerUserValueChanged(javax.swing.event.ListSelectionEvent evt) {
        if (evt.getValueIsAdjusting()) {
            return;
        }
        selectedIntent = lstAttemptsPerUser.getSelectedValue();
        txtInfo.setText(selectedIntent.toString());
        videoFile = selectedIntent.getVideofile();
        checkReview(selectedIntent);
        jTextField1.setText(videoFile);
        String videoLocation = userName + "\\AppData\\Local\\ValadoFitnessHack\\videos\\" + videoFile;
        mediaPlayer.mediaPlayer().media().play(videoLocation);
        isPlaying = true;
        btnPauseResumeVideo.setText("Pause");
    }

    //Método de prueba mientras probaba el funcionamiento del vlc
    private void lstVideosValueChanged(javax.swing.event.ListSelectionEvent evt) {
//        if (evt.getValueIsAdjusting()) {
//            return;
//        }
//        String videoFileFolder = fileChooser.getSelectedFile().getAbsolutePath();
//        String videoFileAbsolutePath = videoFileFolder + "\\" + lstVideos.getSelectedValue();
//        mediaPlayer.mediaPlayer().media().play(videoFileAbsolutePath);
//        isPlaying = true;
//        btnPauseResumeVideo.setText("Pause");

    }

    //Método que comprueba si existe o no una review para mostrar los botones correspondientes
    private void checkReview(Intent intent) {
        Review review = da.getAttemptReview(intent.getId());
        if (review.getId() == 0) {
            btnReview.setVisible(true);
            btnEditReview.setVisible(false);
            btnDeleteReview.setVisible(false);
        } else {
            btnReview.setVisible(false);
            btnEditReview.setVisible(true);
            btnDeleteReview.setVisible(true);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InstructorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InstructorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InstructorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InstructorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InstructorView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteReview;
    private javax.swing.JButton btnEditReview;
    private javax.swing.JButton btnGetAttemptsPendingReview;
    private javax.swing.JButton btnGetUsers;
    private javax.swing.JButton btnLoadFile;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnPauseResumeVideo;
    private javax.swing.JButton btnReview;
    private avp.fitnessexercisecomponent.FitnessExerciseComponent fitnessExerciseComponent2;
    private javax.swing.JMenuItem itmAbout;
    private javax.swing.JMenuItem itmExit;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JScrollPane pnlAttempts;
    private javax.swing.JScrollPane pnlUsers;
    private javax.swing.JPanel pnlVideoPlayer;
    private javax.swing.JTextField txtInfo;
    // End of variables declaration//GEN-END:variables
}
