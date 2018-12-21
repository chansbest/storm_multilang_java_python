package com.chandan.storm.multilang;

import org.apache.storm.Config;
import org.apache.storm.LocalCluster;
import org.apache.storm.generated.StormTopology;
import org.apache.storm.topology.TopologyBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class PythonTopology   {

	private static final Logger LOG = LoggerFactory.getLogger(PythonTopology.class);


	public static void main(String[] args) throws Exception {
		TopologyBuilder builder = new TopologyBuilder();
		builder.setSpout("TSpout", new TestSpout());
		builder.setBolt("Split", new SplitSentence()).shuffleGrouping("TSpout");
		builder.setBolt("Count", new CountBolt()).shuffleGrouping("Split");
		Config conf = new Config();
        conf.setDebug(false);
		LocalCluster lc = new LocalCluster();
		StormTopology topology = builder.createTopology();
		lc.submitTopology("test", conf, topology);
	}
	
}
