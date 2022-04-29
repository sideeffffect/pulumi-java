// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lookoutmetrics;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.lookoutmetrics.AlertArgs;
import com.pulumi.awsnative.lookoutmetrics.outputs.AlertAction;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::LookoutMetrics::Alert
 * 
 */
@ResourceType(type="aws-native:lookoutmetrics:Alert")
public class Alert extends CustomResource {
    /**
     * The action to be taken by the alert when an anomaly is detected.
     * 
     */
    @Export(name="action", type=AlertAction.class, parameters={})
    private Output<AlertAction> action;

    /**
     * @return The action to be taken by the alert when an anomaly is detected.
     * 
     */
    public Output<AlertAction> action() {
        return this.action;
    }
    /**
     * A description for the alert.
     * 
     */
    @Export(name="alertDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> alertDescription;

    /**
     * @return A description for the alert.
     * 
     */
    public Output<Optional<String>> alertDescription() {
        return Codegen.optional(this.alertDescription);
    }
    /**
     * The name of the alert. If not provided, a name is generated automatically.
     * 
     */
    @Export(name="alertName", type=String.class, parameters={})
    private Output</* @Nullable */ String> alertName;

    /**
     * @return The name of the alert. If not provided, a name is generated automatically.
     * 
     */
    public Output<Optional<String>> alertName() {
        return Codegen.optional(this.alertName);
    }
    /**
     * A number between 0 and 100 (inclusive) that tunes the sensitivity of the alert.
     * 
     */
    @Export(name="alertSensitivityThreshold", type=Integer.class, parameters={})
    private Output<Integer> alertSensitivityThreshold;

    /**
     * @return A number between 0 and 100 (inclusive) that tunes the sensitivity of the alert.
     * 
     */
    public Output<Integer> alertSensitivityThreshold() {
        return this.alertSensitivityThreshold;
    }
    /**
     * The Amazon resource name (ARN) of the Anomaly Detector to alert.
     * 
     */
    @Export(name="anomalyDetectorArn", type=String.class, parameters={})
    private Output<String> anomalyDetectorArn;

    /**
     * @return The Amazon resource name (ARN) of the Anomaly Detector to alert.
     * 
     */
    public Output<String> anomalyDetectorArn() {
        return this.anomalyDetectorArn;
    }
    /**
     * ARN assigned to the alert.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN assigned to the alert.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Alert(String name) {
        this(name, AlertArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Alert(String name, AlertArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Alert(String name, AlertArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native:lookoutmetrics:Alert", name, args == null ? AlertArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Alert(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("aws-native:lookoutmetrics:Alert", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Alert get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new Alert(name, id, options);
    }
}
