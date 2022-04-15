// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.healthcare.inputs.DicomStoreIamMemberConditionGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DicomStoreIamMemberState extends io.pulumi.resources.ResourceArgs {

    public static final DicomStoreIamMemberState Empty = new DicomStoreIamMemberState();

    @Import(name="condition")
      private final @Nullable Output<DicomStoreIamMemberConditionGetArgs> condition;

    public Output<DicomStoreIamMemberConditionGetArgs> condition() {
        return this.condition == null ? Codegen.empty() : this.condition;
    }

    /**
     * The DICOM store ID, in the form
     * `{project_id}/{location_name}/{dataset_name}/{dicom_store_name}` or
     * `{location_name}/{dataset_name}/{dicom_store_name}`. In the second form, the provider's
     * project setting will be used as a fallback.
     * 
     */
    @Import(name="dicomStoreId")
      private final @Nullable Output<String> dicomStoreId;

    public Output<String> dicomStoreId() {
        return this.dicomStoreId == null ? Codegen.empty() : this.dicomStoreId;
    }

    /**
     * (Computed) The etag of the DICOM store's IAM policy.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> etag() {
        return this.etag == null ? Codegen.empty() : this.etag;
    }

    @Import(name="member")
      private final @Nullable Output<String> member;

    public Output<String> member() {
        return this.member == null ? Codegen.empty() : this.member;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.healthcare.DicomStoreIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role")
      private final @Nullable Output<String> role;

    public Output<String> role() {
        return this.role == null ? Codegen.empty() : this.role;
    }

    public DicomStoreIamMemberState(
        @Nullable Output<DicomStoreIamMemberConditionGetArgs> condition,
        @Nullable Output<String> dicomStoreId,
        @Nullable Output<String> etag,
        @Nullable Output<String> member,
        @Nullable Output<String> role) {
        this.condition = condition;
        this.dicomStoreId = dicomStoreId;
        this.etag = etag;
        this.member = member;
        this.role = role;
    }

    private DicomStoreIamMemberState() {
        this.condition = Codegen.empty();
        this.dicomStoreId = Codegen.empty();
        this.etag = Codegen.empty();
        this.member = Codegen.empty();
        this.role = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DicomStoreIamMemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DicomStoreIamMemberConditionGetArgs> condition;
        private @Nullable Output<String> dicomStoreId;
        private @Nullable Output<String> etag;
        private @Nullable Output<String> member;
        private @Nullable Output<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(DicomStoreIamMemberState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.dicomStoreId = defaults.dicomStoreId;
    	      this.etag = defaults.etag;
    	      this.member = defaults.member;
    	      this.role = defaults.role;
        }

        public Builder condition(@Nullable Output<DicomStoreIamMemberConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable DicomStoreIamMemberConditionGetArgs condition) {
            this.condition = Codegen.ofNullable(condition);
            return this;
        }
        public Builder dicomStoreId(@Nullable Output<String> dicomStoreId) {
            this.dicomStoreId = dicomStoreId;
            return this;
        }
        public Builder dicomStoreId(@Nullable String dicomStoreId) {
            this.dicomStoreId = Codegen.ofNullable(dicomStoreId);
            return this;
        }
        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = Codegen.ofNullable(etag);
            return this;
        }
        public Builder member(@Nullable Output<String> member) {
            this.member = member;
            return this;
        }
        public Builder member(@Nullable String member) {
            this.member = Codegen.ofNullable(member);
            return this;
        }
        public Builder role(@Nullable Output<String> role) {
            this.role = role;
            return this;
        }
        public Builder role(@Nullable String role) {
            this.role = Codegen.ofNullable(role);
            return this;
        }        public DicomStoreIamMemberState build() {
            return new DicomStoreIamMemberState(condition, dicomStoreId, etag, member, role);
        }
    }
}
