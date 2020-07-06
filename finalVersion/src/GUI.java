
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GUI extends javax.swing.JFrame {

    int src, Dest;
    ArrayList<JPanel> panels = new ArrayList<>();

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputs = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        NumberOfVertices = new javax.swing.JTextField();
        nameVertice = new javax.swing.JTextField();
        NumberOfEdges = new javax.swing.JTextField();
        FromVerticeToVertice = new javax.swing.JTextField();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jLabel5 = new javax.swing.JLabel();
        weight = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        source = new javax.swing.JTextField();
        maximumFlowDirected = new javax.swing.JButton();
        output = new javax.swing.JTextField();
        dest = new javax.swing.JTextField();
        DijkstraDirected = new javax.swing.JButton();
        result = new javax.swing.JLabel();
        maximumFlowUnDirectedGraph = new javax.swing.JButton();
        DijkstrauUnDirectedGraph = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        inputs.setBackground(java.awt.SystemColor.activeCaption);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter Number Of Vertices:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter name Vertice (letters or numbers or both):");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Enter Number Of Edges:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Enter From Vertice To Vertice:");

        NumberOfVertices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumberOfVerticesActionPerformed(evt);
            }
        });

        nameVertice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameVerticeActionPerformed(evt);
            }
        });

        NumberOfEdges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumberOfEdgesActionPerformed(evt);
            }
        });

        FromVerticeToVertice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FromVerticeToVerticeActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Weight of Edges");

        weight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Source - Destination");

        source.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourceActionPerformed(evt);
            }
        });

        maximumFlowDirected.setBackground(java.awt.Color.lightGray);
        maximumFlowDirected.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        maximumFlowDirected.setText("MaximumFlow Directed Graph");
        maximumFlowDirected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maximumFlowDirectedActionPerformed(evt);
            }
        });

        output.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputActionPerformed(evt);
            }
        });

        DijkstraDirected.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        DijkstraDirected.setText("Dijkstra Directed Graph");
        DijkstraDirected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DijkstraDirectedActionPerformed(evt);
            }
        });

        result.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        result.setForeground(new java.awt.Color(255, 255, 255));
        result.setText("Result");

        maximumFlowUnDirectedGraph.setBackground(java.awt.Color.lightGray);
        maximumFlowUnDirectedGraph.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        maximumFlowUnDirectedGraph.setText("MaximumFlow Undirected Graph");
        maximumFlowUnDirectedGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maximumFlowUnDirectedGraphActionPerformed(evt);
            }
        });

        DijkstrauUnDirectedGraph.setBackground(java.awt.Color.lightGray);
        DijkstrauUnDirectedGraph.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        DijkstrauUnDirectedGraph.setText("Dijkstra Undirected Graph");
        DijkstrauUnDirectedGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DijkstrauUnDirectedGraphActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inputsLayout = new javax.swing.GroupLayout(inputs);
        inputs.setLayout(inputsLayout);
        inputsLayout.setHorizontalGroup(
            inputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputsLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(300, 300, 300)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(inputsLayout.createSequentialGroup()
                        .addGroup(inputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(inputsLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(inputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(maximumFlowUnDirectedGraph, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DijkstrauUnDirectedGraph, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(inputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FromVerticeToVertice)
                            .addComponent(NumberOfEdges)
                            .addComponent(nameVertice)
                            .addComponent(NumberOfVertices)
                            .addComponent(weight)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputsLayout.createSequentialGroup()
                                .addComponent(source, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addComponent(dest, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(output)
                            .addComponent(DijkstraDirected, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(maximumFlowDirected, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(69, Short.MAX_VALUE))))
        );
        inputsLayout.setVerticalGroup(
            inputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(inputsLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(inputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NumberOfVertices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(inputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameVertice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(46, 46, 46)
                .addGroup(inputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumberOfEdges, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(38, 38, 38)
                .addGroup(inputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(inputsLayout.createSequentialGroup()
                        .addGroup(inputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(inputsLayout.createSequentialGroup()
                                .addComponent(FromVerticeToVertice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addGroup(inputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(weight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(inputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(source, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6))
                .addGap(30, 30, 30)
                .addGroup(inputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(inputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maximumFlowDirected)
                    .addComponent(maximumFlowUnDirectedGraph))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(inputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DijkstraDirected)
                    .addComponent(DijkstrauUnDirectedGraph))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inputs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inputs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NumberOfVerticesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumberOfVerticesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumberOfVerticesActionPerformed

    private void nameVerticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameVerticeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameVerticeActionPerformed

    private void NumberOfEdgesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumberOfEdgesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumberOfEdgesActionPerformed

    private void FromVerticeToVerticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FromVerticeToVerticeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FromVerticeToVerticeActionPerformed

    private void weightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weightActionPerformed

    private void sourceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sourceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sourceActionPerformed


    private void outputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_outputActionPerformed

    private void DijkstraDirectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DijkstraDirectedActionPerformed
        // TODO add your handling code here
        graph GRaph = new directedGraph();
        graphFrame graphFrame = new graphFrame();
        controller(GRaph, "Dijkstra", "directed");
        graphFrame.setFrameTitle("Dijkstra", " Directed Graph");
        graphFrame.setPanels(panels);
        graphFrame.setVisible(true);
        graphFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        panels.clear();

    }//GEN-LAST:event_DijkstraDirectedActionPerformed

    private void DijkstrauUnDirectedGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DijkstrauUnDirectedGraphActionPerformed
        // TODO add your handling code here:
        graph GRaph = new undirectedGraph();
        graphFrame graphFrame = new graphFrame();

        //JPanel inputPanel =new JPanel();
        controller(GRaph, "Dijkstra", "undirected");
        graphFrame.setFrameTitle("Dijkstra", " UnDirected Graph");
        graphFrame.setPanels(panels);
        // inputPanel.add(panels.get(0));//, BorderLayout.CENTER);
        graphFrame.setVisible(true);
       
     // DISPOSE_ON_CLOSE (the default for JinternalFrame);
      //Graph.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       graphFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        panels.clear();

    }//GEN-LAST:event_DijkstrauUnDirectedGraphActionPerformed

    private void maximumFlowUnDirectedGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maximumFlowUnDirectedGraphActionPerformed
        // TODO add your handling code here:

        graph GRaph = new undirectedGraph();
        graphFrame graphFrame = new graphFrame();
        controller(GRaph, "MaximumFlow", "undirected");
        graphFrame.setFrameTitle("MaximumFlow", " UnDirected Graph");
        graphFrame.setPanels(panels);
        graphFrame.setVisible(true);
        graphFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        panels.clear();

    }//GEN-LAST:event_maximumFlowUnDirectedGraphActionPerformed

    private void maximumFlowDirectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maximumFlowDirectedActionPerformed
        // TODO add your handling code here:
        graph GRaph = new directedGraph();
        graphFrame graphFrame = new graphFrame();
        controller(GRaph, "MaximumFlow", "directed");
        graphFrame.setFrameTitle("MaximumFlow", " Directed Graph");
        graphFrame.setPanels(panels);
        graphFrame.setVisible(true);
        graphFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        panels.clear();

    }//GEN-LAST:event_maximumFlowDirectedActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         String clear = "";
         FromVerticeToVertice.setText(clear);
         NumberOfEdges.setText(clear);
         NumberOfVertices.setText(clear);
         dest.setText(clear);
         nameVertice.setText(clear);
         output.setText(clear);
         source.setText(clear);
         weight.setText(clear);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void controller(graph GRaph, String frameTitle1, String frameTitle2) {

        int numVertices, numEdges;
        String name, edges, w;
        String[] we;

        // get Vertices and number of vertices 
        name = nameVertice.getText();

        try {
            numVertices = Integer.parseInt(NumberOfVertices.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "unvalid vertices Number, PLEASE Enter a valid one", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String[] NameOfVertices = new String[numVertices];
        NameOfVertices = name.split(" ");
        List<String> ListVertex = Arrays.asList(NameOfVertices);

        // Get number of edges and edges 
        try {
            numEdges = Integer.parseInt(NumberOfEdges.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "unvalid Edges Number,  PLEASE Enter a valid one", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String[] Edges = new String[numEdges];
        edges = FromVerticeToVertice.getText();
        Edges = edges.split(" ");

        // Get weight 
        w = weight.getText();
        we = w.split(" ");

        GRaph.setVertixNo(numVertices);
        GRaph.setListVertix(ListVertex);
        GRaph.generateRepMatrix(Edges, we);

        String s, d;
        s = source.getText();
        src = ListVertex.indexOf(s);

        panels.add(GRaph.drawGraph(null));

        String Result;

        if (frameTitle1.equals("MaximumFlow")) {

            d = dest.getText();
            Dest = ListVertex.indexOf(d);

            MaxFlow maxFlow = new MaxFlow();
            Result = Integer.toString(maxFlow.fordFulkerson(GRaph.repMatrix, src, Dest, NumberOfVertices, ListVertex, frameTitle2, Edges, panels));
        } else {

            Dijkstra t = new Dijkstra();
            Result = Arrays.toString(t.dijkstra(GRaph.repMatrix, src, numVertices, ListVertex, frameTitle2, Edges, panels));

        }

        output.setText(Result);
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             new homePadge().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DijkstraDirected;
    private javax.swing.JButton DijkstrauUnDirectedGraph;
    private javax.swing.JTextField FromVerticeToVertice;
    private javax.swing.JTextField NumberOfEdges;
    private javax.swing.JTextField NumberOfVertices;
    private javax.swing.JTextField dest;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JPanel inputs;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton maximumFlowDirected;
    private javax.swing.JButton maximumFlowUnDirectedGraph;
    private javax.swing.JTextField nameVertice;
    private javax.swing.JTextField output;
    private javax.swing.JLabel result;
    private javax.swing.JTextField source;
    private javax.swing.JTextField weight;
    // End of variables declaration//GEN-END:variables

}
