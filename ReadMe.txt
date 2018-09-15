Please follow the below steps for running automated testing:

1: Firefox 37.0.2 version should be available on master node, please execute below commands to install mentioned version of firefox

	wget http://ftp.mozilla.org/pub/firefox/releases/37.0.2/linux-i686/en-US/firefox-37.0.2.tar.bz2
	tar -xjvf firefox-37.0.2.tar.bz2
	rm -rf /opt/firefox*
	mv firefox /opt/firefox37.0.2
	ln -sf /opt/firefox37.0.2/firefox /usr/bin/firefox

2: For kubernetes deployment use the image - veboddu/beatles:iiqscp. 
3: Verify that the aggregation files are present in /opt/DEVOPS/IIQData folder in Node VM
4: Add HTML Report Plugin to jenkins.
5: Configure 5th job in jenkins with the following configurations:
	
	4.1: BUILD->Add Build Step->Execute Shell and enter code below {Replace the <newHostName> with host node's ip/hostname and <newPort> with cluster's port number. For example <newHostName>:<newPort> will look like 192.168.56.4:32266}
	
		rm -r automatedTesting
		git clone https://github.com/git-training-repo/automatedTesting.git
		cd automatedTesting/AutomatedTestNG/
		chmod -R 777 *
		sed -i 's/192.168.56.4:32266/<newHostName>:<newPort>/g' config.xml
		cd src/autotest/
		javac -cp ".:/opt/DEVOPS/Project_workspace/AutomatedTestNG/lib/*" StepDefinitions.java
		cd ..
		cd ..
		mv -f src/autotest/StepDefinitions.class bin/autotest/
		chmod -R 777 *
		java -cp "bin:/opt/DEVOPS/Project_workspace/AutomatedTestNG/lib/*" org.testng.TestNG config.xml

	4.2: Post-build Actions->Add post-build actions->Publish HTML Reports and add configurations below
	
		HTML Directory: automatedTesting/AutomatedTestNG/test-output/
		
	Click on Save.
	