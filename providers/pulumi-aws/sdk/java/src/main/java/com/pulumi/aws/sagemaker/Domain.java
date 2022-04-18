// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.sagemaker.DomainArgs;
import com.pulumi.aws.sagemaker.inputs.DomainState;
import com.pulumi.aws.sagemaker.outputs.DomainDefaultUserSettings;
import com.pulumi.aws.sagemaker.outputs.DomainRetentionPolicy;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a Sagemaker Domain resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Sagemaker Code Domains can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:sagemaker/domain:Domain test_domain d-8jgsjtilstu8
 * ```
 * 
 */
@ResourceType(type="aws:sagemaker/domain:Domain")
public class Domain extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the VPC used for non-EFS traffic. The default value is `PublicInternetOnly`. Valid values are `PublicInternetOnly` and `VpcOnly`.
     * 
     */
    @Export(name="appNetworkAccessType", type=String.class, parameters={})
    private Output</* @Nullable */ String> appNetworkAccessType;

    /**
     * @return Specifies the VPC used for non-EFS traffic. The default value is `PublicInternetOnly`. Valid values are `PublicInternetOnly` and `VpcOnly`.
     * 
     */
    public Output</* @Nullable */ String> appNetworkAccessType() {
        return this.appNetworkAccessType;
    }
    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this Domain.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) assigned by AWS to this Domain.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The mode of authentication that members use to access the domain. Valid values are `IAM` and `SSO`.
     * 
     */
    @Export(name="authMode", type=String.class, parameters={})
    private Output<String> authMode;

    /**
     * @return The mode of authentication that members use to access the domain. Valid values are `IAM` and `SSO`.
     * 
     */
    public Output<String> authMode() {
        return this.authMode;
    }
    /**
     * The default user settings. See Default User Settings below.
     * 
     */
    @Export(name="defaultUserSettings", type=DomainDefaultUserSettings.class, parameters={})
    private Output<DomainDefaultUserSettings> defaultUserSettings;

    /**
     * @return The default user settings. See Default User Settings below.
     * 
     */
    public Output<DomainDefaultUserSettings> defaultUserSettings() {
        return this.defaultUserSettings;
    }
    /**
     * The domain name.
     * 
     */
    @Export(name="domainName", type=String.class, parameters={})
    private Output<String> domainName;

    /**
     * @return The domain name.
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }
    /**
     * The ID of the Amazon Elastic File System (EFS) managed by this Domain.
     * 
     */
    @Export(name="homeEfsFileSystemId", type=String.class, parameters={})
    private Output<String> homeEfsFileSystemId;

    /**
     * @return The ID of the Amazon Elastic File System (EFS) managed by this Domain.
     * 
     */
    public Output<String> homeEfsFileSystemId() {
        return this.homeEfsFileSystemId;
    }
    /**
     * The AWS KMS customer managed CMK used to encrypt the EFS volume attached to the domain.
     * 
     */
    @Export(name="kmsKeyId", type=String.class, parameters={})
    private Output</* @Nullable */ String> kmsKeyId;

    /**
     * @return The AWS KMS customer managed CMK used to encrypt the EFS volume attached to the domain.
     * 
     */
    public Output</* @Nullable */ String> kmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * The retention policy for this domain, which specifies whether resources will be retained after the Domain is deleted. By default, all resources are retained. See Retention Policy below.
     * 
     */
    @Export(name="retentionPolicy", type=DomainRetentionPolicy.class, parameters={})
    private Output</* @Nullable */ DomainRetentionPolicy> retentionPolicy;

    /**
     * @return The retention policy for this domain, which specifies whether resources will be retained after the Domain is deleted. By default, all resources are retained. See Retention Policy below.
     * 
     */
    public Output</* @Nullable */ DomainRetentionPolicy> retentionPolicy() {
        return this.retentionPolicy;
    }
    /**
     * The SSO managed application instance ID.
     * 
     */
    @Export(name="singleSignOnManagedApplicationInstanceId", type=String.class, parameters={})
    private Output<String> singleSignOnManagedApplicationInstanceId;

    /**
     * @return The SSO managed application instance ID.
     * 
     */
    public Output<String> singleSignOnManagedApplicationInstanceId() {
        return this.singleSignOnManagedApplicationInstanceId;
    }
    /**
     * The VPC subnets that Studio uses for communication.
     * 
     */
    @Export(name="subnetIds", type=List.class, parameters={String.class})
    private Output<List<String>> subnetIds;

    /**
     * @return The VPC subnets that Studio uses for communication.
     * 
     */
    public Output<List<String>> subnetIds() {
        return this.subnetIds;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * The domain's URL.
     * 
     */
    @Export(name="url", type=String.class, parameters={})
    private Output<String> url;

    /**
     * @return The domain's URL.
     * 
     */
    public Output<String> url() {
        return this.url;
    }
    /**
     * The ID of the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
     * 
     */
    @Export(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return The ID of the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
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
    public Domain(String name, DomainArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Domain(String name, DomainArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:sagemaker/domain:Domain", name, args == null ? DomainArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Domain(String name, Output<String> id, @Nullable DomainState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:sagemaker/domain:Domain", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Domain get(String name, Output<String> id, @Nullable DomainState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Domain(name, id, state, options);
    }
}
