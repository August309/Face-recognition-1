/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NetworkStats.java
 *
 * Created on 2011-11-11, 16:32:33
 */

package views;


import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;

/**
 *
 * @author Qba
 */
public class NetworkStats extends javax.swing.JPanel {



    /** Creates new form NetworkStats */
    public NetworkStats() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminChartPanel1 = new AdminChartPanel();
        currentStatsPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cgsa = new javax.swing.JLabel();
        ctsMSE = new javax.swing.JLabel();
        ctsa = new javax.swing.JLabel();
        cgsMSE = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cva = new javax.swing.JLabel();
        cvMSE = new javax.swing.JLabel();
        BestStatsPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        bgsa = new javax.swing.JLabel();
        btsMSE = new javax.swing.JLabel();
        btsa = new javax.swing.JLabel();
        bgsMSE = new javax.swing.JLabel();
        jlabel12123 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bva = new javax.swing.JLabel();
        bvMSE = new javax.swing.JLabel();
        CurrentSettings = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cPerc = new javax.swing.JLabel();
        cHidden = new javax.swing.JLabel();
        BestSettings = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        bPerc = new javax.swing.JLabel();
        bHidden = new javax.swing.JLabel();
        controlPanel = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        epoch = new javax.swing.JLabel();

        currentStatsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Current", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel1.setText("Training set accuracy");

        jLabel2.setText("Training set MSE");

        jLabel3.setText("Generalization set accuracy");

        jLabel4.setText("Generalization set MSE");

        cgsa.setText("0");

        ctsMSE.setText("0");

        ctsa.setText("0");

        cgsMSE.setText("0");

        jLabel5.setText("Validation set accuracy");

        jLabel6.setText("Validation set MSE");

        cva.setText("0");

        cvMSE.setText("0");

