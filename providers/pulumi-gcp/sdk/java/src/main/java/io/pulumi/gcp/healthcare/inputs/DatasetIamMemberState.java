// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.healthcare.inputs.DatasetIamMemberConditionGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatasetIamMemberState extends io.pulumi.resources.ResourceArgs {

    public static final DatasetIamMemberState Empty = new DatasetIamMemberState();

    @InputImport(name="condition")
      private final @Nullable Input<DatasetIamMemberConditionGetArgs> condition;

    public Input<DatasetIamMemberConditionGetArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    /**
     * The dataset ID, in the form
     * `{project_id}/{location_name}/{dataset_name}` or
     * `{location_name}/{dataset_name}`. In the second form, the provider's
     * project setting will be used as a fallback.
     * 
     */
    @InputImport(name="datasetId")
      private final @Nullable Input<String> datasetId;

    public Input<String> getDatasetId() {
        return this.datasetId == null ? Input.empty() : this.datasetId;
    }

    /**
     * (Computed) The etag of the dataset's IAM policy.
     * 
     */
    @InputImport(name="etag")
      private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    @InputImport(name="member")
      private final @Nullable Input<String> member;

    public Input<String> getMember() {
        return this.member == null ? Input.empty() : this.member;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.healthcare.DatasetIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role")
      private final @Nullable Input<String> role;

    public Input<String> getRole() {
        return this.role == null ? Input.empty() : this.role;
    }

    public DatasetIamMemberState(
        @Nullable Input<DatasetIamMemberConditionGetArgs> condition,
        @Nullable Input<String> datasetId,
        @Nullable Input<String> etag,
        @Nullable Input<String> member,
        @Nullable Input<String> role) {
        this.condition = condition;
        this.datasetId = datasetId;
        this.etag = etag;
        this.member = member;
        this.role = role;
    }

    private DatasetIamMemberState() {
        this.condition = Input.empty();
        this.datasetId = Input.empty();
        this.etag = Input.empty();
        this.member = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetIamMemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DatasetIamMemberConditionGetArgs> condition;
        private @Nullable Input<String> datasetId;
        private @Nullable Input<String> etag;
        private @Nullable Input<String> member;
        private @Nullable Input<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetIamMemberState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.datasetId = defaults.datasetId;
    	      this.etag = defaults.etag;
    	      this.member = defaults.member;
    	      this.role = defaults.role;
        }

        public Builder condition(@Nullable Input<DatasetIamMemberConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder condition(@Nullable DatasetIamMemberConditionGetArgs condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder datasetId(@Nullable Input<String> datasetId) {
            this.datasetId = datasetId;
            return this;
        }

        public Builder datasetId(@Nullable String datasetId) {
            this.datasetId = Input.ofNullable(datasetId);
            return this;
        }

        public Builder etag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder etag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder member(@Nullable Input<String> member) {
            this.member = member;
            return this;
        }

        public Builder member(@Nullable String member) {
            this.member = Input.ofNullable(member);
            return this;
        }

        public Builder role(@Nullable Input<String> role) {
            this.role = role;
            return this;
        }

        public Builder role(@Nullable String role) {
            this.role = Input.ofNullable(role);
            return this;
        }
        public DatasetIamMemberState build() {
            return new DatasetIamMemberState(condition, datasetId, etag, member, role);
        }
    }
}
