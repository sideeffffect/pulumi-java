// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicedirectory.v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.servicedirectory.v1beta1.NamespaceArgs;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a namespace, and returns the new namespace.
 * 
 */
@ResourceType(type="google-native:servicedirectory/v1beta1:Namespace")
public class Namespace extends com.pulumi.resources.CustomResource {
    /**
     * The timestamp when the namespace was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The timestamp when the namespace was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Optional. Resource labels associated with this namespace. No more than 64 user labels can be associated with a given resource. Label keys and values can be no longer than 63 characters.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Optional. Resource labels associated with this namespace. No more than 64 user labels can be associated with a given resource. Label keys and values can be no longer than 63 characters.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }
    /**
     * Immutable. The resource name for the namespace in the format `projects/*{@literal /}locations/*{@literal /}namespaces/*`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Immutable. The resource name for the namespace in the format `projects/*{@literal /}locations/*{@literal /}namespaces/*`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Required. The Resource ID must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Export(name="namespaceId", type=String.class, parameters={})
    private Output<String> namespaceId;

    /**
     * @return Required. The Resource ID must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z](?:[-a-z0-9]{0,61}[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Output<String> namespaceId() {
        return this.namespaceId;
    }
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }
    /**
     * The timestamp when the namespace was last updated.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The timestamp when the namespace was last updated.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Namespace(String name) {
        this(name, NamespaceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Namespace(String name, NamespaceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Namespace(String name, NamespaceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:servicedirectory/v1beta1:Namespace", name, args == null ? NamespaceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Namespace(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:servicedirectory/v1beta1:Namespace", name, null, makeResourceOptions(options, id));
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
    public static Namespace get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Namespace(name, id, options);
    }
}
