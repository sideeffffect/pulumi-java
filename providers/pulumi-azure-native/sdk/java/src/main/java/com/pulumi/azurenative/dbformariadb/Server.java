// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dbformariadb;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.dbformariadb.ServerArgs;
import com.pulumi.azurenative.dbformariadb.outputs.ServerPrivateEndpointConnectionResponse;
import com.pulumi.azurenative.dbformariadb.outputs.SkuResponse;
import com.pulumi.azurenative.dbformariadb.outputs.StorageProfileResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Represents a server.
 * API Version: 2018-06-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:dbformariadb:Server targetserver /subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/testrg/providers/Microsoft.DBforMariaDB/servers/targetserver 
 * ```
 * 
 */
@ResourceType(type="azure-native:dbformariadb:Server")
public class Server extends com.pulumi.resources.CustomResource {
    /**
     * The administrator's login name of a server. Can only be specified when the server is being created (and is required for creation).
     * 
     */
    @Export(name="administratorLogin", type=String.class, parameters={})
    private Output</* @Nullable */ String> administratorLogin;

    /**
     * @return The administrator's login name of a server. Can only be specified when the server is being created (and is required for creation).
     * 
     */
    public Output</* @Nullable */ String> administratorLogin() {
        return this.administratorLogin;
    }
    /**
     * Earliest restore point creation time (ISO8601 format)
     * 
     */
    @Export(name="earliestRestoreDate", type=String.class, parameters={})
    private Output</* @Nullable */ String> earliestRestoreDate;

    /**
     * @return Earliest restore point creation time (ISO8601 format)
     * 
     */
    public Output</* @Nullable */ String> earliestRestoreDate() {
        return this.earliestRestoreDate;
    }
    /**
     * The fully qualified domain name of a server.
     * 
     */
    @Export(name="fullyQualifiedDomainName", type=String.class, parameters={})
    private Output</* @Nullable */ String> fullyQualifiedDomainName;

    /**
     * @return The fully qualified domain name of a server.
     * 
     */
    public Output</* @Nullable */ String> fullyQualifiedDomainName() {
        return this.fullyQualifiedDomainName;
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The master server id of a replica server.
     * 
     */
    @Export(name="masterServerId", type=String.class, parameters={})
    private Output</* @Nullable */ String> masterServerId;

    /**
     * @return The master server id of a replica server.
     * 
     */
    public Output</* @Nullable */ String> masterServerId() {
        return this.masterServerId;
    }
    /**
     * Enforce a minimal Tls version for the server.
     * 
     */
    @Export(name="minimalTlsVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> minimalTlsVersion;

    /**
     * @return Enforce a minimal Tls version for the server.
     * 
     */
    public Output</* @Nullable */ String> minimalTlsVersion() {
        return this.minimalTlsVersion;
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * List of private endpoint connections on a server
     * 
     */
    @Export(name="privateEndpointConnections", type=List.class, parameters={ServerPrivateEndpointConnectionResponse.class})
    private Output<List<ServerPrivateEndpointConnectionResponse>> privateEndpointConnections;

    /**
     * @return List of private endpoint connections on a server
     * 
     */
    public Output<List<ServerPrivateEndpointConnectionResponse>> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    /**
     * Whether or not public network access is allowed for this server. Value is optional but if passed in, must be 'Enabled' or 'Disabled'
     * 
     */
    @Export(name="publicNetworkAccess", type=String.class, parameters={})
    private Output</* @Nullable */ String> publicNetworkAccess;

    /**
     * @return Whether or not public network access is allowed for this server. Value is optional but if passed in, must be 'Enabled' or 'Disabled'
     * 
     */
    public Output</* @Nullable */ String> publicNetworkAccess() {
        return this.publicNetworkAccess;
    }
    /**
     * The maximum number of replicas that a master server can have.
     * 
     */
    @Export(name="replicaCapacity", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> replicaCapacity;

    /**
     * @return The maximum number of replicas that a master server can have.
     * 
     */
    public Output</* @Nullable */ Integer> replicaCapacity() {
        return this.replicaCapacity;
    }
    /**
     * The replication role of the server.
     * 
     */
    @Export(name="replicationRole", type=String.class, parameters={})
    private Output</* @Nullable */ String> replicationRole;

    /**
     * @return The replication role of the server.
     * 
     */
    public Output</* @Nullable */ String> replicationRole() {
        return this.replicationRole;
    }
    /**
     * The SKU (pricing tier) of the server.
     * 
     */
    @Export(name="sku", type=SkuResponse.class, parameters={})
    private Output</* @Nullable */ SkuResponse> sku;

    /**
     * @return The SKU (pricing tier) of the server.
     * 
     */
    public Output</* @Nullable */ SkuResponse> sku() {
        return this.sku;
    }
    /**
     * Enable ssl enforcement or not when connect to server.
     * 
     */
    @Export(name="sslEnforcement", type=String.class, parameters={})
    private Output</* @Nullable */ String> sslEnforcement;

    /**
     * @return Enable ssl enforcement or not when connect to server.
     * 
     */
    public Output</* @Nullable */ String> sslEnforcement() {
        return this.sslEnforcement;
    }
    /**
     * Storage profile of a server.
     * 
     */
    @Export(name="storageProfile", type=StorageProfileResponse.class, parameters={})
    private Output</* @Nullable */ StorageProfileResponse> storageProfile;

    /**
     * @return Storage profile of a server.
     * 
     */
    public Output</* @Nullable */ StorageProfileResponse> storageProfile() {
        return this.storageProfile;
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * A state of a server that is visible to user.
     * 
     */
    @Export(name="userVisibleState", type=String.class, parameters={})
    private Output</* @Nullable */ String> userVisibleState;

    /**
     * @return A state of a server that is visible to user.
     * 
     */
    public Output</* @Nullable */ String> userVisibleState() {
        return this.userVisibleState;
    }
    /**
     * Server version.
     * 
     */
    @Export(name="version", type=String.class, parameters={})
    private Output</* @Nullable */ String> version;

    /**
     * @return Server version.
     * 
     */
    public Output</* @Nullable */ String> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Server(String name) {
        this(name, ServerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Server(String name, ServerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Server(String name, ServerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:dbformariadb:Server", name, args == null ? ServerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Server(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:dbformariadb:Server", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:dbformariadb/v20180601:Server").build()),
                Output.of(Alias.builder().type("azure-native:dbformariadb/v20180601preview:Server").build())
            ))
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
    public static Server get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Server(name, id, options);
    }
}
