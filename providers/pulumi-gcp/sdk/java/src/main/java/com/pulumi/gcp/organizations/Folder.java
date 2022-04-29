// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.organizations;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.organizations.FolderArgs;
import com.pulumi.gcp.organizations.inputs.FolderState;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Allows management of a Google Cloud Platform folder. For more information see
 * [the official documentation](https://cloud.google.com/resource-manager/docs/creating-managing-folders)
 * and
 * [API](https://cloud.google.com/resource-manager/reference/rest/v2/folders).
 * 
 * A folder can contain projects, other folders, or a combination of both. You can use folders to group projects under an organization in a hierarchy. For example, your organization might contain multiple departments, each with its own set of Cloud Platform resources. Folders allows you to group these resources on a per-department basis. Folders are used to group resources that share common IAM policies.
 * 
 * Folders created live inside an Organization. See the [Organization documentation](https://cloud.google.com/resource-manager/docs/quickstarts) for more details.
 * 
 * The service account used to run the provider when creating a `gcp.organizations.Folder`
 * resource must have `roles/resourcemanager.folderCreator`. See the
 * [Access Control for Folders Using IAM](https://cloud.google.com/resource-manager/docs/access-control-folders)
 * doc for more information.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Folders can be imported using the folder&#39;s id, e.g. # Both syntaxes are valid
 * 
 * ```sh
 *  $ pulumi import gcp:organizations/folder:Folder department1 1234567
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:organizations/folder:Folder department1 folders/1234567
 * ```
 * 
 */
@ResourceType(type="gcp:organizations/folder:Folder")
public class Folder extends CustomResource {
    /**
     * Timestamp when the Folder was created. Assigned by the server.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, accurate to nanoseconds. Example: &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Timestamp when the Folder was created. Assigned by the server.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, accurate to nanoseconds. Example: &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The folder’s display name.
     * A folder’s display name must be unique amongst its siblings, e.g. no two folders with the same parent can share the same display name. The display name must start and end with a letter or digit, may contain letters, digits, spaces, hyphens and underscores and can be no longer than 30 characters.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The folder’s display name.
     * A folder’s display name must be unique amongst its siblings, e.g. no two folders with the same parent can share the same display name. The display name must start and end with a letter or digit, may contain letters, digits, spaces, hyphens and underscores and can be no longer than 30 characters.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * The folder id from the name &#34;folders/{folder_id}&#34;
     * 
     */
    @Export(name="folderId", type=String.class, parameters={})
    private Output<String> folderId;

    /**
     * @return The folder id from the name &#34;folders/{folder_id}&#34;
     * 
     */
    public Output<String> folderId() {
        return this.folderId;
    }
    /**
     * The lifecycle state of the folder such as `ACTIVE` or `DELETE_REQUESTED`.
     * 
     */
    @Export(name="lifecycleState", type=String.class, parameters={})
    private Output<String> lifecycleState;

    /**
     * @return The lifecycle state of the folder such as `ACTIVE` or `DELETE_REQUESTED`.
     * 
     */
    public Output<String> lifecycleState() {
        return this.lifecycleState;
    }
    /**
     * The resource name of the Folder. Its format is folders/{folder_id}.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the Folder. Its format is folders/{folder_id}.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The resource name of the parent Folder or Organization.
     * Must be of the form `folders/{folder_id}` or `organizations/{org_id}`.
     * 
     */
    @Export(name="parent", type=String.class, parameters={})
    private Output<String> parent;

    /**
     * @return The resource name of the parent Folder or Organization.
     * Must be of the form `folders/{folder_id}` or `organizations/{org_id}`.
     * 
     */
    public Output<String> parent() {
        return this.parent;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Folder(String name) {
        this(name, FolderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Folder(String name, FolderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Folder(String name, FolderArgs args, @Nullable CustomResourceOptions options) {
        super("gcp:organizations/folder:Folder", name, args == null ? FolderArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Folder(String name, Output<String> id, @Nullable FolderState state, @Nullable CustomResourceOptions options) {
        super("gcp:organizations/folder:Folder", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Folder get(String name, Output<String> id, @Nullable FolderState state, @Nullable CustomResourceOptions options) {
        return new Folder(name, id, state, options);
    }
}
