// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.sql.ServerArgs;
import com.pulumi.azurenative.sql.outputs.ResourceIdentityResponse;
import com.pulumi.azurenative.sql.outputs.ServerExternalAdministratorResponse;
import com.pulumi.azurenative.sql.outputs.ServerPrivateEndpointConnectionResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * An Azure SQL Database server.
 * API Version: 2020-11-01-preview.
 * 
 * ## Example Usage
 * ### Create server
 * 
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var server = new Server(&#34;server&#34;, ServerArgs.builder()        
 *             .administratorLogin(&#34;dummylogin&#34;)
 *             .administratorLoginPassword(&#34;PLACEHOLDER&#34;)
 *             .administrators(Map.ofEntries(
 *                 Map.entry(&#34;azureADOnlyAuthentication&#34;, true),
 *                 Map.entry(&#34;login&#34;, &#34;bob@contoso.com&#34;),
 *                 Map.entry(&#34;principalType&#34;, &#34;User&#34;),
 *                 Map.entry(&#34;sid&#34;, &#34;00000011-1111-2222-2222-123456789111&#34;),
 *                 Map.entry(&#34;tenantId&#34;, &#34;00000011-1111-2222-2222-123456789111&#34;)
 *             ))
 *             .location(&#34;Japan East&#34;)
 *             .resourceGroupName(&#34;sqlcrudtest-7398&#34;)
 *             .serverName(&#34;sqlcrudtest-4645&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:sql:Server sqlcrudtest-4645 /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/sqlcrudtest-7398/providers/Microsoft.Sql/servers/sqlcrudtest-4645 
 * ```
 * 
 */
@ResourceType(type="azure-native:sql:Server")
public class Server extends com.pulumi.resources.CustomResource {
    /**
     * Administrator username for the server. Once created it cannot be changed.
     * 
     */
    @Export(name="administratorLogin", type=String.class, parameters={})
    private Output</* @Nullable */ String> administratorLogin;

    /**
     * @return Administrator username for the server. Once created it cannot be changed.
     * 
     */
    public Output<Optional<String>> administratorLogin() {
        return Codegen.optional(this.administratorLogin);
    }
    /**
     * The Azure Active Directory identity of the server.
     * 
     */
    @Export(name="administrators", type=ServerExternalAdministratorResponse.class, parameters={})
    private Output</* @Nullable */ ServerExternalAdministratorResponse> administrators;

    /**
     * @return The Azure Active Directory identity of the server.
     * 
     */
    public Output<Optional<ServerExternalAdministratorResponse>> administrators() {
        return Codegen.optional(this.administrators);
    }
    /**
     * The fully qualified domain name of the server.
     * 
     */
    @Export(name="fullyQualifiedDomainName", type=String.class, parameters={})
    private Output<String> fullyQualifiedDomainName;

    /**
     * @return The fully qualified domain name of the server.
     * 
     */
    public Output<String> fullyQualifiedDomainName() {
        return this.fullyQualifiedDomainName;
    }
    /**
     * The Azure Active Directory identity of the server.
     * 
     */
    @Export(name="identity", type=ResourceIdentityResponse.class, parameters={})
    private Output</* @Nullable */ ResourceIdentityResponse> identity;

    /**
     * @return The Azure Active Directory identity of the server.
     * 
     */
    public Output<Optional<ResourceIdentityResponse>> identity() {
        return Codegen.optional(this.identity);
    }
    /**
     * A CMK URI of the key to use for encryption.
     * 
     */
    @Export(name="keyId", type=String.class, parameters={})
    private Output</* @Nullable */ String> keyId;

    /**
     * @return A CMK URI of the key to use for encryption.
     * 
     */
    public Output<Optional<String>> keyId() {
        return Codegen.optional(this.keyId);
    }
    /**
     * Kind of sql server. This is metadata used for the Azure portal experience.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Kind of sql server. This is metadata used for the Azure portal experience.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * Resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Minimal TLS version. Allowed values: &#39;1.0&#39;, &#39;1.1&#39;, &#39;1.2&#39;
     * 
     */
    @Export(name="minimalTlsVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> minimalTlsVersion;

    /**
     * @return Minimal TLS version. Allowed values: &#39;1.0&#39;, &#39;1.1&#39;, &#39;1.2&#39;
     * 
     */
    public Output<Optional<String>> minimalTlsVersion() {
        return Codegen.optional(this.minimalTlsVersion);
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The resource id of a user assigned identity to be used by default.
     * 
     */
    @Export(name="primaryUserAssignedIdentityId", type=String.class, parameters={})
    private Output</* @Nullable */ String> primaryUserAssignedIdentityId;

    /**
     * @return The resource id of a user assigned identity to be used by default.
     * 
     */
    public Output<Optional<String>> primaryUserAssignedIdentityId() {
        return Codegen.optional(this.primaryUserAssignedIdentityId);
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
     * Whether or not public endpoint access is allowed for this server.  Value is optional but if passed in, must be &#39;Enabled&#39; or &#39;Disabled&#39;
     * 
     */
    @Export(name="publicNetworkAccess", type=String.class, parameters={})
    private Output</* @Nullable */ String> publicNetworkAccess;

    /**
     * @return Whether or not public endpoint access is allowed for this server.  Value is optional but if passed in, must be &#39;Enabled&#39; or &#39;Disabled&#39;
     * 
     */
    public Output<Optional<String>> publicNetworkAccess() {
        return Codegen.optional(this.publicNetworkAccess);
    }
    /**
     * The state of the server.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The state of the server.
     * 
     */
    public Output<String> state() {
        return this.state;
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
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The version of the server.
     * 
     */
    @Export(name="version", type=String.class, parameters={})
    private Output</* @Nullable */ String> version;

    /**
     * @return The version of the server.
     * 
     */
    public Output<Optional<String>> version() {
        return Codegen.optional(this.version);
    }
    /**
     * Whether or not existing server has a workspace created and if it allows connection from workspace
     * 
     */
    @Export(name="workspaceFeature", type=String.class, parameters={})
    private Output<String> workspaceFeature;

    /**
     * @return Whether or not existing server has a workspace created and if it allows connection from workspace
     * 
     */
    public Output<String> workspaceFeature() {
        return this.workspaceFeature;
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
        super("azure-native:sql:Server", name, args == null ? ServerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Server(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:Server", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:sql/v20140401:Server").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20150501preview:Server").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20190601preview:Server").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20200202preview:Server").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20200801preview:Server").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20201101preview:Server").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210201preview:Server").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210501preview:Server").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210801preview:Server").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20211101preview:Server").build())
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
