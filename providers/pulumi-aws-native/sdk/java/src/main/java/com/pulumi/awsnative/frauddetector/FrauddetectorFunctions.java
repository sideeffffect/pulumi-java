// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.frauddetector;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.frauddetector.inputs.GetDetectorArgs;
import com.pulumi.awsnative.frauddetector.inputs.GetEntityTypeArgs;
import com.pulumi.awsnative.frauddetector.inputs.GetEventTypeArgs;
import com.pulumi.awsnative.frauddetector.inputs.GetLabelArgs;
import com.pulumi.awsnative.frauddetector.inputs.GetOutcomeArgs;
import com.pulumi.awsnative.frauddetector.inputs.GetVariableArgs;
import com.pulumi.awsnative.frauddetector.outputs.GetDetectorResult;
import com.pulumi.awsnative.frauddetector.outputs.GetEntityTypeResult;
import com.pulumi.awsnative.frauddetector.outputs.GetEventTypeResult;
import com.pulumi.awsnative.frauddetector.outputs.GetLabelResult;
import com.pulumi.awsnative.frauddetector.outputs.GetOutcomeResult;
import com.pulumi.awsnative.frauddetector.outputs.GetVariableResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class FrauddetectorFunctions {
    /**
     * A resource schema for a Detector in Amazon Fraud Detector.
     * 
     */
    public static CompletableFuture<GetDetectorResult> getDetector(GetDetectorArgs args) {
        return getDetector(args, InvokeOptions.Empty);
    }
    /**
     * A resource schema for a Detector in Amazon Fraud Detector.
     * 
     */
    public static CompletableFuture<GetDetectorResult> getDetector(GetDetectorArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:frauddetector:getDetector", TypeShape.of(GetDetectorResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An entity type for fraud detector.
     * 
     */
    public static CompletableFuture<GetEntityTypeResult> getEntityType(GetEntityTypeArgs args) {
        return getEntityType(args, InvokeOptions.Empty);
    }
    /**
     * An entity type for fraud detector.
     * 
     */
    public static CompletableFuture<GetEntityTypeResult> getEntityType(GetEntityTypeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:frauddetector:getEntityType", TypeShape.of(GetEntityTypeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A resource schema for an EventType in Amazon Fraud Detector.
     * 
     */
    public static CompletableFuture<GetEventTypeResult> getEventType(GetEventTypeArgs args) {
        return getEventType(args, InvokeOptions.Empty);
    }
    /**
     * A resource schema for an EventType in Amazon Fraud Detector.
     * 
     */
    public static CompletableFuture<GetEventTypeResult> getEventType(GetEventTypeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:frauddetector:getEventType", TypeShape.of(GetEventTypeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An label for fraud detector.
     * 
     */
    public static CompletableFuture<GetLabelResult> getLabel(GetLabelArgs args) {
        return getLabel(args, InvokeOptions.Empty);
    }
    /**
     * An label for fraud detector.
     * 
     */
    public static CompletableFuture<GetLabelResult> getLabel(GetLabelArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:frauddetector:getLabel", TypeShape.of(GetLabelResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An outcome for rule evaluation.
     * 
     */
    public static CompletableFuture<GetOutcomeResult> getOutcome(GetOutcomeArgs args) {
        return getOutcome(args, InvokeOptions.Empty);
    }
    /**
     * An outcome for rule evaluation.
     * 
     */
    public static CompletableFuture<GetOutcomeResult> getOutcome(GetOutcomeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:frauddetector:getOutcome", TypeShape.of(GetOutcomeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A resource schema for a Variable in Amazon Fraud Detector.
     * 
     */
    public static CompletableFuture<GetVariableResult> getVariable(GetVariableArgs args) {
        return getVariable(args, InvokeOptions.Empty);
    }
    /**
     * A resource schema for a Variable in Amazon Fraud Detector.
     * 
     */
    public static CompletableFuture<GetVariableResult> getVariable(GetVariableArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:frauddetector:getVariable", TypeShape.of(GetVariableResult.class), args, Utilities.withVersion(options));
    }
}
