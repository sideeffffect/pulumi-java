// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kendra;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.kendra.DataSourceArgs;
import com.pulumi.awsnative.kendra.enums.DataSourceType;
import com.pulumi.awsnative.kendra.outputs.DataSourceConfiguration;
import com.pulumi.awsnative.kendra.outputs.DataSourceTag;
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
 * Kendra DataSource
 * 
 */
@ResourceType(type="aws-native:kendra:DataSource")
public class DataSource extends CustomResource {
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }
    @Export(name="dataSourceConfiguration", type=DataSourceConfiguration.class, parameters={})
    private Output</* @Nullable */ DataSourceConfiguration> dataSourceConfiguration;

    public Output<Optional<DataSourceConfiguration>> dataSourceConfiguration() {
        return Codegen.optional(this.dataSourceConfiguration);
    }
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    @Export(name="indexId", type=String.class, parameters={})
    private Output<String> indexId;

    public Output<String> indexId() {
        return this.indexId;
    }
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="roleArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> roleArn;

    public Output<Optional<String>> roleArn() {
        return Codegen.optional(this.roleArn);
    }
    @Export(name="schedule", type=String.class, parameters={})
    private Output</* @Nullable */ String> schedule;

    public Output<Optional<String>> schedule() {
        return Codegen.optional(this.schedule);
    }
    /**
     * Tags for labeling the data source
     * 
     */
    @Export(name="tags", type=List.class, parameters={DataSourceTag.class})
    private Output</* @Nullable */ List<DataSourceTag>> tags;

    /**
     * @return Tags for labeling the data source
     * 
     */
    public Output<Optional<List<DataSourceTag>>> tags() {
        return Codegen.optional(this.tags);
    }
    @Export(name="type", type=DataSourceType.class, parameters={})
    private Output<DataSourceType> type;

    public Output<DataSourceType> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DataSource(String name) {
        this(name, DataSourceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DataSource(String name, DataSourceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataSource(String name, DataSourceArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native:kendra:DataSource", name, args == null ? DataSourceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DataSource(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("aws-native:kendra:DataSource", name, null, makeResourceOptions(options, id));
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
    public static DataSource get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new DataSource(name, id, options);
    }
}
