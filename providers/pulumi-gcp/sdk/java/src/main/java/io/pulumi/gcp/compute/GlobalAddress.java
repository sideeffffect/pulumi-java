// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.GlobalAddressArgs;
import io.pulumi.gcp.compute.inputs.GlobalAddressState;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Represents a Global Address resource. Global addresses are used for
 * HTTP(S) load balancing.
 * 
 * To get more information about GlobalAddress, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/v1/globalAddresses)
 * * How-to Guides
 *     * [Reserving a Static External IP Address](https://cloud.google.com/compute/docs/ip-addresses/reserve-static-external-ip-address)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * GlobalAddress can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:compute/globalAddress:GlobalAddress default projects/{{project}}/global/addresses/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/globalAddress:GlobalAddress default {{project}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/globalAddress:GlobalAddress default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/globalAddress:GlobalAddress")
public class GlobalAddress extends io.pulumi.resources.CustomResource {
    /**
     * The IP address or beginning of the address range represented by this
     * resource. This can be supplied as an input to reserve a specific
     * address or omitted to allow GCP to choose a valid one for you.
     * 
     */
    @Export(name="address", type=String.class, parameters={})
    private Output<String> address;

    /**
     * @return The IP address or beginning of the address range represented by this
     * resource. This can be supplied as an input to reserve a specific
     * address or omitted to allow GCP to choose a valid one for you.
     * 
     */
    public Output<String> address() {
        return this.address;
    }
    /**
     * The type of the address to reserve.
     * * EXTERNAL indicates public/external single IP address.
     * * INTERNAL indicates internal IP ranges belonging to some network.
     *   Default value is `EXTERNAL`.
     *   Possible values are `EXTERNAL` and `INTERNAL`.
     * 
     */
    @Export(name="addressType", type=String.class, parameters={})
    private Output</* @Nullable */ String> addressType;

    /**
     * @return The type of the address to reserve.
     * * EXTERNAL indicates public/external single IP address.
     * * INTERNAL indicates internal IP ranges belonging to some network.
     *   Default value is `EXTERNAL`.
     *   Possible values are `EXTERNAL` and `INTERNAL`.
     * 
     */
    public Output</* @Nullable */ String> addressType() {
        return this.addressType;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Export(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description of this resource.
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * The IP Version that will be used by this address. The default value is `IPV4`.
     * Possible values are `IPV4` and `IPV6`.
     * 
     */
    @Export(name="ipVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> ipVersion;

    /**
     * @return The IP Version that will be used by this address. The default value is `IPV4`.
     * Possible values are `IPV4` and `IPV6`.
     * 
     */
    public Output</* @Nullable */ String> ipVersion() {
        return this.ipVersion;
    }
    /**
     * The fingerprint used for optimistic locking of this resource. Used internally during updates.
     * 
     */
    @Export(name="labelFingerprint", type=String.class, parameters={})
    private Output<String> labelFingerprint;

    /**
     * @return The fingerprint used for optimistic locking of this resource. Used internally during updates.
     * 
     */
    public Output<String> labelFingerprint() {
        return this.labelFingerprint;
    }
    /**
     * Labels to apply to this address.  A list of key->value pairs.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Labels to apply to this address.  A list of key->value pairs.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035.  Specifically, the name must be 1-63 characters long and
     * match the regular expression `a-z?` which means
     * the first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035.  Specifically, the name must be 1-63 characters long and
     * match the regular expression `a-z?` which means
     * the first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The URL of the network in which to reserve the IP range. The IP range
     * must be in RFC1918 space. The network cannot be deleted if there are
     * any reserved IP ranges referring to it.
     * This should only be set when using an Internal address.
     * 
     */
    @Export(name="network", type=String.class, parameters={})
    private Output</* @Nullable */ String> network;

    /**
     * @return The URL of the network in which to reserve the IP range. The IP range
     * must be in RFC1918 space. The network cannot be deleted if there are
     * any reserved IP ranges referring to it.
     * This should only be set when using an Internal address.
     * 
     */
    public Output</* @Nullable */ String> network() {
        return this.network;
    }
    /**
     * The prefix length of the IP range. If not present, it means the
     * address field is a single IP address.
     * This field is not applicable to addresses with addressType=EXTERNAL,
     * or addressType=INTERNAL when purpose=PRIVATE_SERVICE_CONNECT
     * 
     */
    @Export(name="prefixLength", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> prefixLength;

    /**
     * @return The prefix length of the IP range. If not present, it means the
     * address field is a single IP address.
     * This field is not applicable to addresses with addressType=EXTERNAL,
     * or addressType=INTERNAL when purpose=PRIVATE_SERVICE_CONNECT
     * 
     */
    public Output</* @Nullable */ Integer> prefixLength() {
        return this.prefixLength;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The purpose of the resource. Possible values include:
     * * VPC_PEERING - for peer networks
     * * PRIVATE_SERVICE_CONNECT - for Private Service Connect networks
     * 
     */
    @Export(name="purpose", type=String.class, parameters={})
    private Output</* @Nullable */ String> purpose;

    /**
     * @return The purpose of the resource. Possible values include:
     * * VPC_PEERING - for peer networks
     * * PRIVATE_SERVICE_CONNECT - for Private Service Connect networks
     * 
     */
    public Output</* @Nullable */ String> purpose() {
        return this.purpose;
    }
    /**
     * The URI of the created resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GlobalAddress(String name) {
        this(name, GlobalAddressArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GlobalAddress(String name, @Nullable GlobalAddressArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GlobalAddress(String name, @Nullable GlobalAddressArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/globalAddress:GlobalAddress", name, args == null ? GlobalAddressArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GlobalAddress(String name, Output<String> id, @Nullable GlobalAddressState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/globalAddress:GlobalAddress", name, state, makeResourceOptions(options, id));
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
    public static GlobalAddress get(String name, Output<String> id, @Nullable GlobalAddressState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new GlobalAddress(name, id, state, options);
    }
}
