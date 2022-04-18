// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.workspaces;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.workspaces.DirectoryArgs;
import com.pulumi.aws.workspaces.inputs.DirectoryState;
import com.pulumi.aws.workspaces.outputs.DirectorySelfServicePermissions;
import com.pulumi.aws.workspaces.outputs.DirectoryWorkspaceAccessProperties;
import com.pulumi.aws.workspaces.outputs.DirectoryWorkspaceCreationProperties;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a WorkSpaces directory in AWS WorkSpaces Service.
 * 
 * > **NOTE:** AWS WorkSpaces service requires [`workspaces_DefaultRole`](https://docs.aws.amazon.com/workspaces/latest/adminguide/workspaces-access-control.html#create-default-role) IAM role to operate normally.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Workspaces directory can be imported using the directory ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:workspaces/directory:Directory main d-4444444444
 * ```
 * 
 */
@ResourceType(type="aws:workspaces/directory:Directory")
public class Directory extends com.pulumi.resources.CustomResource {
    /**
     * The directory alias.
     * 
     */
    @Export(name="alias", type=String.class, parameters={})
    private Output<String> alias;

    /**
     * @return The directory alias.
     * 
     */
    public Output<String> alias() {
        return this.alias;
    }
    /**
     * The user name for the service account.
     * 
     */
    @Export(name="customerUserName", type=String.class, parameters={})
    private Output<String> customerUserName;

    /**
     * @return The user name for the service account.
     * 
     */
    public Output<String> customerUserName() {
        return this.customerUserName;
    }
    /**
     * The directory identifier for registration in WorkSpaces service.
     * 
     */
    @Export(name="directoryId", type=String.class, parameters={})
    private Output<String> directoryId;

    /**
     * @return The directory identifier for registration in WorkSpaces service.
     * 
     */
    public Output<String> directoryId() {
        return this.directoryId;
    }
    /**
     * The name of the directory.
     * 
     */
    @Export(name="directoryName", type=String.class, parameters={})
    private Output<String> directoryName;

    /**
     * @return The name of the directory.
     * 
     */
    public Output<String> directoryName() {
        return this.directoryName;
    }
    /**
     * The directory type.
     * 
     */
    @Export(name="directoryType", type=String.class, parameters={})
    private Output<String> directoryType;

    /**
     * @return The directory type.
     * 
     */
    public Output<String> directoryType() {
        return this.directoryType;
    }
    /**
     * The IP addresses of the DNS servers for the directory.
     * 
     */
    @Export(name="dnsIpAddresses", type=List.class, parameters={String.class})
    private Output<List<String>> dnsIpAddresses;

    /**
     * @return The IP addresses of the DNS servers for the directory.
     * 
     */
    public Output<List<String>> dnsIpAddresses() {
        return this.dnsIpAddresses;
    }
    /**
     * The identifier of the IAM role. This is the role that allows Amazon WorkSpaces to make calls to other services, such as Amazon EC2, on your behalf.
     * 
     */
    @Export(name="iamRoleId", type=String.class, parameters={})
    private Output<String> iamRoleId;

    /**
     * @return The identifier of the IAM role. This is the role that allows Amazon WorkSpaces to make calls to other services, such as Amazon EC2, on your behalf.
     * 
     */
    public Output<String> iamRoleId() {
        return this.iamRoleId;
    }
    /**
     * The identifiers of the IP access control groups associated with the directory.
     * 
     */
    @Export(name="ipGroupIds", type=List.class, parameters={String.class})
    private Output<List<String>> ipGroupIds;

    /**
     * @return The identifiers of the IP access control groups associated with the directory.
     * 
     */
    public Output<List<String>> ipGroupIds() {
        return this.ipGroupIds;
    }
    /**
     * The registration code for the directory. This is the code that users enter in their Amazon WorkSpaces client application to connect to the directory.
     * 
     */
    @Export(name="registrationCode", type=String.class, parameters={})
    private Output<String> registrationCode;

    /**
     * @return The registration code for the directory. This is the code that users enter in their Amazon WorkSpaces client application to connect to the directory.
     * 
     */
    public Output<String> registrationCode() {
        return this.registrationCode;
    }
    /**
     * Permissions to enable or disable self-service capabilities. Defined below.
     * 
     */
    @Export(name="selfServicePermissions", type=DirectorySelfServicePermissions.class, parameters={})
    private Output<DirectorySelfServicePermissions> selfServicePermissions;

    /**
     * @return Permissions to enable or disable self-service capabilities. Defined below.
     * 
     */
    public Output<DirectorySelfServicePermissions> selfServicePermissions() {
        return this.selfServicePermissions;
    }
    /**
     * The identifiers of the subnets where the directory resides.
     * 
     */
    @Export(name="subnetIds", type=List.class, parameters={String.class})
    private Output<List<String>> subnetIds;

    /**
     * @return The identifiers of the subnets where the directory resides.
     * 
     */
    public Output<List<String>> subnetIds() {
        return this.subnetIds;
    }
    /**
     * A map of tags assigned to the WorkSpaces directory. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags assigned to the WorkSpaces directory. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * Specifies which devices and operating systems users can use to access their WorkSpaces. Defined below.
     * 
     */
    @Export(name="workspaceAccessProperties", type=DirectoryWorkspaceAccessProperties.class, parameters={})
    private Output<DirectoryWorkspaceAccessProperties> workspaceAccessProperties;

    /**
     * @return Specifies which devices and operating systems users can use to access their WorkSpaces. Defined below.
     * 
     */
    public Output<DirectoryWorkspaceAccessProperties> workspaceAccessProperties() {
        return this.workspaceAccessProperties;
    }
    /**
     * Default properties that are used for creating WorkSpaces. Defined below.
     * 
     */
    @Export(name="workspaceCreationProperties", type=DirectoryWorkspaceCreationProperties.class, parameters={})
    private Output<DirectoryWorkspaceCreationProperties> workspaceCreationProperties;

    /**
     * @return Default properties that are used for creating WorkSpaces. Defined below.
     * 
     */
    public Output<DirectoryWorkspaceCreationProperties> workspaceCreationProperties() {
        return this.workspaceCreationProperties;
    }
    /**
     * The identifier of the security group that is assigned to new WorkSpaces.
     * 
     */
    @Export(name="workspaceSecurityGroupId", type=String.class, parameters={})
    private Output<String> workspaceSecurityGroupId;

    /**
     * @return The identifier of the security group that is assigned to new WorkSpaces.
     * 
     */
    public Output<String> workspaceSecurityGroupId() {
        return this.workspaceSecurityGroupId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Directory(String name) {
        this(name, DirectoryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Directory(String name, DirectoryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Directory(String name, DirectoryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:workspaces/directory:Directory", name, args == null ? DirectoryArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Directory(String name, Output<String> id, @Nullable DirectoryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:workspaces/directory:Directory", name, state, makeResourceOptions(options, id));
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
    public static Directory get(String name, Output<String> id, @Nullable DirectoryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Directory(name, id, state, options);
    }
}
