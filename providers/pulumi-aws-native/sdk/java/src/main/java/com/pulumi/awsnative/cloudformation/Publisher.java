// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudformation;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.cloudformation.PublisherArgs;
import com.pulumi.awsnative.cloudformation.enums.PublisherIdentityProvider;
import com.pulumi.awsnative.cloudformation.enums.PublisherStatus;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Register as a publisher in the CloudFormation Registry.
 * 
 */
@ResourceType(type="aws-native:cloudformation:Publisher")
public class Publisher extends com.pulumi.resources.CustomResource {
    /**
     * Whether you accept the terms and conditions for publishing extensions in the CloudFormation registry. You must accept the terms and conditions in order to publish public extensions to the CloudFormation registry. The terms and conditions can be found at https://cloudformation-registry-documents.s3.amazonaws.com/Terms_and_Conditions_for_AWS_CloudFormation_Registry_Publishers.pdf
     * 
     */
    @Export(name="acceptTermsAndConditions", type=Boolean.class, parameters={})
    private Output<Boolean> acceptTermsAndConditions;

    /**
     * @return Whether you accept the terms and conditions for publishing extensions in the CloudFormation registry. You must accept the terms and conditions in order to publish public extensions to the CloudFormation registry. The terms and conditions can be found at https://cloudformation-registry-documents.s3.amazonaws.com/Terms_and_Conditions_for_AWS_CloudFormation_Registry_Publishers.pdf
     * 
     */
    public Output<Boolean> acceptTermsAndConditions() {
        return this.acceptTermsAndConditions;
    }
    /**
     * If you are using a Bitbucket or GitHub account for identity verification, the Amazon Resource Name (ARN) for your connection to that account.
     * 
     */
    @Export(name="connectionArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> connectionArn;

    /**
     * @return If you are using a Bitbucket or GitHub account for identity verification, the Amazon Resource Name (ARN) for your connection to that account.
     * 
     */
    public Output<Optional<String>> connectionArn() {
        return Codegen.optional(this.connectionArn);
    }
    /**
     * The type of account used as the identity provider when registering this publisher with CloudFormation.
     * 
     */
    @Export(name="identityProvider", type=PublisherIdentityProvider.class, parameters={})
    private Output<PublisherIdentityProvider> identityProvider;

    /**
     * @return The type of account used as the identity provider when registering this publisher with CloudFormation.
     * 
     */
    public Output<PublisherIdentityProvider> identityProvider() {
        return this.identityProvider;
    }
    /**
     * The publisher id assigned by CloudFormation for publishing in this region.
     * 
     */
    @Export(name="publisherId", type=String.class, parameters={})
    private Output<String> publisherId;

    /**
     * @return The publisher id assigned by CloudFormation for publishing in this region.
     * 
     */
    public Output<String> publisherId() {
        return this.publisherId;
    }
    /**
     * The URL to the publisher&#39;s profile with the identity provider.
     * 
     */
    @Export(name="publisherProfile", type=String.class, parameters={})
    private Output<String> publisherProfile;

    /**
     * @return The URL to the publisher&#39;s profile with the identity provider.
     * 
     */
    public Output<String> publisherProfile() {
        return this.publisherProfile;
    }
    /**
     * Whether the publisher is verified.
     * 
     */
    @Export(name="publisherStatus", type=PublisherStatus.class, parameters={})
    private Output<PublisherStatus> publisherStatus;

    /**
     * @return Whether the publisher is verified.
     * 
     */
    public Output<PublisherStatus> publisherStatus() {
        return this.publisherStatus;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Publisher(String name) {
        this(name, PublisherArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Publisher(String name, PublisherArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Publisher(String name, PublisherArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:cloudformation:Publisher", name, args == null ? PublisherArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Publisher(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:cloudformation:Publisher", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Publisher get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Publisher(name, id, options);
    }
}
