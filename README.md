# storm_multilang_java_python
A project to demonstrate multilang topology feature of Apache Storm with Java and Python code. 

Steps to run ,
1)Install apache storm
2)Build maven project using plugin of your choice , i have tested with maven install on ecclipse plugin
3)run storm topology by using storm jar com.chandan.storm.multilang.PythonTopology



Python code is situated in \storm_multilang_java_python\multilang_resources\resources directory and contains storm.py file provided by Apache storm if you are experiencing storm compatibility issues , then either remove this file add storm multilang dependency in pom.xml or replace storm.py with latest version.
