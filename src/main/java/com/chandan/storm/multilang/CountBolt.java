package com.chandan.storm.multilang;



import java.beans.Customizer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.storm.task.OutputCollector;
import org.apache.storm.task.TopologyContext;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.topology.base.BaseRichBolt;
import org.apache.storm.tuple.Fields;
import org.apache.storm.tuple.Tuple;
import org.apache.storm.tuple.Values;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
/**
 * A bolt that counts the words that it receives
 */
public class CountBolt extends BaseRichBolt
{
  // To output tuples from this bolt to the next stage bolts, if any
  private OutputCollector collector;
	private static final Logger LOG = LoggerFactory.getLogger(CountBolt.class);
	
  // Map to store the count of the words
  private Map<String, Integer> countMap;


  public void prepare(
      Map                     map,
      TopologyContext         topologyContext,
      OutputCollector         outputCollector)
  {

    // save the collector for emitting tuples
    collector = outputCollector;


  }

 
  public void execute(Tuple tuple)
  {
	  LOG.info("Inside CountBolt.execute");
    // get the word from the 1st column of incoming tuple
    String word = tuple.getString(0);
    for(int i = 0 ; i < tuple.size() ; i++ )
    {
    	 LOG.info("tuple {} {}",i,tuple.getValue(i).getClass().getName());
    }
    
    LOG.info("tuple string {} ",word);
    
    List<String> listofSting = (List<String>) tuple.getValue(1); 
    LOG.info("List {} ",listofSting);
    
    
    String customClassObj = tuple.getString(2);
    CustomClass obj = new Gson().fromJson(customClassObj, CustomClass.class);
    LOG.info("CustomClass obj {} ",obj.toString());
    
    Map<String,String> mapString = ( Map<String,String>) tuple.getValue(3); 
    LOG.info("Map obj {} ",mapString);
    	
    
    collector.emit(new Values(word, "abc"));
    
  }

  
  public void declareOutputFields(OutputFieldsDeclarer outputFieldsDeclarer)
  {
	  // declare the first column 'word', second column 'count'
    outputFieldsDeclarer.declare(new Fields("word","list"));
  }
}
