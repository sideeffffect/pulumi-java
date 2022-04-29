// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.apprunner;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.apprunner.ServiceArgs;
import com.pulumi.awsnative.apprunner.outputs.ServiceEncryptionConfiguration;
import com.pulumi.awsnative.apprunner.outputs.ServiceHealthCheckConfiguration;
import com.pulumi.awsnative.apprunner.outputs.ServiceInstanceConfiguration;
import com.pulumi.awsnative.apprunner.outputs.ServiceSourceConfiguration;
import com.pulumi.awsnative.apprunner.outputs.ServiceTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The AWS::AppRunner::Service resource specifies an AppRunner Service.
 * 
 */
@ResourceType(type="aws-native:apprunner:Service")
public class Service extends CustomResource {
    /**
     * Autoscaling configuration ARN
     * 
     */
    @Export(name="autoScalingConfigurationArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> autoScalingConfigurationArn;

    /**
     * @return Autoscaling configuration ARN
     * 
     */
    public Output<Optional<String>> autoScalingConfigurationArn() {
        return Codegen.optional(this.autoScalingConfigurationArn);
    }
    @Export(name="encryptionConfiguration", type=ServiceEncryptionConfiguration.class, parameters={})
    private Output</* @Nullable */ ServiceEncryptionConfiguration> encryptionConfiguration;

    public Output<Optional<ServiceEncryptionConfiguration>> encryptionConfiguration() {
        return Codegen.optional(this.encryptionConfiguration);
    }
    @Export(name="healthCheckConfiguration", type=ServiceHealthCheckConfiguration.class, parameters={})
    private Output</* @Nullable */ ServiceHealthCheckConfiguration> healthCheckConfiguration;

    public Output<Optional<ServiceHealthCheckConfiguration>> healthCheckConfiguration() {
        return Codegen.optional(this.healthCheckConfiguration);
    }
    @Export(name="instanceConfiguration", type=ServiceInstanceConfiguration.class, parameters={})
    private Output</* @Nullable */ ServiceInstanceConfiguration> instanceConfiguration;

    public Output<Optional<ServiceInstanceConfiguration>> instanceConfiguration() {
        return Codegen.optional(this.instanceConfiguration);
    }
    /**
     * The Amazon Resource Name (ARN) of the AppRunner Service.
     * 
     */
    @Export(name="serviceArn", type=String.class, parameters={})
    private Output<String> serviceArn;

    /**
     * @return The Amazon Resource Name (ARN) of the AppRunner Service.
     * 
     */
    public Output<String> serviceArn() {
        return this.serviceArn;
    }
    /**
     * The AppRunner Service Id
     * 
     */
    @Export(name="serviceId", type=String.class, parameters={})
    private Output<String> serviceId;

    /**
     * @return The AppRunner Service Id
     * 
     */
    public Output<String> serviceId() {
        return this.serviceId;
    }
    /**
     * The AppRunner Service Name.
     * 
     */
    @Export(name="serviceName", type=String.class, parameters={})
    private Output</* @Nullable */ String> serviceName;

    /**
     * @return The AppRunner Service Name.
     * 
     */
    public Output<Optional<String>> serviceName() {
        return Codegen.optional(this.serviceName);
    }
    /**
     * The Service Url of the AppRunner Service.
     * 
     */
    @Export(name="serviceUrl", type=String.class, parameters={})
    private Output<String> serviceUrl;

    /**
     * @return The Service Url of the AppRunner Service.
     * 
     */
    public Output<String> serviceUrl() {
        return this.serviceUrl;
    }
    @Export(name="sourceConfiguration", type=ServiceSourceConfiguration.class, parameters={})
    private Output<ServiceSourceConfiguration> sourceConfiguration;

    public Output<ServiceSourceConfiguration> sourceConfiguration() {
        return this.sourceConfiguration;
    }
    /**
     * AppRunner Service status.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return AppRunner Service status.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    @Export(name="tags", type=List.class, parameters={ServiceTag.class})
    private Output</* @Nullable */ List<ServiceTag>> tags;

    public Output<Optional<List<ServiceTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Service(String name) {
        this(name, ServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Service(String name, ServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Service(String name, ServiceArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native:apprunner:Service", name, args == null ? ServiceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Service(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("aws-native:apprunner:Service", name, null, makeResourceOptions(options, id));
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
    public static Service get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new Service(name, id, options);
    }
}
