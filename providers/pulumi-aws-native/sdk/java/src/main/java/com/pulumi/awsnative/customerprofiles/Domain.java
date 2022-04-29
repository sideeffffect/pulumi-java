// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.customerprofiles;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.customerprofiles.DomainArgs;
import com.pulumi.awsnative.customerprofiles.outputs.DomainTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A domain defined for 3rd party data source in Profile Service
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:customerprofiles:Domain")
public class Domain extends CustomResource {
    /**
     * The time of this integration got created
     * 
     */
    @Export(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return The time of this integration got created
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * The URL of the SQS dead letter queue
     * 
     */
    @Export(name="deadLetterQueueUrl", type=String.class, parameters={})
    private Output</* @Nullable */ String> deadLetterQueueUrl;

    /**
     * @return The URL of the SQS dead letter queue
     * 
     */
    public Output<Optional<String>> deadLetterQueueUrl() {
        return Codegen.optional(this.deadLetterQueueUrl);
    }
    /**
     * The default encryption key
     * 
     */
    @Export(name="defaultEncryptionKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultEncryptionKey;

    /**
     * @return The default encryption key
     * 
     */
    public Output<Optional<String>> defaultEncryptionKey() {
        return Codegen.optional(this.defaultEncryptionKey);
    }
    /**
     * The default number of days until the data within the domain expires.
     * 
     */
    @Export(name="defaultExpirationDays", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> defaultExpirationDays;

    /**
     * @return The default number of days until the data within the domain expires.
     * 
     */
    public Output<Optional<Integer>> defaultExpirationDays() {
        return Codegen.optional(this.defaultExpirationDays);
    }
    /**
     * The unique name of the domain.
     * 
     */
    @Export(name="domainName", type=String.class, parameters={})
    private Output<String> domainName;

    /**
     * @return The unique name of the domain.
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }
    /**
     * The time of this integration got last updated at
     * 
     */
    @Export(name="lastUpdatedAt", type=String.class, parameters={})
    private Output<String> lastUpdatedAt;

    /**
     * @return The time of this integration got last updated at
     * 
     */
    public Output<String> lastUpdatedAt() {
        return this.lastUpdatedAt;
    }
    /**
     * The tags (keys and values) associated with the domain
     * 
     */
    @Export(name="tags", type=List.class, parameters={DomainTag.class})
    private Output</* @Nullable */ List<DomainTag>> tags;

    /**
     * @return The tags (keys and values) associated with the domain
     * 
     */
    public Output<Optional<List<DomainTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Domain(String name) {
        this(name, DomainArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Domain(String name, @Nullable DomainArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Domain(String name, @Nullable DomainArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native:customerprofiles:Domain", name, args == null ? DomainArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Domain(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("aws-native:customerprofiles:Domain", name, null, makeResourceOptions(options, id));
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
    public static Domain get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new Domain(name, id, options);
    }
}