        javax.swing.GroupLayout currentStatsPanelLayout = new javax.swing.GroupLayout(currentStatsPanel);
        currentStatsPanel.setLayout(currentStatsPanelLayout);
        currentStatsPanelLayout.setHorizontalGroup(
            currentStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(currentStatsPanelLayout.createSequentialGroup()
                .addGroup(currentStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(currentStatsPanelLayout.createSequentialGroup()
                        .addGroup(currentStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(currentStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ctsMSE, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(cgsa, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(cgsMSE, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(ctsa, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)))
                    .addGroup(currentStatsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(29, 29, 29)
                        .addGroup(currentStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cvMSE, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                            .addComponent(cva, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)))
                    .addComponent(jLabel6))
                .addContainerGap())
        );
        currentStatsPanelLayout.setVerticalGroup(
            currentStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(currentStatsPanelLayout.createSequentialGroup()
                .addGroup(currentStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ctsa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(currentStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ctsMSE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(currentStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cgsa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(currentStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cgsMSE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(currentStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cva))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(currentStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cvMSE)))
        );

        BestStatsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Best", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel9.setText("Training set accuracy");

        jLabel10.setText("Training set MSE");

        jLabel11.setText("Generalization set accuracy");

        jLabel12.setText("Generalization set MSE");

        bgsa.setText("0");

        btsMSE.setText("0");

        btsa.setText("0");

        bgsMSE.setText("0");

        jlabel12123.setText("Validation set MSE");

        jLabel7.setText("Validation set accuracy");

        bva.setText("0");

        bvMSE.setText("0");

        javax.swing.GroupLayout BestStatsPanelLayout = new javax.swing.GroupLayout(BestStatsPanel);
        BestStatsPanel.setLayout(BestStatsPanelLayout);
        BestStatsPanelLayout.setHorizontalGroup(
            BestStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BestStatsPanelLayout.createSequentialGroup()
                .addGroup(BestStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12)
                    .addComponent(jLabel7)
                    .addComponent(jlabel12123))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BestStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bvMSE, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(bva, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(btsMSE, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(bgsa, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(bgsMSE, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(btsa, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                .addContainerGap())
        );
        BestStatsPanelLayout.setVerticalGroup(
            BestStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BestStatsPanelLayout.createSequentialGroup()
                .addGroup(BestStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(btsa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BestStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(btsMSE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BestStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(bgsa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BestStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(bgsMSE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BestStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(bva))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BestStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel12123)
                    .addComponent(bvMSE)))
        );

        CurrentSettings.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Current", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel17.setText("Hidden layers");

        jLabel18.setText("Perceptrons");

        cPerc.setText("0");

        cHidden.setText("0");

        javax.swing.GroupLayout CurrentSettingsLayout = new javax.swing.GroupLayout(CurrentSettings);
        CurrentSettings.setLayout(CurrentSettingsLayout);
        CurrentSettingsLayout.setHorizontalGroup(
            CurrentSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CurrentSettingsLayout.createSequentialGroup()
                .addGroup(CurrentSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(CurrentSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cHidden, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cPerc, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        CurrentSettingsLayout.setVerticalGroup(
            CurrentSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CurrentSettingsLayout.createSequentialGroup()
                .addGroup(CurrentSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(cHidden))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CurrentSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(cPerc))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BestSettings.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Best", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel25.setText("Hidden layers");

        jLabel26.setText("Perceptrons");

        bPerc.setText("0");

        bHidden.setText("0");

        javax.swing.GroupLayout BestSettingsLayout = new javax.swing.GroupLayout(BestSettings);
        BestSettings.setLayout(BestSettingsLayout);
        BestSettingsLayout.setHorizontalGroup(
            BestSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BestSettingsLayout.createSequentialGroup()
                .addGroup(BestSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BestSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bHidden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bPerc, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BestSettingsLayout.setVerticalGroup(
            BestSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BestSettingsLayout.createSequentialGroup()
                .addGroup(BestSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(bHidden))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BestSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(bPerc))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        controlPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel19.setText("Epoch");

        epoch.setText("0");

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanelLayout.setHorizontalGroup(
        	controlPanelLayout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(Alignment.LEADING, controlPanelLayout.createSequentialGroup()
        			.addComponent(jLabel19)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(epoch, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(526, Short.MAX_VALUE))
        );
        controlPanelLayout.setVerticalGroup(
        	controlPanelLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(controlPanelLayout.createParallelGroup(Alignment.BASELINE)
        			.addComponent(jLabel19)
        			.addComponent(epoch))
        );
        controlPanel.setLayout(controlPanelLayout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(currentStatsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BestStatsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CurrentSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BestSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(controlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(adminChartPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(BestStatsPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(currentStatsPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(BestSettings, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CurrentSettings, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminChartPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(controlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BestSettings;
    private javax.swing.JPanel BestStatsPanel;
    private javax.swing.JPanel CurrentSettings;
    public AdminChartPanel adminChartPanel1;
    private javax.swing.JLabel bHidden;
    private javax.swing.JLabel bPerc;
    private javax.swing.JLabel bgsMSE;
    private javax.swing.JLabel bgsa;
    private javax.swing.JLabel btsMSE;
    private javax.swing.JLabel btsa;
    private javax.swing.JLabel bvMSE;
    private javax.swing.JLabel bva;
    private javax.swing.JLabel cHidden;
    private javax.swing.JLabel cPerc;
    private javax.swing.JLabel cgsMSE;
    private javax.swing.JLabel cgsa;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JLabel ctsMSE;
    private javax.swing.JLabel ctsa;
    private javax.swing.JPanel currentStatsPanel;
    private javax.swing.JLabel cvMSE;
    private javax.swing.JLabel cva;
    public javax.swing.JLabel epoch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jlabel12123;
    // End of variables declaration//GEN-END:variables

    public AdminChartPanel getAdminChartPanel1() {
        return adminChartPanel1;
    }

    public void setAdminChartPanel1(AdminChartPanel adminChartPanel1) {
        this.adminChartPanel1 = adminChartPanel1;
    }


/*
    public void updateCurrent(NetworkStatistics stats){
        NumberFormat format=new DecimalFormat("##0.##");
        

        ctsa.setText(format.format(stats.tsAcc) +"%");
        ctsMSE.setText(format.format(stats.tsMSE));
        cgsa.setText(format.format(stats.gsAcc)+"%");
        cgsMSE.setText(format.format(stats.gsMSE));
        cva.setText(format.format(stats.valAcc)+"%");
        cvMSE.setText(format.format(stats.valMSE));
        cHidden.setText(""+stats.hidden);
        cPerc.setText(""+stats.perceptrons);
    }
    
    public void updateBest(NetworkStatistics stats){
        NumberFormat format=new DecimalFormat("##0.##");
        
        btsa.setText(format.format(stats.tsAcc));
        btsMSE.setText(format.format(stats.tsMSE));
        bgsa.setText(format.format(stats.gsAcc));
        bgsMSE.setText(format.format(stats.gsMSE));
        bva.setText(format.format(stats.valAcc));
        bvMSE.setText(format.format(stats.valMSE));
        bHidden.setText(""+stats.hidden);
        bPerc.setText(""+stats.perceptrons);
        
    }
 */   
    public void setEpoch(int epoch){
        this.epoch.setText(""+epoch);
    }
    
    
}