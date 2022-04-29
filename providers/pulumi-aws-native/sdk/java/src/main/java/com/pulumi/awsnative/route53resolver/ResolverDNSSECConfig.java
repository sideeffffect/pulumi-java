// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.route53resolver;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.route53resolver.ResolverDNSSECConfigArgs;
import com.pulumi.awsnative.route53resolver.enums.ResolverDNSSECConfigValidationStatus;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::Route53Resolver::ResolverDNSSECConfig.
 * 
 */
@ResourceType(type="aws-native:route53resolver:ResolverDNSSECConfig")
public class ResolverDNSSECConfig extends CustomResource {
    /**
     * AccountId
     * 
     */
    @Export(name="ownerId", type=String.class, parameters={})
    private Output<String> ownerId;

    /**
     * @return AccountId
     * 
     */
    public Output<String> ownerId() {
        return this.ownerId;
    }
    /**
     * ResourceId
     * 
     */
    @Export(name="resourceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceId;

    /**
     * @return ResourceId
     * 
     */
    public Output<Optional<String>> resourceId() {
        return Codegen.optional(this.resourceId);
    }
    /**
     * ResolverDNSSECValidationStatus, possible values are ENABLING, ENABLED, DISABLING AND DISABLED.
     * 
     */
    @Export(name="validationStatus", type=ResolverDNSSECConfigValidationStatus.class, parameters={})
    private Output<ResolverDNSSECConfigValidationStatus> validationStatus;

    /**
     * @return ResolverDNSSECValidationStatus, possible values are ENABLING, ENABLED, DISABLING AND DISABLED.
     * 
     */
    public Output<ResolverDNSSECConfigValidationStatus> validationStatus() {
        return this.validationStatus;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResolverDNSSECConfig(String name) {
        this(name, ResolverDNSSECConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResolverDNSSECConfig(String name, @Nullable ResolverDNSSECConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResolverDNSSECConfig(String name, @Nullable ResolverDNSSECConfigArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native:route53resolver:ResolverDNSSECConfig", name, args == null ? ResolverDNSSECConfigArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ResolverDNSSECConfig(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("aws-native:route53resolver:ResolverDNSSECConfig", name, null, makeResourceOptions(options, id));
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
    public static ResolverDNSSECConfig get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new ResolverDNSSECConfig(name, id, options);
    }
}
