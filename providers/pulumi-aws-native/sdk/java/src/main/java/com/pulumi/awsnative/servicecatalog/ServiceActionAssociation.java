// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.servicecatalog;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.servicecatalog.ServiceActionAssociationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource Schema for AWS::ServiceCatalog::ServiceActionAssociation
 * 
 */
@ResourceType(type="aws-native:servicecatalog:ServiceActionAssociation")
public class ServiceActionAssociation extends CustomResource {
    @Export(name="productId", type=String.class, parameters={})
    private Output<String> productId;

    public Output<String> productId() {
        return this.productId;
    }
    @Export(name="provisioningArtifactId", type=String.class, parameters={})
    private Output<String> provisioningArtifactId;

    public Output<String> provisioningArtifactId() {
        return this.provisioningArtifactId;
    }
    @Export(name="serviceActionId", type=String.class, parameters={})
    private Output<String> serviceActionId;

    public Output<String> serviceActionId() {
        return this.serviceActionId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServiceActionAssociation(String name) {
        this(name, ServiceActionAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServiceActionAssociation(String name, ServiceActionAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServiceActionAssociation(String name, ServiceActionAssociationArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native:servicecatalog:ServiceActionAssociation", name, args == null ? ServiceActionAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServiceActionAssociation(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("aws-native:servicecatalog:ServiceActionAssociation", name, null, makeResourceOptions(options, id));
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
    public static ServiceActionAssociation get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new ServiceActionAssociation(name, id, options);
    }
}
