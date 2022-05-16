// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sqs;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.sqs.inputs.GetQueueArgs;
import com.pulumi.awsnative.sqs.outputs.GetQueueResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class SqsFunctions {
    /**
     * Resource Type definition for AWS::SQS::Queue
     * 
     */
    public static CompletableFuture<GetQueueResult> getQueue(GetQueueArgs args) {
        return getQueue(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for AWS::SQS::Queue
     * 
     */
    public static CompletableFuture<GetQueueResult> getQueue(GetQueueArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:sqs:getQueue", TypeShape.of(GetQueueResult.class), args, Utilities.withVersion(options));
    }
}
