
import edu.uci.ics.jung.algorithms.layout.CircleLayout;
import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.DirectedSparseGraph;
import edu.uci.ics.jung.visualization.BasicVisualizationServer;
import edu.uci.ics.jung.visualization.GraphZoomScrollPane;
import edu.uci.ics.jung.visualization.VisualizationViewer;
import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;
import java.awt.Color;
import java.awt.Dimension;
import java.util.List;

import org.apache.commons.collections15.Transformer;
import java.awt.Font;
import java.awt.Paint;
import javax.swing.JPanel;




public class directedGraph extends graph {

    Graph<String, String> graph = new DirectedSparseGraph();
   
    
    @Override
    void generateRepMatrix(String[] Edges, String[] weight) {

        // Convert Names to integer
        adjMatrix = new boolean[numVertices][numVertices];
        repMatrix = new int[numVertices][numVertices];
 
        int m = 0;
        for (int j = 0; j < Edges.length; j += 2) {

         int fromVertex, toVertex;
        fromVertex = ListVertex.indexOf(Edges[j]);
            toVertex = ListVertex.indexOf(Edges[j + 1]);
        adjMatrix[fromVertex][toVertex] = true;
        repMatrix[fromVertex][toVertex] = Integer.parseInt(weight[m]);
         addEdge(weight[m], (m++),Edges[j], Edges[j + 1]);

        }

    }
    
    @Override
    void addEdge(String edgeWeight, int edgeNumber, String edge1, String edge2) {
  
        graph.addEdge("Edge- " + (edgeNumber+1) + " (" + edgeWeight + " )", edge1, edge2);
        edges.add(edge1);
        edges.add(edge2);
    }

    @Override
    void addEdges(List<String> FinalGraphEdges,String[] inputGraphEdges,String frameTitle) {
        int fromVertex, toVertex;
        int EdgeNumber = 0;
        for (int j = 0; j < FinalGraphEdges.size(); j += 2) {
            fromVertex = ListVertex.indexOf(FinalGraphEdges.get(j));
            toVertex = ListVertex.indexOf(FinalGraphEdges.get(j + 1));
            EdgeNumber=getEdgeName(inputGraphEdges,FinalGraphEdges.get(j),FinalGraphEdges.get(j + 1),frameTitle);
            addEdge(Integer.toString(repMatrix[fromVertex][toVertex]), EdgeNumber, FinalGraphEdges.get(j), FinalGraphEdges.get(j + 1));
            EdgeNumber++;
        }
    }

  
    @Override
   // JPanel drawGraph(String frameTitle, int[] result) {
    JPanel drawGraph(int[] result) {

        Layout<String, String> layout = new CircleLayout(graph);
        layout.setSize(new Dimension(300, 300));

        BasicVisualizationServer<String, String> vv = new BasicVisualizationServer<>(layout);
        vv.setPreferredSize(new Dimension(400, 400));

        Transformer<String, Font> edgeFont = (String node) -> {
            Font font = new Font("Sans Serif", Font.PLAIN, 15);
            return font;
        };

        Transformer<String, Paint> vertexPaint = new Transformer<String, Paint>() {
            private final Color[] palette = {Color.RED,  Color.BLUE,Color.PINK, Color.MAGENTA, Color.CYAN, Color.GREEN, 
                Color.LIGHT_GRAY, Color.ORANGE, Color.black, Color.darkGray, Color.YELLOW, Color.DARK_GRAY, Color.magenta};
            int index;
            int vertixIndex;

            @Override
            public Paint transform(String j) {

                if (result == null) {
                    return Color.CYAN;

                } else {

                    vertixIndex = ListVertex.indexOf(j);
                    index = result[vertixIndex];
                    return palette[result[vertixIndex]];

                }

            }

        };

        vv.getRenderContext().setVertexLabelTransformer(new ToStringLabeller());
        vv.getRenderContext().setEdgeLabelTransformer(new ToStringLabeller());
        vv.getRenderContext().setEdgeFontTransformer(edgeFont);
        vv.getRenderContext().setVertexFillPaintTransformer(vertexPaint);

       // JFrame frame = new JFrame(frameTitle);
        JPanel panel = new JPanel();
       // GraphZoomScrollPane pane = new GraphZoomScrollPane((VisualizationViewer) vv);
       // p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       panel.add(vv);
        //BorderLayout.CENTER);
        //panel.revalidate();
        //panel.repaint();
       // p.getContentPane().add(vv);
       // frame.pack();
       // frame.setVisible(true);
    return panel;
    }

}
