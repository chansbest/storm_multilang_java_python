package com.chandan.storm.multilang;

import java.util.Map;

import org.apache.storm.task.ShellBolt;
import org.apache.storm.topology.IRichBolt;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.tuple.Fields;

/**
 * A bolt that parses the tweet into words
 */

 // https://github.com/apache/storm/blob/master/examples/storm-starter/src/jvm/storm/starter/WordCountTopology.java

  public class SplitSentence extends ShellBolt implements IRichBolt {

    public SplitSentence() {
      super("/home/labuser/anaconda3/bin/python", "splitsentence.py");
    }

   
    public void declareOutputFields(OutputFieldsDeclarer declarer) {
      declarer.declare(new Fields("string","list","complexdatatype","map"));
    }

    
    public Map<String, Object> getComponentConfiguration() {
      return null;
    }
  }
