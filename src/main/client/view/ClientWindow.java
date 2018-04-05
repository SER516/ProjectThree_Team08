package main.client.view;

import java.awt.*;
import javax.swing.*;
import main.client.controller.ClientUILogic;

/**
 * Graphical User Interface (GUI) for the client window.
 * @author Jason Rice
 * @version 1.1
 */
public class ClientWindow extends JFrame{
	private JMenuBar menuBar;
	private JTabbedPane clientTabbedPane;
	private JPanel clientPanel;
	private JPanel metricsValuesPanelArea;
	private JPanel metricsGraphPanelArea;
	private JPanel metricsTab;
	private JPanel facePanelArea;
	private JPanel expressionGraphPanelArea;
	private JPanel expressionsTab;
	ClientUILogic clientUILogic;
	
	/**
	 * Create the Client Window.
	 */
	public ClientWindow(ClientUILogic clientUILogic){
		this.clientUILogic = clientUILogic;
		this.setTitle("Client");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(200,200);
		this.setBackground(Color.LIGHT_GRAY);
		this.setMinimumSize(new Dimension(1250, 650));
		
		this.clientPanel = new JPanel(new BorderLayout());
		this.clientPanel.setBackground(Color.LIGHT_GRAY);
		this.add(this.clientPanel);
		
		initializeMenuBar();
		initializeTabbedPane();
		
		this.pack();
	}

	/**
	 * Initialize the tabbed pane and configure the layout.
	 */
	public void initializeTabbedPane(){
		JPanel metricsValuesPanelArea = new JPanel(new BorderLayout());
		metricsValuesPanelArea.setPreferredSize(new Dimension(400, 550));
		metricsValuesPanelArea.setBorder(BorderFactory.createTitledBorder("Affective Values"));
		metricsValuesPanelArea.setBackground(Color.GRAY);
		this.metricsValuesPanelArea = metricsValuesPanelArea;
		
		JPanel metricsGraphPanelArea = new JPanel(new BorderLayout());
		metricsGraphPanelArea.setPreferredSize(new Dimension(800, 550));
		metricsGraphPanelArea.setBorder(BorderFactory.createTitledBorder("Affective Plot"));
		metricsGraphPanelArea.setBackground(Color.GRAY);
		this.metricsGraphPanelArea = metricsGraphPanelArea;
		
		JPanel metricsTab = new JPanel();
		metricsTab.add(this.metricsValuesPanelArea);
		metricsTab.add(this.metricsGraphPanelArea);
		metricsTab.setOpaque(false);
		this.metricsTab = metricsTab;
		
		JPanel facePanelArea = new JPanel(new BorderLayout());
		facePanelArea.setPreferredSize(new Dimension(500, 550));
		facePanelArea.setBorder(BorderFactory.createTitledBorder("Expression Avatar"));
		facePanelArea.setBackground(Color.GRAY);
		this.facePanelArea = facePanelArea;
		
		JPanel expressionGraphPanelArea = new JPanel(new BorderLayout());
		expressionGraphPanelArea.setPreferredSize(new Dimension(700, 550));
		expressionGraphPanelArea.setBorder(BorderFactory.createTitledBorder("Expression Plot"));
		facePanelArea.setBackground(Color.GRAY);
		this.expressionGraphPanelArea = expressionGraphPanelArea;
		
		JPanel expressionsTab = new JPanel();
		expressionsTab.add(this.facePanelArea);
		expressionsTab.add(this.expressionGraphPanelArea);
		expressionsTab.setOpaque(false);
		this.expressionsTab = expressionsTab;
		
		JTabbedPane clientTabbedPane = new JTabbedPane();
		clientTabbedPane.addTab("Expressions", this.expressionsTab);
		clientTabbedPane.addTab("Metrics", this.metricsTab);
		clientTabbedPane.setOpaque(true);
		clientTabbedPane.setBackground(Color.LIGHT_GRAY);
		this.clientTabbedPane = clientTabbedPane;
		
		this.clientPanel.add(this.clientTabbedPane, BorderLayout.CENTER);
	}
	
	/**
	 * Sets the menu bar of the client.
	 * @param menuBar
	 */
	public void initializeMenuBar(){
		JMenu menu = new JMenu("Menu");
		
		JMenuItem openServer = new JMenuItem("Open Server");
		openServer.addActionListener(this.clientUILogic.getOpenServerActionListener());
		menu.add(openServer);
		
		JMenuItem startServer = new JMenuItem("Start Server");
		startServer.addActionListener(this.clientUILogic.getStartServerActionListener());
		menu.add(startServer);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.add(menu);
		this.menuBar = menuBar;
		
		this.setJMenuBar(this.menuBar);
	}
	
	/**
	 * Add the metrics value panel to client.
	 * @param panel
	 */
	public void addMetricsValuesPanel(JPanel panel){
		this.metricsValuesPanelArea.add(panel, BorderLayout.CENTER);
	}
	
	/**
	 * Add the metrics graph panel to the client.
	 * @param panel
	 */
	public void addMetricsGraphPanel(JPanel panel){
		this.metricsGraphPanelArea.add(panel, BorderLayout.CENTER);
	}
	
	/**
	 * Add the face panel to the client.
	 * @param panel
	 */
	public void addFacePanel(JPanel panel){
		this.facePanelArea.add(panel, BorderLayout.CENTER);
	}
	
	/**
	 * Add the expressions graph panel to the client.
	 * @param panel
	 */
	public void addExpressionGraphPanel(JPanel panel){
		this.expressionGraphPanelArea.add(panel, BorderLayout.CENTER);
	}
}
