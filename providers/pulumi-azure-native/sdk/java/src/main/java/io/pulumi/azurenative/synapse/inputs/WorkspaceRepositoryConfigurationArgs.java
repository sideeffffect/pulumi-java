// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Git integration settings
 * 
 */
public final class WorkspaceRepositoryConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkspaceRepositoryConfigurationArgs Empty = new WorkspaceRepositoryConfigurationArgs();

    /**
     * Account name
     * 
     */
    @InputImport(name="accountName")
      private final @Nullable Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName == null ? Input.empty() : this.accountName;
    }

    /**
     * Collaboration branch
     * 
     */
    @InputImport(name="collaborationBranch")
      private final @Nullable Input<String> collaborationBranch;

    public Input<String> getCollaborationBranch() {
        return this.collaborationBranch == null ? Input.empty() : this.collaborationBranch;
    }

    /**
     * GitHub Enterprise host name. For example: https://github.mydomain.com
     * 
     */
    @InputImport(name="hostName")
      private final @Nullable Input<String> hostName;

    public Input<String> getHostName() {
        return this.hostName == null ? Input.empty() : this.hostName;
    }

    /**
     * The last commit ID
     * 
     */
    @InputImport(name="lastCommitId")
      private final @Nullable Input<String> lastCommitId;

    public Input<String> getLastCommitId() {
        return this.lastCommitId == null ? Input.empty() : this.lastCommitId;
    }

    /**
     * VSTS project name
     * 
     */
    @InputImport(name="projectName")
      private final @Nullable Input<String> projectName;

    public Input<String> getProjectName() {
        return this.projectName == null ? Input.empty() : this.projectName;
    }

    /**
     * Repository name
     * 
     */
    @InputImport(name="repositoryName")
      private final @Nullable Input<String> repositoryName;

    public Input<String> getRepositoryName() {
        return this.repositoryName == null ? Input.empty() : this.repositoryName;
    }

    /**
     * Root folder to use in the repository
     * 
     */
    @InputImport(name="rootFolder")
      private final @Nullable Input<String> rootFolder;

    public Input<String> getRootFolder() {
        return this.rootFolder == null ? Input.empty() : this.rootFolder;
    }

    /**
     * The VSTS tenant ID
     * 
     */
    @InputImport(name="tenantId")
      private final @Nullable Input<String> tenantId;

    public Input<String> getTenantId() {
        return this.tenantId == null ? Input.empty() : this.tenantId;
    }

    /**
     * Type of workspace repositoryID configuration. Example WorkspaceVSTSConfiguration, WorkspaceGitHubConfiguration
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public WorkspaceRepositoryConfigurationArgs(
        @Nullable Input<String> accountName,
        @Nullable Input<String> collaborationBranch,
        @Nullable Input<String> hostName,
        @Nullable Input<String> lastCommitId,
        @Nullable Input<String> projectName,
        @Nullable Input<String> repositoryName,
        @Nullable Input<String> rootFolder,
        @Nullable Input<String> tenantId,
        @Nullable Input<String> type) {
        this.accountName = accountName;
        this.collaborationBranch = collaborationBranch;
        this.hostName = hostName;
        this.lastCommitId = lastCommitId;
        this.projectName = projectName;
        this.repositoryName = repositoryName;
        this.rootFolder = rootFolder;
        this.tenantId = tenantId;
        this.type = type;
    }

    private WorkspaceRepositoryConfigurationArgs() {
        this.accountName = Input.empty();
        this.collaborationBranch = Input.empty();
        this.hostName = Input.empty();
        this.lastCommitId = Input.empty();
        this.projectName = Input.empty();
        this.repositoryName = Input.empty();
        this.rootFolder = Input.empty();
        this.tenantId = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceRepositoryConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accountName;
        private @Nullable Input<String> collaborationBranch;
        private @Nullable Input<String> hostName;
        private @Nullable Input<String> lastCommitId;
        private @Nullable Input<String> projectName;
        private @Nullable Input<String> repositoryName;
        private @Nullable Input<String> rootFolder;
        private @Nullable Input<String> tenantId;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceRepositoryConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.collaborationBranch = defaults.collaborationBranch;
    	      this.hostName = defaults.hostName;
    	      this.lastCommitId = defaults.lastCommitId;
    	      this.projectName = defaults.projectName;
    	      this.repositoryName = defaults.repositoryName;
    	      this.rootFolder = defaults.rootFolder;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder accountName(@Nullable Input<String> accountName) {
            this.accountName = accountName;
            return this;
        }

        public Builder accountName(@Nullable String accountName) {
            this.accountName = Input.ofNullable(accountName);
            return this;
        }

        public Builder collaborationBranch(@Nullable Input<String> collaborationBranch) {
            this.collaborationBranch = collaborationBranch;
            return this;
        }

        public Builder collaborationBranch(@Nullable String collaborationBranch) {
            this.collaborationBranch = Input.ofNullable(collaborationBranch);
            return this;
        }

        public Builder hostName(@Nullable Input<String> hostName) {
            this.hostName = hostName;
            return this;
        }

        public Builder hostName(@Nullable String hostName) {
            this.hostName = Input.ofNullable(hostName);
            return this;
        }

        public Builder lastCommitId(@Nullable Input<String> lastCommitId) {
            this.lastCommitId = lastCommitId;
            return this;
        }

        public Builder lastCommitId(@Nullable String lastCommitId) {
            this.lastCommitId = Input.ofNullable(lastCommitId);
            return this;
        }

        public Builder projectName(@Nullable Input<String> projectName) {
            this.projectName = projectName;
            return this;
        }

        public Builder projectName(@Nullable String projectName) {
            this.projectName = Input.ofNullable(projectName);
            return this;
        }

        public Builder repositoryName(@Nullable Input<String> repositoryName) {
            this.repositoryName = repositoryName;
            return this;
        }

        public Builder repositoryName(@Nullable String repositoryName) {
            this.repositoryName = Input.ofNullable(repositoryName);
            return this;
        }

        public Builder rootFolder(@Nullable Input<String> rootFolder) {
            this.rootFolder = rootFolder;
            return this;
        }

        public Builder rootFolder(@Nullable String rootFolder) {
            this.rootFolder = Input.ofNullable(rootFolder);
            return this;
        }

        public Builder tenantId(@Nullable Input<String> tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = Input.ofNullable(tenantId);
            return this;
        }

        public Builder type(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public WorkspaceRepositoryConfigurationArgs build() {
            return new WorkspaceRepositoryConfigurationArgs(accountName, collaborationBranch, hostName, lastCommitId, projectName, repositoryName, rootFolder, tenantId, type);
        }
    }
}
