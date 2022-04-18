// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.workflows.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowState extends com.pulumi.resources.ResourceArgs {

    public static final WorkflowState Empty = new WorkflowState();

    /**
     * The timestamp of when the workflow was created in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine
     * fractional digits.
     * 
     */
    @Import(name="createTime")
      private final @Nullable Output<String> createTime;

    public Output<String> createTime() {
        return this.createTime == null ? Codegen.empty() : this.createTime;
    }

    /**
     * Description of the workflow provided by the user. Must be at most 1000 unicode characters long.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * A set of key/value label pairs to assign to this Workflow.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * Name of the Workflow.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Creates a unique name beginning with the
     * specified prefix. If this and name are unspecified, a random value is chosen for the name.
     * 
     */
    @Import(name="namePrefix")
      private final @Nullable Output<String> namePrefix;

    public Output<String> namePrefix() {
        return this.namePrefix == null ? Codegen.empty() : this.namePrefix;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The region of the workflow.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> region() {
        return this.region == null ? Codegen.empty() : this.region;
    }

    /**
     * The revision of the workflow. A new one is generated if the service account or source contents is changed.
     * 
     */
    @Import(name="revisionId")
      private final @Nullable Output<String> revisionId;

    public Output<String> revisionId() {
        return this.revisionId == null ? Codegen.empty() : this.revisionId;
    }

    /**
     * Name of the service account associated with the latest workflow version. This service
     * account represents the identity of the workflow and determines what permissions the workflow has.
     * Format: projects/{project}/serviceAccounts/{account}.
     * 
     */
    @Import(name="serviceAccount")
      private final @Nullable Output<String> serviceAccount;

    public Output<String> serviceAccount() {
        return this.serviceAccount == null ? Codegen.empty() : this.serviceAccount;
    }

    /**
     * Workflow code to be executed. The size limit is 32KB.
     * 
     */
    @Import(name="sourceContents")
      private final @Nullable Output<String> sourceContents;

    public Output<String> sourceContents() {
        return this.sourceContents == null ? Codegen.empty() : this.sourceContents;
    }

    /**
     * State of the workflow deployment.
     * 
     */
    @Import(name="state")
      private final @Nullable Output<String> state;

    public Output<String> state() {
        return this.state == null ? Codegen.empty() : this.state;
    }

    /**
     * The timestamp of when the workflow was last updated in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to
     * nine fractional digits.
     * 
     */
    @Import(name="updateTime")
      private final @Nullable Output<String> updateTime;

    public Output<String> updateTime() {
        return this.updateTime == null ? Codegen.empty() : this.updateTime;
    }

    public WorkflowState(
        @Nullable Output<String> createTime,
        @Nullable Output<String> description,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> name,
        @Nullable Output<String> namePrefix,
        @Nullable Output<String> project,
        @Nullable Output<String> region,
        @Nullable Output<String> revisionId,
        @Nullable Output<String> serviceAccount,
        @Nullable Output<String> sourceContents,
        @Nullable Output<String> state,
        @Nullable Output<String> updateTime) {
        this.createTime = createTime;
        this.description = description;
        this.labels = labels;
        this.name = name;
        this.namePrefix = namePrefix;
        this.project = project;
        this.region = region;
        this.revisionId = revisionId;
        this.serviceAccount = serviceAccount;
        this.sourceContents = sourceContents;
        this.state = state;
        this.updateTime = updateTime;
    }

    private WorkflowState() {
        this.createTime = Codegen.empty();
        this.description = Codegen.empty();
        this.labels = Codegen.empty();
        this.name = Codegen.empty();
        this.namePrefix = Codegen.empty();
        this.project = Codegen.empty();
        this.region = Codegen.empty();
        this.revisionId = Codegen.empty();
        this.serviceAccount = Codegen.empty();
        this.sourceContents = Codegen.empty();
        this.state = Codegen.empty();
        this.updateTime = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> createTime;
        private @Nullable Output<String> description;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> name;
        private @Nullable Output<String> namePrefix;
        private @Nullable Output<String> project;
        private @Nullable Output<String> region;
        private @Nullable Output<String> revisionId;
        private @Nullable Output<String> serviceAccount;
        private @Nullable Output<String> sourceContents;
        private @Nullable Output<String> state;
        private @Nullable Output<String> updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.revisionId = defaults.revisionId;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.sourceContents = defaults.sourceContents;
    	      this.state = defaults.state;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder createTime(@Nullable Output<String> createTime) {
            this.createTime = createTime;
            return this;
        }
        public Builder createTime(@Nullable String createTime) {
            this.createTime = Codegen.ofNullable(createTime);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
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
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }
        public Builder namePrefix(@Nullable String namePrefix) {
            this.namePrefix = Codegen.ofNullable(namePrefix);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = Codegen.ofNullable(region);
            return this;
        }
        public Builder revisionId(@Nullable Output<String> revisionId) {
            this.revisionId = revisionId;
            return this;
        }
        public Builder revisionId(@Nullable String revisionId) {
            this.revisionId = Codegen.ofNullable(revisionId);
            return this;
        }
        public Builder serviceAccount(@Nullable Output<String> serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }
        public Builder serviceAccount(@Nullable String serviceAccount) {
            this.serviceAccount = Codegen.ofNullable(serviceAccount);
            return this;
        }
        public Builder sourceContents(@Nullable Output<String> sourceContents) {
            this.sourceContents = sourceContents;
            return this;
        }
        public Builder sourceContents(@Nullable String sourceContents) {
            this.sourceContents = Codegen.ofNullable(sourceContents);
            return this;
        }
        public Builder state(@Nullable Output<String> state) {
            this.state = state;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = Codegen.ofNullable(state);
            return this;
        }
        public Builder updateTime(@Nullable Output<String> updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Builder updateTime(@Nullable String updateTime) {
            this.updateTime = Codegen.ofNullable(updateTime);
            return this;
        }        public WorkflowState build() {
            return new WorkflowState(createTime, description, labels, name, namePrefix, project, region, revisionId, serviceAccount, sourceContents, state, updateTime);
        }
    }
}
