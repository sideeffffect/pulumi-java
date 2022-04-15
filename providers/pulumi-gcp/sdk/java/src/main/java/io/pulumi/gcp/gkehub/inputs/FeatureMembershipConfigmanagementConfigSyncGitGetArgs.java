// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gkehub.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FeatureMembershipConfigmanagementConfigSyncGitGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FeatureMembershipConfigmanagementConfigSyncGitGetArgs Empty = new FeatureMembershipConfigmanagementConfigSyncGitGetArgs();

    @Import(name="gcpServiceAccountEmail")
      private final @Nullable Output<String> gcpServiceAccountEmail;

    public Output<String> gcpServiceAccountEmail() {
        return this.gcpServiceAccountEmail == null ? Codegen.empty() : this.gcpServiceAccountEmail;
    }

    /**
     * URL for the HTTPS proxy to be used when communicating with the Git repo.
     * 
     */
    @Import(name="httpsProxy")
      private final @Nullable Output<String> httpsProxy;

    public Output<String> httpsProxy() {
        return this.httpsProxy == null ? Codegen.empty() : this.httpsProxy;
    }

    /**
     * The path within the Git repository that represents the top level of the repo to sync. Default: the root directory of the repository.
     * 
     */
    @Import(name="policyDir")
      private final @Nullable Output<String> policyDir;

    public Output<String> policyDir() {
        return this.policyDir == null ? Codegen.empty() : this.policyDir;
    }

    /**
     * Type of secret configured for access to the Git repo.
     * 
     */
    @Import(name="secretType")
      private final @Nullable Output<String> secretType;

    public Output<String> secretType() {
        return this.secretType == null ? Codegen.empty() : this.secretType;
    }

    /**
     * The branch of the repository to sync from. Default: master.
     * 
     */
    @Import(name="syncBranch")
      private final @Nullable Output<String> syncBranch;

    public Output<String> syncBranch() {
        return this.syncBranch == null ? Codegen.empty() : this.syncBranch;
    }

    /**
     * The URL of the Git repository to use as the source of truth.
     * 
     */
    @Import(name="syncRepo")
      private final @Nullable Output<String> syncRepo;

    public Output<String> syncRepo() {
        return this.syncRepo == null ? Codegen.empty() : this.syncRepo;
    }

    /**
     * Git revision (tag or hash) to check out. Default HEAD.
     * 
     */
    @Import(name="syncRev")
      private final @Nullable Output<String> syncRev;

    public Output<String> syncRev() {
        return this.syncRev == null ? Codegen.empty() : this.syncRev;
    }

    /**
     * Period in seconds between consecutive syncs. Default: 15.
     * 
     */
    @Import(name="syncWaitSecs")
      private final @Nullable Output<String> syncWaitSecs;

    public Output<String> syncWaitSecs() {
        return this.syncWaitSecs == null ? Codegen.empty() : this.syncWaitSecs;
    }

    public FeatureMembershipConfigmanagementConfigSyncGitGetArgs(
        @Nullable Output<String> gcpServiceAccountEmail,
        @Nullable Output<String> httpsProxy,
        @Nullable Output<String> policyDir,
        @Nullable Output<String> secretType,
        @Nullable Output<String> syncBranch,
        @Nullable Output<String> syncRepo,
        @Nullable Output<String> syncRev,
        @Nullable Output<String> syncWaitSecs) {
        this.gcpServiceAccountEmail = gcpServiceAccountEmail;
        this.httpsProxy = httpsProxy;
        this.policyDir = policyDir;
        this.secretType = secretType;
        this.syncBranch = syncBranch;
        this.syncRepo = syncRepo;
        this.syncRev = syncRev;
        this.syncWaitSecs = syncWaitSecs;
    }

    private FeatureMembershipConfigmanagementConfigSyncGitGetArgs() {
        this.gcpServiceAccountEmail = Codegen.empty();
        this.httpsProxy = Codegen.empty();
        this.policyDir = Codegen.empty();
        this.secretType = Codegen.empty();
        this.syncBranch = Codegen.empty();
        this.syncRepo = Codegen.empty();
        this.syncRev = Codegen.empty();
        this.syncWaitSecs = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureMembershipConfigmanagementConfigSyncGitGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> gcpServiceAccountEmail;
        private @Nullable Output<String> httpsProxy;
        private @Nullable Output<String> policyDir;
        private @Nullable Output<String> secretType;
        private @Nullable Output<String> syncBranch;
        private @Nullable Output<String> syncRepo;
        private @Nullable Output<String> syncRev;
        private @Nullable Output<String> syncWaitSecs;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureMembershipConfigmanagementConfigSyncGitGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gcpServiceAccountEmail = defaults.gcpServiceAccountEmail;
    	      this.httpsProxy = defaults.httpsProxy;
    	      this.policyDir = defaults.policyDir;
    	      this.secretType = defaults.secretType;
    	      this.syncBranch = defaults.syncBranch;
    	      this.syncRepo = defaults.syncRepo;
    	      this.syncRev = defaults.syncRev;
    	      this.syncWaitSecs = defaults.syncWaitSecs;
        }

        public Builder gcpServiceAccountEmail(@Nullable Output<String> gcpServiceAccountEmail) {
            this.gcpServiceAccountEmail = gcpServiceAccountEmail;
            return this;
        }
        public Builder gcpServiceAccountEmail(@Nullable String gcpServiceAccountEmail) {
            this.gcpServiceAccountEmail = Codegen.ofNullable(gcpServiceAccountEmail);
            return this;
        }
        public Builder httpsProxy(@Nullable Output<String> httpsProxy) {
            this.httpsProxy = httpsProxy;
            return this;
        }
        public Builder httpsProxy(@Nullable String httpsProxy) {
            this.httpsProxy = Codegen.ofNullable(httpsProxy);
            return this;
        }
        public Builder policyDir(@Nullable Output<String> policyDir) {
            this.policyDir = policyDir;
            return this;
        }
        public Builder policyDir(@Nullable String policyDir) {
            this.policyDir = Codegen.ofNullable(policyDir);
            return this;
        }
        public Builder secretType(@Nullable Output<String> secretType) {
            this.secretType = secretType;
            return this;
        }
        public Builder secretType(@Nullable String secretType) {
            this.secretType = Codegen.ofNullable(secretType);
            return this;
        }
        public Builder syncBranch(@Nullable Output<String> syncBranch) {
            this.syncBranch = syncBranch;
            return this;
        }
        public Builder syncBranch(@Nullable String syncBranch) {
            this.syncBranch = Codegen.ofNullable(syncBranch);
            return this;
        }
        public Builder syncRepo(@Nullable Output<String> syncRepo) {
            this.syncRepo = syncRepo;
            return this;
        }
        public Builder syncRepo(@Nullable String syncRepo) {
            this.syncRepo = Codegen.ofNullable(syncRepo);
            return this;
        }
        public Builder syncRev(@Nullable Output<String> syncRev) {
            this.syncRev = syncRev;
            return this;
        }
        public Builder syncRev(@Nullable String syncRev) {
            this.syncRev = Codegen.ofNullable(syncRev);
            return this;
        }
        public Builder syncWaitSecs(@Nullable Output<String> syncWaitSecs) {
            this.syncWaitSecs = syncWaitSecs;
            return this;
        }
        public Builder syncWaitSecs(@Nullable String syncWaitSecs) {
            this.syncWaitSecs = Codegen.ofNullable(syncWaitSecs);
            return this;
        }        public FeatureMembershipConfigmanagementConfigSyncGitGetArgs build() {
            return new FeatureMembershipConfigmanagementConfigSyncGitGetArgs(gcpServiceAccountEmail, httpsProxy, policyDir, secretType, syncBranch, syncRepo, syncRev, syncWaitSecs);
        }
    }
}
