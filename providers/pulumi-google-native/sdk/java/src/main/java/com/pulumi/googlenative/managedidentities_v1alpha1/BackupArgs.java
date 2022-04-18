// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.managedidentities_v1alpha1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackupArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackupArgs Empty = new BackupArgs();

    @Import(name="backupId", required=true)
      private final Output<String> backupId;

    public Output<String> backupId() {
        return this.backupId;
    }

    @Import(name="domainId", required=true)
      private final Output<String> domainId;

    public Output<String> domainId() {
        return this.domainId;
    }

    /**
     * Optional. Resource labels to represent user provided metadata.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    public BackupArgs(
        Output<String> backupId,
        Output<String> domainId,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> project) {
        this.backupId = Objects.requireNonNull(backupId, "expected parameter 'backupId' to be non-null");
        this.domainId = Objects.requireNonNull(domainId, "expected parameter 'domainId' to be non-null");
        this.labels = labels;
        this.project = project;
    }

    private BackupArgs() {
        this.backupId = Codegen.empty();
        this.domainId = Codegen.empty();
        this.labels = Codegen.empty();
        this.project = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> backupId;
        private Output<String> domainId;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupId = defaults.backupId;
    	      this.domainId = defaults.domainId;
    	      this.labels = defaults.labels;
    	      this.project = defaults.project;
        }

        public Builder backupId(Output<String> backupId) {
            this.backupId = Objects.requireNonNull(backupId);
            return this;
        }
        public Builder backupId(String backupId) {
            this.backupId = Output.of(Objects.requireNonNull(backupId));
            return this;
        }
        public Builder domainId(Output<String> domainId) {
            this.domainId = Objects.requireNonNull(domainId);
            return this;
        }
        public Builder domainId(String domainId) {
            this.domainId = Output.of(Objects.requireNonNull(domainId));
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }        public BackupArgs build() {
            return new BackupArgs(backupId, domainId, labels, project);
        }
    }
}
