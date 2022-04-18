// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.accessanalyzer;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.accessanalyzer.inputs.GetAnalyzerArgs;
import com.pulumi.awsnative.accessanalyzer.outputs.GetAnalyzerResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class AccessanalyzerFunctions {
    /**
     * The AWS::AccessAnalyzer::Analyzer type specifies an analyzer of the user's account
     * 
     */
    public static CompletableFuture<GetAnalyzerResult> getAnalyzer(GetAnalyzerArgs args) {
        return getAnalyzer(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetAnalyzerResult> getAnalyzer(GetAnalyzerArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:accessanalyzer:getAnalyzer", TypeShape.of(GetAnalyzerResult.class), args, Utilities.withVersion(options));
    }
}
