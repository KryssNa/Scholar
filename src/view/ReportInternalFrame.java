/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import view.*;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import database.DbConnection;
import java.awt.Color;
import java.awt.Font;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.sql.*;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Iqbal-Asi
 */
public class ReportInternalFrame extends javax.swing.JInternalFrame {
Connection conn=DbConnection.getconnection();
PreparedStatement pst;
ResultSet rs;
    /**
     * Creates new form ReportInternalFrame
     */
    public ReportInternalFrame() {
        initComponents();
        conn = DbConnection.getconnection();
        
        
        //title
        setTitle("Reporting Panel");        
        
//        teacherCombo();
//        
//        //Calling Method
//        getDataInTable();
//        
        //All Batch Attendance Table Data
        BatchAttendance();
        
        // Applying white color while selection mode        
//        jTableBS.setSelectionForeground(Color.WHITE);
//        jTableDate.setSelectionForeground(Color.WHITE);
        jTableForAllBatch.setSelectionForeground(Color.WHITE);
//        jTableBatchwithCustomized.setSelectionForeground(Color.WHITE);
        
        //Getting DateWise Batch Attendance
//        dateWiseBatch();
        
    }
    
    
    
    /**
     * Filling batch code combo for DAte Wise PAnel
    */
//    public void dateWiseBatch(){
//        try{
//             ResultSet rs = c.xc.createStatement().executeQuery("select batch_code from tbl_batch");
//             while (rs.next()){
//                 jComboBoxBatch.addItem(rs.getString(1));
//             }
//        }
//        catch(Exception ex) {
//            System.out.println(ex.toString());
//        }
//    } 

    /**
     * Teacher Combo in Student and Batch Wise Panel
     */
//    public void teacherCombo(){
//        try {
//             ResultSet rs = c.st.executeQuery("select teacher_name from tbl_teacher");
//             while(rs.next()){
//                 jTeacherCombo.addItem(rs.getString(1));
//             }
//        }
//        catch(Exception ex){
//            System.out.println(ex.toString());
//        }
//       
//    }
    
    /**
     * Getting Data in table All Batches Attendance with Customized Date
     */
//    public void getDataInTable(){
//        /**
//         * Clearing Rows from Table
//         */
//        
////        DefaultTableModel dm = (DefaultTableModel) jTableDate.getModel();
////        int rowCount = dm.getRowCount();
////        //Remove rows one by one from the end of the table
////        for (int i = rowCount - 1; i >= 0; i--) {
////           dm.removeRow(i);
////        }
//        
//        
//         /**
//          * Filling table
//          */
////         try {
////             DefaultTableModel dt = (DefaultTableModel)jTableDate.getModel();
////             
////             ResultSet rs = c.st.executeQuery("select attend_date as 'Attendance Date', std_id as 'Student ID', std_name as 'Student Name' , std_batch_code as 'Batch Code', std_book as 'Book', std_book_session as 'Book Session', std_status as 'Status' from std_attend");
////            while(rs.next()){
////                dt.addRow(new Object[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)});
////            }
////            jTableDate.setModel(dt);
////         }
////         catch(Exception ex){
////             System.out.println(ex.toString());
////         }
   
//    
//    
    //BSPanel Absent Present
//    public void BSPresentAbsent(){
//        try {
//            ResultSet pre = c.st.executeQuery("select count(std_status) from std_attend where std_status = 'Present' and std_batch_code = '"+jBatchCodeCombo.getSelectedItem()+"'");
//                while(pre.next()){
//                    jLabelBGPresent.setText(pre.getString(1));
//                }
//            ResultSet abs = c.st.executeQuery("select count(std_status) from std_attend where std_status = 'Absent' and std_batch_code = '"+jBatchCodeCombo.getSelectedItem()+"'");
//                while(abs.next()){
//                    jLabelBSAbsent.setText(abs.getString(1));
//                }
//        }
//        catch(Exception ex){
//            System.out.println(ex.toString());
//        }
//    }
    
