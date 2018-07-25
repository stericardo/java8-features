package com.stevenprogramming.java8.stream.impl;

import com.stevenprogramming.java8.stream.ArrayStreamSample;
import com.stevenprogramming.java8.stream.IntStreamSample;
import com.stevenprogramming.java8.stream.StreamService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.logging.Logger;

@Service("streamService")
public class StreamServiceImpl implements StreamService {

    private static final Logger LOGGER = Logger.getLogger( StreamService.class.getName() );

    @PostConstruct
    public void runSamples(){
        runIntStreamSample();
    }

    private void runIntStreamSample(){
        IntStreamSample intStreamSample = new IntStreamSample();
        intStreamSample.sample();
        LOGGER.info("\n\n**************************************************************");
        ArrayStreamSample arrayStreamSample = new ArrayStreamSample();
        arrayStreamSample.sample();
    }

}
