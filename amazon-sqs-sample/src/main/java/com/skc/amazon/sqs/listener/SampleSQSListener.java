package com.skc.amazon.sqs.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Component;

@Component
public class SampleSQSListener {
	
    Logger logger= LoggerFactory.getLogger(SampleSQSListener.class);
	
    @SqsListener("sample-sqs")
    public void sampleReadMessageFromSQS(String message)  {
        logger.info("message from SQS Queue {}",message);
    }

}
