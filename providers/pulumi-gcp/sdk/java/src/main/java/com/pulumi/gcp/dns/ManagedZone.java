// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dns;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.dns.ManagedZoneArgs;
import com.pulumi.gcp.dns.inputs.ManagedZoneState;
import com.pulumi.gcp.dns.outputs.ManagedZoneDnssecConfig;
import com.pulumi.gcp.dns.outputs.ManagedZoneForwardingConfig;
import com.pulumi.gcp.dns.outputs.ManagedZonePeeringConfig;
import com.pulumi.gcp.dns.outputs.ManagedZonePrivateVisibilityConfig;
import com.pulumi.gcp.dns.outputs.ManagedZoneServiceDirectoryConfig;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A zone is a subtree of the DNS namespace under one administrative
 * responsibility. A ManagedZone is a resource that represents a DNS zone
 * hosted by the Cloud DNS service.
 * 
 * To get more information about ManagedZone, see:
 * 
 * * [API documentation](https://cloud.google.com/dns/api/v1/managedZones)
 * * How-to Guides
 *     * [Managing Zones](https://cloud.google.com/dns/zones/)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * ManagedZone can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:dns/managedZone:ManagedZone default projects/{{project}}/managedZones/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:dns/managedZone:ManagedZone default {{project}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:dns/managedZone:ManagedZone default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:dns/managedZone:ManagedZone")
public class ManagedZone extends com.pulumi.resources.CustomResource {
    /**
     * A textual description field. Defaults to 'Managed by Pulumi'.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return A textual description field. Defaults to 'Managed by Pulumi'.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * The DNS name of this managed zone, for instance "example.com.".
     * 
     */
    @Export(name="dnsName", type=String.class, parameters={})
    private Output<String> dnsName;

    /**
     * @return The DNS name of this managed zone, for instance "example.com.".
     * 
     */
    public Output<String> dnsName() {
        return this.dnsName;
    }
    /**
     * DNSSEC configuration
     * Structure is documented below.
     * 
     */
    @Export(name="dnssecConfig", type=ManagedZoneDnssecConfig.class, parameters={})
    private Output</* @Nullable */ ManagedZoneDnssecConfig> dnssecConfig;

    /**
     * @return DNSSEC configuration
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ ManagedZoneDnssecConfig> dnssecConfig() {
        return this.dnssecConfig;
    }
    /**
     * Set this true to delete all records in the zone.
     * 
     */
    @Export(name="forceDestroy", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> forceDestroy;

    /**
     * @return Set this true to delete all records in the zone.
     * 
     */
    public Output</* @Nullable */ Boolean> forceDestroy() {
        return this.forceDestroy;
    }
    /**
     * The presence for this field indicates that outbound forwarding is enabled
     * for this zone. The value of this field contains the set of destinations
     * to forward to.
     * Structure is documented below.
     * 
     */
    @Export(name="forwardingConfig", type=ManagedZoneForwardingConfig.class, parameters={})
    private Output</* @Nullable */ ManagedZoneForwardingConfig> forwardingConfig;

    /**
     * @return The presence for this field indicates that outbound forwarding is enabled
     * for this zone. The value of this field contains the set of destinations
     * to forward to.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ ManagedZoneForwardingConfig> forwardingConfig() {
        return this.forwardingConfig;
    }
    /**
     * A set of key/value label pairs to assign to this ManagedZone.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return A set of key/value label pairs to assign to this ManagedZone.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * User assigned name for this resource.
     * Must be unique within the project.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return User assigned name for this resource.
     * Must be unique within the project.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Delegate your managed_zone to these virtual name servers; defined by the server
     * 
     */
    @Export(name="nameServers", type=List.class, parameters={String.class})
    private Output<List<String>> nameServers;

    /**
     * @return Delegate your managed_zone to these virtual name servers; defined by the server
     * 
     */
    public Output<List<String>> nameServers() {
        return this.nameServers;
    }
    /**
     * The presence of this field indicates that DNS Peering is enabled for this
     * zone. The value of this field contains the network to peer with.
     * Structure is documented below.
     * 
     */
    @Export(name="peeringConfig", type=ManagedZonePeeringConfig.class, parameters={})
    private Output</* @Nullable */ ManagedZonePeeringConfig> peeringConfig;

    /**
     * @return The presence of this field indicates that DNS Peering is enabled for this
     * zone. The value of this field contains the network to peer with.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ ManagedZonePeeringConfig> peeringConfig() {
        return this.peeringConfig;
    }
    /**
     * For privately visible zones, the set of Virtual Private Cloud
     * resources that the zone is visible from.
     * Structure is documented below.
     * 
     */
    @Export(name="privateVisibilityConfig", type=ManagedZonePrivateVisibilityConfig.class, parameters={})
    private Output</* @Nullable */ ManagedZonePrivateVisibilityConfig> privateVisibilityConfig;

    /**
     * @return For privately visible zones, the set of Virtual Private Cloud
     * resources that the zone is visible from.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ ManagedZonePrivateVisibilityConfig> privateVisibilityConfig() {
        return this.privateVisibilityConfig;
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
     * Specifies if this is a managed reverse lookup zone. If true, Cloud DNS will resolve reverse
     * lookup queries using automatically configured records for VPC resources. This only applies
     * to networks listed under `private_visibility_config`.
     * 
     */
    @Export(name="reverseLookup", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> reverseLookup;

    /**
     * @return Specifies if this is a managed reverse lookup zone. If true, Cloud DNS will resolve reverse
     * lookup queries using automatically configured records for VPC resources. This only applies
     * to networks listed under `private_visibility_config`.
     * 
     */
    public Output</* @Nullable */ Boolean> reverseLookup() {
        return this.reverseLookup;
    }
    /**
     * The presence of this field indicates that this zone is backed by Service Directory. The value of this field contains information related to the namespace associated with the zone.
     * Structure is documented below.
     * 
     */
    @Export(name="serviceDirectoryConfig", type=ManagedZoneServiceDirectoryConfig.class, parameters={})
    private Output</* @Nullable */ ManagedZoneServiceDirectoryConfig> serviceDirectoryConfig;

    /**
     * @return The presence of this field indicates that this zone is backed by Service Directory. The value of this field contains information related to the namespace associated with the zone.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ ManagedZoneServiceDirectoryConfig> serviceDirectoryConfig() {
        return this.serviceDirectoryConfig;
    }
    /**
     * The zone's visibility: public zones are exposed to the Internet,
     * while private zones are visible only to Virtual Private Cloud resources.
     * Default value is `public`.
     * Possible values are `private` and `public`.
     * 
     */
    @Export(name="visibility", type=String.class, parameters={})
    private Output</* @Nullable */ String> visibility;

    /**
     * @return The zone's visibility: public zones are exposed to the Internet,
     * while private zones are visible only to Virtual Private Cloud resources.
     * Default value is `public`.
     * Possible values are `private` and `public`.
     * 
     */
    public Output</* @Nullable */ String> visibility() {
        return this.visibility;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ManagedZone(String name) {
        this(name, ManagedZoneArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ManagedZone(String name, ManagedZoneArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ManagedZone(String name, ManagedZoneArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dns/managedZone:ManagedZone", name, args == null ? ManagedZoneArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ManagedZone(String name, Output<String> id, @Nullable ManagedZoneState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dns/managedZone:ManagedZone", name, state, makeResourceOptions(options, id));
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
    public static ManagedZone get(String name, Output<String> id, @Nullable ManagedZoneState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ManagedZone(name, id, state, options);
    }
}
