// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.folder;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.folder.IamAuditConfigArgs;
import io.pulumi.gcp.folder.inputs.IamAuditConfigState;
import io.pulumi.gcp.folder.outputs.IamAuditConfigAuditLogConfig;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="gcp:folder/iamAuditConfig:IamAuditConfig")
public class IamAuditConfig extends io.pulumi.resources.CustomResource {
    /**
     * The configuration for logging of each type of permission. This can be specified multiple times.
     * 
     */
    @Export(name="auditLogConfigs", type=List.class, parameters={IamAuditConfigAuditLogConfig.class})
    private Output<List<IamAuditConfigAuditLogConfig>> auditLogConfigs;

    /**
     * @return The configuration for logging of each type of permission. This can be specified multiple times.
     * 
     */
    public Output<List<IamAuditConfigAuditLogConfig>> auditLogConfigs() {
        return this.auditLogConfigs;
    }
    /**
     * The etag of iam policy
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return The etag of iam policy
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    @Export(name="folder", type=String.class, parameters={})
    private Output<String> folder;

    public Output<String> folder() {
        return this.folder;
    }
    /**
     * Service which will be enabled for audit logging. The special value allServices covers all services.
     * 
     */
    @Export(name="service", type=String.class, parameters={})
    private Output<String> service;

    /**
     * @return Service which will be enabled for audit logging. The special value allServices covers all services.
     * 
     */
    public Output<String> service() {
        return this.service;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IamAuditConfig(String name) {
        this(name, IamAuditConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IamAuditConfig(String name, IamAuditConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IamAuditConfig(String name, IamAuditConfigArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:folder/iamAuditConfig:IamAuditConfig", name, args == null ? IamAuditConfigArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IamAuditConfig(String name, Output<String> id, @Nullable IamAuditConfigState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:folder/iamAuditConfig:IamAuditConfig", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
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
    public static IamAuditConfig get(String name, Output<String> id, @Nullable IamAuditConfigState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new IamAuditConfig(name, id, state, options);
    }
}
