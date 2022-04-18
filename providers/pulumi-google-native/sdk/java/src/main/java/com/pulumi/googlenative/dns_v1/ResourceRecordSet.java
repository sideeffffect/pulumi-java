// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.dns_v1.ResourceRecordSetArgs;
import com.pulumi.googlenative.dns_v1.outputs.RRSetRoutingPolicyResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a new ResourceRecordSet.
 * 
 */
@ResourceType(type="google-native:dns/v1:ResourceRecordSet")
public class ResourceRecordSet extends com.pulumi.resources.CustomResource {
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    public Output<String> kind() {
        return this.kind;
    }
    /**
     * For example, www.example.com.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return For example, www.example.com.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Configures dynamic query responses based on geo location of querying user or a weighted round robin based routing policy. A ResourceRecordSet should only have either rrdata (static) or routing_policy (dynamic). An error is returned otherwise.
     * 
     */
    @Export(name="routingPolicy", type=RRSetRoutingPolicyResponse.class, parameters={})
    private Output<RRSetRoutingPolicyResponse> routingPolicy;

    /**
     * @return Configures dynamic query responses based on geo location of querying user or a weighted round robin based routing policy. A ResourceRecordSet should only have either rrdata (static) or routing_policy (dynamic). An error is returned otherwise.
     * 
     */
    public Output<RRSetRoutingPolicyResponse> routingPolicy() {
        return this.routingPolicy;
    }
    /**
     * As defined in RFC 1035 (section 5) and RFC 1034 (section 3.6.1) -- see examples.
     * 
     */
    @Export(name="rrdatas", type=List.class, parameters={String.class})
    private Output<List<String>> rrdatas;

    /**
     * @return As defined in RFC 1035 (section 5) and RFC 1034 (section 3.6.1) -- see examples.
     * 
     */
    public Output<List<String>> rrdatas() {
        return this.rrdatas;
    }
    /**
     * As defined in RFC 4034 (section 3.2).
     * 
     */
    @Export(name="signatureRrdatas", type=List.class, parameters={String.class})
    private Output<List<String>> signatureRrdatas;

    /**
     * @return As defined in RFC 4034 (section 3.2).
     * 
     */
    public Output<List<String>> signatureRrdatas() {
        return this.signatureRrdatas;
    }
    /**
     * Number of seconds that this ResourceRecordSet can be cached by resolvers.
     * 
     */
    @Export(name="ttl", type=Integer.class, parameters={})
    private Output<Integer> ttl;

    /**
     * @return Number of seconds that this ResourceRecordSet can be cached by resolvers.
     * 
     */
    public Output<Integer> ttl() {
        return this.ttl;
    }
    /**
     * The identifier of a supported record type. See the list of Supported DNS record types.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The identifier of a supported record type. See the list of Supported DNS record types.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResourceRecordSet(String name) {
        this(name, ResourceRecordSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResourceRecordSet(String name, ResourceRecordSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResourceRecordSet(String name, ResourceRecordSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dns/v1:ResourceRecordSet", name, args == null ? ResourceRecordSetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ResourceRecordSet(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dns/v1:ResourceRecordSet", name, null, makeResourceOptions(options, id));
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
    public static ResourceRecordSet get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ResourceRecordSet(name, id, options);
    }
}
