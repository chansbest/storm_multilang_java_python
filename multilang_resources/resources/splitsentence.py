#!/home/labuser/anaconda3/bin python3
import storm




class SplitSentenceBolt(storm.BasicBolt):
	testmap={}
	#procedure to find geonames in text using spacy library
	
	def process(self, tup):
		if tup.values[0]:
			sentence = tup.values[0]
		list = tup.values[1]
		complexObj = tup.values[2]
		locations = self.getLocation(sentence)
		#tuple is list which would be emmited, equivalent of new Values() in java
		tuple = []
		
		#add 3 fields to the tupple
		tuple.append(locations)
		tuple.append(list)
		tuple.append(complexObj)
		tuple.append(self.testmap)
		
		#emit tuple
		storm.emit(tuple)
			
SplitSentenceBolt().run()
