import javax.swing.*;

public class HomePageStaff extends javax.swing.JFrame {

    public HomePageStaff() {
        initComponents();
    }
 ////////don't bother about this part//////////////////////////////////////////////////////////////////////
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        closeButton = new javax.swing.JLabel();
        minButton = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        bookOp = new javax.swing.JLabel();
        displayBookList = new javax.swing.JPanel();
        function1 = new javax.swing.JLabel();
        addNewBook = new javax.swing.JPanel();
        function2 = new javax.swing.JLabel();
        removeBook = new javax.swing.JPanel();
        function3 = new javax.swing.JLabel();
        searchBook = new javax.swing.JPanel();
        funtion4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        studentOp = new javax.swing.JLabel();
        displayStudentList = new javax.swing.JPanel();
        function5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        welcome = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1000, 700));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(7, 136, 155));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Library System");

        closeButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        closeButton.setForeground(new java.awt.Color(255, 255, 255));
        closeButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeButton.setText("X");
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });

        minButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        minButton.setForeground(new java.awt.Color(255, 255, 255));
        minButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minButton.setText("-");
        minButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 567, Short.MAX_VALUE)
                .addComponent(minButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(minButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1000, 60);

        jPanel3.setBackground(new java.awt.Color(247, 212, 190));

        bookOp.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bookOp.setForeground(new java.awt.Color(50, 50, 50));
        bookOp.setText("Book Operation");

        displayBookList.setBackground(new java.awt.Color(247, 151, 84));
        displayBookList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                displayBookListMouseClicked(evt);
            }
        });

        function1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        function1.setForeground(new java.awt.Color(50, 50, 50));
        function1.setText("Display Book List");

        javax.swing.GroupLayout displayBookListLayout = new javax.swing.GroupLayout(displayBookList);
        displayBookList.setLayout(displayBookListLayout);
        displayBookListLayout.setHorizontalGroup(
            displayBookListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayBookListLayout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addComponent(function1)
                .addGap(107, 107, 107))
        );
        displayBookListLayout.setVerticalGroup(
            displayBookListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayBookListLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(function1)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        addNewBook.setBackground(new java.awt.Color(247, 151, 84));
        addNewBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addNewBookMouseClicked(evt);
            }
        });

        function2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        function2.setForeground(new java.awt.Color(50, 50, 50));
        function2.setText("Add New Book");

        javax.swing.GroupLayout addNewBookLayout = new javax.swing.GroupLayout(addNewBook);
        addNewBook.setLayout(addNewBookLayout);
        addNewBookLayout.setHorizontalGroup(
            addNewBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addNewBookLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(function2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addNewBookLayout.setVerticalGroup(
            addNewBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addNewBookLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(function2)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        removeBook.setBackground(new java.awt.Color(247, 151, 84));
        removeBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeBookMouseClicked(evt);
            }
        });

        function3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        function3.setForeground(new java.awt.Color(50, 50, 50));
        function3.setText("Remove Book From List");

        javax.swing.GroupLayout removeBookLayout = new javax.swing.GroupLayout(removeBook);
        removeBook.setLayout(removeBookLayout);
        removeBookLayout.setHorizontalGroup(
            removeBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, removeBookLayout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addComponent(function3)
                .addGap(70, 70, 70))
        );
        removeBookLayout.setVerticalGroup(
            removeBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, removeBookLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(function3)
                .addGap(25, 25, 25))
        );

        searchBook.setBackground(new java.awt.Color(247, 151, 84));
        searchBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchBookMouseClicked(evt);
            }
        });

        funtion4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        funtion4.setForeground(new java.awt.Color(50, 50, 50));
        funtion4.setText("Search Book From List");

        javax.swing.GroupLayout searchBookLayout = new javax.swing.GroupLayout(searchBook);
        searchBook.setLayout(searchBookLayout);
        searchBookLayout.setHorizontalGroup(
            searchBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchBookLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(funtion4)
                .addGap(79, 79, 79))
        );
        searchBookLayout.setVerticalGroup(
            searchBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchBookLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(funtion4)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(bookOp)
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(displayBookList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(addNewBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(removeBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(searchBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(49, 49, 49))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bookOp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(displayBookList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addNewBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(removeBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 220, 500, 480);

        jPanel4.setBackground(new java.awt.Color(181, 223, 226));

        studentOp.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        studentOp.setForeground(new java.awt.Color(50, 50, 50));
        studentOp.setText("Student Operation");

        displayStudentList.setBackground(new java.awt.Color(31, 155, 173));
        displayStudentList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                displayStudentListMouseClicked(evt);
            }
        });

        function5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        function5.setForeground(new java.awt.Color(50, 50, 50));
        function5.setText("Display Student List");

        javax.swing.GroupLayout displayStudentListLayout = new javax.swing.GroupLayout(displayStudentList);
        displayStudentList.setLayout(displayStudentListLayout);
        displayStudentListLayout.setHorizontalGroup(
            displayStudentListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayStudentListLayout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(function5)
                .addGap(107, 107, 107))
        );
        displayStudentListLayout.setVerticalGroup(
            displayStudentListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayStudentListLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(function5)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(studentOp))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(displayStudentList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(studentOp)
                .addGap(167, 167, 167)
                .addComponent(displayStudentList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(182, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(500, 220, 500, 480);

        jPanel2.setBackground(new java.awt.Color(230, 240, 240));

        welcome.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        welcome.setForeground(new java.awt.Color(50, 50, 50));
        welcome.setText("Welcome Staff, Have a Nice Day");

        logoutButton.setBackground(new java.awt.Color(219, 116, 116));
        logoutButton.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(50, 50, 50));
        logoutButton.setText("Log Out");
        logoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(302, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(welcome)
                        .addGap(300, 300, 300))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(logoutButton)
                        .addGap(35, 35, 35))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(welcome)
                .addGap(18, 18, 18)
                .addComponent(logoutButton)
                .addContainerGap(511, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 60, 1000, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Interface design code end here/////////////////////////////////////////////////////////////////////////////////

    ///event listener generated
    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeButtonMouseClicked

    private void minButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minButtonMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minButtonMouseClicked

    private void displayBookListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayBookListMouseClicked

    }//GEN-LAST:event_displayBookListMouseClicked

    private void addNewBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addNewBookMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addNewBookMouseClicked

    private void removeBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeBookMouseClicked

    }//GEN-LAST:event_removeBookMouseClicked

    private void displayStudentListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayStudentListMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_displayStudentListMouseClicked

    private void searchBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBookMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBookMouseClicked

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutButtonActionPerformed
//to get the panel at main program
    public JPanel getDisplayBookPanel(){
        return displayBookList;
    }
    public JPanel getDisplayStudentPanel(){
        return displayStudentList;
    }
    public JPanel getRemoveBookPanel(){
        return removeBook;
    }
    public JPanel getAddBookPanel(){
        return addNewBook;
    }
    public JPanel getSearchBookPanel(){
        return searchBook;
    }

    public JButton getLogoutButton(){
        return logoutButton;
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addNewBook;
    private javax.swing.JLabel bookOp;
    private javax.swing.JLabel closeButton;
    private javax.swing.JPanel displayBookList;
    private javax.swing.JPanel displayStudentList;
    private javax.swing.JLabel function1;
    private javax.swing.JLabel function2;
    private javax.swing.JLabel function3;
    private javax.swing.JLabel function5;
    private javax.swing.JLabel funtion4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel minButton;
    private javax.swing.JPanel removeBook;
    private javax.swing.JPanel searchBook;
    private javax.swing.JLabel studentOp;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
