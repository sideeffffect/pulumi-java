// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.servicecatalogappregistry;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.servicecatalogappregistry.ResourceAssociationArgs;
import com.pulumi.awsnative.servicecatalogappregistry.enums.ResourceAssociationResourceType;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource Schema for AWS::ServiceCatalogAppRegistry::ResourceAssociation
 * 
 */
@ResourceType(type="aws-native:servicecatalogappregistry:ResourceAssociation")
public class ResourceAssociation extends CustomResource {
    /**
     * The name or the Id of the Application.
     * 
     */
    @Export(name="application", type=String.class, parameters={})
    private Output<String> application;

    /**
     * @return The name or the Id of the Application.
     * 
     */
    public Output<String> application() {
        return this.application;
    }
    @Export(name="applicationArn", type=String.class, parameters={})
    private Output<String> applicationArn;

    public Output<String> applicationArn() {
        return this.applicationArn;
    }
    /**
     * The name or the Id of the Resource.
     * 
     */
    @Export(name="resource", type=String.class, parameters={})
    private Output<String> resource;

    /**
     * @return The name or the Id of the Resource.
     * 
     */
    public Output<String> resource() {
        return this.resource;
    }
    @Export(name="resourceArn", type=String.class, parameters={})
    private Output<String> resourceArn;

    public Output<String> resourceArn() {
        return this.resourceArn;
    }
    /**
     * The type of the CFN Resource for now it&#39;s enum CFN_STACK.
     * 
     */
    @Export(name="resourceType", type=ResourceAssociationResourceType.class, parameters={})
    private Output<ResourceAssociationResourceType> resourceType;

    /**
     * @return The type of the CFN Resource for now it&#39;s enum CFN_STACK.
     * 
     */
    public Output<ResourceAssociationResourceType> resourceType() {
        return this.resourceType;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResourceAssociation(String name) {
        this(name, ResourceAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResourceAssociation(String name, ResourceAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResourceAssociation(String name, ResourceAssociationArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native:servicecatalogappregistry:ResourceAssociation", name, args == null ? ResourceAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ResourceAssociation(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("aws-native:servicecatalogappregistry:ResourceAssociation", name, null, makeResourceOptions(options, id));
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
    public static ResourceAssociation get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new ResourceAssociation(name, id, options);
    }
}
