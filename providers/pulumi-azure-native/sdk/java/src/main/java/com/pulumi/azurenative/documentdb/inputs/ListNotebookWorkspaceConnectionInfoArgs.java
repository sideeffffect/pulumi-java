// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListNotebookWorkspaceConnectionInfoArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListNotebookWorkspaceConnectionInfoArgs Empty = new ListNotebookWorkspaceConnectionInfoArgs();

    /**
     * Cosmos DB database account name.
     * 
     */
    @Import(name="accountName", required=true)
    private String accountName;

    public String accountName() {
        return this.accountName;
    }

    /**
     * The name of the notebook workspace resource.
     * 
     */
    @Import(name="notebookWorkspaceName", required=true)
    private String notebookWorkspaceName;

    public String notebookWorkspaceName() {
        return this.notebookWorkspaceName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private ListNotebookWorkspaceConnectionInfoArgs() {}

    private ListNotebookWorkspaceConnectionInfoArgs(ListNotebookWorkspaceConnectionInfoArgs $) {
        this.accountName = $.accountName;
        this.notebookWorkspaceName = $.notebookWorkspaceName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListNotebookWorkspaceConnectionInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListNotebookWorkspaceConnectionInfoArgs $;

        public Builder() {
            $ = new ListNotebookWorkspaceConnectionInfoArgs();
        }

        public Builder(ListNotebookWorkspaceConnectionInfoArgs defaults) {
            $ = new ListNotebookWorkspaceConnectionInfoArgs(Objects.requireNonNull(defaults));
        }

        public Builder accountName(String accountName) {
            $.accountName = accountName;
            return this;
        }

        public Builder notebookWorkspaceName(String notebookWorkspaceName) {
            $.notebookWorkspaceName = notebookWorkspaceName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public ListNotebookWorkspaceConnectionInfoArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.notebookWorkspaceName = Objects.requireNonNull($.notebookWorkspaceName, "expected parameter 'notebookWorkspaceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
