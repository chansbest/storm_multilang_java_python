package com.chandan.storm.multilang;

import java.beans.Customizer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;

import org.apache.storm.spout.SpoutOutputCollector;
import org.apache.storm.task.TopologyContext;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.topology.base.BaseRichSpout;
import org.apache.storm.tuple.Fields;
import org.apache.storm.tuple.Values;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
/**
 * simple spout to emmit sentences
 * @author chandan.bhatte
 *
 */
public class TestSpout extends BaseRichSpout {

	private static final long serialVersionUID = 1L;
	LinkedList<String> pythonList = new LinkedList<String>();
	private SpoutOutputCollector collector;
	ArrayList<String> testArrayList;
	ParagraphPojo customClassObject = new ParagraphPojo();
	
	private static final Logger LOG = LoggerFactory.getLogger(TestSpout.class);

	@Override
	public void open(Map conf, TopologyContext context, SpoutOutputCollector collector) {
		LOG.info("Inside TweetSpout.open ");
		
		pythonList.add("Janpad Adhyaksha of Gram Panchayat has decided to give reservation Satnami and Harijan in Ambikapur");
		pythonList.add("Pornography, sex tourism are serious offence in Korba");
		pythonList.add("extramarital Affairs with Play Boy are very common in Bijapur District");
		pythonList.add(" organisation that supplies Cannabis,Cocaine,LSD,Opium,Morphine likes drugs which causes alarm in Raipur");
		pythonList.add("various organisation like Ambuja Cements and Amrutanjan Healthcare took campaign in most parts of the Jagdalpur and Mungeli");
		pythonList.add("thefts are increased causing fraud home invasions with cannon and coastal artillery were reported at Dantewada");
		this.collector = collector;
	
		testArrayList = new ArrayList<String>();
		testArrayList.add("a");
		testArrayList.add("b");
		testArrayList.add("c");
		
		
	}
	
	@Override
	public void nextTuple() {
		
		if(!pythonList.isEmpty()){
			Gson gson = new Gson();
			String customClassObjectString = gson.toJson(customClassObject);
			String S = pythonList.poll();
			//emmit a tupple with string , arraylist and custom class object as field.
			collector.emit(new Values(S,testArrayList,customClassObjectString));
		}
	}
	
	@Override
	public void declareOutputFields(OutputFieldsDeclarer declarer) {
		
		declarer.declare(new Fields("string","list","complexobject"));
	}

}
