// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.configuration;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.configuration.AggregationAuthorizationArgs;
import com.pulumi.awsnative.configuration.outputs.AggregationAuthorizationTag;
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
 * Resource Type definition for AWS::Config::AggregationAuthorization
 * 
 */
@ResourceType(type="aws-native:configuration:AggregationAuthorization")
public class AggregationAuthorization extends CustomResource {
    /**
     * The ARN of the AggregationAuthorization.
     * 
     */
    @Export(name="aggregationAuthorizationArn", type=String.class, parameters={})
    private Output<String> aggregationAuthorizationArn;

    /**
     * @return The ARN of the AggregationAuthorization.
     * 
     */
    public Output<String> aggregationAuthorizationArn() {
        return this.aggregationAuthorizationArn;
    }
    /**
     * The 12-digit account ID of the account authorized to aggregate data.
     * 
     */
    @Export(name="authorizedAccountId", type=String.class, parameters={})
    private Output<String> authorizedAccountId;

    /**
     * @return The 12-digit account ID of the account authorized to aggregate data.
     * 
     */
    public Output<String> authorizedAccountId() {
        return this.authorizedAccountId;
    }
    /**
     * The region authorized to collect aggregated data.
     * 
     */
    @Export(name="authorizedAwsRegion", type=String.class, parameters={})
    private Output<String> authorizedAwsRegion;

    /**
     * @return The region authorized to collect aggregated data.
     * 
     */
    public Output<String> authorizedAwsRegion() {
        return this.authorizedAwsRegion;
    }
    /**
     * The tags for the AggregationAuthorization.
     * 
     */
    @Export(name="tags", type=List.class, parameters={AggregationAuthorizationTag.class})
    private Output</* @Nullable */ List<AggregationAuthorizationTag>> tags;

    /**
     * @return The tags for the AggregationAuthorization.
     * 
     */
    public Output<Optional<List<AggregationAuthorizationTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AggregationAuthorization(String name) {
        this(name, AggregationAuthorizationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AggregationAuthorization(String name, AggregationAuthorizationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AggregationAuthorization(String name, AggregationAuthorizationArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native:configuration:AggregationAuthorization", name, args == null ? AggregationAuthorizationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AggregationAuthorization(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("aws-native:configuration:AggregationAuthorization", name, null, makeResourceOptions(options, id));
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
    public static AggregationAuthorization get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new AggregationAuthorization(name, id, options);
    }
}
