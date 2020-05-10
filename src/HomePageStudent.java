import javax.swing.*;

public class HomePageStudent extends javax.swing.JFrame {
    public HomePageStudent() {
        initComponents();
    }
 ////////don't bother about this part//////////////////////////////////////////////////////////////////////
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        closeButton = new javax.swing.JLabel();
        minButton = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        bookOp = new javax.swing.JLabel();
        displayBorrowedBookList = new javax.swing.JPanel();
        function1 = new javax.swing.JLabel();
        borrowBook = new javax.swing.JPanel();
        function2 = new javax.swing.JLabel();
        returnBook = new javax.swing.JPanel();
        function3 = new javax.swing.JLabel();
        searchBook = new javax.swing.JPanel();
        funtion4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        studentOp = new javax.swing.JLabel();
        displayBookingDetails = new javax.swing.JPanel();
        function5 = new javax.swing.JLabel();
        bookingRoom = new javax.swing.JPanel();
        function7 = new javax.swing.JLabel();
        displayRoomList = new javax.swing.JPanel();
        function6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        welcome = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

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
                .addGap(72, 72, 72)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(minButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(247, 212, 190));

        bookOp.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bookOp.setForeground(new java.awt.Color(50, 50, 50));
        bookOp.setText("Book Operation");

        displayBorrowedBookList.setBackground(new java.awt.Color(247, 151, 84));
        displayBorrowedBookList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                displayBorrowedBookListMouseClicked(evt);
            }
        });

        function1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        function1.setForeground(new java.awt.Color(50, 50, 50));
        function1.setText("Display Borrowed Book");

        javax.swing.GroupLayout displayBorrowedBookListLayout = new javax.swing.GroupLayout(displayBorrowedBookList);
        displayBorrowedBookList.setLayout(displayBorrowedBookListLayout);
        displayBorrowedBookListLayout.setHorizontalGroup(
            displayBorrowedBookListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayBorrowedBookListLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(function1)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        displayBorrowedBookListLayout.setVerticalGroup(
            displayBorrowedBookListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayBorrowedBookListLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(function1)
                .addGap(26, 26, 26))
        );

        borrowBook.setBackground(new java.awt.Color(247, 151, 84));
        borrowBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                borrowBookMouseClicked(evt);
            }
        });

        function2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        function2.setForeground(new java.awt.Color(50, 50, 50));
        function2.setText("Borrow Book");

        javax.swing.GroupLayout borrowBookLayout = new javax.swing.GroupLayout(borrowBook);
        borrowBook.setLayout(borrowBookLayout);
        borrowBookLayout.setHorizontalGroup(
            borrowBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, borrowBookLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(function2)
                .addGap(131, 131, 131))
        );
        borrowBookLayout.setVerticalGroup(
            borrowBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, borrowBookLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(function2)
                .addGap(25, 25, 25))
        );

        returnBook.setBackground(new java.awt.Color(247, 151, 84));
        returnBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnBookMouseClicked(evt);
            }
        });

        function3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        function3.setForeground(new java.awt.Color(50, 50, 50));
        function3.setText("Return Book");

        javax.swing.GroupLayout returnBookLayout = new javax.swing.GroupLayout(returnBook);
        returnBook.setLayout(returnBookLayout);
        returnBookLayout.setHorizontalGroup(
            returnBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(returnBookLayout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(function3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        returnBookLayout.setVerticalGroup(
            returnBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, returnBookLayout.createSequentialGroup()
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
            .addGroup(searchBookLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(funtion4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        searchBookLayout.setVerticalGroup(
            searchBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchBookLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(funtion4)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(bookOp)
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(displayBorrowedBookList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(borrowBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(returnBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(49, 49, 49))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bookOp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(displayBorrowedBookList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(borrowBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(returnBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(181, 223, 226));

        studentOp.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        studentOp.setForeground(new java.awt.Color(50, 50, 50));
        studentOp.setText("Student Operation");

        displayBookingDetails.setBackground(new java.awt.Color(31, 155, 173));
        displayBookingDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                displayBookingDetailsMouseClicked(evt);
            }
        });

        function5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        function5.setForeground(new java.awt.Color(50, 50, 50));
        function5.setText("Display Booking Details");

        javax.swing.GroupLayout displayBookingDetailsLayout = new javax.swing.GroupLayout(displayBookingDetails);
        displayBookingDetails.setLayout(displayBookingDetailsLayout);
        displayBookingDetailsLayout.setHorizontalGroup(
            displayBookingDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayBookingDetailsLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(function5)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        displayBookingDetailsLayout.setVerticalGroup(
            displayBookingDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayBookingDetailsLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(function5)
                .addGap(26, 26, 26))
        );

        bookingRoom.setBackground(new java.awt.Color(31, 155, 173));
        bookingRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookingRoomMouseClicked(evt);
            }
        });

        function7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        function7.setForeground(new java.awt.Color(50, 50, 50));
        function7.setText("Booking Room");

        javax.swing.GroupLayout bookingRoomLayout = new javax.swing.GroupLayout(bookingRoom);
        bookingRoom.setLayout(bookingRoomLayout);
        bookingRoomLayout.setHorizontalGroup(
            bookingRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookingRoomLayout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addComponent(function7)
                .addGap(107, 107, 107))
        );
        bookingRoomLayout.setVerticalGroup(
            bookingRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookingRoomLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(function7)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        displayRoomList.setBackground(new java.awt.Color(31, 155, 173));
        displayRoomList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                displayRoomListMouseClicked(evt);
            }
        });

        function6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        function6.setForeground(new java.awt.Color(50, 50, 50));
        function6.setText("Display Room List");

        javax.swing.GroupLayout displayRoomListLayout = new javax.swing.GroupLayout(displayRoomList);
        displayRoomList.setLayout(displayRoomListLayout);
        displayRoomListLayout.setHorizontalGroup(
            displayRoomListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayRoomListLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(function6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        displayRoomListLayout.setVerticalGroup(
            displayRoomListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayRoomListLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(function6)
                .addGap(26, 26, 26))
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
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bookingRoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(displayBookingDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(displayRoomList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(studentOp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(bookingRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(displayBookingDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(displayRoomList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        jPanel2.setBackground(new java.awt.Color(230, 240, 240));

        welcome.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        welcome.setForeground(new java.awt.Color(50, 50, 50));
        welcome.setText("Welcome Student, Have a Nice Day");

        logoutButton.setBackground(new java.awt.Color(219, 116, 116));
        logoutButton.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(50, 50, 50));
        logoutButton.setText("Log Out");
        logoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(logoutButton)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(welcome)
                        .addGap(280, 280, 280))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(welcome)
                .addGap(18, 18, 18)
                .addComponent(logoutButton)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

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

    private void displayBorrowedBookListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayBorrowedBookListMouseClicked

    }//GEN-LAST:event_displayBorrowedBookListMouseClicked

    private void borrowBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrowBookMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_borrowBookMouseClicked

    private void returnBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnBookMouseClicked

    }//GEN-LAST:event_returnBookMouseClicked

    private void searchBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBookMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBookMouseClicked

    private void displayBookingDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayBookingDetailsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_displayBookingDetailsMouseClicked

    private void bookingRoomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingRoomMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bookingRoomMouseClicked

    private void displayRoomListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayRoomListMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_displayRoomListMouseClicked


      //accesors and functions that use to return value to main program
    public JButton getLogoutButton(){
        return logoutButton;
    }

    public JPanel getBorrowedBookListPanel(){
        return displayBorrowedBookList;
    }
    public JPanel getBorrowBookPanel(){
        return borrowBook;
    }
    public JPanel getReturnBookPanel(){
        return returnBook;
    }
    public JPanel getBookingRoomPanel(){
        return bookingRoom;
    }
    public JPanel getBookingDetailsPanel(){
        return displayBookingDetails;
    }
    public JPanel getSearchBookPanel(){
        return searchBook;
    }
    public JPanel getDisplayRoomPanel(){
        return displayRoomList;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bookOp;
    private javax.swing.JPanel bookingRoom;
    private javax.swing.JPanel borrowBook;
    private javax.swing.JLabel closeButton;
    private javax.swing.JPanel displayBookingDetails;
    private javax.swing.JPanel displayBorrowedBookList;
    private javax.swing.JPanel displayRoomList;
    private javax.swing.JLabel function1;
    private javax.swing.JLabel function2;
    private javax.swing.JLabel function3;
    private javax.swing.JLabel function5;
    private javax.swing.JLabel function6;
    private javax.swing.JLabel function7;
    private javax.swing.JLabel funtion4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel minButton;
    private javax.swing.JPanel returnBook;
    private javax.swing.JPanel searchBook;
    private javax.swing.JLabel studentOp;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}