    /**
     * Fetching table for BatchAttendance Panel
     */
    public void BatchAttendance(){
        try {
            DefaultTableModel dt = (DefaultTableModel)jTableForAllBatch.getModel();
            
            pst=conn.prepareStatement("select * from std_attend");
            ResultSet rs = pst.executeQuery();
            while (rs.next()){
                dt.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)});
            }
            jTableForAllBatch.setModel(dt);
        }
        catch(Exception ex) {
            System.out.println(ex.toString());
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableForAllBatch = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jButtonAllBatchExcel = new javax.swing.JButton();
        jButtonAllBatchPDf = new javax.swing.JButton();
        jButtonAllBatchPrint = new javax.swing.JButton();
        jLabelAllBatchAttendanceBG = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(990, 550));
        setMinimumSize(new java.awt.Dimension(990, 550));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(990, 550));
        getContentPane().setLayout(null);

        jPanel3.setLayout(null);

        jScrollPane3.setBorder(null);

        jTableForAllBatch.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jTableForAllBatch.setForeground(new java.awt.Color(240, 240, 240));
        jTableForAllBatch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Assignment Date", "Subject Name", "Batch Number"
            }
        ));
        jTableForAllBatch.setOpaque(false);
        ((DefaultTableCellRenderer)jTableForAllBatch.getDefaultRenderer(Object.class)).setOpaque(false);

        jScrollPane3.setOpaque(false);
        jScrollPane3.getViewport().setOpaque(false);

        jTableForAllBatch.setShowGrid(false);
        jScrollPane3.setViewportView(jTableForAllBatch);

        jPanel3.add(jScrollPane3);
        jScrollPane3.setBounds(40, 122, 860, 350);

        jLabel10.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("All Assignments");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(380, 20, 210, 30);

        jButtonAllBatchExcel.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jButtonAllBatchExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/excel.png"))); // NOI18N
        jButtonAllBatchExcel.setBorderPainted(false);
        jButtonAllBatchExcel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAllBatchExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAllBatchExcelActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonAllBatchExcel);
        jButtonAllBatchExcel.setBounds(190, 70, 110, 30);

        jButtonAllBatchPDf.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jButtonAllBatchPDf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/pdf.png"))); // NOI18N
        jButtonAllBatchPDf.setBorderPainted(false);
        jButtonAllBatchPDf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAllBatchPDf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAllBatchPDfActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonAllBatchPDf);
        jButtonAllBatchPDf.setBounds(430, 70, 110, 30);

        jButtonAllBatchPrint.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jButtonAllBatchPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/Printer.png"))); // NOI18N
        jButtonAllBatchPrint.setBorderPainted(false);
        jButtonAllBatchPrint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAllBatchPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAllBatchPrintActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonAllBatchPrint);
        jButtonAllBatchPrint.setBounds(650, 70, 110, 30);

        jLabelAllBatchAttendanceBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/FrameBG.png"))); // NOI18N
        jPanel3.add(jLabelAllBatchAttendanceBG);
        jLabelAllBatchAttendanceBG.setBounds(0, 0, 960, 510);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 970, 510);

        setBounds(0, 0, 990, 550);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAllBatchPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAllBatchPrintActionPerformed
        // TODO add your handling code here:

        /**
        * Printing Report
        */
        try {
            MessageFormat h = new MessageFormat("Attendance Record \n All Batches Report");
            MessageFormat f = new MessageFormat("Attendance Management System");

            jTableForAllBatch.print(JTable.PrintMode.FIT_WIDTH, h, f);
        }
        catch(Exception ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_jButtonAllBatchPrintActionPerformed

    private void jButtonAllBatchPDfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAllBatchPDfActionPerformed
        // TODO add your handling code here:

        /**
        * Reporting in PDF File
        */
        try {
            //BaseColor(7, 20, 42)
            Rectangle pageSize = new Rectangle(PageSize.A4.rotate());
            pageSize.setBackgroundColor(new BaseColor(135 ,206 ,250));
            pageSize.setBorder(Rectangle.BOX);
            pageSize.setBorderWidth(10f);
            Document doc = new Document(pageSize);
            PdfWriter.getInstance(doc, new FileOutputStream("AllBatchAttendanceReport.pdf"));
            doc.open();

            doc.add(new Paragraph("All Batches Attendance", FontFactory.getFont("Candara", 35, Font.BOLD, BaseColor.BLACK)));
            doc.add(new Paragraph(20f, Chunk.NEWLINE));

            jTableForAllBatch.setForeground(Color.WHITE);
            PdfPTable pdfTable = new PdfPTable(jTableForAllBatch.getColumnCount());
            //adding table headers
            for (int i = 0; i < jTableForAllBatch.getColumnCount(); i++) {
                pdfTable.addCell(jTableForAllBatch.getColumnName(i));
            }
            //extracting data from the jTableForAllBatch and inserting it to PdfPTable
            for (int rows = 0; rows < jTableForAllBatch.getRowCount(); rows++) {
                for (int cols = 0; cols < jTableForAllBatch.getColumnCount(); cols++) {
                    pdfTable.addCell(jTableForAllBatch.getModel().getValueAt(rows, cols).toString());

                }
            }
            doc.add(pdfTable);
            doc.close();
            JOptionPane.showMessageDialog(null, "Attendance Report Saved");

        }
        catch(Exception ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_jButtonAllBatchPDfActionPerformed

    private void jButtonAllBatchExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAllBatchExcelActionPerformed
        // TODO add your handling code here:

        /**
        * Excel Report
        */

        JFileChooser j = new JFileChooser();
        int i = j.showSaveDialog(this);
        System.out.println(i);
        if (i==0){
            try {
                PrintWriter p = new PrintWriter(j.getSelectedFile()+".csv");

                p.println(jTableForAllBatch.getColumnName(0)+","+jTableForAllBatch.getColumnName(1)+","+jTableForAllBatch.getColumnName(2)+","+jTableForAllBatch.getColumnName(3)+","+jTableForAllBatch.getColumnName(4)+","+jTableForAllBatch.getColumnName(5)+","+jTableForAllBatch.getColumnName(6));

                for (int x = 0; x< jTableForAllBatch.getRowCount();x++){
                    p.println(jTableForAllBatch.getValueAt(x, 0)+","+jTableForAllBatch.getValueAt(x, 1)+","+jTableForAllBatch.getValueAt(x, 2)+","+jTableForAllBatch.getValueAt(x, 3)+","+jTableForAllBatch.getValueAt(x, 4)+","+jTableForAllBatch.getValueAt(x, 5)+","+jTableForAllBatch.getValueAt(x, 6));
                }p.flush();
            }
            catch(Exception ex) {
                System.out.println(ex.toString());
            }
        }
    }//GEN-LAST:event_jButtonAllBatchExcelActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAllBatchExcel;
    private javax.swing.JButton jButtonAllBatchPDf;
    private javax.swing.JButton jButtonAllBatchPrint;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabelAllBatchAttendanceBG;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableForAllBatch;
    // End of variables declaration//GEN-END:variables
}
