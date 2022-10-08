package com.ing.main;

import org.apache.beam.runners.dataflow.options.DataflowPipelineOptions;
import org.apache.beam.sdk.options.Default;
import org.apache.beam.sdk.options.Description;


public interface PipelineOptions extends DataflowPipelineOptions {
	
    @Description("Subscription name")
    @Default.String("dataflow_subscription")
    String getSubscription();
    void setSubscription(String subscription);

    @Description("Build number")
    String getBuildNumber();
    void setBuildNumber(String buildNumber);
}
