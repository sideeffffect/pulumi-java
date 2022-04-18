// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.eks;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.eks.ClusterArgs;
import com.pulumi.awsnative.eks.outputs.ClusterEncryptionConfig;
import com.pulumi.awsnative.eks.outputs.ClusterKubernetesNetworkConfig;
import com.pulumi.awsnative.eks.outputs.ClusterLogging;
import com.pulumi.awsnative.eks.outputs.ClusterResourcesVpcConfig;
import com.pulumi.awsnative.eks.outputs.ClusterTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * An object representing an Amazon EKS cluster.
 * 
 */
@ResourceType(type="aws-native:eks:Cluster")
public class Cluster extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the cluster, such as arn:aws:eks:us-west-2:666666666666:cluster/prod.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the cluster, such as arn:aws:eks:us-west-2:666666666666:cluster/prod.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The certificate-authority-data for your cluster.
     * 
     */
    @Export(name="certificateAuthorityData", type=String.class, parameters={})
    private Output<String> certificateAuthorityData;

    /**
     * @return The certificate-authority-data for your cluster.
     * 
     */
    public Output<String> certificateAuthorityData() {
        return this.certificateAuthorityData;
    }
    /**
     * The cluster security group that was created by Amazon EKS for the cluster. Managed node groups use this security group for control plane to data plane communication.
     * 
     */
    @Export(name="clusterSecurityGroupId", type=String.class, parameters={})
    private Output<String> clusterSecurityGroupId;

    /**
     * @return The cluster security group that was created by Amazon EKS for the cluster. Managed node groups use this security group for control plane to data plane communication.
     * 
     */
    public Output<String> clusterSecurityGroupId() {
        return this.clusterSecurityGroupId;
    }
    @Export(name="encryptionConfig", type=List.class, parameters={ClusterEncryptionConfig.class})
    private Output</* @Nullable */ List<ClusterEncryptionConfig>> encryptionConfig;

    public Output</* @Nullable */ List<ClusterEncryptionConfig>> encryptionConfig() {
        return this.encryptionConfig;
    }
    /**
     * Amazon Resource Name (ARN) or alias of the customer master key (CMK).
     * 
     */
    @Export(name="encryptionConfigKeyArn", type=String.class, parameters={})
    private Output<String> encryptionConfigKeyArn;

    /**
     * @return Amazon Resource Name (ARN) or alias of the customer master key (CMK).
     * 
     */
    public Output<String> encryptionConfigKeyArn() {
        return this.encryptionConfigKeyArn;
    }
    /**
     * The endpoint for your Kubernetes API server, such as https://5E1D0CEXAMPLEA591B746AFC5AB30262.yl4.us-west-2.eks.amazonaws.com.
     * 
     */
    @Export(name="endpoint", type=String.class, parameters={})
    private Output<String> endpoint;

    /**
     * @return The endpoint for your Kubernetes API server, such as https://5E1D0CEXAMPLEA591B746AFC5AB30262.yl4.us-west-2.eks.amazonaws.com.
     * 
     */
    public Output<String> endpoint() {
        return this.endpoint;
    }
    @Export(name="kubernetesNetworkConfig", type=ClusterKubernetesNetworkConfig.class, parameters={})
    private Output</* @Nullable */ ClusterKubernetesNetworkConfig> kubernetesNetworkConfig;

    public Output</* @Nullable */ ClusterKubernetesNetworkConfig> kubernetesNetworkConfig() {
        return this.kubernetesNetworkConfig;
    }
    @Export(name="logging", type=ClusterLogging.class, parameters={})
    private Output</* @Nullable */ ClusterLogging> logging;

    public Output</* @Nullable */ ClusterLogging> logging() {
        return this.logging;
    }
    /**
     * The unique name to give to your cluster.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return The unique name to give to your cluster.
     * 
     */
    public Output</* @Nullable */ String> name() {
        return this.name;
    }
    /**
     * The issuer URL for the cluster's OIDC identity provider, such as https://oidc.eks.us-west-2.amazonaws.com/id/EXAMPLED539D4633E53DE1B716D3041E. If you need to remove https:// from this output value, you can include the following code in your template.
     * 
     */
    @Export(name="openIdConnectIssuerUrl", type=String.class, parameters={})
    private Output<String> openIdConnectIssuerUrl;

    /**
     * @return The issuer URL for the cluster's OIDC identity provider, such as https://oidc.eks.us-west-2.amazonaws.com/id/EXAMPLED539D4633E53DE1B716D3041E. If you need to remove https:// from this output value, you can include the following code in your template.
     * 
     */
    public Output<String> openIdConnectIssuerUrl() {
        return this.openIdConnectIssuerUrl;
    }
    @Export(name="resourcesVpcConfig", type=ClusterResourcesVpcConfig.class, parameters={})
    private Output<ClusterResourcesVpcConfig> resourcesVpcConfig;

    public Output<ClusterResourcesVpcConfig> resourcesVpcConfig() {
        return this.resourcesVpcConfig;
    }
    /**
     * The Amazon Resource Name (ARN) of the IAM role that provides permissions for the Kubernetes control plane to make calls to AWS API operations on your behalf.
     * 
     */
    @Export(name="roleArn", type=String.class, parameters={})
    private Output<String> roleArn;

    /**
     * @return The Amazon Resource Name (ARN) of the IAM role that provides permissions for the Kubernetes control plane to make calls to AWS API operations on your behalf.
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Export(name="tags", type=List.class, parameters={ClusterTag.class})
    private Output</* @Nullable */ List<ClusterTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Output</* @Nullable */ List<ClusterTag>> tags() {
        return this.tags;
    }
    /**
     * The desired Kubernetes version for your cluster. If you don't specify a value here, the latest version available in Amazon EKS is used.
     * 
     */
    @Export(name="version", type=String.class, parameters={})
    private Output</* @Nullable */ String> version;

    /**
     * @return The desired Kubernetes version for your cluster. If you don't specify a value here, the latest version available in Amazon EKS is used.
     * 
     */
    public Output</* @Nullable */ String> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Cluster(String name) {
        this(name, ClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Cluster(String name, ClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Cluster(String name, ClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:eks:Cluster", name, args == null ? ClusterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Cluster(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:eks:Cluster", name, null, makeResourceOptions(options, id));
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
    public static Cluster get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Cluster(name, id, options);
    }
}
