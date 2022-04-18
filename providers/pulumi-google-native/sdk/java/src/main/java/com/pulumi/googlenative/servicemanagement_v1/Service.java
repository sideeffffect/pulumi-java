// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.servicemanagement_v1.ServiceArgs;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a new managed service. A managed service is immutable, and is subject to mandatory 30-day data retention. You cannot move a service or recreate it within 30 days after deletion. One producer project can own no more than 500 services. For security and reliability purposes, a production service should be hosted in a dedicated producer project. Operation
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:servicemanagement/v1:Service")
public class Service extends com.pulumi.resources.CustomResource {
    /**
     * ID of the project that produces and owns this service.
     * 
     */
    @Export(name="producerProjectId", type=String.class, parameters={})
    private Output<String> producerProjectId;

    /**
     * @return ID of the project that produces and owns this service.
     * 
     */
    public Output<String> producerProjectId() {
        return this.producerProjectId;
    }
    /**
     * The name of the service. See the [overview](/service-management/overview) for naming requirements.
     * 
     */
    @Export(name="serviceName", type=String.class, parameters={})
    private Output<String> serviceName;

    /**
     * @return The name of the service. See the [overview](/service-management/overview) for naming requirements.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Service(String name) {
        this(name, ServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Service(String name, @Nullable ServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Service(String name, @Nullable ServiceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:servicemanagement/v1:Service", name, args == null ? ServiceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Service(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:servicemanagement/v1:Service", name, null, makeResourceOptions(options, id));
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
    public static Service get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Service(name, id, options);
    }
}
