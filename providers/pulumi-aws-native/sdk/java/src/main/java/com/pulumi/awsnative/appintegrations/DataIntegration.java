// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appintegrations;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.appintegrations.DataIntegrationArgs;
import com.pulumi.awsnative.appintegrations.outputs.DataIntegrationScheduleConfig;
import com.pulumi.awsnative.appintegrations.outputs.DataIntegrationTag;
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
 * Resource Type definition for AWS::AppIntegrations::DataIntegration
 * 
 */
@ResourceType(type="aws-native:appintegrations:DataIntegration")
public class DataIntegration extends CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the data integration.
     * 
     */
    @Export(name="dataIntegrationArn", type=String.class, parameters={})
    private Output<String> dataIntegrationArn;

    /**
     * @return The Amazon Resource Name (ARN) of the data integration.
     * 
     */
    public Output<String> dataIntegrationArn() {
        return this.dataIntegrationArn;
    }
    /**
     * The data integration description.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The data integration description.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The KMS key of the data integration.
     * 
     */
    @Export(name="kmsKey", type=String.class, parameters={})
    private Output<String> kmsKey;

    /**
     * @return The KMS key of the data integration.
     * 
     */
    public Output<String> kmsKey() {
        return this.kmsKey;
    }
    /**
     * The name of the data integration.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the data integration.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the data and how often it should be pulled from the source.
     * 
     */
    @Export(name="scheduleConfig", type=DataIntegrationScheduleConfig.class, parameters={})
    private Output<DataIntegrationScheduleConfig> scheduleConfig;

    /**
     * @return The name of the data and how often it should be pulled from the source.
     * 
     */
    public Output<DataIntegrationScheduleConfig> scheduleConfig() {
        return this.scheduleConfig;
    }
    /**
     * The URI of the data source.
     * 
     */
    @Export(name="sourceURI", type=String.class, parameters={})
    private Output<String> sourceURI;

    /**
     * @return The URI of the data source.
     * 
     */
    public Output<String> sourceURI() {
        return this.sourceURI;
    }
    /**
     * The tags (keys and values) associated with the data integration.
     * 
     */
    @Export(name="tags", type=List.class, parameters={DataIntegrationTag.class})
    private Output</* @Nullable */ List<DataIntegrationTag>> tags;

    /**
     * @return The tags (keys and values) associated with the data integration.
     * 
     */
    public Output<Optional<List<DataIntegrationTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DataIntegration(String name) {
        this(name, DataIntegrationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DataIntegration(String name, DataIntegrationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataIntegration(String name, DataIntegrationArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native:appintegrations:DataIntegration", name, args == null ? DataIntegrationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DataIntegration(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("aws-native:appintegrations:DataIntegration", name, null, makeResourceOptions(options, id));
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
    public static DataIntegration get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new DataIntegration(name, id, options);
    }
}
