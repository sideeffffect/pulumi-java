// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wisdom;

import io.pulumi.awsnative.wisdom.enums.AssistantAssociationAssociationType;
import io.pulumi.awsnative.wisdom.inputs.AssistantAssociationAssociationDataArgs;
import io.pulumi.awsnative.wisdom.inputs.AssistantAssociationTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AssistantAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AssistantAssociationArgs Empty = new AssistantAssociationArgs();

    @InputImport(name="assistantId", required=true)
      private final Input<String> assistantId;

    public Input<String> getAssistantId() {
        return this.assistantId;
    }

    @InputImport(name="association", required=true)
      private final Input<AssistantAssociationAssociationDataArgs> association;

    public Input<AssistantAssociationAssociationDataArgs> getAssociation() {
        return this.association;
    }

    @InputImport(name="associationType", required=true)
      private final Input<AssistantAssociationAssociationType> associationType;

    public Input<AssistantAssociationAssociationType> getAssociationType() {
        return this.associationType;
    }

    @InputImport(name="tags")
      private final @Nullable Input<List<AssistantAssociationTagArgs>> tags;

    public Input<List<AssistantAssociationTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public AssistantAssociationArgs(
        Input<String> assistantId,
        Input<AssistantAssociationAssociationDataArgs> association,
        Input<AssistantAssociationAssociationType> associationType,
        @Nullable Input<List<AssistantAssociationTagArgs>> tags) {
        this.assistantId = Objects.requireNonNull(assistantId, "expected parameter 'assistantId' to be non-null");
        this.association = Objects.requireNonNull(association, "expected parameter 'association' to be non-null");
        this.associationType = Objects.requireNonNull(associationType, "expected parameter 'associationType' to be non-null");
        this.tags = tags;
    }

    private AssistantAssociationArgs() {
        this.assistantId = Input.empty();
        this.association = Input.empty();
        this.associationType = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssistantAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> assistantId;
        private Input<AssistantAssociationAssociationDataArgs> association;
        private Input<AssistantAssociationAssociationType> associationType;
        private @Nullable Input<List<AssistantAssociationTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(AssistantAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assistantId = defaults.assistantId;
    	      this.association = defaults.association;
    	      this.associationType = defaults.associationType;
    	      this.tags = defaults.tags;
        }

        public Builder assistantId(Input<String> assistantId) {
            this.assistantId = Objects.requireNonNull(assistantId);
            return this;
        }

        public Builder assistantId(String assistantId) {
            this.assistantId = Input.of(Objects.requireNonNull(assistantId));
            return this;
        }

        public Builder association(Input<AssistantAssociationAssociationDataArgs> association) {
            this.association = Objects.requireNonNull(association);
            return this;
        }

        public Builder association(AssistantAssociationAssociationDataArgs association) {
            this.association = Input.of(Objects.requireNonNull(association));
            return this;
        }

        public Builder associationType(Input<AssistantAssociationAssociationType> associationType) {
            this.associationType = Objects.requireNonNull(associationType);
            return this;
        }

        public Builder associationType(AssistantAssociationAssociationType associationType) {
            this.associationType = Input.of(Objects.requireNonNull(associationType));
            return this;
        }

        public Builder tags(@Nullable Input<List<AssistantAssociationTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<AssistantAssociationTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public AssistantAssociationArgs build() {
            return new AssistantAssociationArgs(assistantId, association, associationType, tags);
        }
    }
}
